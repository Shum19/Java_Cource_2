from Dog import Dog
from Cat import Cat
from Salmon import Salmon

from src.main.java.Practice_7.Owl import Owl

cat = Cat(True, 10)
cat.set_name("Boris")
cat.set_age(5)
print(cat)

dog = Dog("Doberman", 10)
dog.set_age(3)
dog.set_name("Lucy")
dog.voice()

salmon = Salmon()
salmon.set_cooked(True)
dog.feed(salmon)
dog.voice()


owl = Owl(True, 8)
owl.set_age(2)
owl.set_name("Fluffy")
print(owl)

