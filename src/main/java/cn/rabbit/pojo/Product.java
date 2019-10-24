package cn.rabbit.pojo;

import org.springframework.stereotype.Component;

import java.util.List;

@Component("product")
public class Product {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Product() { }
    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    //演示 xml 配置文件如果装配集合的
    public Product(List<Integer> list) {
        System.out.println(list);
    }

    private int id;
    private String name;
    private int price;


}
