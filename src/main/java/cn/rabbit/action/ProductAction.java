package cn.rabbit.action;

import cn.rabbit.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
//单例(singleton)和 非单例（prototype）的设置，
//@Scope(value = "singleton")
//是否延迟加载， 只有单例可以设置， 非单例无效
//@Lazy(value = true)
public class ProductAction {
    @Resource(name = "productService")
    private ProductService productService;

    public void add() {
        System.out.println(productService);

        productService.add();
    }
}
