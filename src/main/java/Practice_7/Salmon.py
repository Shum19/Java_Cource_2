class Salmon:
    def __init__(self):
        self.__is_cooked = False

    def is_cooked(self):
        return self.__is_cooked
    def set_cooked(self, cooked):
        self.__is_cooked =cooked

    def __str__(self):
        return f"Is cooked {self.__is_cooked}"

