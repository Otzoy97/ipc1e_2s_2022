## Python soporta 4 tipos de estructuras de datos:
# (1) Diccionarios
# (2) Listas
# (3) Tuplas
# (4) Sets

# Más info de sobre diccionarios en python
# https://www.freecodecamp.org/news/create-a-dictionary-in-python-python-dict-methods/
dict = {
    'key1': 'value1',
    'key2': 'value2',
    'key3': 'value3',
    'key4': 'value4',
    'key5': 'value5'
}

# Más info de sobre listas en python
# https://www.freecodecamp.org/news/lists-in-python-comprehensive-guide/
list = ['a', 1, [4, 'a', {'key1': 'value1'}]]

# Más info de sobre tuplas en python
# https://forum.freecodecamp.org/t/the-ultimate-guide-to-python-tuples-python-data-structure-tutorial-with-code-examples/19165
tuple = ("a", 1, "c", {'key1': 'value1'})

# Más info de sobre tuplas en python
# https://www.freecodecamp.org/news/python-sets-detailed-visual-introduction/
set = {'a', 1, 4, 'abecedario'}


if __name__ == "__main__":
    print(dict)
    print(list)
    print(tuple)
    print(set)
