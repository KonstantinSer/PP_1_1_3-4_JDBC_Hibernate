package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

    UserDao userDaoHibernate = new UserDaoHibernateImpl();

    @Override
    public void createUsersTable() {
        userDaoHibernate.createUsersTable();

    }

    @Override
    public void dropUsersTable() {
        userDaoHibernate.dropUsersTable();
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        userDaoHibernate.saveUser(name, lastName, age);
    }

    @Override
    public void removeUserById(long id) {
        userDaoHibernate.removeUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDaoHibernate.getAllUsers();
//        List<User> users = userDaoHibernate.getAllUsers();
//        // Гарантируем, что никогда не возвращаем null
//        return users != null ? users : new ArrayList<>();
    }

    @Override
    public void cleanUsersTable() {
        userDaoHibernate.cleanUsersTable();
    }
}
