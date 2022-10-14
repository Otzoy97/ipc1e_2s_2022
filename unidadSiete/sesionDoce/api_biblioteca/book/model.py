from marshmallow import Schema, fields

class Book():
    def __init__(self, isbn, author, title, year, no_copies):
        self.isbn = isbn
        self.author = author
        self.title = title
        self.year = year
        self.no_copies = no_copies
        self.no_available_copies = no_copies

class BookSchema(Schema):
    isbn = fields.Int()
    author = fields.Str()
    title = fields.Str()
    year = fields.Int()
    no_copies = fields.Int()
    no_available_copies = fields.Int()