package pres.ycq.demo.tag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author: wb.cunqiu.yang
 * @date: 2022-01-05 17:01
 */
public class MyTagHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("zml", new MyTagParser());
    }
}
