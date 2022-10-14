import random


class Mammal():
    def make_sound(self):
        print("Mammal making a sound!")


class Dog(Mammal):
    def __init__(self, name):
        self.__id = random.randint(0, 10)
        self.name = name

    def get_id(self):
        return self.__id

    def make_sound(self):
        print("Woof!")


if __name__ == "__main__":
    dog = Dog("Mauricio")
    dog.make_sound()
    print(dog.get_id())
    print(f'The name of the dog is {dog.name}')
