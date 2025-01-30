package User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserList {
    private List<User> users;

    public UserList(){
        users = new ArrayList<>();
    }

    public void addUser(User user){
        users.add(user);
    }

    public List<User> getUsers(){
        return users;
    }

    public void sortedByLastName(){
        users = users.stream().sorted((user1, user2) -> user1.getLastName()
                .compareTo(user2.getLastName()))
                .collect(Collectors.toList());
    }

    public void sortedByAge(){
        users = users.stream().sorted((user1, user2) -> Integer.compare(user1.getAge(), user2.getAge()))
                .collect(Collectors.toList());
    }

    public boolean usersOlder(final int FIXED_AGE){
        return users.stream().allMatch(user -> user.getAge() > FIXED_AGE);
    }

    public double averageAge(){
        return users.stream().mapToDouble(user -> user.getAge()).average().orElse(0.0);
    }

    public long countDifferentCountries(){
        return users.stream().map(user -> user.getCountry()).distinct().count();
    }
}
