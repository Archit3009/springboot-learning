package car.example.constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationConstructorinjection.xml");
        Car mycar = (Car) context.getBean("mycaar");
        mycar.displaydetails();
    }
}
