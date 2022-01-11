//package com.spring.springboot.dao;
//
//import org.springframework.stereotype.Repository;
//import com.spring.springboot.model.User;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import java.util.List;
//
//@Repository
//public class UserDaoImpl implements UserDao {
//
//    @PersistenceContext
//    EntityManager entityManager;
//
//    @Override
//    public List<User> getAllUsers() {
//        return entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
//    }
//
//    @Override
//    public User getUser(int id) {
//        return entityManager.find(User.class, id);
//    }
//
//    @Override
//    public void addUser(User user) {
//        entityManager.persist(user);
//    }
//
//    @Override
//    public void deleteUser(User user) {
//        entityManager.remove(entityManager.contains(user) ? user : entityManager.merge(user));
//    }
//
//    @Override
//    public void editUser(User user) {
//        entityManager.merge(user);
//    }
//
//    @Override
//    public User getByName(String username) {
//        return entityManager.createQuery("SELECT u FROM User u WHERE u.username = :username", User.class)
//                .setParameter("username", username).getSingleResult();
//    }
//}





//package com.spring.springboot.dao;
//
//
//import com.spring.springboot.model.User;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.TypedQuery;
//import java.util.List;
//
//
//@Repository
//public class UserDaoImpl implements UserDao {
//
//    @PersistenceContext(unitName = "entityManagerFactory")
//    private EntityManager entityManager;
//
//
//    @Override
//    public List<User> getAllUsers() {
//        return entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
//    }
//
//    @Override
//    public User getUserById(Long id) {
//        TypedQuery<User> q = entityManager.createQuery("select u from User u where u.id = :id", User.class);
//        q.setParameter("id", id);
//        return q.getResultList().stream().findAny().orElse(null);
//    }
//
//    @Override
//    public void saveUser(User user) {
//        entityManager.persist(user);
//    }
//
//    @Override
//    public void updateUser(User user) {
//        entityManager.merge(user);
//    }
//
//    @Override
//    public void deleteUserById(Long id) {
//        User user = (User) entityManager.createQuery("select u from User u where u.id=?1")
//                .setParameter(1, id)
//                .getSingleResult();
//        entityManager.remove(user);
//    }
//
//    @Override
//    public User getUserByName(String name) {
//        TypedQuery<User> q = entityManager.createQuery("select u from User u where u.name = :name", User.class);
//        q.setParameter("name", name);
//        return q.getResultList().stream().findAny().orElse(null);
//    }
//
//    @Override
//    public User getUserByEmail(String email) {
//        TypedQuery<User> q = entityManager.createQuery("select u from User u where u.email = :email", User.class);
//        q.setParameter("email", email);
//        return q.getResultList().stream().findAny().orElse(null);
//    }
//}