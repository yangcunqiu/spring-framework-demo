package pres.ycq.demo.tag;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * @author: wb.cunqiu.yang
 * @date: 2022-01-05 16:58
 */
public class MyTagParser extends AbstractSingleBeanDefinitionParser {

    @Override
    protected Class<?> getBeanClass(Element element) {
        return Person.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        String username = element.getAttribute("username");
        if (StringUtils.hasText(username)){
            builder.addPropertyValue("username", username);
        }
        String password = element.getAttribute("password");
        if (StringUtils.hasText(password)){
            builder.addPropertyValue("password", password);
        }
        String location = element.getAttribute("location");
        if (StringUtils.hasText(location)){
            builder.addPropertyValue("location", location);
        }
    }
}
