package Practice_5.model;

/** Добавить операции удаления, изменения и вывода пользователей
 * ДЗ
 *      Реализовать систему работы банковского приложения.
 *      - Создать класс пользователь и соответсвующие классы
 *      - Реализовать операции зачисления средств пользователю на счет и списания
 *        (У пользователя должно быть отдельное поле - его балланс)
 *      - Реализовать функции добавления и удаления пользователя
 */
public class User {
    private String name;
    private int age;
    private double balance;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.balance = 0.0;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public boolean equalUser(User oteherUser){
        if (this.name.equals(oteherUser.getName()) && this.age == oteherUser.getAge()){
            return true;
        }
        return false;
    }

    public void addBalance(double balance) {
        this.balance = this.balance + balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }
    public void printBalance(){
        System.out.printf("Balance - %d $", this.getBalance());
    }
    @Override
    public String toString() {
        return String.format("Name: %s, Age: %d", this.name, this.age);
    }
}
