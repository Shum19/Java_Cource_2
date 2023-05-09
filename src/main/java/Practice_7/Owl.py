from Animal import Animal
from Salmon import Salmon
class Owl(Animal):
    def __init__(self, is_domestic, hunger):
        self.__is_domestic = is_domestic
        self.__hunger = hunger
        self.__age = 0
        self.__name = "No name is set"
    def voice(self):
        pass

    def feed(self, hunger):
        from src.main.java.Practice_7.main import salmon
        if isinstance(salmon, Salmon):
            if salmon.is_cooked():
                self.__hunger = self.__hunger - 9
            else:
                self.__hunger = self.__hunger -5
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
        return f"Owl (Name {self.__name}, Age {self.__age}, Is Domestic - {self.__is_domestic}, Hunger {self.__hunger})"