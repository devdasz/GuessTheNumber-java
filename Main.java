import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Mini project

    Scanner sc = new Scanner(System.in);
    // Generate a random number
    int myNumber = (int) (Math.random() * 100);

    // to check the number
    // System.out.println(myNumber);
    int userNumber = 0;
    do {
      System.out.println("Guess my number (enter -1 to exit)");
      userNumber = sc.nextInt();
   
    } while (userNumber >= 0); //exit the loop for -ve number 
    System.out.print("my number was :");
    System.out.println(myNumber);
  }
}