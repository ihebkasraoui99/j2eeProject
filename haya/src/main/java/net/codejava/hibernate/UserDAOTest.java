package net.codejava.hibernate;
 
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
 
/**
 * UserDAOTest.java
 * Copyright by CodeJava.net
 */
public class UserDAOTest {
 
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("UsersDB");
        EntityManager entityManager = factory.createEntityManager();
         
        entityManager.getTransaction().begin();
         
        User newUser = new User();
        newUser.setEmail("billjoy@gmail.com");
        newUser.setFullname("bill Joy");
        newUser.setPassword("billi");
         
        entityManager.persist(newUser);
         
        entityManager.getTransaction().commit();
         
        entityManager.close();
        factory.close();
    }
}