package User;

import java.util.ArrayList;

public class UserUtils {
    public void printUsers(UserList userList){
        System.out.println("Список всех пользователей");
        for (User user : userList.getUsers()){
            System.out.println("-------------------------");
            System.out.println("Идентификатор: " + user.getId());
            System.out.println("Имя: " + user.getFirstName());
            System.out.println("Фамилия: " + user.getLastName());
            System.out.println("Возраст: " + user.getAge());
            System.out.println("Страна: " + user.getCountry());
        }
    }

    public void allOlder(UserList userList, final int FIXED_AGE){
        System.out.println(userList.usersOlder(FIXED_AGE) ? "\nВсе пользователи старше " + FIXED_AGE : "\nНе менее одного пользователя младше " + FIXED_AGE);
    }

    public void printAverageAge(UserList userList){
        System.out.println("\nСредний возраст пользователей: " + userList.averageAge());
    }

    public void printCountDifferentCountries(UserList userList){
        System.out.println("\nЧисло различных стран: " + userList.countDifferentCountries());
    }

    public void printSortedByLastName(UserList userList){
        userList.sortedByLastName();
        System.out.println("\n-------------------------\nСписок пользователей отсортирован по фамилии\n-------------------------");
    }

    public void printSortedByAge(UserList userList){
        userList.sortedByAge();
        System.out.println("\n-------------------------\nСписок пользователей отсортирован по возрасту\n-------------------------");
    }
}
