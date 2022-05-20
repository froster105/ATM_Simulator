
package banksystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
    JButton l1,l2,l3,l4,l5,l6,exit;
    String cardNumber;
    FastCash(String cardNumber){
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
        
         l1 =new JButton("100");
        l1.setBounds(155,415,150,30);
        l1.addActionListener(this);
        picLabel.add(l1);
        
         l2 =new JButton("500");
        l2.setBounds(367,415,150,30);
        l2.addActionListener(this);
        picLabel.add(l2);
        
         l3 =new JButton("1000");
        l3.setBounds(155,450,150,30);
        l3.addActionListener(this);
        picLabel.add(l3);
        
         l4 =new JButton("2000");
        l4.setBounds(367,450,150,30);
        l4.addActionListener(this);
        picLabel.add(l4);
        
          l5 =new JButton("5000");
        l5.setBounds(155,485,150,30);
        l5.addActionListener(this);
        picLabel.add(l5);
        
          l6 =new JButton("10000");
        l6.setBounds(367,485,150,30);
        l6.addActionListener(this);
        picLabel.add(l6);
        
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
        setVisible(false);
        new Transactions(cardNumber).setVisible(true);
    }else{
//    String amount=((JButton)ae.getSource()).getText();
//    Conn conn=new Conn();
//    try{
//        //get the values related to card number from the bank table
//    ResultSet rs=conn.s.executeQuery("select * from deposit where cardNumber'"+cardNumber+"'");
//    int balance=0;
//    //this will loop the rows of the result set and the while will continue
//    while(rs.next()){
//        if(rs.getString("type").equals("Deposit")){
//        balance+=Integer.parseInt(rs.getString("amount"));
//        }else{
//            balance-=Integer.parseInt(rs.getString("amount"));
//        }
//    }
//    //now we compare the balance with the button we clicked
//    if(ae.getSource()!=exit&&balance<Integer.parseInt(amount)){
//        JOptionPane.showMessageDialog(null,"Your Balance Is Low");
//        return;
//    }
//    Date date =new Date();
//    String query="insert into deposit values('"+cardNumber+"','"+date+"','Withdrawl','"+amount+"')";
//    conn.s.queryUpdate(query);
   JOptionPane.showMessageDialog(null, "Debted Successfully");
    setVisible(false);
    new Transactions(cardNumber).setVisible(true);}
//    }catch(Exception e){
//        System.out.println(e);}
//    }
    }
    public static void main(String[] args) {
        new FastCash("");
    }
}
