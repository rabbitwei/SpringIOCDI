package cn.rabbit.service;

import cn.rabbit.dao.ProductDAO;
import org.springframework.stereotype.Service;

//@Resource 注解需要而外添加 依赖
import javax.annotation.Resource;

@Service
public class ProductService {

    @Resource(name = "productDAO")
    private ProductDAO productDAO;
    public void add() {
        productDAO.add();
    }
}
