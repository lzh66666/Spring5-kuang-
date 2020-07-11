package nuc.ss.service;

import nuc.ss.dao.UserDao;
import nuc.ss.dao.UserDaoMysqlImpl;
import nuc.ss.dao.UserDaoOracleImpl;

public class UserServiceImpl implements UserService {
    //private UserDao userDao = new UserDaoImpl();
    //private UserDao userDao = new UserDaoMysqlImpl();
    //private UserDao userDao = new UserDaoOracleImpl();

    private UserDao userDao;

    // 利用set进行动态实现值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
