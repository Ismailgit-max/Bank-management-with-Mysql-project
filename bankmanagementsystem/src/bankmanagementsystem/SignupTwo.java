package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java .util.*;
import java.awt.event.*;
import java.sql.Connection;


public class SignupTwo  extends  JFrame implements ActionListener{
    SignupTwo(){

        JButton nextButton;
        JTextField additionalNameTextField,religionTextField, categoryTextField ,educationTextField,incomeTextField,qualificationTextField,occcupationTextField,adharNumberTextField,panNumberTextField,exisitingAccountTextField,seniorCitizenTextField;

        setLayout(null);
    setTitle("NEW ACCOUNT APPLICATION Form");


    JLabel additionalDetails = new JLabel("Additiional Details");
    additionalDetails.setFont(new Font("Times New Roman",Font.BOLD,25));
    additionalDetails.setBounds(290,80,400,30);
    add(additionalDetails);






    JLabel religion = new JLabel("Religion");
    religion.setFont(new Font("Times New Roman",Font.BOLD,25));
    religion.setBounds(100,140,100,30);
    add(religion);

    String valReligion[] = {"Hindus","Muslim","sikh","christain","others"};
    JComboBox religionbox = new JComboBox(valReligion);
    religionbox.setBounds(540,140,200,30);
    religionbox.setBackground(Color.WHITE);
    add(religionbox);




    JLabel category = new JLabel("Category");
    category.setFont(new Font("Times New Roman",Font.BOLD,25));
    category.setBounds(100,180,200,30);
    add(category);

    String valcategory[]={"obc","others","st","sc",};
    JComboBox categorybox = new JComboBox(valcategory);
    categorybox.setBounds(540,180,200,30);
    categorybox.setBackground(Color.WHITE);
    add(categorybox);




     JLabel income = new JLabel("Income");
     income.setFont(new Font("Times New Roman",Font.BOLD,25));
     income.setBounds(100,240,200,30);
     add(income);
     String incomecategory[] = {"null","<1,50,00","<2,50,00","<5,00,00","upto 10,00,00"};
     JComboBox incomebox = new JComboBox(incomecategory);
     incomebox.setBounds(540,240,200,30);
     add(incomebox);


     JLabel education = new JLabel("education");
     education.setFont(new Font("Times New Roman",Font.BOLD,25));
     education.setBounds(100,280,200,30);
     add(education);
     educationTextField = new JTextField();
     educationTextField.setBounds(540,280,200,30);
     educationTextField.setFont(new Font("Times New Roman",Font.BOLD,25));
     add(educationTextField);


     JLabel qualification = new JLabel("Qualification");
     qualification.setFont(new Font("Times New Roman",Font.BOLD,25));
     qualification.setBounds(100,320,200,30);
     add(qualification);
        qualificationTextField = new JTextField();
        qualificationTextField.setBounds(540,320,200,30);
        qualificationTextField.setFont(new Font("Times New Roman",Font.BOLD,25));
        add(qualificationTextField);


     JLabel occupation = new JLabel("Occupation");
     occupation.setFont(new Font("Times New Roman",Font.BOLD,25));
     occupation.setBounds(100,360,200,30);
     add(occupation);
     occcupationTextField = new JTextField();
     occcupationTextField.setBounds(540,360,200,30);
     occcupationTextField.setFont(new Font("Times New Roman",Font.BOLD,25));
     add(occcupationTextField);

     JLabel panNumber = new JLabel("Pannumber");
     panNumber.setFont(new Font("Times New Roman",Font.BOLD,25));
     panNumber.setBounds(100,400,200,30);
     add(panNumber);
     panNumberTextField = new JTextField();
     panNumberTextField.setBounds(540,400,200,30);
     panNumberTextField.setFont(new Font("Times New Roman",Font.BOLD,25));
     add(panNumberTextField);


     JLabel adharNumber = new JLabel("Adharnumber");
     adharNumber.setFont(new Font("Times New Roman",Font.BOLD,25));
     adharNumber.setBounds(100,440,200,30);
     add(adharNumber);
     adharNumberTextField = new JTextField();
     adharNumberTextField.setBounds(540,440,200,30);
     adharNumberTextField.setFont(new Font("Times New Roman",Font.BOLD,25));
     add(adharNumberTextField);


     JLabel seniorCitizen=  new JLabel("Senior Citizen");
     seniorCitizen.setBounds(100,480,200,30);
     seniorCitizen.setFont(new Font("Times New Roman",Font.BOLD,25));
     add(seniorCitizen);
     seniorCitizenTextField = new JTextField();
     seniorCitizenTextField.setBounds(540,480,200,30);
     seniorCitizenTextField.setFont(new Font("Times New Roman",Font.BOLD,25));
     add(seniorCitizenTextField);


     JLabel exisitingAccount= new JLabel("Exisiting Account");
     exisitingAccount.setBounds(100,520,200,30);
     exisitingAccount.setFont(new Font("Times New Roman",Font.BOLD,25));
     add(exisitingAccount);
     exisitingAccountTextField = new JTextField();
     exisitingAccountTextField.setBounds(540,520,200,30);
     exisitingAccountTextField.setFont(new Font("Times New Roman",Font.BOLD,25));
     add(exisitingAccountTextField);






//next button/



        setSize(850,800);
        setVisible(true);
        setLocation(350,10);


        getContentPane().setBackground(Color.WHITE);


        nextButton = new JButton("Next");
        nextButton.setBounds(660,660,80,30);
        nextButton.setBackground(Color.black);
        nextButton.setForeground(Color.white);
        nextButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        nextButton.addActionListener(this);
        add(nextButton);







    }
    public  void actionPerformed(ActionEvent e) {

    }




public static void main(String[] args) {
    new SignupTwo();

}



}
