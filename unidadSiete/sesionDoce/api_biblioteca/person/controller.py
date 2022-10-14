from db.person_db import select, update
from .model import Person

def exists(cui):
    for person in select():
        if person.cui == cui:
            return True
    return False

def find_one(cui):
    for person in select():
        if person.cui == cui:
            return person
    return None

def insert(person):
    data = select()
    data.append(Person(cui=person['cui'],first_name=person['first_name'], last_name=person['last_name']))
    update(data)


def select_all():
    return select()

def filter_single(data, cui):
    return list(filter(lambda b: b.cui == cui, data))