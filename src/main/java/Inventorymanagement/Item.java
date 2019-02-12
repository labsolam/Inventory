package Inventorymanagement;

import java.util.Objects;

//Item for the warehouse
class Item {

    private String name;
    private double price; //TODO: Find out what the difference between float and double is. Pro's and cons of using both
    private int stock;

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

    int getStock() {
        return stock;
    }

    double getTotalCost(){
        return getPrice()*getStock();
    }

    void setName(String name) {
        this.name = name;
    }

    void setPrice(double price) {
        this.price = price;
    }

    void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }

        if(!(o instanceof Item)){
            return false;
        }

        Item item = (Item) o;

        return getName().equals(item.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}