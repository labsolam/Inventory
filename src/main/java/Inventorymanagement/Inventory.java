package Inventorymanagement;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class Inventory {

    private List<Inventory> warehouses = new ArrayList<>();

    void open(){

        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        boolean correct;
        int option = -1;

        do {
            do {
                try {
                    printOptions();
                    option = scanner.nextInt();

                    if (option <= 0 || option > 8) {
                        throw new IllegalArgumentException();
                    }

                    correct = false;

                } catch (InputMismatchException e) {
                    System.out.println("Invalid option. Please enter a number from the list");
                    printOptions();
                    correct = true;
                    scanner.nextLine();
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid menu option. Please enter a number from the list");
                    scanner.nextLine();
                    correct = true;
                }
            } while (correct);

            switch (option) {
                case 1: //TODO
                    break;
                case 2: //TODO
                    break;
                case 3: //TODO
                    break;
                case 4: //TODO
                    break;
                case 5: //TODO
                    break;
                case 6: //TODO
                    break;
                case 7: //TODO
                    break;
                case 8:
                    running = false;
            }
        } while(running);
    }

    private void printOptions(){
        System.out.println("1. Show all stock");
        System.out.println("2. Show in stock items");
        System.out.println("3. Show out of stock items");
        System.out.println("4. Increase stock");
        System.out.println("5. Decrease stock");
        System.out.println("6. Add new item");
        System.out.println("7. Remove an item");
        System.out.println("8. Close Inventory");
    }

}