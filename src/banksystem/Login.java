
package banksystem;

  import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Login extends JFrame implements ActionListener {
  

    //--buttons are locally defined and we want to use it outside the method
    JButton login,signUp,clear;
    //--for the text field
    JTextField cardTextField;
    //--for password to hide
    JPasswordField pinTextField;
    
   
    Login(){
        setTitle("Banking System Simulator");
        
        setLayout(null);
        
        //now we have to load the image through making its new object 
        //and using function ClassLoader.getSystemResource("Address")
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        
        //--There is no Image class in Swing Package so we have to import AWT package
        //-- now we have to scale that image we havt to make its object
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        
        //--we havt convert the image into image icon 
        ImageIcon i3=new ImageIcon(i2);
        
        //--new object of Jlabel
       //--we cannot simply add the icon on frame we have to use Jlabel then add 
       //that label
         JLabel label=new JLabel(i3);
         
         //--to change the location of lable for custom layout
         label.setBounds(70,10,100,100);
         
         add(label);
         
         //--to change the color of the frame
         getContentPane().setBackground(Color.WHITE);
         
         //--to write content using JLabel
         JLabel text=new JLabel("Welcome To  Bank");
         text.setFont(new Font("Osward",Font.BOLD,38));
         text.setBounds(200,40,400,40);
         add(text);
         //--to add the label card number
         JLabel cardNo=new JLabel("Card No:");
         cardNo.setFont(new Font("Railway",Font.BOLD,28));
         cardNo.setBounds(120,150,150,30);
         add(cardNo);
        //--to add text field for the card number
          cardTextField=new JTextField();
          cardTextField.setFont(new Font("Arial",Font.BOLD,14));
         cardTextField.setBounds(300,150,250,30);
         add(cardTextField);
         
         //--to add label pin
         JLabel pin=new JLabel("PIN:");
         pin.setFont(new Font("Railway",Font.BOLD,28));
         pin.setBounds(120,220,250,30);
         add(pin);
         //--to add pin text field 
         pinTextField=new JPasswordField();
          pinTextField.setFont(new Font("Arial",Font.BOLD,14));
          pinTextField.setBounds(300,220,250,30);
         add(pinTextField);
         
         //--login button
          login=new JButton("Sign In");
         login.setBounds(300,300,100,30);
         login.setBackground(Color.black);
         login.setForeground(Color.pink);
         login.addActionListener(this);
         add(login);
         
         //--clear button
          clear=new JButton("Clear");
         clear.setBounds(450,300,100,30);
         clear.setBackground(Color.black);
         clear.setForeground(Color.pink);
         clear.addActionListener(this);
         add(clear);
         
         //--sign up button
          signUp=new JButton("Sign Up");
         signUp.setBounds(300,350,250,30);
         signUp.setBackground(Color.black);
         signUp.setForeground(Color.pink);
         signUp.addActionListener(this);
         add(signUp);
        
        setSize(800,480);
        //set visible is used to make slide visible it is function of JFrame package
        setVisible(true);
        //setlocation function is used to open the slide 350 from left and 200 from top
        setLocation(350,200);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }else if(ae.getSource()==signUp){
            //--this will open the signupframe
            setVisible(false);
            new BankSystem().setVisible(true);
        }else if(ae.getSource()==login){
//            Conn conn=new Conn;
            String cardnumber=cardTextField.getText();
            String pin=pinTextField.getText();
//            String query="select * from login where carnumber="+cardnumber+" and pin="+pin+"";
//            try{
//              ResultSet rs=  conn.s.executeQuery(query);
//              //if result set rs has the data then the we have entered the right values
//              if(rs.next()){
               setVisible(false);
             new Transactions(pin).setVisible(true);
//              }else{
//              JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin");}
//            }catch(Exception e){
//                System.out.println(e);}
           
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}
