package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java .util.*;
import java.awt.event.*;
import java.sql.Connection;



public class SignupOne extends JFrame implements  ActionListener {

    long random;
    JTextField nameTextField,fnameTextField,dobTextField,addressTextField,cityTextField,emailTextField,pincodeTextField,stateTextField;
    JButton nextButton;
    JRadioButton male,female, married,unmarried;




    SignupOne(){
        setLayout(null);

        Random ran = new Random();
        random = (Math.abs((ran.nextLong() % 9000l) + 1000l));


        JLabel formno = new JLabel("APPLICATION FORM NUMBER.  " + random);
        formno.setFont(new Font("Times New Roman", Font.BOLD, 30));
        formno.setBounds(140,20,600,40);
        add(formno);

        JLabel personDetails = new JLabel("page 1 : Person Details ");
        personDetails .setFont(new Font("Times New Roman", Font.BOLD, 22));
        personDetails .setBounds(290,80,400,30);
        add(personDetails );

        JLabel name = new JLabel("Name:");
        name  .setFont(new Font("Times New Roman", Font.BOLD, 22));
        name  .setBounds(80,140,100,30);
        add( name );
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Times New Roman", Font.BOLD, 14));
        nameTextField.setBounds(300,140,400,30);
        add( nameTextField );


        JLabel fname = new JLabel(" Father Name:");
        fname  .setFont(new Font("Times New Roman", Font.BOLD, 22));
        fname  .setBounds(70,190,150,30);
        add( fname );
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Times New Roman", Font.BOLD, 14));
        fnameTextField.setBounds(300,190,400,30);
        add( fnameTextField );

        JLabel dob = new JLabel("Date of Birth :");
        dob .setFont(new Font("Times New Roman", Font.BOLD, 22));
        dob .setBounds(80,240,200,30);
        add( dob );
       //calender importing
        dobTextField = new JTextField();
        dobTextField.setFont(new Font("Times New Roman", Font.BOLD, 14));
        dobTextField.setBounds(300,190,400,30);
        add( dobTextField );
        dobTextField = new JTextField();
        dobTextField.setFont(new Font("Times New Roman", Font.BOLD, 14));
        dobTextField.setBounds(300,240,400,30); // ✅ correct position
        add(dobTextField);










        JLabel gender = new JLabel("Gender: ");
        gender .setFont(new Font("Times New Roman", Font.BOLD, 22));
        gender .setBounds(80,290,200,30);
        add( gender );
        //male
        male = new JRadioButton("Male");
        male .setBounds(300,290,60,30);
        male.setBackground(Color.white);
        add(male );

        //female
        female = new JRadioButton("Female");
        female .setBounds(450,290,60,30);
        female.setBackground(Color.white);
        add(female );

        //selecting one

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(male);
        buttonGroup.add(female);


        JLabel email = new JLabel("Email Address: ");
        email .setFont(new Font("Times New Roman", Font.BOLD, 22));
        email .setBounds(80,340,200,30);
        add( email );
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Times New Roman", Font.BOLD, 14));
        emailTextField.setBounds(300,340,400,30);
        add( emailTextField );

        JLabel marital = new JLabel("Marital Status: ");
        marital .setFont(new Font("Times New Roman", Font.BOLD, 22));
        marital.setBounds(80,390,200,30);
        add( marital );
        married= new JRadioButton("Married");
        married .setBounds(300,390,100,30);
        married.setBackground(Color.white);
        add(married );

        //female
        unmarried = new JRadioButton("Unmarried");
        unmarried .setBounds(450,390,100,30);
        unmarried.setBackground(Color.white);
        add(unmarried );

        //selecting one

        ButtonGroup marriageGroup = new ButtonGroup();
        marriageGroup.add(married);
        marriageGroup.add(unmarried);


        JLabel address = new JLabel("Address: ");
        address.setFont(new Font("Times New Roman", Font.BOLD, 22));
        address.setBounds(80,440,200,30);
        add( address );
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Times New Roman", Font.BOLD, 14));
        addressTextField.setBounds(300,440,400,30);
        add( addressTextField);



        JLabel city = new JLabel("City: ");
        city.setFont(new Font("Times New Roman", Font.BOLD, 22));
        city.setBounds(80,490,200,30);
        add(city);
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Times New Roman", Font.BOLD, 14));
        cityTextField.setBounds(300,490,400,30);
        add( cityTextField );

        JLabel state = new JLabel("State: ");
        state.setFont(new Font("Times New Roman", Font.BOLD, 22));
        state.setBounds(80,540,200,30);
        add(state);
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Times New Roman", Font.BOLD, 14));
        stateTextField.setBounds(300,540,400,30);
        add( stateTextField );

        JLabel pincode = new JLabel("pincode: ");
        pincode.setFont(new Font("Times New Roman", Font.BOLD, 22));
        pincode.setBounds(80,590,200,30);
        add(pincode);
        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Times New Roman", Font.BOLD, 14));
        pincodeTextField.setBounds(300,590,400,30);
        add( pincodeTextField );

        nextButton = new JButton("Next");
        nextButton.setBounds(660,660,80,30);
        nextButton.setBackground(Color.black);
        nextButton.setForeground(Color.white);
        nextButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        nextButton.addActionListener(this);
        add(nextButton);


/// textfield//






        setSize(850,800);
        setVisible(true);
        setLocation(350,10);


        getContentPane().setBackground(Color.WHITE);







    }

    public  void actionPerformed(ActionEvent e) {
        String formno =""+ random;
        String name = nameTextField.getText();// value ku nikal sakte hai form get
        String fname = fnameTextField.getText();
        String gender = null;
        if (male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";

        }
        String email = emailTextField.getText();
        String marital = married.isSelected() ? "Married" : "Unmarried";

        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pincode = pincodeTextField.getText();
        String dob = dobTextField.getText();


        try {
            if (name.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter your name");
            } else {
                Conn c = new Conn();
                String query =
                        "INSERT INTO signup (formno, name, fname, dob, gender, email, marital, address, city, state, pincode) " +
                                "VALUES ('" + formno + "','" + name + "','" + fname + "','" + dob + "','" +
                                gender + "','" + email + "','" + marital + "','" + address + "','" +
                                city + "','" + state + "','" + pincode + "')";


                c.s.executeUpdate(query);
            }
        }catch (Exception ex){
            System.out.println(ex);

        }



    }

    public static void main(String[] args) {
        new SignupOne();
    }
}
