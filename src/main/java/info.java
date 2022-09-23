import javax.swing.*;
import java.awt.*;

public class info extends JFrame{
    JFrame frame = new JFrame();
    JLabel infolabel = new JLabel();
    JLabel infolabel2 = new JLabel();
    JLabel infolabel3 = new JLabel();
    JLabel infolabel4 = new JLabel();
    public info(){
        ImageIcon icon = new ImageIcon("info.png");
        ImageIcon image = new ImageIcon("home.png");
        frame.setSize(350,350);
        frame.setVisible(true);
        frame.setTitle("info");
        frame.setLayout(null);
        frame.setIconImage(icon.getImage());
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(8, 55, 15));

        infolabel.setHorizontalAlignment(JLabel.CENTER);
        infolabel.setVerticalAlignment(JLabel.TOP);
        infolabel.setBounds(0,50,350,50);
        infolabel.setBackground(new Color(8, 55, 15));
        infolabel.setFont(new Font("MV Boli",Font.BOLD,15));
        infolabel.setOpaque(true);
        infolabel.setForeground(Color.WHITE);
        infolabel.setText("It is a gambling card game in which ");

        infolabel2.setHorizontalAlignment(JLabel.CENTER);
        infolabel2.setVerticalAlignment(JLabel.TOP);
        infolabel2.setBounds(0,100,350,50);
        infolabel2.setBackground(new Color(8, 55, 15));
        infolabel2.setFont(new Font("MV Boli",Font.BOLD,15));
        infolabel2.setOpaque(true);
        infolabel2.setForeground(Color.WHITE);
        infolabel2.setText("players try to acquire cards with a");

        infolabel3.setHorizontalAlignment(JLabel.CENTER);
        infolabel3.setVerticalAlignment(JLabel.TOP);
        infolabel3.setBounds(0,150,350,50);
        infolabel3.setBackground(new Color(8, 55, 15));
        infolabel3.setFont(new Font("MV Boli",Font.BOLD,15));
        infolabel3.setOpaque(true);
        infolabel3.setForeground(Color.WHITE);
        infolabel3.setText("face value totalling 21 and no more.");

        infolabel4.setHorizontalAlignment(JLabel.CENTER);
        infolabel4.setVerticalAlignment(JLabel.TOP);
        infolabel4.setBounds(0,200,350,50);
        infolabel4.setBackground(new Color(8, 55, 15));
        infolabel4.setFont(new Font("MV Boli",Font.BOLD,15));
        infolabel4.setOpaque(true);
        infolabel4.setForeground(Color.WHITE);
        infolabel4.setText("* The Ace can be regarded as 1 or 11 *");

        frame.add(infolabel);
        frame.add(infolabel2);
        frame.add(infolabel3);
        frame.add(infolabel4);
    }

}
