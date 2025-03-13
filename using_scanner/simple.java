import java.util.*;

public class simple {
         public static void main(String args[]){
          Scanner input = new Scanner(System.in);
          System.out.println("What is your name?");
          String name = input.nextLine();
          System.out.println("How old are you?");
          int age = input.nextInt();
          input.nextLine();
          System.out.println("What's your favorite food?");
          String food = input.nextLine();
          System.out.println("--------------------------------------");
          System.out.println("Name: "+name);
          System.out.println("Age: "+age);
          System.out.println("Favorite food: "+food);
         } 
}
