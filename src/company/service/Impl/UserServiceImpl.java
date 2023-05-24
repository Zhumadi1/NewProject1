package company.service.Impl;
import company.dao.UserDao;
import company.model.User;
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
        for (User user : userDao.getArrayList()) {
            if(user.getId()==id){
                return user;
            }else{
                throw new RuntimeException();
            }
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        for (User user : userDao.getArrayList()) {
            if(user.getId()==id){
                userDao.getArrayList().remove(user);

            }
        }

    }

    @Override
    public ArrayList<User> allUser() {
        return userDao.getArrayList();
    }
}
