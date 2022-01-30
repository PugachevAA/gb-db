package ru.gb;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.gb.config.HibernateConfig;
import ru.gb.dao.ManufacturerDao;
import ru.gb.dao.OldJdbcManufacturerDao;
import ru.gb.dao.OldJdbcProductDao;
import ru.gb.dao.ProductDao;
import ru.gb.entity.Manufacturer;
import ru.gb.entity.Product;

public class ShopApp {



    public static void main(String[] args) {

//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
//        ManufacturerDao manufacturerDao = context.getBean(ManufacturerDao.class);
//        System.out.println(manufacturerDao.findNameById(3L));
//        System.out.println("-----------------------");
//        System.out.println(manufacturerDao.findById(3L));
//        System.out.println("-----------------------");
//        for (Manufacturer manufacturer : manufacturerDao.findAll()) {
//            System.out.println(manufacturer);
//        }

//        AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(DbConfig.class);
        AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(HibernateConfig.class);
        ProductDao productDao = context2.getBean(ProductDao.class);
        System.out.println(productDao.findNameById(65L));
        System.out.println("-----------------------");
        System.out.println(productDao.findById(78L));
        System.out.println("-----------------------");
//        OldJdbcProductDao oldJdbcProductDao = new OldJdbcProductDao();
//        for (Product product : oldJdbcProductDao.findAll()) {
        for (Product product : productDao.findAll()) {
            System.out.println(product);
        }
    }
}
