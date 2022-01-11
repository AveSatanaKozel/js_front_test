////package com.spring.springboot.service;
////
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.security.core.userdetails.UserDetails;
////import org.springframework.security.core.userdetails.UserDetailsService;
////import org.springframework.security.core.userdetails.UsernameNotFoundException;
////import org.springframework.stereotype.Service;
////import com.spring.springboot.dao.UserDao;
////import com.spring.springboot.model.User;
////
////import javax.transaction.Transactional;
////import java.util.List;
////
////@Service
////@Transactional
////public class UserServiceImpl implements UserService, UserDetailsService {
////
////    @Autowired
////    UserDao userDao;
////
////
////    @Override
////    public List<User> getAllUsers() {
////        return userDao.getAllUsers();
////    }
////
////    @Override
////    public User getUser(int id) {
////        return userDao.getUser(id);
////    }
////
////    @Override
////    public void addUser(User user) {
////
////        userDao.addUser(user);
////    }
////
////    @Override
////    public void deleteUser(int id) {
////        userDao.deleteUser(id);
////    }
////
////    @Override
////    public void editUser(User user) {
////        userDao.editUser(user);
////    }
////
////    @Override
////    public User getByName(String username) {
////        return userDao.getByName(username);
////    }
////
////    @Override
////    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
////        User user = userDao.getByName(s);
////        return user;
////    }
////}
//
//
//
//package com.spring.springboot.service;
//
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import com.spring.springboot.dao.RoleRepository;
//import com.spring.springboot.dao.UserRepository;
//import com.spring.springboot.model.Role;
//import com.spring.springboot.model.User;
//
//import java.util.List;
//
//
//@Service
//@Transactional
//public class UserServiceImpl  implements UserService{
//
//    private final UserRepository userRepository;
//
//
//    public UserServiceImpl(UserRepository userRepository) {
//        this.userRepository = userRepository;
//
//    }
//    @Override
//    public void addUser(User user) {
//        userRepository.save(user);
//    }
//
//    @Override
//    public List<User> getAllUsers() {
//        return userRepository.findAll();
//    }
//
//
//    @Override
//    public void deleteUser(int id) {
//        userRepository.deleteById(id);
//    }
//
//
//    @Override
//    public User getByName(String username) {
//        return null;
//    }
//
//    @Override
//    public User getUserById(int id) {
//        return userRepository.findById(id).get();
//    }
//
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        return userRepository.findByName(username);
//    }
//
//}
//
//
//
////package com.spring.springboot.service;
////
////
////        import com.spring.springboot.dao.UserDao;
////        import com.spring.springboot.model.User;
////        import org.springframework.beans.factory.annotation.Autowired;
////        import org.springframework.security.core.userdetails.UserDetails;
////        import org.springframework.security.core.userdetails.UserDetailsService;
////        import org.springframework.security.core.userdetails.UsernameNotFoundException;
////        import org.springframework.stereotype.Service;
////        import org.springframework.transaction.annotation.Transactional;
////
////        import java.util.List;
////
////@Service
////@Transactional
////public class UserServiceImpl implements UserService, UserDetailsService {
////    private final UserDao userDao;
////
////    public UserServiceImpl(@Autowired UserDao userDao) {
////        this.userDao = userDao;
////    }
////
////    @Override
////    public List<User> getAllUsers() {
////        return userDao.getAllUsers();
////    }
////
////    @Override
////    public User getUserById(Long id) {
////        return userDao.getUserById(id);
////    }
////
////    @Override
////    public void saveUser(User user) {
////        userDao.saveUser(user);
////    }
////
////    @Override
////    public void updateUser(User user) {
////        userDao.updateUser(user);
////    }
////
////    @Override
////    public void deleteUserById(Long id) {
////        userDao.deleteUserById(id);
////    }
////
////    @Override
////    public User getUserByName(String name) {
////        return userDao.getUserByName(name);
////    }
////
////    @Override
////    public User getUserByEmail(String Email) {
////        return userDao.getUserByEmail(Email);
////    }
////
////    @Override
////    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
////        User user = userDao.getUserByName(s);
////        return user;
////    }
////}
//
