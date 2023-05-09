from Animal import Animal
from Salmon import Salmon
from src.main.java.Practice_7.main import salmon


class Cat(Animal):


    def __init__(self, in_good_mood, hunger):
        self.__in_good_mood = in_good_mood
        self.__hunger = hunger

    def feed(self, hunger):
        if isinstance(salmon, Salmon):
            if salmon.is_cooked():
                self.__hunger = self.__hunger - 7
            else:
                self.__hunger = self.__hunger -4
        else:
            print("I eat only Salmon")

    def voice(self):
        pass

    def is_in_good_mood(self):
        return self.__in_good_mood

    def set_in_good_mood(self, in_good_mood):
        self.__in_good_mood = in_good_mood

    def get_hunger(self):
        return self.__hunger

    def set_hunger(self, hunger):
        self.__hunger = hunger

    def __str__(self):
        return f"Cat (Name {self.__name}, Age {self.__age}, Is in Good Mood - {self.__in_good_mood}, Hunger {self.__hunger})"

    def set_name(self, name):
        self.__name = name

    def get_name(self):
        return self.__name

    def set_age(self, age):
        self.__age = age

    def get_age(self):
        return self.__age
