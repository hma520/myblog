package org.kingxkm.myblog.repository;

import org.kingxkm.myblog.entity.User;
import org.springframework.data.repository.CrudRepository;


public interface UserDao extends CrudRepository<User, Long> {


}
