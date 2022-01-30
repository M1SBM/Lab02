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

public class Product {

   public void productType() {
    System.out.println("The product has a type");
  }
    private int id;
  private double price;
  private String name;
  private int quantity;
  
  public Product(int id, double price, String name){
    this.id = id;
    this.price = price;
    this.name = name;
  }

  
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int newQuantity) {
    this.quantity = newQuantity;
  }

  public void applySaleDiscount(double percentage){
    this.price = this.price - ((percentage/100) * this.price);
  }

  public void addToShoppingCart(){
    System.out.println(this.name + " has been added to the shopping cart.");
  }

  public void printTotalQuantity(){
    System.out.println("Total Quantity: " + getQuantity());
  }
  
  public void getSellableStatus(){
    System.out.println("This product is sellable");
  }

  public String toString(){
    return "Product info:\n+Id: " + this.id + "\t" + "name: " + this.name +
      "\tPrice: SR" + this.price;
  }
}


 class FoodProduct extends Product{

  public void productType() {
    System.out.println("The product type is food");
  }
  private LocalDate expirationDate;

  public FoodProduct(int id, double price, String name, LocalDate expirationDate){
    super(id, price, name);
    this.expirationDate = expirationDate;
  }

  @Override
  public String toString(){
    return super.toString() +"\t Expiration Date: " + this.expirationDate;
  }
}

 class ElectricProduct extends Product{


   public void productType() {
    System.out.println("The product type is electric");
  }
  private String voltage;

  public ElectricProduct(int id, double price, String name, String voltage){
    super(id, price, name);
    this.voltage = voltage;
  }

  @Override
  public String toString(){
    return super.toString() +"\t Voltage: " + this.voltage;
  }

}
