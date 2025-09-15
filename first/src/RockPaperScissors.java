import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        System.out.println("enter your move");
        String M = sc.nextLine();

        switch(M){
            case "rock":
                
                System.out.println("Paper beats rock");
                break;
            case "paper":
                System.out.println("Scissors beats paper");
                break;
            case "scissors":
                System.out.println("Rock beats Scissors");
                break;
            default:
                System.out.println("Invalid Choise");
            
        }
        sc.close();
        }
}
