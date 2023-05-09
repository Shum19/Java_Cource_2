from abc import ABC, abstractmethod
class Animal(ABC):
    @abstractmethod
    def voice(self):
        pass

    @abstractmethod
    def feed(self, hunger):
        pass

    @abstractmethod
    def set_name(self, name):
        pass

    @abstractmethod
    def get_name(self):
        pass

    @abstractmethod
    def set_age(self, age):
        pass
    @abstractmethod
    def get_age(self):
        pass
