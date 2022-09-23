import java.util.ArrayList;
public class pcHand extends Hand {
    private ArrayList<Card> pchand = new ArrayList<Card>();
    public pcHand(){
    }
    public void handCard(Deck deck){
        for(int i = 0 ; i < 2 ; i++){
            pchand.add(deck.draw());
        }
    }
    public void plusCard(Deck deck){
        pchand.add(deck.draw());
    }
    public int sumOfhandvalue(){
        int sum = 0;
        int aceCount = 0;
        for(Card card: pchand){
            sum += card.getValue();
            if (card.getValue() == 11){
                aceCount ++;
            }
        }
        if (sum > 21 && aceCount > 0){
            while(aceCount > 0 && sum > 21){
                aceCount --;
                sum -= 10;
            }
        }
        return sum;
    }

    public int handcard(){
        return pchand.size();
    }
    public void removeCard(){
        pchand.clear();
    }
    public String handtoString(){
        return "Dealer hand shows" + pchand;
    }
    public String onecardtoString(){
        return "Dealer hand shows " + pchand.get(0) + " , *****-*****";
    }
    public String onecardtoString(int index){
        return pchand.get(index) + "";
    }
    public String twocardtoString(){
        return "Dealer hand shows " + pchand.get(0) + ", " + pchand.get(1);
    }
}