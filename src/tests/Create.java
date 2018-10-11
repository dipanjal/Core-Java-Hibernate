package tests;



import entities.Role;
import entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Create {
    public static void main(String[] args) {
//        SessionFactory factory = new Configuration()
//                .configure()
//                .addAnnotatedClass(Role.class)
//                .addAnnotatedClass(User.class)
//                .buildSessionFactory();
//        
//        Session session = factory.getCurrentSession();
//        session.beginTransaction();
//        
//        //NEW ROLE
//        Role role = new Role();
//        role.name = "Test 9417-1";
//        session.save(role);
//        
//        //EXISTING ROLE
//        //Role role = session.get(Role.class, 1);      
//        
//        User user = new User();
//        user.name = "Test 9417-2";
//        user.userName = "test9417-2";
//        user.password = "0";
//        user.roles.add(role);
//        session.save(user);
//        
//        session.getTransaction().commit();
//        session.close();   
    }
}
