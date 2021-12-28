package pres.ycq.demo;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pres.ycq.demo.module.User;

public class SimpleTest {

    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        User user = (User) context.getBean("user");
        System.out.print("---");
    }
}
