from Product import Product
class Bottle_Of_Water(Product):
    def __init__(self, condition, type):
        self.__condition = condition.upper()
        self.__type = type.upper()
        self.set_price(0)
        self.__athributs =[self.__type, self.__condition, self.get_price()]

    def __str__(self):
        return f"Price {self.get_price()}rub, {self.__condition}, {self.__type} Water"

    def __iter__(self):
        self.__counter = 0
        return self
    def __next__(self):
        if self.__counter >= len(self.__athributs):
            raise StopIteration
        else:
            self.__counter += 1
            return self.__athributs[self.__counter - 1]

