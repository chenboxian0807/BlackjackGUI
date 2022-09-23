import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener{
    JLabel label = new JLabel();
    JFrame frame = new JFrame();
    JButton button2 = new JButton();
    JButton button1 = new JButton();

    public GUI(){
        button1.setBounds(900,150,100,50);
        button2.setBounds(900,350,100,50);
        button1.setText("Enter");
        button2.setText("Exit");
        button1.setFont(new Font("MV Boli",Font.BOLD,20));
        button2.setFont(new Font("MV Boli",Font.BOLD,20));
        button1.addActionListener(this);
        button2.addActionListener(this);

        ImageIcon labelimage = new ImageIcon("newlabel.jpg");
        label.setIcon(labelimage);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.white);
        label.setFont(new Font("MS Gothic",Font.PLAIN,60));
        label.setText("B L A C K J A C K");
        label.setBackground(Color.black);
        label.setOpaque(true); //display background color
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0,0,800,600);

        frame.add(button1);
        frame.add(button2);
        frame.add(label);
        frame.setTitle(" BlackJack ");
        frame.setDefaultCloseOperation(3);
        frame.setSize(1100,600);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(0,100,0));
        ImageIcon image = new ImageIcon("logo.png");
        frame.setIconImage(image.getImage());

    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button1){
            frame.setVisible(false);
            new Game().frame.setVisible(true);

        }
        else if (e.getSource() == button2){
            System.exit(0);
        }
    }
}
