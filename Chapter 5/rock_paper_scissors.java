import java.util.*;
public class rock_paper_scissors {
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        Random rand= new Random();
        int wins=0;int losses=0;int ties=0;
        int human=0;
        String input="";
        final int rock= 1, paper= 2, scissors= 3;
        System.out.println("Type \'quit\' to quit.");
        while(!input.equalsIgnoreCase("quit")){
            System.out.print("Your weapon: ");          
            input = scan.next();
            int computer=rand.nextInt(3)+1;
            if (computer==1) System.out.println("Computer: "+ "Rock");
            else if (computer==2) System.out.println("Computer: "+"Paper");
            else System.out.println("Computer: "+"Scissors");
            if (input.equalsIgnoreCase("rock")) human=1;
            if (input.equalsIgnoreCase("paper")) human= 2;
            if (input.equalsIgnoreCase("scissors")) human= 3;
            if (human== computer){System.out.println("It's a tie!"); ties++;}
            else if ((human==rock && computer==scissors)||(human==paper && computer==rock)||(human==scissors && computer==paper))
            {System.out.println("You win!");wins++;}
            else {System.out.println("You lose.");losses++;}
			System.out.println("-------------------------------------------");
        }
        System.out.println("Wins: "+wins+"\nLosses: "+losses+"\nTies: "+ties);
    }
}
