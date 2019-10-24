package cn.rabbit;

import cn.rabbit.action.ProductAction;
import cn.rabbit.pojo.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


//spring 下的测试需要使用 @RunWith 注解方式来测试，且值为 SpringJUnit4ClassRunner.class
@RunWith(SpringJUnit4ClassRunner.class)

//要使用@ContextConfiguration加载配置类的信息【引入test包】
@ContextConfiguration("classpath:applicationContext.xml")
public class ProductAddTest {
    @Autowired
    private Product product;
    @Autowired
    private ProductAction productAction;
    @Test
    public void test() {
        productAction.add();
        System.out.println(product);
    }
}
