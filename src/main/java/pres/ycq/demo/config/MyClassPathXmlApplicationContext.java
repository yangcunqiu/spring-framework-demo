package pres.ycq.demo.config;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

    public MyClassPathXmlApplicationContext(String... configLocations){
        super(configLocations);
    }

    @Override
    protected void initPropertySources() {
        // 设置Spring容器启动时必须的环境参数, Spring会进行校验
        getEnvironment().setRequiredProperties("abc");
    }

    @Override
    protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
        // 是否允许覆盖BeanDefinition
        setAllowBeanDefinitionOverriding(false);
        // 是否允许自动解决循环依赖
        setAllowCircularReferences(false);
        // 调用父类方法将自定义的属性设置到beanFactory中
        super.customizeBeanFactory(beanFactory);
    }
}
