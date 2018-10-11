package tests;

import entities.Role;
import entities.User;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RetrieveMultiple {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Role.class)
                .addAnnotatedClass(User.class)
                .buildSessionFactory();
        
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        
        //PRINTING FROM USER END
        List<User> userList = session.createQuery("from User").getResultList();
        for(User user: userList){
            for(Role role: user.roles)
                System.out.println(role.name);
        }
        
        //PRINTING FROM ROLE END
//        List<Role> roleList = session.createQuery("from Role").getResultList();        
//        for(Role role: roleList){
//            for(User user: role.users)
//                System.out.println(user.name);
//        }
        
        session.getTransaction().commit();
        
        session.close();        
    }
}
