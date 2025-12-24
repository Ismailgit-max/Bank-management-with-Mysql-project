package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;


public class Login extends JFrame implements ActionListener {

    JButton login,clear,signup;;
    JTextField cardTextField,pinTextField;
    JPasswordField pinTextfield;

    Login() {

        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);
//
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/images.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);

//text
        JLabel text = new JLabel("Welcome to Atm");
        text.setFont(new Font("Arial", Font.BOLD, 40));
        text.setBounds(200,40,400,50);
        add(text);

        JLabel card = new JLabel("Card No:");
        card.setFont(new Font("Raleway", Font.BOLD, 40));
        card.setBounds(120,150,400,40);
        add(card);


        JLabel pin  = new JLabel("pin");
        pin.setFont(new Font("Arial", Font.BOLD, 40));
        pin.setBounds(120,220,250,40);
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(300,220,250,40);
        add(pinTextField);



        cardTextField = new JTextField();
        cardTextField.setBounds(300,150,250,40);
        add(cardTextField);


        login = new JButton("SIGN IN");
        login.setBounds(300,300,100,30 );
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        clear = new JButton("clear");
        clear.setBounds(430,300,100,30 );
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("signup");
        signup.setBounds(300,350,230,30 );
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup .addActionListener(this);
        add(signup);





        getContentPane().setBackground(Color.white);



//


        setSize(800,480);
        setVisible(true);
        setLocation(350,200);

    }
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == clear ){
            cardTextField.setText("");
            pinTextField.setText("");



        } else if (ae.getSource() == login) {

        } else if (ae.getSource() == signup) {}

    }

    public static void main(String[] args) {

        new Login();

    }

}
