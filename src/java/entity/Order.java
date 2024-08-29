/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Asus
 */
public class Order {
    private int order_id  ;
    private String customer_name;
    private int order_status;
    private String order_date, required_date, shipped_date;


    public Order() {
    }

    public Order(int order_id, String customer_name, int order_status, String order_date, String required_date, String shipped_date) {
        this.order_id = order_id;
        this.customer_name = customer_name;
        this.order_status = order_status;
        this.order_date = order_date;
        this.required_date = required_date;
        this.shipped_date = shipped_date;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public int getOrder_status() {
        return order_status;
    }

    public void setOrder_status(int order_status) {
        this.order_status = order_status;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public String getRequired_date() {
        return required_date;
    }

    public void setRequired_date(String required_date) {
        this.required_date = required_date;
    }

    public String getShipped_date() {
        return shipped_date;
    }

    public void setShipped_date(String shipped_date) {
        this.shipped_date = shipped_date;
    }

    @Override
    public String toString() {
        return "Order{" + "order_id=" + order_id + ", customer_name=" + customer_name + ", order_status=" + order_status + ", order_date=" + order_date + ", required_date=" + required_date + ", shipped_date=" + shipped_date + '}';
    }

    
    

    
}
