
public class Driver
{
    public static void main (String[]args){
    Coin dime = new Coin(10);
    Coin nickel = new Coin(5);
    Coin penny= new Coin (1);
    
    
    Purse p1= new Purse();
    Purse p2 = new Purse();
    
    p1.addCoin(dime);
    p2.addCoin(nickel);
    p2.addCoin(penny);
    
    System.out.println(p1.compareV(p2));
    System.out.println(p1.compareN(p2));
    
    }
}
