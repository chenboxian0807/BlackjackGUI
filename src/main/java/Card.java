public class Card{
    private Rank rank;
    private Suit suit;

    public Card(Rank rank , Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }
    public int getValue(){  //取得卡片的值
        return rank.getvalue();
    }
    public Rank getRank(){  //取得卡片的花色
        return rank;
    }
    public String toString(){  //將卡片的花色與值用tostring輸出
        return rank + "-" + suit;
    }
}

