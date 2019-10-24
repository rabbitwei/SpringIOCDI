package cn.rabbit;

import cn.rabbit.action.ProductAction;
import cn.rabbit.dao.ProductDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestProduct {
    public static void main(String[] args) {

        //需要获取配置信息
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        //注解将 ProductAction 添加到 IOC 容器中了
        ProductAction productAction = (ProductAction) ac.getBean("productAction");
        ProductAction productAction2 = (ProductAction) ac.getBean("productAction");
        System.out.println(productAction == productAction2);

        productAction.add();
    }
}
