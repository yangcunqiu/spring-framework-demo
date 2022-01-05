package pres.ycq.demo;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pres.ycq.demo.module.User;
import pres.ycq.demo.tag.Person;

public class SimpleTest {

    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        User user = (User) context.getBean("user");
        System.out.println("---");

        Person person = (Person) context.getBean("person");
        System.out.println(person);
    }
}
