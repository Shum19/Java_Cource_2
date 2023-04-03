package Home_Task_2;
//Написать простой калькулятор(сложение, вычитание, умножение и деление) в ООП стиле.
public class Home_Task_2_1 {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println(calc.sum(45, 5));
        System.out.println(calc.divide(45, 5));
        System.out.println(calc.multiply(45,5));
        System.out.println(calc.subtract(45, 5));
    }
}
