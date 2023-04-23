package Practice_5.repository;

import Practice_5.model.User;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

public class UserRepository implements Iterator<User> {
    private int counter;
    private List <User> users;
    public UserRepository(){
         this.counter = 0;
         this.users = new ArrayList<>();
    }
    public void saveUser(User user){
        this.users.add(user);

//        try (FileWriter fileWriter = new FileWriter("user.txt", true)){
//            fileWriter.write( user.toString() + "\n");
//        }catch (Exception e){
//            System.out.println("error in repo");
    }
    public List<User> getUsers(){
        return this.users;
    }
    public void removeUser(int index){
            this.users.remove(index);
    }
    public void updateUser(int index, String name, int age){
        this.users.get(index).setName(name);
        this.users.get(index).setAge(age);
    }
    public double getBalance(int index){
        return this.users.get(index).getBalance();
    }
    public void showBalance(int index){
        System.out.printf("Dear %s your Balance - %s $\n",this.users.get(index).getName(), this.users.get(index).getBalance());
    }

    public void fillBalance(int index, double additionMoney){
        this.users.get(index).addBalance(additionMoney);
    }

    public void withDrawBalance(int index, double subtractingMoney){
        double currantBalance = this.users.get(index).getBalance();
        double newBalance;
        if (subtractingMoney < currantBalance){
            newBalance = currantBalance - subtractingMoney;
            this.users.get(index).setBalance(newBalance);
        }else {
            newBalance = subtractingMoney - currantBalance;
            this.users.get(index).setBalance(newBalance);
        }
    }
    public int getIndexUser(String name, int age){
        User otherUser = new User(name, age);
        int index = 0;
        int counter = 0;
        for (User user:this.users) {
            if (user.equalUser(otherUser))
                index = counter;
            counter++;
        }
        return index;
    }


    @Override
    public boolean hasNext() {
        return this.counter < this.users.size();
    }

    @Override
    public User next() {
        if (!hasNext()){return null;}
        return this.users.get(counter++);
    }
}
