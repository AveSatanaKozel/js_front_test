package com.spring.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import com.spring.springboot.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<User> getAllUsers();



    void addUser(User user);

    void deleteUser(int id);



    User getByName(String username);

    User getUserById(int id) ;
}


//package com.spring.springboot.service;
//        import org.springframework.security.core.userdetails.UserDetailsService;
//        import com.spring.springboot.model.User;
//
//        import java.util.List;
//
//public interface UserService extends UserDetailsService {
//    List<User> getAllUsers();
//    User getUserById(Long id);
//    void saveUser(User user);
//    void updateUser(User user);
//    void deleteUserById(Long id);
//    User getUserByName(String name);
//    User getUserByEmail(String Email);
//}
