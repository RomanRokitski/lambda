package npe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public class UserService {
    private Collection<User> users;

    public UserService() {
        users = new ArrayList<>();

        addUser("john.doe@gmail.com", "John Doe");
        addUser("max.rogov@gmail.com", "Max Rogov");
    }

    private void addUser(String email, String name) {
        users.add(new User(email, name));
    }

    public Optional <User> findByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return Optional.of(user);
            }
        }

        return Optional.empty();
    }
}
