import company.model.User;
import company.model.enam.Gender;
import company.service.Impl.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        User user = new User(1, "Zhumadil", Gender.MALE, 24);
        User user1 = new User(2, "Aksana", Gender.FEMALE, 24);
        User user2 = new User(3, "Artur", Gender.MALE, 14);

        User[] users = new User[]{user, user1, user2};
        UserServiceImpl userService = new UserServiceImpl();
        for (User user3 : users) {
            userService.addUser(user3);
        }
        System.out.println(userService.getUserById(1));
        System.out.println(userService.allUser());
        userService.deleteById(2);
        System.out.println(userService.allUser());


    }
}