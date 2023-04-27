package org.liangfacan53.courses.sf.ssm.spring.schema.ioc.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.liangfacan53.courses.sf.ssm.spring.dao.UserDao;
import org.liangfacan53.courses.sf.ssm.spring.pojo.User;
import org.liangfacan53.courses.sf.ssm.spring.service.UserService;

@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @Override
    public boolean updateUserById(User user, int id) {
        user.setId(id);
        return userDao.updateUserById(user) == 1;
    }

}
