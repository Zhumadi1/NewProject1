package company.service.Impl;

import company.dao.UserDao;
import company.model.User;
import company.myException.MyException;
import company.service.UserService;

import java.util.ArrayList;

public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDao();

    @Override
    public void addUser(User user) {
        userDao.getArrayList().add(user);
    }

    @Override
    public User getUserById(int id) {
        boolean booleanId = true;

        for (User user : userDao.getArrayList()) {
            if (user.getId() == id) {
                booleanId = false;
                return user;
            }
        }
        if (booleanId) {
            throw new MyException("There in no such ID");
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        boolean bool = true;
        for (User user : userDao.getArrayList()) {
            if (user.getId() == id) {
                userDao.getArrayList().remove(user);
                bool = false;
            }
        }
        if (bool) {
            throw new MyException("There in no such ID");
        }
    }


    @Override
    public ArrayList<User> allUser() {
        return userDao.getArrayList();
    }
}
