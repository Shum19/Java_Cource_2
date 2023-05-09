from Animal import Animal
from Salmon import Salmon
class Dog(Animal):
    def __init__(self, breed, hunger):
        self.__breed = breed
        self.__hunger = hunger
        self.__age = 0
        self.__name = "No name is set"

    def voice(self):
        if self.__hunger > 5:
            print("Wofff Wofff Wofff")
        elif self.__hunger > 3 or self.__hunger <= 5:
            print("Wof Wof")

    def feed(self, salmon):
        if isinstance(salmon, Salmon):
            if salmon.is_cooked():
                self.__hunger = self.__hunger - 5
            else:
                self.__hunger = self.__hunger -1
        else:
            print("I eat only Salmon")

    def set_name(self, name):
        self.__name = name

    def get_name(self):
        return self.__name

    def set_age(self, age):
        self.__age = age

    def get_age(self):
        return self.__age
    def __str__(self):
        return f"Dog (Name: {self.__name}, Age {self.__age}, Breed {self.__breed}, Hunger {self.__hunger})"
