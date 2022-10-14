from datetime import datetime
from db.lend_db import select, update
from lend.model import Lend


def lend_book(person, book):
    data = select()
    person.available = False
    book.no_available_copies = book.no_available_copies - 1
    lend_record = Lend(person=person, book=book)
    person.lends.append(lend_record)
    data.append(lend_record)
    update(data)


def find_one(uuid):
    data = select()
    for lend in data:
        if lend.uuid == uuid:
            return lend
    return None

def return_book(uuid):
    lend = find_one(uuid)
    lend.person.available = True
    lend.book.no_available_copies = lend.book.no_available_copies + 1
    lend.returned = datetime.now
    return lend

def is_returned(uuid):
    lend = find_one(uuid)
    return lend.returned == None

def exists(uuid):
    data = select()
    for lend in data:
        if lend.uuid == uuid:
            return True
    return False