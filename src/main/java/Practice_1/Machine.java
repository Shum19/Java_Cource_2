package Practice_1;

import java.util.ArrayList;
import java.util.List;

/** Интерфейс для реализации методов конкретнных венндинговыхх автоматов которые имеют общие характеристики
 * и могут быть обощенны одним и тем же методом а релезаци метода моджет быть реалезован
 * в конкретнном классе веннденгого автомата.
 * Например мне необходимо создать класс автомат по продаже только воды.
 * Таким образом можно данный интерфейс имплементировать в класс вендингого атомата по продаже воды
 * и реализовать методы согласно тех заданнию.
 */
public interface Machine {
    List<Commodity> item = new ArrayList<>();
    Commodity getItemByType(String type);

    Commodity geItemByPrice(double price);
    void addItem (BottleOfWatter bottle);

}
