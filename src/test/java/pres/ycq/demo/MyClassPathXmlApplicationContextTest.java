package pres.ycq.demo;

import org.junit.Test;
import pres.ycq.demo.config.MyClassPathXmlApplicationContext;
import pres.ycq.demo.module.User;

public class MyClassPathXmlApplicationContextTest {

    @Test
    public void test(){
        MyClassPathXmlApplicationContext context = new MyClassPathXmlApplicationContext("application.xml");
        User user = (User) context.getBean("user");
        System.out.println("---");
    }
}
