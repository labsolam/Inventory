package Inventorymanagement;

import java.util.InputMismatchException;
import java.util.Scanner;

class Inventory {

    //TODO: Warehouse warehouse = Warehouse.getWarehouse();

    void open(){
        printOptions();

        Scanner scanner = new Scanner(System.in);

        boolean correct;
        int option = -1;

        do {
            try {
                option = scanner.nextInt();

                if(option <= 0 || option > 5){
                    throw new IllegalArgumentException();
                }

                correct = false;

            } catch (InputMismatchException e) {
                System.out.println("Invalid option. Please enter a number from the list");
                printOptions();
                correct = true;
                scanner.nextLine();
            } catch (IllegalArgumentException e){
                System.out.println("Invalid menu option. Please enter a number from the list");
                scanner.nextLine();
                correct = true;
            }
        } while(correct);

        switch(option){
            case 1 : //Print stock
                //TODO: warehouse.printStock();
                break;
            case 2 : //Increasing stock
                break;
            case 3 : //Decreasing stock
                break;
            case 4 : //Add a new item
                break;
            case 5 : //Remove an item from the inventory
                break;
        }
    }

    private void printOptions(){
        System.out.println("1. Check your stock");
        System.out.println("2. Add more stock");
        System.out.println("3. Remove stock");
        System.out.println("4. Add new item");
        System.out.println("5. Remove an item");

        //SHow all items
        //Show only in stock items
        //Show only out of stock items

    }

}