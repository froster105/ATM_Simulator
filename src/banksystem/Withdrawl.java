
package banksystem;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;



    


public class Withdrawl extends JFrame implements ActionListener {
     JTextField withdrawlText;
    JButton withdrawl,clear;
    String cardNumber,amount;
    Withdrawl(String cardNumber){
    this .cardNumber=cardNumber;
    
   
    
     setLayout(null);
     
    
     ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
     Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
     ImageIcon i3=new ImageIcon(i2);
     JLabel picLabel=new JLabel(i3);
     picLabel.setBounds(0,0,900,900);
     add(picLabel);
     
     JLabel text=new JLabel("Enter Amount:");
     text.setFont(new Font("Railway",Font.BOLD,16));
     text.setForeground(Color.WHITE);
     text.setBounds(155,410,150,30);
     picLabel.add(text);
     
      withdrawlText=new JTextField();
     withdrawlText.setBounds(155,450,200,30);
     withdrawlText.setBackground(Color.white);
     picLabel.add(withdrawlText);
     
      withdrawl=new JButton("Withdrawl");
     withdrawl.setBounds(155,520,100,30);
     withdrawl.setBackground(Color.LIGHT_GRAY);
     withdrawl.setForeground(Color.black);
     withdrawl.addActionListener(this);
     picLabel.add(withdrawl);
     
      clear=new JButton("Back");
     clear.setBounds(415,520,100,30);
     clear.setBackground(Color.LIGHT_GRAY);
     clear.setForeground(Color.black);
     clear.addActionListener(this);
     picLabel.add(clear);
     
     
    setSize(900,900);
    setLocation(300,0);
    setTitle("Withdrawl Window");
    getContentPane().setBackground(Color.WHITE);
    setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==clear){
    
    setVisible(false);
    new Transactions(cardNumber).setVisible(true);
    }else if(ae.getSource()==withdrawl){
        amount=withdrawlText.getText();
       Date date=new Date();
       if(amount.equals("")){
       JOptionPane.showMessageDialog(null,"Please Enter the Amount");}
//       else{
//        try{
////    Conn conn=new Conn();
//    String query="insert into deposit values('"+cardNumber+"','"+date+"','Withdrawl','"+amount+"')";
////    conn.s.executeUpdate(query);
//    JOptionPane.showMessageDialog(null,"Rs" +amount+"Withdrawl Successfully");
//        }catch(Exception e){
//            System.out.println(e);}
//    }
    }
    }
   


    public static void main(String[] args) {
        new Withdrawl("");
    }
}
        

