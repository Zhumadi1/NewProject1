package company.service;

import company.model.User;

import java.util.ArrayList;

public interface UserService {
    void addUser(User user);

    User getUserById(int id);

    void deleteById(int id);

    ArrayList<User> allUser();
}
