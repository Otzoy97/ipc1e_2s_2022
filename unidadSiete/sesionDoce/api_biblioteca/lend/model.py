from marshmallow import Schema, fields
from datetime import datetime
from uuid import uuid4
from book.model import BookSchema

from person.model import PersonSchema

class Lend():
    def __init__(self, person, book):
        self.uuid = uuid4()
        self.person = person
        self.book = book
        self.lent = datetime.now()
        self.returned = None

class LendSchema(Schema):
    uuid = fields.Str()
    person = fields.Nested(PersonSchema)
    book = fields.Nested(BookSchema)
    lent = fields.DateTime()
    returned = fields.DateTime()