/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

/**
 *
 * @author SATTAM
 */
import java.time.LocalDate;

public class App {
    public static void main(String[]args){
    
    Product p = new Product(1234, 9.99, "water");
    Product electric = new ElectricProduct(4875, 30.0, "Extension cord", "220v");
    Product food = new FoodProduct(3452, 10.0, "Cheddar Cheese",LocalDate.parse("2022-06-07"));
    p.productType();
    electric.productType();
    food.productType();
  }
}
