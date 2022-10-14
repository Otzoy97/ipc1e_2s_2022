from flask import Blueprint, request
from lend.controller import is_returned, lend_book, exists, return_book
from book.controller import exists as book_exists, find_one as book_find_one
from person.controller import exists as person_exists, find_one as person_find_one

lends = Blueprint('lend', __name__, url_prefix='/api/lend')

@lends.route('/', methods=['POST'])
def create():
    body = request.get_json()
    if not(person_exists(body['cui'])):
        return {"msg": "person does not exists"}, 404
    if not(book_exists(int(body['isbn']))):
        return {"msg": "book does not exists"}, 404
    person = person_find_one(body["cui"])
    book = book_find_one(int(body['isbn']))
    lend_book(person, book)
    return {"msg": f'"{book.title}" by {book.author} lent to {person.first_name} {person.last_name}'}, 200

@lends.route('/<uuid>', methods=['PATCH'])
def update(uuid):
    if not(exists(uuid)):
        return {"msg": "lend information not found"}, 404
    if is_returned(uuid):
        return {"msg": "book was already returned"}, 422
    lend = return_book(uuid)
    return {"msg": f'{lend.book.first_name} {lend.book.last_name} returned "{lend.book.title}" by {lend.book.author}'}, 200