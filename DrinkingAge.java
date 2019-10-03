import java.util.Scanner;

public class DrinkingAge{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your current age: ");
    int age = scan.nextInt();
    if (age < 21)
      System.out.println("You are too young to drink");
    else
      System.out.println("You are older enough to drink");
  }
}
