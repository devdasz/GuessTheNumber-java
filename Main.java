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

      // check if user guessed right 
         if (userNumber == myNumber) {
        System.out.println("Woohoo .. correct number");
        break; //end the game if user is right
      }
        //check if number is greater than userNumber
         else if (userNumber > myNumber) {
        System.out.println("your number is too large");
      } 
        //check if number is lesser than userNumber
         else {
        System.out.println("your number is too small");
      }
   
    } while (userNumber >= 0); //exit the loop for -ve number 
    
    // print the random was picked
    System.out.print("my number was :");
    System.out.println(myNumber);
  }
}