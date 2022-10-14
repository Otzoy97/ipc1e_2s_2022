from marshmallow import Schema, fields
from book.model import BookSchema

class Person():
    def __init__(self, cui, first_name, last_name):
        self.cui = cui
        self.first_name = first_name
        self.last_name = last_name
        self.lends = []
        self.available = True

class PersonSchema(Schema):
    cui = fields.Str()
    first_name = fields.Str()
    last_name = fields.Str()
    lends = fields.Nested(BookSchema(), many=True)
    available = fields.Bool()
