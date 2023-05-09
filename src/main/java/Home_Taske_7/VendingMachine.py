class VendingMachine:
    def __init__(self):
        self.__products = list()

    def add_product(self, product):
        self.__products.append(product)

    def remove_product_by_index_position(self, index_position):
           self.__products.pop(index_position)
           print(f"{self.__products[index_position]} is removed")


    def get_product(self, product):
        if product in self.__products:
            return product
        else:
            return f"No such {product} in Vending Machine"


    def print_all_products(self):
        for product in self.__products:
            print(product)

    def __str__(self):
        return self.__products

    def remove_by_name(self, name):
        for product in self.__products:
            if name in product:
                self.__products.remove(product)
                print(f"{product} was Removed")

