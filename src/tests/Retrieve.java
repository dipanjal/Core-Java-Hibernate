package tests;


import entities.Role;
import entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Retrieve {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Role.class)
                .addAnnotatedClass(User.class)
                .buildSessionFactory();
        
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        
        User user = session.get(User.class, 2);
        for(Role role: user.roles)
        {
            System.out.println(role.name);
        }
           
        
//        Role role = session.get(Role.class, 2);
//        for(User user: role.users)
//            System.out.println(user.name);
        
        session.getTransaction().commit();
        
        session.close();        
    }
}
