import java.util.*;
public class sample{
                    public static void main(String args[]){
                              Scanner input = new Scanner(System.in);
                              System.out.println("CHOOSE A OPTION FOR THE FOLLOWING");
                              System.out.println("OPTION 1 : ADDITION \n OPTION 2 : SUBSTRACTION \n OPTION 3 : MULTIPLICATIN \n OPTION 4 : DIVISION \n OPTION 5 : FIND_REMAINDER");
                              int choose = input.nextInt();
                              if(choose == 1){
                                        System.out.println("Enter the first number");
                                        int a = input.nextInt();
                                        System.out.println("Enter the second number");
                                        int b = input.nextInt();
                                        int sum = a + b;
                                        System.out.println("The sum of " + a +" and " + b +" is " + sum);
                              }
                              else if(choose == 2){
                                        System.out.println("Enter the first number");
                                        int a = input.nextInt();
                                        System.out.println("Enter the second number");
                                        int b = input.nextInt();
                                        int sum = a - b;
                                        System.out.println("The difference of " + a +" and " + b +" is " + sum);
                              }
                              else  if (choose == 3){
                                        System.out.println("Enter the first number");
                                        int a = input.nextInt();
                                        System.out.println("Enter the second number");
                                        int b = input.nextInt();
                                        int sum = a * b;
                                        System.out.println("The multiplication of " + a +" and " + b +" is " + sum);
                              }
                              else if(choose == 4){
                                        System.out.println("Enter the first number");
                                        int a = input.nextInt();
                                        System.out.println("Enter the second number");
                                        int b = input.nextInt();
                                        int sum = a / b;
                                        System.out.println("The division of " + a +" by " + b +" is " + sum);
                              }
                              else if(choose == 5){
                                        System.out.println("Enter the first number");
                                        int a = input.nextInt();
                                        System.out.println("Enter the second number");
                                        int b = input.nextInt();
                                        int sum = a % b;
                                        System.out.println("The remainder of " + a +" divided by " + b +" is " + sum);
                              }
                              else{
                                        System.out.println("You are choosed the wrong input");
                              }
                    }
}