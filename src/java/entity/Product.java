/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Asus
 */
public class Product {
    private int product_id;
    private String product_name;
    private double list_price;
    private String category_name;
    private String img;

    public Product() {
    }

    public Product(int product_id, String product_name, double list_price, String category_name, String img) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.list_price = list_price;
        this.category_name = category_name;
        this.img = img;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public double getList_price() {
        return list_price;
    }

    public void setList_price(double list_price) {
        this.list_price = list_price;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Product{" + "product_id=" + product_id + ", product_name=" + product_name + ", list_price=" + list_price + ", category_name=" + category_name + ", img=" + img + '}';
    }
    
    
    

    
    
    
    
}
