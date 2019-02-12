package Inventorymanagement;

import java.util.HashSet;

class Warehouse {

    private HashSet<Item> items = new HashSet<>();

    public Warehouse(){
        getItemsFromFile();
    }

    void printStock(){
        if(items.isEmpty()) {
            System.out.println("No items in stock");
            return;
        }

        for(Item item : items){
            System.out.println(item.getName() + " " + item.getPrice() + " " + item.getStock());
        }
    }

    //TODO
    void getItemsFromFile(){
        System.out.println("TODO: getItemsFromFile");
    }

    //boolean TODO: Add item to warehouse - maybe complain if the item is already in the warehouse - throw an error or return false
}
