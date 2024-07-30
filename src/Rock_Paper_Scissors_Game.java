import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int computer;
        int rounds = 0, score_of_user = 0, score_of_computer = 0;


        while(rounds < 10){

             int random = rand.nextInt(1, 100);

            System.out.println("Enter 0 for Rock, 1 for Paper and 2 for Scissor:");
            int user = sc.nextInt();

            if(random >=1 && random <=33){
                computer = 0;
                System.out.println("Computer chose Rock");
            }
            else if(random > 33 && random <= 66){
                computer = 1;
                System.out.println("Computer chose Paper");
            }
            else{
                computer = 2;
                System.out.println("Computer chose Scissor");
            }

            if(computer == 0 && user == 1){
                System.out.println("User won!");
                score_of_user += 1;
            }
            else if(computer == 0 && user == 2){
                System.out.println("Computer won!");
                score_of_computer += 1;
            }
            else if(computer == 1 && user == 0){
                System.out.println("Computer won!");
                score_of_computer += 1;
            }
            else if(computer == 1 && user == 2){
                System.out.println("User won!");
                score_of_user += 1;
            }
            else if(computer == 2 && user == 0){
                System.out.println("User won!");
                score_of_user += 1;
            }
            else if(computer == 2 && user == 1){
                System.out.println("Computer won!");
                score_of_computer += 1;
            }
            else {
                System.out.println("Match draw!");
            }

            rounds++;

        }

        if(score_of_user > score_of_computer){
            System.out.println("You scored " + score_of_user + " and computer scored " + score_of_computer);
        }
        else if(score_of_user < score_of_computer){
            System.out.println("You scored " + score_of_user + " and computer scored " + score_of_computer);
        }
        else{
            System.out.println("You scored " + score_of_user + " and computer scored " + score_of_computer);
        }


    }
}
