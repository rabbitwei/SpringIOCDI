package cn.rabbit;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //通过Resource获取BeanFactory, 这种方式不常用了
        /*
        //加载Spring的资源文件
        Resource resource = new ClassPathResource("applicationContext.xml");

        //创建IOC容器对象【IOC容器=工厂类+applicationContext.xml】
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        */

        //类路径下XML获取ApplicationContext， 常用的方式
        String resource = "applicationContext.xml";
        // 得到IOC容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        // 获取 IOC 容器里指定 id 的 bea
        System.out.println(ac.getBean("product"));

        // 获取 带参构造函数的 bean
        System.out.println(ac.getBean("product2"));

        //获取 由工厂类的静态方法创建的 bean
        System.out.println(ac.getBean("product3"));

        //获取 由工厂类的方法创建的 bean
        System.out.println(ac.getBean("product4"));


        //获取 构造函数的参数是集合，xml 方式装配集合的bean
        System.out.println(ac.getBean("product5"));

    }
}
