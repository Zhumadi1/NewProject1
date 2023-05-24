package company.dao;

import company.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
  private ArrayList<User> arrayList = new ArrayList<>();

    public ArrayList<User> getArrayList() {
        return arrayList;
    }
}
