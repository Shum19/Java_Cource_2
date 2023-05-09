from Product import Product
class Chips(Product):
    def __init__(self, taste, weight):
        self.__taste = taste
        self.__weight = weight
        self.set_price(0)
        self.__athributs = [self.__taste, self.__weight, self.get_price()]

    def __str__(self):
        return f"Price {self.get_price()}rub, Taste {self.__taste}, Weight {self.__weight}gm"
    def __iter__(self):
        self.__counter = 0
        return self
    def __next__(self):
        if self.__counter >= len(self.__athributs):
            raise StopIteration
        else:
            self.__counter += 1
            return self.__athributs[self.__counter - 1]
