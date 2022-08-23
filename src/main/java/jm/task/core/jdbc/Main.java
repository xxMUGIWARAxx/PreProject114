package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;


public class Main {
    public static void main(String[] args) {

        UserDao hibernate = new UserDaoHibernateImpl();

        hibernate.createUsersTable();
        hibernate.saveUser("Joaquin", "Phoenix", (byte) 48);
        hibernate.saveUser("Ryan", "Reynolds", (byte) 46);
        hibernate.saveUser("Jim", "Carrey", (byte) 60);
        hibernate.getAllUsers();

    }
}
