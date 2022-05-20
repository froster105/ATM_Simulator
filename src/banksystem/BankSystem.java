
//sign up page
package banksystem;

  import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class BankSystem extends JFrame implements ActionListener {
    long random;
    String s;
   JTextField nameText,fnameText,emailText,addressText,cityText,stateText,pincodeText;
   JButton next;
   JRadioButton male,female;
   JDateChooser dateChooser;
    BankSystem(){
  
        //--next button
         next=new JButton("Next");
        next.setBounds(600,600,100,30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.addActionListener(this);
        add(next);
        //--date chooser
         dateChooser=new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        add(dateChooser);
        
        //--to make radio button
         male=new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);
         female=new JRadioButton("Female");
        female.setBounds(400,290,120,30);
        female.setBackground(Color.WHITE);
        add(female);
        
        ButtonGroup gendergroup=new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);

        
        //--these are text fields for the input
        //--the code is not written in between the lable because it is not working  
        nameText=new JTextField();
        nameText.setBounds(300,140,400,30);
        nameText.setFont(new Font("Railway",Font.BOLD,14));
         add(nameText);
         
          fnameText=new JTextField();
        fnameText.setBounds(300,190,400,30);
        fnameText.setFont(new Font("Railway",Font.BOLD,14));
         add(fnameText);
         
           emailText=new JTextField();
        emailText.setBounds(300,340,400,30);
        emailText.setFont(new Font("Railway",Font.BOLD,14));
         add(emailText);
         
        addressText= new JTextField();
        addressText.setBounds(300,390,400,30);
        addressText.setFont(new Font("Railway",Font.BOLD,14));
         add(addressText);
         
         cityText= new JTextField();
        cityText.setBounds(300,440,400,30);
        cityText.setFont(new Font("Railway",Font.BOLD,14));
         add(cityText);
         
         stateText= new JTextField();
        stateText.setBounds(300,490,400,30);
        stateText.setFont(new Font("Railway",Font.BOLD,14));
         add(stateText);
         
         pincodeText=new JTextField();
        pincodeText.setBounds(300,540,400,30);
        pincodeText.setFont(new Font("Railway",Font.BOLD,14));
         add(pincodeText);
         
         //--used to set titile to the frame
        setTitle("Sign Up");
        
        setLayout(null);
        setSize(850,800);
        setVisible(true);
        setLocation(350,10);
        
        getContentPane().setBackground(Color.WHITE);
        
        //--to generate the random number
        Random rand=new Random();
         random=Math.abs((rand.nextLong() % 9000L)+1000L); 
        
        //--this will add the random number to the page
        JLabel formno=new JLabel("APPLICATION NUMBER: "+random);
        formno.setFont(new Font("Railway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        //--for personal details
        JLabel personal=new JLabel("Page 1:Personal Details ");
        personal.setFont(new Font("Railway",Font.BOLD,18));
        personal.setBounds(300,60,400,40);
        add(personal);
        
        JLabel name=new JLabel("Name:");
        name.setFont(new Font("Railway",Font.BOLD,18));
        name.setBounds(100,140,100,30);
        add(name);
        
       
       
         JLabel fname=new JLabel(" Fathers Name:");
        fname.setFont(new Font("Railway",Font.BOLD,18));
        fname.setBounds(95,190,140,30);
        add(fname);
//        JTextField fatherNameText=new JTextField();
//        fatherNameText.setBounds(250,140,400,30);
//        add(fatherNameText);
        
         JLabel dob=new JLabel("Date Of Birth:");
        dob.setFont(new Font("Railway",Font.BOLD,18));
        dob.setBounds(100,240,150,30);
        add(dob);
        
         JLabel address=new JLabel("Address:");
        address.setFont(new Font("Railway",Font.BOLD,18));
        address.setBounds(100,390,100,30);
        add(address);
        
        JLabel city=new JLabel("City:");
        city.setFont(new Font("Railway",Font.BOLD,18));
        city.setBounds(100,440,100,30);
        add(city);
        
        JLabel state=new JLabel("State:");
        state.setFont(new Font("Railway",Font.BOLD,18));
        state.setBounds(100,490,100,30);
        add(state);
        
         JLabel pincode=new JLabel("Pincode:");
        pincode.setFont(new Font("Railway",Font.BOLD,18));
        pincode.setBounds(100,540,100,30);
        add(pincode);
        
         JLabel gender=new JLabel("Gender:");
        gender.setFont(new Font("Railway",Font.BOLD,18));
        gender.setBounds(100,290,100,30);
        add(gender);
        
         JLabel email=new JLabel("Email Address:");
        email.setFont(new Font("Railway",Font.BOLD,18));
        email.setBounds(100,340,150,30);
        add(email);
        
        
        s=String.valueOf(random);
         
        
    }

   
    @Override
    public  void actionPerformed(ActionEvent ae){
        String formno=""+random;
        String name=nameText.getText();
        String fname=fnameText.getText();
        String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(male.isSelected()){
            gender="Male";
        }else if(female.isSelected()){
            gender="Female";
        }
        String email=emailText.getText();
        String address=addressText.getText();
        String city=cityText.getText();
        String state=stateText.getText();
        String pincode=pincodeText.getText();
        
        try{
            if(name.equals("")){
            JOptionPane.showMessageDialog(null,"Name is required");}
            
//            else if(fname.equals("")){
//            JOptionPane.showMessageDialog(null,"Fathers Name is required");}
//            else if(email.equals("")){
//            JOptionPane.showMessageDialog(null,"Email is required");}
//            else if(address.equals("")){
//            JOptionPane.showMessageDialog(null,"Address is required");}
//            else if(city.equals("")){
//            JOptionPane.showMessageDialog(null,"City is required");}
//            else if(pincode.equals("")){
//            JOptionPane.showMessageDialog(null,"Pincode is required");}
//            else  if(state.equals("")){
//            JOptionPane.showMessageDialog(null,"State is required");}
//            //--mysql query
//            else{
//                Conn c=new Conn();
//                String query="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+address+"','"+city+"','"+pincode+"','"+pincode+"')";
  // --by using the c connection and s statement we will use dml command executeUpdate to insert the values     
//c.s.executeUpdate(query);
//            }
            else if(ae.getSource()==next){
            setVisible(false);
            new signUpExtra(s).setVisible(true);
        }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
      
    public static void main(String[] args) {
        // TODO code application logic here
       
        new BankSystem();
    }
    
}
