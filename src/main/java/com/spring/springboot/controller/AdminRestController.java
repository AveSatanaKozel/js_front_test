package com.spring.springboot.controller;

import com.spring.springboot.model.Role;
import com.spring.springboot.model.User;
import com.spring.springboot.service.RoleService;
import com.spring.springboot.service.UserService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/users")
public class AdminRestController {

    private UserService userService;
    private final RoleService roleService;

    @Autowired
    public AdminRestController(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

//    @GetMapping("/user")
//    public List<User> getAllUsers() {
//        List<User> allUsers = userService.getAllUsers();
//        return allUsers;
//    }
//
////    @GetMapping(value = "/user")
////    public ResponseEntity<List<User>> getAllUsers() {
////        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
////    }
//
//    @PostMapping("/adduser")
//    public String saveUser(@RequestParam("username") String username,
//                           @RequestParam("city") String city,
//                           @RequestParam("email") String email,
//                           @RequestParam("password") String password,
//                           @RequestParam(required = false, name = "ROLE_ADMIN") Set<String> roleAdmin) {
//
//        Set<Role> roles = new HashSet<>();
//        if (roleAdmin.size() == 1 && roleAdmin.contains("ROLE_ADMIN")) {
//            roles.add(roleService.getRoleByName("ROLE_ADMIN"));
//        } else {
//            roles.add(roleService.getRoleByName("ROLE_USER"));
//        }
//        System.out.println(roleAdmin);
//
//        if (roleAdmin.size() == 2) {
//            roles.add(roleService.getRoleByName("ROLE_ADMIN"));
//            roles.add(roleService.getRoleByName("ROLE_USER"));
//        }
//
//        User user = new User(username, city, email, password, roles);
//        user.setRoles(roles);
//
//
//        try {
//            userService.addUser(user);
//        } catch (Exception ignored) {
//
//        }
//        roleAdmin.clear();
//        return "redirect:/admin";
//    }
//
//
//    @PostMapping("/users")
//    public String updateUser(@RequestBody UserDto user,
//                             @RequestParam(required = false, name = "ROLE_ADMIN") Set<String> roleAdmin) {
//
//        Set<Role> roles = new HashSet<>();
//
//        if (roleAdmin.size() == 1 && roleAdmin.contains("ROLE_ADMIN")) {
//            roles.add(roleService.getRoleByName("ROLE_ADMIN"));
//        } else {
//            roles.add(roleService.getRoleByName("ROLE_USER"));
//        }
//        System.out.println(roleAdmin);
//
//        if (roleAdmin.size() == 2) {
//            roles.add(roleService.getRoleByName("ROLE_ADMIN"));
//            roles.add(roleService.getRoleByName("ROLE_USER"));
//        }
//
//        user.setUserName(username);
//        user.setCity(city);
//        user.setEmail(email);
//        user.setPassword(password);
//        user.setRoles(roles);
//
//
//        try {
//            userService.addUser(user);
//        } catch (Exception ignored) {
//
//        }
//
//        user.setRoles(roles);
//        userService.editUser(user);
//        return "redirect:/admin";
//    }
//
//    @DeleteMapping("/users/{id}")
//    public String deleteUser(@PathVariable("id") int id) {
//        User user = userService.getUser(id);
//
//        userService.deleteUser(userService.getUser(id));
//
//        return "User : " + userService.getUser(id).getUserName() + "was deleted";
//    }
//
////    @GetMapping("/user")
////    public User showUser() {
////        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
////        return user;
////    }
//



    @GetMapping()
    public List<User> allUsers() {                     // выводит всех User's
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") int id) {         //User по id
        return userService.getUserById(id);
    }

    @PostMapping()
    public User addUser(@RequestBody User user) {          // добавить User
        userService.addUser(user);
        return user;
    }

    @PutMapping()
    public User editUser(@RequestBody User user) {               // изменить User
        userService.addUser(user);
        return user;
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") int id) {           // удалить User по  id
        userService.deleteUser(id);
    }

//    @GetMapping ("/user")
//    public ResponseEntity<User> getActiveUser() {
//        System.out.println(SecurityContextHolder.getContext().getAuthentication().getPrincipal());
//        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//
//        return new ResponseEntity<>(user, HttpStatus.OK);
//    }


//        @ResponseBody
//    @GetMapping("/thisUser")
//    public User getUs(HttpServletRequest request) {
//        Principal principal = request.getUserPrincipal();
//        User user;
//        user = userService.getByName(principal.getName());
//        return user;
//    }







//    @GetMapping("/roles")
//    public List<Role> allRoles() {                     // вывести роли
//        return userService.allRoles();
//    }

}




