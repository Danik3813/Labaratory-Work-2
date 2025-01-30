//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import User.*;

public class Main {
    public static void main(String[] args) {
        UserList userList = new UserList();

        User user1 = new User(1, "Джон", "Смит", 21, "Россия");
        User user2 = new User(2, "Иван", "Иванов", 18, "США");
        User user3 = new User(3, "Петр", "Петров", 6, "Россия");

        //Добавление пользователей
        userList.addUser(user1);
        userList.addUser(user2);
        userList.addUser(user3);

        UserUtils userUtils = new UserUtils();
        userUtils.printUsers(userList);
        //Сортировка по фамилии
        userUtils.printSortedByLastName(userList);
        userUtils.printUsers(userList);

        //Сортировка по возрасту
        userUtils.printSortedByAge(userList);
        userUtils.printUsers(userList);

        userUtils.allOlder(userList, 7);
        userUtils.printAverageAge(userList);
        userUtils.printCountDifferentCountries(userList);
    }
}