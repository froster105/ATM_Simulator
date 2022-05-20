
package banksystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener{
    JButton deposites,cashWithdrawl,fastCash,miniStatement,pinChange,balanceInquiry,exit;
    String cardNumber;
    public  Transactions(String cardNumber){
        this.cardNumber=cardNumber;
       
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel picLabel=new JLabel(i3);
        picLabel.setBounds(0,0,900,900);
        add(picLabel);
        
        JLabel text=new JLabel("Please select your Transactions");
        text.setBounds(215,300,700,35);
        text.setFont(new Font("System",Font.BOLD,16) );
        text.setForeground(Color.WHITE);
        //--we want to add the text on the image so that's why we use image
        picLabel.add(text);
        
         deposites =new JButton("Deposite");
        deposites.setBounds(155,415,150,30);
        deposites.addActionListener(this);
        picLabel.add(deposites);
        
         cashWithdrawl =new JButton("Cash Withdrawl");
        cashWithdrawl.setBounds(367,415,150,30);
        cashWithdrawl.addActionListener(this);
        picLabel.add(cashWithdrawl);
        
         fastCash =new JButton("Fast Cash");
        fastCash.setBounds(155,450,150,30);
        fastCash.addActionListener(this);
        picLabel.add(fastCash);
        
         miniStatement =new JButton("Mini Statement");
        miniStatement.setBounds(367,450,150,30);
        miniStatement.addActionListener(this);
        picLabel.add(miniStatement);
        
          pinChange =new JButton("PIN Change");
        pinChange.setBounds(155,485,150,30);
        pinChange.addActionListener(this);
        picLabel.add(pinChange);
        
          balanceInquiry =new JButton("Balance Inquiry");
        balanceInquiry.setBounds(367,485,150,30);
        balanceInquiry.addActionListener(this);
        picLabel.add(balanceInquiry);
        
          exit =new JButton("EXIT");
        exit.setBounds(155,520,150,30);
        exit.addActionListener(this);
        picLabel.add(exit);
        
        setSize(900,900);
        setLocation(300,0);
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==exit){
        System.exit(0);
    }else if(ae.getSource()==deposites){
        setVisible(false);
        new Deposits(cardNumber).setVisible(true);
    }else if(ae.getSource()==cashWithdrawl){
        setVisible(false);
        new Withdrawl(cardNumber).setVisible(true);
    }else if(ae.getSource()==fastCash){
    setVisible(false);
    new FastCash(cardNumber).setVisible(true);
    }else if(ae.getSource()==pinChange){
    setVisible(false);
    new PinChange(cardNumber).setVisible(true);
    
    }
    }
    public static void main(String[] args) {
        new Transactions("",);
    }
}
