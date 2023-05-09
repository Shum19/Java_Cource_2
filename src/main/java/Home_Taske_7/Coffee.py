from Product import Product


class Coffee(Product):
    def __init__(self, type, volume):
        self.__type = type
        self.__volume = volume
        self.set_price(0)
        self.__athributs = [self.__type, self.__volume, self.get_price()]

    def get_type(self):
        self.__type

    def __str__(self):
        return f"Price {self.get_price()}rub, Type {self.__type}, Volume {self.__volume}ml"

    def __iter__(self):
        self.__counter = 0
        return self

    def __next__(self):
        if self.__counter >= len(self.__athributs):
            raise StopIteration
        else:
            self.__counter += 1
            return self.__athributs[self.__counter - 1]
