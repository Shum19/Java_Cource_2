package Practice_5.service;

import Practice_5.model.User;
import Practice_5.repository.UserRepository;

import java.util.List;

public class UserServiceImpl implements UserService{
    private UserRepository userRepository = new UserRepository();

    @Override
    public void saveUser(User user) {
        if(user == null){
            System.out.println("User is null!");
        }
        userRepository.saveUser(user);
    }

    @Override
    public void removeUser(int index){
        if(userRepository.getUsers() != null){
            userRepository.removeUser(index);
        }
        else {
            System.out.println("User is null!");
        }
    }

    @Override
    public void updateUser(int index, String name, int age) {
        userRepository.updateUser(index, name, age);
    }

    @Override
    public List<User> showUsers() {
        return userRepository.getUsers();
        }

    @Override
    public User showUser(String name, int age) {
        for (User user:this.userRepository.getUsers()) {
            if (user.getAge() == age && name.equals(user.getName())){
                return user;
            }
        }
        return null;
    }

    @Override
    public double getBalance(int index) {
        return this.userRepository.getBalance(index);
    }

    @Override
    public void showBalance(int index) {
        this.userRepository.showBalance(index);
    }

    @Override
    public int getIndexUser(String name, int age) {
        return this.userRepository.getIndexUser(name, age);
    }

    @Override
    public void withDrawBalance(int index, double subtractingMoney) {
        userRepository.withDrawBalance(index, subtractingMoney);
    }

    @Override
    public void fillBalance(int index, double addedMoney) {
        this.userRepository.fillBalance(index, addedMoney);
    }
}
