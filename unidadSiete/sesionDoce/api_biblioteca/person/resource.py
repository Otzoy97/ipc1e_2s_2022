from flask import Blueprint, request
from person.controller import exists, filter_single, insert, select_all
from person.model import PersonSchema

persons = Blueprint('person', __name__, url_prefix='/api/person')


@persons.route('/', methods=['POST'])
def create():
    body = request.get_json()
    if (exists(body['cui'])):
        return {"msg": "duplicated person"}, 400
    else:
        insert(body)
        return {"msg": "person created"}, 200


@persons.route('/', methods=['GET'])
def list():
    return PersonSchema(many=True, exclude=["available"]).dumps(select_all()), 200


@persons.route('/<cui>', methods=['GET'])
def select(cui):
    data = select_all()
    return PersonSchema(many=True, exclude=["available"]).dumps(filter_single(data, cui)), 200
