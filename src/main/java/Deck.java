import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Deck {
    private ArrayList<Card> deck = new ArrayList<Card>();
    private Scanner scanner = new Scanner(System.in);
    public Deck(){  //初始化Deck這個object
        createdeck();
        shuffle();
    }
    public void createdeck(){  //建立Deck,使用for-each迴圈
        for (Suit suit : Suit.values()){
            for (Rank rank : Rank.values()){
                deck.add(new Card(rank, suit));
            }
        }
    }
    public void shuffle(){  //使用collection定義的shuffle將Deck打亂
        Collections.shuffle(deck);
    }
    public Card draw(){  //抽牌的method,抽Deck[0],並移除Deck[0]
        deck.get(0);
        return deck.remove(0);
    }
    public int countdeck(){  //計算牌組剩餘的牌數,並return牌數,供後續使用
        return deck.size();
    }
    public void cleardeck(){  //將牌組清空
        deck.clear();
    }
}

