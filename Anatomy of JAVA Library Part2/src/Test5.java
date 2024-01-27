/*Assuming you are riding a Bike and Police officer stops you.
Police Officer Asking you to provide 2 details 
your current speed 
if it is your birthday today?
The Police officer will Calculate Fine based on following parameters:-
If it is your brithday you will be waived off with 5 miles/hour
If it is not your birthday bo exemption will be given
If your speed is greater than 80, ticket raised will be "High Ticket"
If your speed is between 60 and 80, ticket will raised will be "Mid Ticket"
If your Speed is below 60, Ticket raised will be "No Ticket"
 */

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Speed: ");
        int speed=sc.nextInt();
        System.out.println("Today is your Birthday: ");
        boolean isbirthday=sc.nextBoolean();

        if(isbirthday==true){
            speed=speed-5;
        }

        if(speed>80){
            System.out.println("High Ticket");
        }
        else if(speed>=60 && speed<=80){
            System.out.println("Mis Ticket");
        }
        else{
            System.out.println("No Ticket");
        }
    }
}
