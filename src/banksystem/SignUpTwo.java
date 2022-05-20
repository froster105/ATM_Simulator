
package banksystem;

//sign up page two

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class SignUpTwo extends JFrame implements ActionListener {
    
    long random;
   JTextField incomeText,qualificationText,panNumberText,aadharNumberText,occupationText;
   JButton next;
   JRadioButton noSenior,yesSenior,yesExisting,noExisting;
  

    SignUpTwo(){
    
    
  
        //--next button
         next=new JButton("Next");
        next.setBounds(600,600,100,30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.addActionListener(this);
        add(next);
        
        
      
         //--used to set titile to the frame
        setTitle("Additional Details");
        
        setLayout(null);
        setSize(850,820);
        setVisible(true);
        setLocation(350,0);
        
        getContentPane().setBackground(Color.WHITE);
        
        //--text fields
       
         
//          qualificationText=new JTextField();
//        qualificationText.setBounds(300,190,400,30);
//        qualificationText.setFont(new Font("Railway",Font.BOLD,14));
//         add(qualificationText);
//         
//         occupationText=new JTextField();
//        occupationText.setBounds(300,240,400,30);
//        add(occupationText);
//        
//         panNumberText=new JTextField();
//        panNumberText.setBounds(300,390,400,30);
//        panNumberText.setFont(new Font("Railway",Font.BOLD,14));
//         add(panNumberText);
//         
//         aadharNumberText= new JTextField();
//        aadharNumberText.setBounds(300,440,400,30);
//        aadharNumberText.setFont(new Font("Railway",Font.BOLD,14));
//         add(aadharNumberText);
//         
//         yesExisting=new JRadioButton("Yes");
//        yesExisting.setBounds(300,440,60,30);
//        yesExisting.setBackground(Color.WHITE);
//        add(yesExisting);
//         noExisting=new JRadioButton("No");
//        noExisting.setBounds(400,440,120,30);
//        noExisting.setBackground(Color.WHITE);
//        add(noExisting);
//        
//        ButtonGroup existinggroup=new ButtonGroup();
//        existinggroup.add(yesExisting);
//        existinggroup.add(noExisting);
//        
//         yesSenior=new JRadioButton("Yes");
//        yesSenior.setBounds(300,390,60,30);
//        yesSenior.setBackground(Color.WHITE);
//        add(yesSenior);
//         noSenior=new JRadioButton("No");
//        noSenior.setBounds(400,390,120,30);
//        noSenior.setBackground(Color.WHITE);
//        add(noSenior);
//        
//        ButtonGroup seniorgroup=new ButtonGroup();
//        seniorgroup.add(noSenior);
//        seniorgroup.add(noSenior);
       
        
        //--for personal details
        JLabel additionalDetails=new JLabel("Page 2:Additional Details ");
        additionalDetails.setFont(new Font("Railway",Font.BOLD,18));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        JLabel incomeLabel=new JLabel("Income:");
        incomeLabel.setFont(new Font("Railway",Font.BOLD,20));
        incomeLabel.setBounds(100,140,200,30);
        add(incomeLabel);
        
        String incomecategory[]={"Null","<1,50,000","<2,50,000","5,00,000","Upto 10,00,000"};
        JComboBox income=new JComboBox(incomecategory);
        income.setBounds(300,140,400,30);
        income.setBackground(Color.WHITE);
        add(income);
//         incomeText=new JTextField();
//        incomeText.setBounds(300,140,400,30);
//        incomeText.setFont(new Font("Railway",Font.BOLD,14));
//         add(incomeText);
        
       
       
         JLabel qualification=new JLabel(" Educational ");
        qualification.setFont(new Font("Railway",Font.BOLD,20));
        qualification.setBounds(100,190,200,30);
        add(qualification);
        
        JLabel quality=new JLabel("Qualification ");
        quality.setFont(new Font("Railway",Font.BOLD,20));
        quality.setBounds(100,210,200,30);
        add(quality);
        
        
        
         
        
         JLabel occupation=new JLabel("Occupation:");
        occupation.setFont(new Font("Railway",Font.BOLD,18));
        occupation.setBounds(100,240,150,30);
        add(occupation);
        
         
        
         JLabel pan=new JLabel("PAN Number:");
        pan.setFont(new Font("Railway",Font.BOLD,18));
        pan.setBounds(100,290,100,30);
        add(pan);
        
        
        
        JLabel aadhar=new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("Railway",Font.BOLD,18));
        aadhar.setBounds(100,340,100,30);
        add(aadhar);
        
        
        
        JLabel senior=new JLabel("Senior Citizen:");
        senior.setFont(new Font("Railway",Font.BOLD,18));
        senior.setBounds(100,390,100,30);
        add(senior);
        
         //--to make radio button
        
        
         JLabel existingAccount=new JLabel("Existing Acoount:");
        existingAccount.setFont(new Font("Railway",Font.BOLD,12));
        existingAccount.setBounds(100,440,100,30);
        add(existingAccount);
        
        
        
      
    }

   
    @Override
    public  void actionPerformed(ActionEvent ae){
        
        String income1=incomeText.getText();
        String qualification=qualificationText.getText();
        String senior=null;
        if(yesSenior.isSelected()){
            senior="Yes";
        }else if(noSenior.isSelected()){
            senior="No";
        }
        
        String existing=null;
        if(yesExisting.isSelected()){
            existing="Yes";
        }else if(noExisting.isSelected()){
            existing="Yes";
        }
        String panNumber=panNumberText.getText();
        String aadharNumber=aadharNumberText.getText();
        String occupation=occupationText.getText();
       
        
        try{
            if(income1.equals("")){
            JOptionPane.showMessageDialog(null,"Name is required");}
            
            else if(panNumber.equals("")){
            JOptionPane.showMessageDialog(null,"Fathers Name is required");}
            else if(occupation.equals("")){
            JOptionPane.showMessageDialog(null,"Email is required");}
            else if(aadharNumber.equals("")){
            JOptionPane.showMessageDialog(null,"Address is required");}
            else if(qualification.equals("")){
            JOptionPane.showMessageDialog(null,"City is required");}
            
            //--mysql query
//            else{
//                Conn c=new Conn();
//                String query="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+address+"','"+city+"','"+pincode+"','"+pincode+"')";
  // --by using the c connection and s statement we will use dml command executeUpdate to insert the values     
//c.s.executeUpdate(query);
//            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
      
    public static void main(String[] args) {
        // TODO code application logic here
       
        new SignUpTwo();
    }
    
}


