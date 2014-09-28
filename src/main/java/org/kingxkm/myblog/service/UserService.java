package org.kingxkm.myblog.service;

import java.util.List;

import org.kingxkm.myblog.entity.User;
import org.kingxkm.myblog.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户管理类.
 *
 * @author calvin
 */
// Spring Service Bean的标识.
@Component
@Transactional
public class UserService {


    @Autowired
    private UserDao userDao;

    public Iterable<User> getAllUser() {
        return userDao.findAll();
    }

    public User getUser(Long id) {
        return userDao.findOne(id);
    }

    public void deleteUser(Long id) {
         userDao.delete(id);
    }

    public User addUser(User user) {return userDao.save(user);
    }
}
