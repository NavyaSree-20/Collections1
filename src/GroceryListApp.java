package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class GroceryListApp {
    private List<String>groceryList;
    public GroceryListApp(){
        this.groceryList=new ArrayList<>();
    }
    public void addItem(String item){
        groceryList.add(item);
        System.out.println(item+" added to list");
    }
    public void removeItem(String item){
       if( groceryList.remove(item)){
        System.out.println(item+" removed from list");
       }
       else{
           System.out.println(item+" not removed from list");
       }
    }
    public void displayItems(){
        if(groceryList.isEmpty()){
            System.out.println("The list is empty");
        }
        else{
            System.out.println("The list is not empty");
        }
    }
    public static void main(String[] args) {
GroceryListApp groceryListApp=new GroceryListApp();
Scanner sc=new Scanner(System.in);
boolean exit=false;
while(!exit){
    System.out.println("Add an item");
    System.out.println("Remove an item");
    System.out.println("display all items");
    System.out.println("exit");
    int choice=sc.nextInt();
    switch(choice){
        case 1:
            System.out.print("enter the item to add");
            String itemToAdd=sc.nextLine();
            groceryListApp.addItem(itemToAdd);
            break;
        case 2:
            System.out.print("Enter the item to remove");
            String itemToRemove=sc.nextLine();
            groceryListApp.removeItem(itemToRemove);
            break;
        case 3:
            groceryListApp.displayItems();
            break;
        case 4:
            exit=true;
            System.out.println("Exiting the application");
            break;
        default:
            System.out.println("Invalid");
    }
}
sc.close();
}
}