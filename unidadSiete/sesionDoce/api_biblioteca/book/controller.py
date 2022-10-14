from db.books_db import select, update
from .model import Book

def exists(isbn):
    for book in select():
        if book.isbn == isbn:
            return True
    return False

def find_one(isbn):
    for book in select():
        if book.isbn == isbn:
            return book
    return None

def insert(book):
    data = select()
    data.append(Book(isbn=book['isbn'], author=book['author'], title=book['title'], year=int(book['year']), no_copies=int(book['no_copies'])))
    update(data)


def select_all():
    return select()


def filter_title(books_data, title):
    if title == None:
        return select_all()
    return list(filter(lambda b: b.title == title, books_data))


def filter_year_range(books_data, year_from=0, year_to=3000):
    if year_from == None:
        year_from = 0
    if year_to == None:
        year_to = 3000
    return list(filter(lambda b: b.year >= int(str(year_from)) and b.year <= int(str(year_to)), books_data))


def filter_author(books_data, author):
    if author == None:
        return select_all()
    return list(filter(lambda b: b.author == author, books_data))
