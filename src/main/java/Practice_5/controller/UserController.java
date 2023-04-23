package Practice_5.controller;

import Practice_5.model.User;
import Practice_5.service.UserService;
import Practice_5.service.UserServiceImpl;

import java.util.ConcurrentModificationException;
import java.util.List;

public class UserController {
    private UserService userService = new UserServiceImpl();
    public void saveUser(String name, int age){
        userService.saveUser(new User(name, age));
    }
    public void removeUser(int index){
            userService.removeUser(index);
    }
    public void showUsers(){
        System.out.println(userService.showUsers());
    }
    public void showUser(String name, int age){
        System.out.println(userService.showUser(name, age));
    }
    public List<User> getUsers(){
        return this.userService.showUsers();
    }
    public User getUser(String name, int age){
        return userService.showUser(name, age);
    }
    public void updateUser(int index, String name, int age){
        userService.updateUser(index, name, age);
    }
    public int getUserIndex(String name, int age){
        return this.userService.getIndexUser(name, age);
    }
    public void showBalance(int index){
        this.userService.showBalance(index);
    }
    public void fillBalance(int index, double addedMoney){
        this.userService.fillBalance(index, addedMoney);
    }
    public void withDrawBalance(int index, double subtractingMoney){
        this.userService.withDrawBalance(index, subtractingMoney);
    }
}
