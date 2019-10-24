package cn.rabbit;

import cn.rabbit.action.ProductAction;
import cn.rabbit.dao.ProductDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestProduct {
    public static void main(String[] args) {

        // 不论是注解模式，还是配置文件的方式，都需要加载配置文件
       String resources = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resources);
        ProductAction productAction = (ProductAction) ac.getBean("productAction");
        productAction.add();

    }
}
