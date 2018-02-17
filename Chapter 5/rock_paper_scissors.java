import java.util.*;
public class rock_paper_scissors {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("Type \'quit\' to quit.");
        String input = scan.next();
        int random = rand.nextInt(3)+1;
        int win=0;
        int tie=0;
        int loss=0;
        //1=rock
        //2=paper
        //3=scissors
        while(!input.equalsIgnoreCase("quit")){
            //rock cases
            if (input.equalsIgnoreCase("rock") && random==1){
                System.out.println("Rock, it was a tie");
                tie++;
            }else if(input.equalsIgnoreCase("paper") && random==1){
                System.out.println("rock, you win");
                win++;
            }else if(input.equalsIgnoreCase("scissors") && random==1){
                System.out.println("rock, i win!");
                loss++;
            }
            //paper cases
            if (input.equalsIgnoreCase("rock") && random==2){
                System.out.println("Paper, i win!");
                loss++;
            }else if(input.equalsIgnoreCase("paper") && random==2){
                System.out.println("Paper, it was a tie");
                tie++;
            }else if(input.equalsIgnoreCase("scissors") && random==2){
                System.out.println("Paper, i lose...");
                win++;
            }
            //scissors cases
            if (input.equalsIgnoreCase("rock") && random==3){
                System.out.println("Scissors, i lose...");
                win++;
            }else if(input.equalsIgnoreCase("paper") && random==3){
                System.out.println("Scissors, i win!");
                loss++;
            }else if(input.equalsIgnoreCase("scissors") && random==3){
                System.out.println("Scissors, it was a tie");
                tie++;
            }
            input = scan.next();
            random=rand.nextInt(2)+1;
        }
        System.out.println("Wins: "+win+"\nLosses: "+loss+"\nTies: "+tie);
    }
}
