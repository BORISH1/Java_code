import java.util.*;
public class simple {
          public static void main(String args[]){
                    Scanner input = new Scanner(System.in);{
                              System.out.println("Enter the height of altitude");
                              float a = input.nextFloat();
                              input.nextLine();
                              System.out.println("Enter the length of the base");
                              float b = input.nextFloat();
                              double z =  Math.sqrt((a*a) + (b*b));
                              System.out.println("The length of the hypothesis side is " + z);



                    }
          }
}
