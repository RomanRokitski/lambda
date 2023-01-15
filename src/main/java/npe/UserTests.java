package npe;

import java.util.Optional;

public class UserTests {
    public static void main(String[] args) {
        UserService userService = new UserService();

        Optional<User> userOptional = userService.findByEmail("john.doe@gmail.com");

//        if (userOptional.isPresent()) {
//            System.out.println("userOptional.get() = " + userOptional.get());
//        } else {
//            System.out.println("No such user");
//        }

//        User user = userOptional
//                .orElse(new User("default@gmail.com", "Default user"));

 //       User user = userOptional.orElseGet(() -> new User("default@gmail.com", "Default user"));

        userOptional.ifPresentOrElse(
                (u) -> System.out.println("User found: " + u),
                () -> System.out.println("No user found"));

    }
}
