from VendingMachine import VendingMachine
from Coffee import Coffee
from Chips import Chips
from BottleOfWater import Bottle_Of_Water

coffe_latte = Coffee("Latte", 300)
coffe_latte.set_price(199)

coffe_cappuccino = Coffee("Cappuccino", 400)
coffe_cappuccino.set_price(180)

coffe_americano = Coffee("Americano", 200)
coffe_americano.set_price(120)

coffee_vending_machine = VendingMachine()
coffees = [coffe_americano, coffe_cappuccino, coffe_latte]
for coffee in coffees:
    coffee_vending_machine.add_product(coffee)
coffee_vending_machine.print_all_products()
print("")

coffee_vending_machine.remove_by_name("Latte")
print("")
coffee_vending_machine.print_all_products()
print("")

onion_chips = Chips("Onion", 90)
onion_chips.set_price(110)

garlic_chips = Chips("Garlic", 30)
garlic_chips.set_price(50)

beacon_chips = Chips("Beacon", 90)
beacon_chips.set_price(99)

chips_vending_machine = VendingMachine()
chips = [onion_chips, garlic_chips, beacon_chips]
for chip_bag in chips:
    chips_vending_machine.add_product(chip_bag)
chips_vending_machine.print_all_products()
print("")

chips_vending_machine.remove_by_name("Beacon")
print("")

chips_vending_machine.print_all_products()
print("")

sparkling_water = Bottle_Of_Water("cold", "sparkling")
sparkling_water.set_price(50)

still_water = Bottle_Of_Water("cold", "Still")
still_water.set_price(30)

warm_still_water = Bottle_Of_Water("warm", "still")
warm_still_water.set_price(30)

water_vending_mmachine = VendingMachine()
bottles = [still_water, sparkling_water, warm_still_water]
for bottle in bottles:
    water_vending_mmachine.add_product(bottle)
water_vending_mmachine.print_all_products()
print("")
water_vending_mmachine.remove_product_by_index_position(0)
print("")
water_vending_mmachine.print_all_products()
