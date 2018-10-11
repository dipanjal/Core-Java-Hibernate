package tests;

import entities.Role;
import entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Delete {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Role.class)
                .addAnnotatedClass(User.class)
                .buildSessionFactory();
        
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        
        Role role = session.get(Role.class, 4);
             
        User user = session.get(User.class, 5);
        user.roles.remove(role);
        
        session.getTransaction().commit();        
        session.close();        
    }
}
