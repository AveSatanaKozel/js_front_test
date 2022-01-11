//package com.spring.springboot.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import com.spring.springboot.dao.RoleDao;
//import com.spring.springboot.model.Role;
//
//@Service
//public class RoleServiceImpl implements RoleService {
//
//    private RoleDao roleDao;
//
//    @Autowired
//    public RoleServiceImpl(RoleDao roleDao) {
//        this.roleDao = roleDao;
//    }
//
//    @Override
//    public Role getRoleByName(String name) {
//        return roleDao.getRoleByName(name);
//    }
//
//    @Override
//    public Role getRoleById(int id) {
//        return roleDao.getRoleById(id);
//    }
//}



package com.spring.springboot.service;

import com.spring.springboot.dao.RoleRepository;
import com.spring.springboot.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.springboot.model.Role;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceImpl(UserRepository userRepository, RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role getRoleByName(String name) {
        return roleRepository.findByRole(name);
    }


    @Override
    public List<Role> allRoles() {
        return roleRepository.findAll();
    }
}




//package com.spring.springboot.service;
//
//import com.spring.springboot.dao.RoleDao;
//import com.spring.springboot.model.Role;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//
//@Service
//@Transactional
//public class RoleServiceImpl implements RoleService {
//
//    private final RoleDao roleDao;
//
//    public RoleServiceImpl(@Autowired RoleDao roleDao) {
//        this.roleDao = roleDao;
//    }
//
//
//    @Override
//    public Role getRoleByString(String s) {
//        return roleDao.findRoleByString(s);
//    }
//
//}
