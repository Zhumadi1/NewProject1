import company.dao.UserDao;
import company.model.User;
import company.model.enam.Gender;
import company.service.Impl.UserServiceImpl;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

       User user = new User(1,"Zhumadil",Gender.MALE,24);
       User user1 = new User(2,"Aksana",Gender.FEMALE,24);
       User user2 = new User(3,"Artur",Gender.MALE,14);


      UserServiceImpl userService = new UserServiceImpl();
      userService.addUser(user);
      userService.addUser(user1);
      userService.addUser(user2);
        System.out.println(userService.getUserById(1));
        System.out.println(userService.allUser());
        userService.deleteById(2);
        System.out.println(userService.allUser());


    }
}