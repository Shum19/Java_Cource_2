package Practice_5.service;

import Practice_5.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);
    void removeUser(int index);
    void updateUser(int index, String name, int age);
    List<User> showUsers();
    User showUser(String name, int age);
    double getBalance(int index);
    void showBalance(int index);
    int getIndexUser(String name, int age);
    void fillBalance(int index, double addedMoney);
    void withDrawBalance(int index, double subtractingMoney);

}
