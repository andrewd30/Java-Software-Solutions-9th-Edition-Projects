
public class Purse implements Valcoins, number
{
    int numCoins;
    int valCoins;
    public Purse(){
    
    }
    
    public void addCoin(Coin c){
    valCoins += c.getValue();
    numCoins++;
    }
    
    public int getNumCoins(){
    return numCoins;
    }
    
    public int getValCoins(){
    return valCoins;
    }
    
    public int compareV(Purse p){
    if(this.valCoins>p.getValCoins()){
    System.out.println("working as intended");
    }return 0;
    }
    
    public int compareN(Purse p){
    
    if(this.numCoins <p.getNumCoins()){
    System.out.println("working as intended");
    }return 0;
    }
}
