package Practice_5.view;

import Practice_5.controller.UserController;
import Practice_5.model.User;

import java.util.ConcurrentModificationException;
import java.util.Scanner;

public class UserView {
    public static void main(String[] args) throws Exception {
        UserController userController = new UserController();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Choose option 1 - 7:" +
                                "\n 1. Save User." +
                                "\n 2. Show all Users." +
                                "\n 3. Show User" +
                                "\n           Update;" +
                                "\n           Remove;" +
                                "\n           Show Balance" +
                                "\n           Fill Balance" +
                                "\n           Withdraw Money." +
                                "\n 4. Exit");
            String input =  scanner.next();
            switch (input){
                case "1": //1. Save User.
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    userController.saveUser(name, age);
                    System.out.println("saved");
                    break;

                case "2": // 2. Show all Users."
                    userController.showUsers();
                    break;

                case "3": // 3. Show User(Sub Menu: Update; Remove...)"
                    boolean flagFifthCase = true;
                    System.out.print("Enter name: ");
                    String findName = scanner.next();
                    System.out.print("Enter age: ");
                    int findAge = scanner.nextInt();
                    userController.showUser(findName, findAge);
                    while (flagFifthCase){
                        int index = 0;
                        System.out.println("Edit Menu:" +
                                            "\n1. Remove User " +
                                            "\n2. Update User" +
                                            "\n3. Show Balance" +
                                            "\n4. Fill Balance" +
                                            "\n5. Withdraw balance" +
                                            "\n6. Return Back");
                        String inputInFifthCase =  scanner.next();
                        switch (inputInFifthCase){

                            case "1"://1. Remove User "
                                index = userController.getUserIndex(findName, findAge);
                                userController.removeUser(index);
                                System.out.printf("%s, %d was removed\nUpdated User List\n", findName, findAge );
                                userController.showUsers();
                                flagFifthCase = false;
                                break;

                            case "2"://2. Update User
                                boolean flagCaseSecondInCaseFifth = true;
                                while (flagCaseSecondInCaseFifth){
                                    System.out.println("Update Menu:" +
                                            "\n1. Edit Name " +
                                            "\n2. Edit Age" +
                                            "\n3. Full Edition" +
                                            "\n4. Return Back");
                                    String caseSecondInCaseFifth =  scanner.next();
                                    switch (caseSecondInCaseFifth){
                                        case "1": //. Edit Name "
                                            index = userController.getUserIndex(findName, findAge);
                                            System.out.print("Enter new name ");
                                            String newName = scanner.next();
                                            userController.updateUser(index, newName, findAge);
                                            System.out.printf("Name %s, was changed. New name %s\n", findName, newName);
                                            findName = newName;
                                            System.out.println(userController.getUsers().get(index));
                                            break;
                                        case "2": // 2. Edit Age"
                                            index = userController.getUserIndex(findName, findAge);
                                            System.out.print("Enter new age ");
                                            int newAge = scanner.nextInt();
                                            userController.updateUser(index, findName, newAge);
                                            System.out.printf("Age %d, was changed. New age %d\n", findAge, newAge);
                                            findAge = newAge;
                                            System.out.println(userController.getUsers().get(index));
                                            break;
                                        case "3": // 3. Full Edition"
                                            index = userController.getUserIndex(findName, findAge);
                                            System.out.print("Enter new name ");
                                            String newNameThirdCase = scanner.next();
                                            System.out.print("Enter new age ");
                                            int newAgeThirdCase = scanner.nextInt();
                                            userController.updateUser(index, newNameThirdCase, newAgeThirdCase);
                                            findName = newNameThirdCase;
                                            findAge = newAgeThirdCase;
                                            System.out.println("User fully updated\n" +  userController.getUsers().get(index));
                                            break;
                                        case "4"://4. Return Back"
                                            flagCaseSecondInCaseFifth = false;
                                    }
                                }
                                break;
                            case "3"://Show Balance;
                                index = userController.getUserIndex(findName, findAge);
                                userController.showBalance(index);
                                break;
                            case "4":// 2. Fill Balance.
                                index = userController.getUserIndex(findName, findAge);
                                System.out.printf("Enter amount of money to fill %s's Balance\n", findName);
                                double addedMoney = scanner.nextDouble();
                                userController.fillBalance(index, addedMoney);
                                System.out.printf("New %s's Balance - ", findName);
                                userController.showBalance(index);
                                break;

                            case "5": // Withdraw Balance
                                index = userController.getUserIndex(findName, findAge);
                                System.out.printf("Enter amount of money to withdraw %s's Balance\n", findName);
                                double subtractMoney = scanner.nextDouble();
                                userController.withDrawBalance(index, subtractMoney);
                                System.out.printf("New %s's Balance - ", findName);
                                userController.showBalance(index);
                                break;
                            case "6"://4. Return Back
                                flagFifthCase =false;
                        }
                    }
                    break;
                case "4": // 6. Exit"
                    flag = false;
            }
        }
    }
}
