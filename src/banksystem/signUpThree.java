
package banksystem;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class signUpThree extends JFrame implements ActionListener  {
    JRadioButton r1,r2,r3;
    JCheckBox c2,c3,c4,c5,c6,c7,c1;
    JButton submit,cancel;
    String formno;
    signUpThree(String formno){
        this.formno=formno;
        setLayout(null);
        setSize(850,820);
        setLocation(350,0);
        setVisible(true);
        getContentPane().setBackground(Color.white);
        
       JLabel l12 = new JLabel("Form No:");
        l12.setFont(new Font("Raleway", Font.BOLD, 13));
        l12.setBounds(700,10,60,30);
        add(l12);
        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD, 13));
        l13.setBounds(760,10,60,30);
        add(l13);
        
        JLabel l1=new JLabel("Page 3:Account Details");
        l1.setFont(new Font("Railway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);
        
        JLabel l2=new JLabel("Account Type:");
        l2.setFont(new Font("Railway",Font.BOLD,22));
        l2.setBounds(100,140,200,30);
        add(l2);
    
        r1=new JRadioButton("Savings Account");
        setFont(new Font("Railway",Font.BOLD,16));
        r1.setBounds(320,140,120,30);
        r1.setBackground(Color.WHITE);
        add(r1);
        r2=new JRadioButton("Current  Account");
        r2.setBounds(450,140,150,30);
        r2.setBackground(Color.WHITE);
        add(r2);
        r3=new JRadioButton("Business Account");
        r3.setBounds(610,140,150,30);
        r3.setBackground(Color.WHITE);
        add(r3);
        
        ButtonGroup account=new ButtonGroup();
        account.add(r1);
        account.add(r2);
        account.add(r3);
          
        JLabel l3=new JLabel("Card Number:");
        l3.setFont(new Font("Railway",Font.BOLD,22));
        l3.setBounds(100,190,200,30);
        add(l3);
        
        JLabel l4=new JLabel("XXXX-XXXX-XXXX-3241");
        l4.setFont(new Font("Railway",Font.BOLD,22));
        l4.setBounds(320,190,300,30);
        add(l4);
        
         JLabel l7=new JLabel("Your 16 Digit Card Number");
        l7.setFont(new Font("Railway",Font.BOLD,12));
        l7.setBounds(320,220,300,20);
        add(l7);
        
         JLabel l5=new JLabel("PIN:");
        l5.setFont(new Font("Railway",Font.BOLD,22));
        l5.setBounds(100,250,200,30);
        add(l5);
        
        JLabel l6=new JLabel("XXXX");
        l6.setFont(new Font("Railway",Font.BOLD,22));
        l6.setBounds(320,250,300,30);
        add(l6);
        
         JLabel l9=new JLabel("Your 4 Digit PIN Number");
        l9.setFont(new Font("Railway",Font.BOLD,12));
        l9.setBounds(320,280,300,20);
        add(l9);
        
        JLabel l8=new JLabel("Services Required:");
        l8.setFont(new Font("Railway",Font.BOLD,22));
        l8.setBounds(100,320,300,30);
        add(l8);
        
        
         c2=new JCheckBox("ATM Card");
        c2.setBackground(Color.white);
         c2.setFont(new Font("Railway",Font.BOLD,16));
        c2.setBounds(100,360,150,30);
        add(c2);
        
         c3=new JCheckBox("Internet Banking");
        c3.setBackground(Color.white);
         c3.setFont(new Font("Railway",Font.BOLD,16));
        c3.setBounds(270,360,150,30);
        add(c3);
        
         c4=new JCheckBox("Mobile Banking");
        c4.setBackground(Color.white);
         c4.setFont(new Font("Railway",Font.BOLD,16));
        c4.setBounds(470,360,150,30);
        add(c4);
        
         c5=new JCheckBox("Email Alerts");
        c5.setBackground(Color.white);
         c5.setFont(new Font("Railway",Font.BOLD,16));
        c5.setBounds(100,400,150,30);
        add(c5);
//        
         c6=new JCheckBox("Cheque Book");
        c6.setBackground(Color.white);
         c6.setFont(new Font("Railway",Font.BOLD,16));
        c6.setBounds(270,400,150,30);
        add(c6);
//        
         c7=new JCheckBox("E-Statement");
        c7.setBackground(Color.white);
         c7.setFont(new Font("Railway",Font.BOLD,16));
        c7.setBounds(470,400,150,30);
        add(c7);
        
         c1=new JCheckBox("I Hereby Declare That The Above Entered Details Are Correct To My Knowledge");
        c1.setBackground(Color.white);
         c1.setFont(new Font("Railway",Font.BOLD,13));
        c1.setBounds(100,600,600,30);
        add(c1);
        
        submit=new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setBounds(250,700,100,30);
        add(submit);
        
         cancel=new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setBounds(500,700,100,30);
        add(cancel);
        
       
    }
    @Override
    public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==submit){
       String accountType=null;
       if(r1.isSelected()){
       accountType="Savings";
       }else if(r2.isSelected()){
       accountType="Current";}else if(r3.isSelected()){
       accountType="Businness";}
       Random random=new Random();
       String cardNumber=""+ Math.abs((random.nextLong()%900000000)+5040936000000000L);
       String pinNumber=""+Math.abs(random.nextLong()%9000L+1000L);
       String facility=null;
       if(c2.isSelected()){
       facility=facility+" ATM Card";
       }else if(c3.isSelected()){
       facility=facility+" Internet Banking";
       }else if(c4.isSelected()){
       facility=facility+" Mobile Banking";
       }else if(c5.isSelected()){
       facility=facility+" Email Alerts";
       }else if(c6.isSelected()){
       facility=facility+" Cheque Book";
       }else if(c7.isSelected()){
       facility=facility+" E-Statement";
       }
       
       try{
           if(accountType.equals("")){
           JOptionPane.showMessageDialog(null,"Account TYpe is required");
           }else{
//           Conn conn=new Conn();
//           String query="insert int signUp3 values('"+formno+"','"+accountType+"','"+cardNumber+"','"+pinNumber+"','"+facility+"')";
         //  String query2="insert into login value("'+formno+'","'+cardNumber+'","'+pinNumber+'");
         // conn.s.executeUpdate(query2)
//           conn.s.executeUpdate(query);
            
        JOptionPane.showMessageDialog(null,"Card Number: "+cardNumber +"\n PIN: "+pinNumber);
        setVisible(false);
        new Deposits(cardNumber).setVisible(true);
           }
        }catch(Exception e){
           System.out.println(e);
        }
       }
    else if(ae.getSource()==cancel){
        setVisible(false);
        new Login().setVisible(true);
    }
    
    }
    
    public static void main(String[] args) {
        new signUpThree("");
    }
}
        