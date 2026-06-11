package coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingExample
{
    public static void main(String[] args)
    {
//        UserDataProvider databaseProvider = new UserDatabaseProvider();
//        UserManager userManagerWithDB = new UserManager(databaseProvider);
//        System.out.println(userManagerWithDB.getUserInfo());
//
//        UserDataProvider webServiceProvider = new WebServiceDataProvider();
//        UserManager userManagerWithWS = new UserManager(webServiceProvider);
//        System.out.println(userManagerWithWS.getUserInfo());
//
//        UserDataProvider newDatabaseProvider = new NewDatabaseProvider();
//        UserManager userManagerWithNewDB = new UserManager(newDatabaseProvider);
//        System.out.println(userManagerWithNewDB.getUserInfo());

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationbeaniocconstructorinjection.xml");
        UserManager usermanagerwithdb = (UserManager)context.getBean("usermanagerwithuserdataprovider");
        UserManager usermanagerwithnewdata  = (UserManager) context.getBean("usermanagerwithnewdataprovider");
        UserManager usermanagerwithwebdata = (UserManager) context.getBean("usermanagerwithwebdataprovider");
        System.out.println(usermanagerwithdb.getUserInfo());
        System.out.println(usermanagerwithnewdata.getUserInfo());
        System.out.println(usermanagerwithwebdata.getUserInfo());
    }
}