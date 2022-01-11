//package com.spring.springboot.dao;
//
//import org.springframework.stereotype.Repository;
//import com.spring.springboot.model.Role;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//
//@Repository
//public class RoleDaoImpl implements RoleDao {
//
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    protected EntityManager getEntityManager() {
//        return this.entityManager;
//    }
//
//
//    @Override
//    public Role getRoleByName(String name) {
//        Role role = null;
//        try {
//            role = getEntityManager().createQuery("SELECT r FROM Role r WHERE r.role=:name", Role.class)
//                    .setParameter("name", name)
//                    .getSingleResult();
//
//        } catch (Exception e) {
//            System.out.println("Роли с таким именем не существует!");
//        }
//        return role;
//    }
//
//    @Override
//    public Role getRoleById(int id) {
//        return getEntityManager().find(Role.class, id);
//    }
//
//}






//package com.spring.springboot.dao;
//
//
//import com.spring.springboot.model.Role;
//import org.springframework.stereotype.Component;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import java.util.Optional;
//
//@Component
//public class RoleDaoImpl implements RoleDao {
//
//    @PersistenceContext(unitName = "entityManagerFactory")
//    private EntityManager manager;
//
//    @Override
//    public Role findRoleByString(String s) {
//        Optional<Role> role = Optional.of((Role) manager.createQuery("select r from Role r where r.role=?1").setParameter(1, s).getSingleResult());
//        return role.get();
//    }
//
//    @Override
//    public Role findRoleById(Long id) {
//        Optional<Role> role = Optional.of((Role) manager.createQuery("select r from Role r where r.id=?1").setParameter(1, id).getSingleResult());
//        return role.get();
//    }
//}