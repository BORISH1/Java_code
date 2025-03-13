import java.util.Scanner;

public class simple {
        public static void main(String args[]){
          Scanner obj = new Scanner(System.in);
          System.out.println("Enter your age");
          int age = obj.nextInt();
          if(age >=18 && age<100){
                    System.out.println("you are eligible for voting");
          }
          else if(age<18 ){
                    System.out.println("You are not eligible for voting");
          }
          else{
                    System.out.println("please enter the valid age");
          }
        }  
}
