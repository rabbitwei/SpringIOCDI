package cn.rabbit.factory;

import cn.rabbit.pojo.Product;

public class ProductFactory {
    //使用一个工厂的静态方法返回一个对象
    public static Product getProduct() {
        return new Product();
    }

    //使用一个工厂的方法返回一个对象
    public Product getProduct2() {
        return new Product();
    }
}
