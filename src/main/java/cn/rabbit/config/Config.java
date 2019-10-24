package cn.rabbit.config;

import cn.rabbit.dao.ProductDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    //自动装配并不能将第三方库组件装配到应用中，于是需要显式装配配置
    //通过java代码装配bean
    /*
    使用配置类创建bean:

    使用@Bean来修饰方法，该方法返回一个对象。

    不管方法体内的对象是怎么创建的，Spring可以获取得到对象就行了。

    Spring内部会将该对象加入到Spring容器中

    容器中bean的ID默认为方法名
     */
    @Bean
    public ProductDAO userDAO() {
        ProductDAO productDAO = new ProductDAO ();
        System.out.println("我是在config中的"+ productDAO);
        return productDAO;
    }
}
