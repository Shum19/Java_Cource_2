package Practice_1;

/** Класс который наследуется от общего класса Тоовары и в
 *  этом классе добаввлено поеле condition которое будет подорузомевать
 *  что вода газированая или негаззированная
 */
public class BottleOfWatter extends Commodity{
    protected String condition;
    public BottleOfWatter(){
        super.type = "";
        super.price = 0.0d;
        this.condition= "";
    }

    @Override
    String getType() {
        return super.type;
    }

    @Override
    double getPrice() {
        return super.price;
    }

    @Override
    public void setType(String type){
        super.type = type;
    }
    @Override
    public void setPrice(double price){
        super.price = price;
   }
    public void setCondition(String condition){
        this.condition = condition;
   }
    public String getCondition(){
        return condition;
   }
    @Override
    public String toString(){
        String data = String.format("%s, %s, Cost: %s", condition, super.type, super.price);
        return data;
   }
}
