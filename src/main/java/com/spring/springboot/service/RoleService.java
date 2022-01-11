package com.spring.springboot.service;

import com.spring.springboot.model.Role;

import java.util.List;

public interface RoleService {
    Role getRoleByName(String name);

    List<Role> allRoles();
}


//package com.spring.springboot.service;
//
//import com.spring.springboot.model.Role;
//
//public interface RoleService {
//    Role getRoleByString(String s);
//}
