package model;

import java.util.List;
import java.util.Scanner;

import dao.ProductDAO;

public class Product {

    private int id;
    private String name;
    private Integer code;
    private Integer quantity;
    private Double price;

    List<Product> list;

    public Product() {
    }

    public Product(Product cadastrarProduto) {

    }

    public Product(String name, Integer code, Integer quantity, Double price) {
        super();
        this.name = name;
        this.code = code;
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getID() {
        return id;
    }

    public void setID(Integer id) {
        this.code = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // 1 - foi encontrado | 0 - n�o foi encontrado
    public static int verificarCodigo(int code, List<Product> list2) {
        int encontrado = 0;
        for (Product p : list2) {
            if (code == p.getCode()) {
                encontrado = 1;
                return encontrado;
            }
        }
        return encontrado;
    }

    @Override
    public String toString() {
        return "Product: " + name + "\ncode: " + code + "\nquantity: " + quantity + "\nprice: " + price;
    }

}
