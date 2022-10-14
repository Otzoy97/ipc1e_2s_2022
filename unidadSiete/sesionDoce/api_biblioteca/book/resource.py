from flask import Blueprint, request
from book.controller import exists, filter_author, filter_title, filter_year_range, insert, select_all
from book.model import BookSchema

books = Blueprint('book', __name__, url_prefix="/api/book")


@books.route('/', methods=['POST'])
def create():
    body = request.get_json()
    if (exists(body["isbn"])):
        return {"msg": "duplicated book"}, 400
    else:
        insert(body)
        return {"msg": "book created"}, 200


@books.route('/', methods=['GET'])
def list():
    args = request.args
    if (args):
        books_data = select_all()
        books_data = filter_author(books_data, args.get('author'))
        books_data = filter_title(books_data, args.get('title'))
        books_data = filter_year_range(
            books_data, args.get('year_from'),  args.get('year_to'))
        return BookSchema(many=True).dumps(books_data), 200
    else:
        return BookSchema(many=True).dumps(select_all()), 200