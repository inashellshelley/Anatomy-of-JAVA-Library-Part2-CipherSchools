
import java.util.Random;
import java.util.Scanner;
//Objective: Generate Random Number
//Package: java.util
//Class: random
//Method: nextInt() : generates random bewteen 0 to limit
//Lecture 5. (Lec4 solution by sir)
public class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int computerChoice = rnd.nextInt(20);

        //Guess the Number
        for(int i=1; i<=6; i++){

        System.out.println("Guess the number between 0 and 20: ");
        int userChoice = sc.nextInt();

        System.out.println("Computer Choice: "+computerChoice);

        if(userChoice>computerChoice){
            System.out.println("Your guess is too high");
        }
        else if(userChoice<computerChoice){
            System.out.println("Your guess is low");
        }
        else{
            System.out.println("Your guess is CORRECT!!");
        }
    }
    }
}