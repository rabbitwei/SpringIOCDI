package cn.rabbit.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository         //作用同@Component； 在持久层使用, 指定把一个对象加入IOC容器
public class ProductDAO {
    public void add() {
        System.out.println("保存商品");
    }
}
