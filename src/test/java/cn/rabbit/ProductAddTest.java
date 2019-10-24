package cn.rabbit;

import cn.rabbit.pojo.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


//注解方式的测试
@RunWith(SpringJUnit4ClassRunner.class)
//要使用@ContextConfiguration加载配置类的信息【引入test包】
@ContextConfiguration("classpath:applicationContext.xml")
public class ProductAddTest {
    //注解的方式
    @Autowired
    Product product;
    @Test
    public void test() {
        //xml 配置文件的方式
//        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ProductAction productAction = (ProductAction) ac.getBean("productAction");
//        productAction.add();
        System.out.println(product);
    }
}
