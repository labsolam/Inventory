package Inventorymanagement;

import java.util.HashSet;

abstract class Storage {

    private HashSet<Item> items = new HashSet<>();
    private String name;

    Storage(String name){
        this.name = name;
        getItemsFromFile(); //TODO
    }

    private String getName(){
        return name;
    }

    private void setName(String name){
        this.name = name;
    }

    private void printStock(){
        if(items.isEmpty()) {
            System.out.println("No items in stock");
            return;
        }

        for(Item item : items){
            System.out.println(item.getName() + " " + item.getPrice() + " " + item.getStock());
        }
    }

    private boolean addItem(Item item){
        return items.add(item);
    }

    private boolean removeItem(Item item){
        return items.remove(item);
    }

    private void getItemsFromFile(){
        System.out.println("TODO: getItemsFromFile");
    }
}