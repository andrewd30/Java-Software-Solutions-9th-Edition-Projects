public class FlipRace {
    public static void main (String[]args) {
        Coin coin1= new Coin(); Coin coin2= new Coin();
        int heads1= 0; int heads2= 0; int count= 0;
        while (heads1!=3 && heads2!= 3) {
            coin1.flip(); coin2.flip();            
            count++;
            if (coin1.isHeads()==true){heads1++;}
            else heads1= 0;
            if (coin2.isHeads()==true){heads2++;}
            else heads2= 0;
            System.out.println("Round :"+count);
            System.out.println("Coin1: "+coin1);
            System.out.println("Coin2: "+coin2);
        }
        if (heads1==3)
            System.out.println("Coin1 wins!");
        else if (heads2==3)
            System.out.println("Coin2 wins!");
        else
            System.out.println("Its a tie!");
        System.out.println("Flips: "+count);
    }
}
