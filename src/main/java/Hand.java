import java.util.ArrayList;
public class Hand implements action{
    private ArrayList<Card> hand = new ArrayList<Card>();
    public Hand(){
    }
    public void handCard(Deck deck){  //利用for迴圈,使玩家抽兩張牌
        for(int i = 0 ; i < 2 ; i++){
            hand.add(deck.draw());
        }
    }
    public void plusCard(Deck deck){  //再抽一張牌的method
        hand.add(deck.draw());
    }
    public int sumOfhandvalue(){  //將手牌的點數加起來
        int sum = 0;
        int aceCount = 0;

        for(Card card: hand){
            sum += card.getValue();
            if (card.getValue() == 11){
                aceCount ++;  //計算手牌有幾張Ace
            }
        }
        if (sum > 21 && aceCount > 0){  //原本將Ace當11,若是手牌的點數加起來>21,將Ace視為1,並用aceCount-1來記錄
            while(aceCount > 0 && sum > 21){
                aceCount --;
                sum -= 10;
            }
        }
        return sum;
    }

    public int handcard(){
        return hand.size();
    }

    public void removeCard(){  //開啟新的一局時,將手牌移除
        hand.clear();
    }

    public boolean BlackJack(){
        if (sumOfhandvalue() == 21){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean Bust(){
        if (sumOfhandvalue() > 21){
            return true;
        }
        else {
            return false;
        }
    }
    public String handtoString(){  //將手牌輸出給玩家看
        return "Your hand shows" + hand;
    }
    public String onecardtoString(int index){
        return hand.get(index) + " , value : " + sumOfhandvalue();
    }
    public String twocardtoString(){
        return "Your hand shows " + hand.get(0) + ", " + hand.get(1);
    }
}
