import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class Game extends JFrame implements ActionListener {
    private Hand playerhand = new Hand();
    private pcHand dealerhand = new pcHand();
    private Deck deck = new Deck();
    private int win = 0;
    private int push = 0;
    private int lose = 0;
    private int a = 500;
    private int answer;
    private int input;
    private int pay;
    private boolean betornot = false;
    private boolean pass5 = false;
    private boolean betable = true;
    private int borrowtime = 0;
    private int sumofborrowcoin = 0;
    private int borrow;
    private boolean enterMoney = false;
    JFrame frame = new JFrame();
    JButton hit = new JButton();
    JButton stand = new JButton();
    JButton back = new JButton();
    JButton info = new JButton();
    JButton Double = new JButton();
    JButton start = new JButton("Start");
    JLabel gamelabel = new JLabel();
    JLabel cardlabel1 = new JLabel();
    JLabel cardlabel2 = new JLabel();
    JLabel cardlabel3 = new JLabel();
    JLabel cardlabel4 = new JLabel();
    JLabel winlabel = new JLabel();
    JLabel loselabel = new JLabel();
    JLabel pushlabel = new JLabel();
    JLabel deckremain = new JLabel();
    JLabel playerlabel = new JLabel();
    JLabel dealerlabel = new JLabel();
    JLabel pluscard1 = new JLabel();
    JLabel pluscard2 = new JLabel();
    JLabel pluscard3 = new JLabel();
    JLabel pluscard4 = new JLabel();
    JLabel pluscard5 = new JLabel();
    JLabel pluscard6 = new JLabel();
    JLabel background = new JLabel();
    JLabel coin = new JLabel();

    public Game() {
        setFrame();
        setButton();
        setLabel();
    }

    public void setButton(){
        ImageIcon image = new ImageIcon("home.png");
        ImageIcon infoicon = new ImageIcon("info.png");
        hit.setBounds(950,100,100,50);
        hit.setText("Hit");
        hit.setFont(new Font("MV Boli",Font.BOLD,20));
        hit.addActionListener(this);
        stand.setBounds(950,180,100,50);
        stand.setText("Stand");
        stand.setFont(new Font("MV Boli",Font.BOLD,20));
        stand.addActionListener(this);
        back.setBounds(980,500,30,30);
        back.setIcon(image);
        back.setFont(new Font("MV Boli",Font.BOLD,20));
        back.addActionListener(this);
        info.setBounds(50,500,30,30);
        info.addActionListener(this);
        info.setIcon(infoicon);
        Double.setBounds(950,260,100,50);
        Double.setText("Double");
        Double.setFont(new Font("MV Boli",Font.BOLD,20));
        Double.addActionListener(this);
        start.setBounds(500,500,100,50);
        start.setFont(new Font("MV Boli",Font.BOLD,20));
        start.addActionListener(this);
        background.add(hit);
        background.add(stand);
        background.add(back);
        background.add(info);
        background.add(Double);
        background.add(start);
        hit.setVisible(false);
        stand.setVisible(false);
        Double.setVisible(false);
    }

    public void setFrame(){
        frame.setTitle(" BlackJack ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1100,600);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(0,100,0));
        ImageIcon image = new ImageIcon("logo.png");
        frame.setIconImage(image.getImage());
    }

    public void setLabel(){
        frame.add(background);
        background.add(gamelabel);
        background.add(cardlabel1);
        background.add(cardlabel2);
        background.add(cardlabel3);
        gamelabel.add(winlabel);
        gamelabel.add(loselabel);
        gamelabel.add(pushlabel);
        gamelabel.add(deckremain);
        background.add(playerlabel);
        background.add(dealerlabel);
        background.add(pluscard1);
        background.add(pluscard3);
        background.add(pluscard5);
        background.add(pluscard2);
        background.add(pluscard4);
        background.add(pluscard6);
        background.add(coin);

        ImageIcon gamebackground = new ImageIcon("background.png");
        background.setBounds(0,0,1100,600);
        background.setIcon(gamebackground);
        background.setVisible(true);

        coin.setHorizontalTextPosition(JLabel.CENTER);
        coin.setVerticalTextPosition(JLabel.CENTER);
        coin.setForeground(Color.WHITE);
        coin.setBounds(20,0,160,70);
        coin.setFont(new Font("MV Boli",Font.BOLD,18));
        coin.setBackground(new Color(5, 31, 7));
        coin.setOpaque(true);
        coin.setText("Coin : ");

        winlabel.setHorizontalTextPosition(JLabel.CENTER);
        winlabel.setVerticalTextPosition(JLabel.CENTER);
        winlabel.setForeground(Color.WHITE);
        winlabel.setBounds(0,0,120,70);
        winlabel.setFont(new Font("MV Boli",Font.BOLD,18));
        winlabel.setBackground(new Color(100,100,0));
        winlabel.setOpaque(true);

        loselabel.setHorizontalTextPosition(JLabel.CENTER);
        loselabel.setVerticalTextPosition(JLabel.CENTER);
        loselabel.setForeground(Color.WHITE);
        loselabel.setBounds(120,0,120,70);
        loselabel.setFont(new Font("MV Boli",Font.BOLD,18));
        loselabel.setBackground(new Color(0,0,0));
        loselabel.setOpaque(true);

        pushlabel.setHorizontalTextPosition(JLabel.CENTER);
        pushlabel.setVerticalTextPosition(JLabel.CENTER);
        pushlabel.setForeground(Color.WHITE);
        pushlabel.setBounds(240,0,120,70);
        pushlabel.setFont(new Font("MV Boli",Font.BOLD,18));
        pushlabel.setBackground(new Color(100,00,00));
        pushlabel.setOpaque(true);

        deckremain.setHorizontalTextPosition(JLabel.CENTER);
        deckremain.setVerticalTextPosition(JLabel.CENTER);
        deckremain.setForeground(Color.WHITE);
        deckremain.setBounds(500,0,200,70);
        deckremain.setFont(new Font("MV Boli",Font.BOLD,18));
        deckremain.setBackground(new Color(5, 31, 7));
        deckremain.setOpaque(true);

        gamelabel.setHorizontalTextPosition(0);
        gamelabel.setVerticalTextPosition(JLabel.TOP);
        gamelabel.setForeground(Color.WHITE);
        gamelabel.setBounds(200,0,700,70);
        gamelabel.setFont(new Font("MV Boli",Font.BOLD,18));
        gamelabel.setBackground(new Color(5, 31, 7));
        gamelabel.setOpaque(true); //display background color

        cardlabel1.setHorizontalTextPosition(0);
        cardlabel1.setVerticalTextPosition(JLabel.TOP);
        cardlabel1.setForeground(Color.WHITE);
        cardlabel1.setBounds(200,70,700,60);
        cardlabel1.setFont(new Font("MV Boli",Font.BOLD,18));
        cardlabel1.setBackground(new Color(7, 44, 12));
        cardlabel1.setOpaque(true); //display background color

        cardlabel2.setHorizontalTextPosition(0);
        cardlabel2.setVerticalTextPosition(JLabel.TOP);
        cardlabel2.setForeground(Color.WHITE);
        cardlabel2.setBounds(200,130,700,60);
        cardlabel2.setFont(new Font("MV Boli",Font.BOLD,18));
        cardlabel2.setBackground(new Color(8, 47, 14));
        cardlabel2.setOpaque(true); //display background color

        cardlabel3.setHorizontalTextPosition(0);
        cardlabel3.setVerticalTextPosition(JLabel.TOP);
        cardlabel3.setForeground(Color.WHITE);
        cardlabel3.setBounds(200,190,700,60);
        cardlabel3.setFont(new Font("MV Boli",Font.BOLD,18));
        cardlabel3.setBackground(new Color(7, 51, 13));
        cardlabel3.setOpaque(true); //display background color

        cardlabel4.setHorizontalTextPosition(0);
        cardlabel4.setVerticalTextPosition(JLabel.TOP);
        cardlabel4.setForeground(Color.WHITE);
        cardlabel4.setBounds(200,250,700,60);
        cardlabel4.setFont(new Font("MV Boli",Font.BOLD,18));
        cardlabel4.setBackground(new Color(0,0,0));
        cardlabel4.setOpaque(true); //display background color

        playerlabel.setHorizontalTextPosition(JLabel.CENTER);
        playerlabel.setVerticalTextPosition(JLabel.CENTER);
        playerlabel.setForeground(Color.WHITE);
        playerlabel.setBounds(200,250,350,60);
        playerlabel.setFont(new Font("MV Boli",Font.BOLD,18));
        playerlabel.setBackground(new Color(0,100,0));
        playerlabel.setOpaque(true); //display background color
        playerlabel.setText("            PLAYERCARD");

        dealerlabel.setHorizontalTextPosition(0);
        dealerlabel.setVerticalTextPosition(JLabel.CENTER);
        dealerlabel.setForeground(Color.WHITE);
        dealerlabel.setBounds(550,250,350,60);
        dealerlabel.setFont(new Font("MV Boli",Font.BOLD,18));
        dealerlabel.setBackground(new Color(0,100,0));
        dealerlabel.setOpaque(true); //display background color
        dealerlabel.setText("            DEALERCARD");

        pluscard1.setHorizontalTextPosition(0);
        pluscard1.setVerticalTextPosition(JLabel.CENTER);
        pluscard1.setForeground(Color.WHITE);
        pluscard1.setBounds(200,310,350,58);
        pluscard1.setFont(new Font("MV Boli",Font.BOLD,18));
        pluscard1.setBackground(new Color(8, 55, 15));
        pluscard1.setOpaque(true); //display background color

        pluscard3.setHorizontalTextPosition(0);
        pluscard3.setVerticalTextPosition(JLabel.CENTER);
        pluscard3.setForeground(Color.WHITE);
        pluscard3.setBounds(200,368,350,58);
        pluscard3.setFont(new Font("MV Boli",Font.BOLD,18));
        pluscard3.setBackground(new Color(8, 55, 15));
        pluscard3.setOpaque(true); //display background color

        pluscard5.setHorizontalTextPosition(0);
        pluscard5.setVerticalTextPosition(JLabel.CENTER);
        pluscard5.setForeground(Color.WHITE);
        pluscard5.setBounds(200,426,350,58);
        pluscard5.setFont(new Font("MV Boli",Font.BOLD,18));
        pluscard5.setBackground(new Color(8, 55, 15));
        pluscard5.setOpaque(true); //display background color

        pluscard2.setHorizontalTextPosition(0);
        pluscard2.setVerticalTextPosition(JLabel.CENTER);
        pluscard2.setForeground(Color.WHITE);
        pluscard2.setBounds(550,310,350,58);
        pluscard2.setFont(new Font("MV Boli",Font.BOLD,18));
        pluscard2.setBackground(new Color(8, 55, 15));
        pluscard2.setOpaque(true); //display background color

        pluscard4.setHorizontalTextPosition(0);
        pluscard4.setVerticalTextPosition(JLabel.CENTER);
        pluscard4.setForeground(Color.WHITE);
        pluscard4.setBounds(550,368,350,58);
        pluscard4.setFont(new Font("MV Boli",Font.BOLD,18));
        pluscard4.setBackground(new Color(8, 55, 15));
        pluscard4.setOpaque(true); //display background color

        pluscard6.setHorizontalTextPosition(0);
        pluscard6.setVerticalTextPosition(JLabel.CENTER);
        pluscard6.setForeground(Color.WHITE);
        pluscard6.setBounds(550,426,350,58);
        pluscard6.setFont(new Font("MV Boli",Font.BOLD,18));
        pluscard6.setBackground(new Color(8, 55, 15));
        pluscard6.setOpaque(true); //display background color
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == start){
            hit.setVisible(true);
            stand.setVisible(true);
            start.setVisible(false);
            checkbet();
        }
        else if (e.getSource() == back){
            new GUI().frame.setVisible(true);
            frame.setVisible(false);
        }
        else if (e.getSource() == hit){
            playerHits();
        }
        else if (e.getSource() == info){
            new info();
        }
        else if(e.getSource() == stand) {
            playerStands();
        }
        else if (e.getSource() == Double){
            this.pay = 2 * pay;
            if ( this.pay > a){
                JOptionPane.showMessageDialog(null,"You don't have enough coin to double","Wrong bet",JOptionPane.WARNING_MESSAGE);
                this.pay /= 2;
            }
        }
    }

    public void gamestart() {
        playerhand.handCard(deck);
        playerhand.sumOfhandvalue();
        dealerhand.handCard(deck);
        dealerhand.sumOfhandvalue();
        pushlabel.setText(" PUSH : " + push);
        loselabel.setText(" LOSE : " + lose);
        winlabel.setText(" WIN : " + win);
        deckremain.setText("Deck remain :" + deck.countdeck());
        cardlabel1.setText(showPlayhand());
        cardlabel2.setText(showDealerhand());
    }

    public String showPlayhand() {
        return playerhand.handtoString() + " Your Value: " + playerhand.sumOfhandvalue();
    }


    public String showDealerhand() {
        return dealerhand.onecardtoString();
    }

    public void playerHits() {
        dealerPlays();
        playerhand.plusCard(deck);
        if (playerhand.handcard() == 3){
            cardlabel1.setText(playerhand.twocardtoString());
            pluscard1.setText("1." + playerhand.onecardtoString(2));
        }
        else if (playerhand.handcard() == 4){
            cardlabel1.setText(playerhand.twocardtoString());
            pluscard1.setText("1." + playerhand.onecardtoString(2));
            pluscard3.setText("2." + playerhand.onecardtoString(3));
        }
        else {
            cardlabel1.setText(playerhand.twocardtoString());
            pluscard1.setText("1." + playerhand.onecardtoString(2));
            pluscard3.setText("2." + playerhand.onecardtoString(3));
            pluscard5.setText("3." + playerhand.onecardtoString(4));
        }
        deckremain.setText("Deck remain :" + deck.countdeck());
        if (playerhand.sumOfhandvalue() > 21) {
            if (dealerhand.sumOfhandvalue() > 21){
                cardlabel3.setText("Dealer value : " + dealerhand.sumOfhandvalue());
                push();
            }else {
                cardlabel3.setText("Dealer value : " + dealerhand.sumOfhandvalue());
                lose();
            }
        } else if (playerhand.BlackJack()){
            if (dealerhand.Bust()){
                cardlabel3.setText("Dealer value : " + dealerhand.sumOfhandvalue());
                win();
            }
            else if (dealerhand.BlackJack()){
                cardlabel3.setText("Dealer value : " + dealerhand.sumOfhandvalue());
                push();
            }
            else {
                cardlabel3.setText("Dealer value : " + dealerhand.sumOfhandvalue());
                win();
            }
        } else if ((playerhand.handcard() >= 5) && (playerhand.sumOfhandvalue() <= 21)){
            pass5 = true;
            JOptionPane.showMessageDialog(null,
                    "Congratulations on five card Charlie","Congratulations",JOptionPane.PLAIN_MESSAGE);
            cardlabel3.setText("Dealer value : " + dealerhand.sumOfhandvalue());
            win();
        }
    }

    public void playerStands() {
        dealerPlays();
        if ((dealerhand.sumOfhandvalue() > 21)) {
            cardlabel3.setText("Dealer value : " + dealerhand.sumOfhandvalue());
            win();
        } else if (playerhand.BlackJack()){
            if (dealerhand.BlackJack()){
                cardlabel3.setText("Dealer value : " + dealerhand.sumOfhandvalue());
                push();
            } else if (dealerhand.Bust()){
                cardlabel3.setText("Dealer value : " + dealerhand.sumOfhandvalue());
                win();
            }else {
                cardlabel3.setText("Dealer value : " + dealerhand.sumOfhandvalue());
                win();
            }
        } else if (playerhand.sumOfhandvalue() > dealerhand.sumOfhandvalue()) {
            cardlabel3.setText("Dealer value : " + dealerhand.sumOfhandvalue());
            win();
        } else if (playerhand.sumOfhandvalue() == dealerhand.sumOfhandvalue()) {
            cardlabel3.setText("Dealer value : " + dealerhand.sumOfhandvalue());
            push();
        } else {
            cardlabel3.setText("Dealer value : " + dealerhand.sumOfhandvalue());
            lose();
        }
    }

    public void dealerPlays() {
        while (dealerhand.sumOfhandvalue() < 17) {
            dealerHits();
            if (dealerhand.handcard() == 3){
                cardlabel2.setText(dealerhand.onecardtoString());
                pluscard2.setText("          "+"1." + dealerhand.onecardtoString(2));
            }
            else if(dealerhand.handcard() == 4){
                cardlabel2.setText(dealerhand.onecardtoString());
                pluscard2.setText("          "+"1." + dealerhand.onecardtoString(2));
                pluscard4.setText("          "+"2." + dealerhand.onecardtoString(3));
            }
            else {
                cardlabel2.setText(dealerhand.onecardtoString());
                pluscard2.setText("          "+"1." + dealerhand.onecardtoString(2));
                pluscard4.setText("          "+"2." + dealerhand.onecardtoString(3));
                pluscard6.setText("          "+"3." + dealerhand.onecardtoString(4));
            }
        }
    }

    public void dealerHits() {
        dealerhand.plusCard(deck);
    }

    public void playagain(){
        answer = JOptionPane.showConfirmDialog(null,
                "Do you want to play again ?","AGAIN?",JOptionPane.YES_OPTION);
        if (answer == 0){
            playerhand.removeCard();
            dealerhand.removeCard();
            pluscard1.setText("");
            pluscard2.setText("");
            pluscard3.setText("");
            pluscard4.setText("");
            pluscard5.setText("");
            pluscard6.setText("");
            cardlabel3.setText("");
            cardlabel1.setText("");
            cardlabel2.setText("");
            checkbet();
        }
        else {
            winrate();
            JOptionPane.showMessageDialog(null,
                    "See you next time !!! ","Bye",JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }
    }

    public void win() {
        win++;
        winlabel.setText(" WIN : " + win);
        cardlabel2.setText(dealerhand.twocardtoString());
        JOptionPane.showMessageDialog(null,
                "You win !!! ","WIN",JOptionPane.PLAIN_MESSAGE);
        Double.setVisible(false);
        if (betornot == true){
            if (enterMoney == true) {
                this.a += pay;
                coin.setText("Coin : " + a);
                if (borrowtime == 1) {
                    if (this.a > borrow) {
                        this.a -= borrow;
                        JOptionPane.showMessageDialog(null,"Because your coin has exceeded the coin you borrow : " + borrow,"Return",JOptionPane.PLAIN_MESSAGE);
                        JOptionPane.showMessageDialog(null,"So you should returned the coin.","Return",JOptionPane.PLAIN_MESSAGE);
                        JOptionPane.showMessageDialog(null,"Now you have : " + a + " coin ","BET",JOptionPane.PLAIN_MESSAGE);
                        coin.setText("Coin : " + a);
                        borrowtime = 0;
                        sumofborrowcoin = 0;
                        enterMoney = false;
                        playagain();
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"You have : " + a + " coin ","BET",JOptionPane.PLAIN_MESSAGE);
                        coin.setText("Coin : " + a);
                        playagain();
                    }
                }
                else if (borrowtime > 1) {
                    if (this.a > sumofborrowcoin){
                        this.a -= sumofborrowcoin;
                        JOptionPane.showMessageDialog(null,"Because your coin has exceeded the coin you borrow : " + sumofborrowcoin,"Return",JOptionPane.PLAIN_MESSAGE);
                        JOptionPane.showMessageDialog(null,"So you should returned the coin.","Return",JOptionPane.PLAIN_MESSAGE);
                        JOptionPane.showMessageDialog(null,"Now you have : " + a + " coin ","BET",JOptionPane.PLAIN_MESSAGE);
                        coin.setText("Coin : " + a);
                        borrowtime = 0;
                        sumofborrowcoin = 0;
                        enterMoney = false;
                        playagain();
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Now you have : " + a + " coin ","BET",JOptionPane.PLAIN_MESSAGE);
                        coin.setText("Coin : " + a);
                        playagain();
                    }
                }
            }
            else if (pass5 == true){
                this.pay = 3 * pay;
                this.a += pay;
                coin.setText("Coin : " + a);
                betornot = false;
                playagain();
            }
            else {
                this.a += pay;
                coin.setText("Coin : " + a);
                betornot = false;
                playagain();
            }
        }
        else if (deck.countdeck() <= 10){
            resumedeck();
            playagain();
        }
    }

    public void push() {
        push++;
        pushlabel.setText(" PUSH : " + push);
        cardlabel2.setText(dealerhand.twocardtoString());
        Double.setVisible(false);
        if (betornot == true){
            this.a = a;
            coin.setText("Coin : " + a);
            betornot = false;
        }
        JOptionPane.showMessageDialog(null,
                "Push~~ ","PUSH",JOptionPane.PLAIN_MESSAGE);
        if (deck.countdeck() <= 10){
            resumedeck();
            playagain();
        }
        else {
            playagain();
        }
    }

    public void lose() {
        lose++;
        loselabel.setText(" LOSE : " + lose);
        cardlabel2.setText(dealerhand.twocardtoString());
        Double.setVisible(false);
        if (betornot == true){
            if (this.a - pay > 0){
                this.a -= pay;
                coin.setText("Coin : " + a);
                JOptionPane.showMessageDialog(null,
                        "You lose... ","LOSE",JOptionPane.PLAIN_MESSAGE);
                if (deck.countdeck() <= 10){
                    resumedeck();
                    betornot = false;
                    playagain();
                }
                else {
                    betornot = false;
                    playagain();
                }
            }
            else if (this.a - pay <= 0){
                betable = false;
                this.a -= pay;
                coin.setText("Coin : " + a);
                JOptionPane.showMessageDialog(null,
                        "You lose... ","LOSE",JOptionPane.PLAIN_MESSAGE);
                JOptionPane.showMessageDialog(null,"Sorry...You don't have enough coin , so you can't bet",
                        "Sorry",JOptionPane.WARNING_MESSAGE);
                coin.setText("");
                borrowMoney();
                if (deck.countdeck() <= 10){
                    resumedeck();
                    playagain();
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null,
                    "You lose... ","LOSE",JOptionPane.PLAIN_MESSAGE);
            if (deck.countdeck() <= 10){
                resumedeck();
                playagain();
            }
            else {
                playagain();
            }
        }
    }

    public void resumedeck (){
            int answer = JOptionPane.showConfirmDialog(null,
                    "need to create a new deck","CREATE A NEW DECK",JOptionPane.YES_OPTION);
            if (answer == 0){
                playerhand.removeCard();
                dealerhand.removeCard();
                cardlabel1.setText("");
                cardlabel2.setText("");
                cardlabel3.setText("");
                pluscard1.setText("");
                pluscard2.setText("");
                pluscard3.setText("");
                pluscard4.setText("");
                pluscard5.setText("");
                pluscard6.setText("");
                deck.cleardeck();
                deck.createdeck();
                deck.shuffle();
                deckremain.setText("Deck remain :" + deck.countdeck());
            }
            else {
                int response = JOptionPane.showConfirmDialog(null,
                        "The game will be over","ENDGAME",JOptionPane.PLAIN_MESSAGE);
                if (response == 0){
                    System.exit(0);
                }
            }
    }

    public int getWin(){
        return win;
    }

    public int getPush(){
        return push;
    }

    public int getLose(){
        return lose;
    }

    public void winrate(){
        double w = getWin();
        double p = getPush();
        double l = getLose();
        double percentage = ( w / ( p + w + l));
        DecimalFormat nf = (DecimalFormat) NumberFormat.getPercentInstance();
        nf.applyPattern("00%");
        nf.setMinimumFractionDigits(2);
        JOptionPane.showMessageDialog(null,"Your winrate is :" + nf.format(percentage),"WINRATE",JOptionPane.PLAIN_MESSAGE);

    }

    public void checkbet() {
        if (betable == true){
            input = JOptionPane.showConfirmDialog(null,"Do you want to bet?","BET",JOptionPane.YES_NO_OPTION);
            if (input == 0){
                betornot = true;
                Double.setVisible(true);
                JOptionPane.showMessageDialog(null,"You have : " + a + " coin ","BET",JOptionPane.PLAIN_MESSAGE);
                coin.setText("Coin : " + a);
                JOptionPane.showMessageDialog(null,"You need to pay at least 1/5 of your coin ","BET",JOptionPane.PLAIN_MESSAGE);
                pay = Integer.parseInt(JOptionPane.showInputDialog(null,"How much do you want to bet?","BET",JOptionPane.PLAIN_MESSAGE));
                if (pay < 0){
                    JOptionPane.showMessageDialog(null,"Worng pay","Error",JOptionPane.WARNING_MESSAGE);
                    checkbet();
                }
                else if (pay > this.a){
                    JOptionPane.showMessageDialog(null,"Worng pay","Error",JOptionPane.WARNING_MESSAGE);
                    checkbet();
                }
                else if (pay < this.a / 5){
                    JOptionPane.showMessageDialog(null, "Worng pay", "Error", JOptionPane.WARNING_MESSAGE);
                    checkbet();
                }
                else {
                    gamestart();
                }
            }
            else {
                gamestart();
            }
        }
        else {
            gamestart();
        }
    }

    public void borrowMoney() {
        borrowtime++;
        int chioce = JOptionPane.showConfirmDialog(null,"Do you want to borrow coin ?","Borrow coin",JOptionPane.YES_NO_OPTION);
        if (chioce == 0) {
            playerhand.removeCard();
            dealerhand.removeCard();
            pluscard1.setText("");
            pluscard2.setText("");
            pluscard3.setText("");
            pluscard4.setText("");
            pluscard5.setText("");
            pluscard6.setText("");
            cardlabel1.setText("");
            cardlabel2.setText("");
            cardlabel3.setText("");
            enterMoney();
        }
        else if (chioce == 1){
            betable = false;
            playerhand.removeCard();
            dealerhand.removeCard();
            pluscard1.setText("");
            pluscard2.setText("");
            pluscard3.setText("");
            pluscard4.setText("");
            pluscard5.setText("");
            pluscard6.setText("");
            cardlabel1.setText("");
            cardlabel2.setText("");
            cardlabel3.setText("");
            gamestart();
        }
        else {
            JOptionPane.showMessageDialog(null,"Wrong choose","Wrong message",JOptionPane.WARNING_MESSAGE);
            borrowMoney();
        }
    }

    public void enterMoney() {
        betable = true;
        enterMoney = true;
        borrow = Integer.parseInt(JOptionPane.showInputDialog(null,"How much do you want to borrow ?","Borrow coin",JOptionPane.PLAIN_MESSAGE));
        this.a = borrow;
        JOptionPane.showMessageDialog(null,"You have : " + borrow + " coin ","BET",JOptionPane.PLAIN_MESSAGE);
        coin.setText("Coin : " + borrow);
        sumofborrowcoin += borrow;
        checkbet();
    }
}