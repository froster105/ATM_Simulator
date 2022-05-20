
    

package banksystem;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;



    


public class PinChange extends JFrame implements ActionListener {
     JTextField pinChangeText;
    JButton submit,clear;
    String cardNumber,pinNew;
    PinChange(String cardNumber){
    this .cardNumber=cardNumber;
    
    
     setLayout(null);
     
    
     ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
     Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
     ImageIcon i3=new ImageIcon(i2);
     JLabel picLabel=new JLabel(i3);
     picLabel.setBounds(0,0,900,900);
     add(picLabel);
     
     JLabel text=new JLabel("Enter New PIN:");
     text.setFont(new Font("Railway",Font.BOLD,16));
     text.setForeground(Color.WHITE);
     text.setBounds(155,410,150,30);
     picLabel.add(text);
     
      pinChangeText=new JTextField();
     pinChangeText.setBounds(155,450,200,30);
     pinChangeText.setBackground(Color.white);
     picLabel.add(pinChangeText);
     
      submit=new JButton("Submit");
     submit.setBounds(155,520,100,30);
     submit.setBackground(Color.LIGHT_GRAY);
     submit.setForeground(Color.black);
     submit.addActionListener(this);
     picLabel.add(submit);
     
      clear=new JButton("Back");
     clear.setBounds(415,520,100,30);
     clear.setBackground(Color.LIGHT_GRAY);
     clear.setForeground(Color.black);
     clear.addActionListener(this);
     picLabel.add(clear);
     
     
    setSize(900,900);
    setLocation(300,0);
    setTitle("PIN Change Window");
    getContentPane().setBackground(Color.WHITE);
    setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==clear){
    
    setVisible(false);
    new Transactions(cardNumber).setVisible(true);
    }else if(ae.getSource()==submit){
        pinNew=pinChangeText.getText();
       Date date=new Date();
       if(pinNew.equals("")){
       JOptionPane.showMessageDialog(null,"Please Enter the PIN");}
//       else{
//        try{
////    Conn conn=new Conn();
//    String query="update  deposit set pinNumber=pinNew where cardNumber="+cardNumber+" ";
////    conn.s.executeUpdate(query);
//    JOptionPane.showMessageDialog(null,"PIN Change Successfully");
//        }catch(Exception e){
//            System.out.println(e);}
//    }
    }
    }
   


    public static void main(String[] args) {
        new PinChange("");
    }
}
        

