public interface action {  //為定義Hand中動作的method
    void handCard(Deck deck);
    void plusCard(Deck deck);
    int sumOfhandvalue();
    boolean BlackJack();
    boolean Bust();
    String handtoString();
    String onecardtoString(int index);
    String twocardtoString();
}
