package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JButton Login , Signup , Clear;
    
    JTextField CardTextField ;
    JPasswordField PinTextField;
    Login(){
        setTitle("AUTOMATED TELLER MACHINE -> SHAMA");
        setLayout(null);
        ImageIcon i1 = new ImageIcon (ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70 , 10 , 100 ,100);
        add(label);
        
        JLabel text = new JLabel("Wellcom To ATM ");
        text.setFont(new Font("Osward" , Font.BOLD , 38));
        text.setBounds(200 , 40 , 400 , 40); 
        add(text);
        
        JLabel CardNo = new JLabel("Card No :-");
        CardNo.setFont(new Font("Raleway" , Font.BOLD , 28));
        CardNo.setBounds(120 , 150 , 400 , 30); 
        add(CardNo);
        
        CardTextField = new JTextField();
        CardTextField.setBounds(300 , 150 , 230 ,30);
        CardTextField.setFont(new Font("Arial" , Font.BOLD ,14));
        add(CardTextField);
        
        PinTextField = new JPasswordField();
        PinTextField.setBounds(300 , 220 , 230 ,30);
        PinTextField.setFont(new Font("Arial" , Font.BOLD ,16));
        add(PinTextField);
     
        JLabel Pin = new JLabel("Pin No :-");
        Pin.setFont(new Font("Osward" , Font.BOLD , 28));
        Pin.setBounds(120 , 220, 400 , 40); 
        add(Pin);
        
       // Button 
       Login = new JButton("SIGN IN");
       Login.setBounds(300 , 300 , 100 , 30);
       Login.setBackground(Color.black);
       Login.setForeground(Color.white);
       Login.addActionListener(this);
       add(Login);
       
       Clear = new JButton("CLEAR");
       Clear.setBounds(430 , 300 , 100 , 30);
       Clear.setBackground(Color.black);
       Clear.setForeground(Color.white);
       Clear.addActionListener(this);
       add(Clear);
       
       Signup = new JButton("SIGN UP");
       Signup.setBounds(300 , 350 , 230 , 30);
       Signup.setBackground(Color.black);
       Signup.setForeground(Color.white);
       Signup.addActionListener(this);
       add(Signup);
        
        getContentPane().setBackground(Color.red);
        
        
        setSize(900 , 450);
        setVisible (true);
        setLocation(400 , 250);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == Clear){
            CardTextField.setText("");
            PinTextField.setText("");
            
        }
        else if(ae.getSource() == Login){
            Conn conn = new Conn();
            String cardnumber  = CardTextField .getText();
            String pinnumber = PinTextField.getText();
            String query = "select*from login where cardnumber = '" + cardnumber + "' and pin = '" + pinnumber+"'";
            
            try{
              ResultSet rs =   conn.s.executeQuery(query);
              if(rs.next()){
                  setVisible (false);
                  new Transactions(pinnumber).setVisible(true);
              }
              else {
                  JOptionPane.showMessageDialog(null,"INcoreact Card Number or Pin: " );
              }
            }
            catch (Exception e){
                System .out.print(e);
                
            }
            
        }
        else if(ae.getSource() == Signup){
            setVisible(false);
            new SignupOne().setVisible(true);
            
        }
        
        
    }

   
    public static void main(String args[]) {
        new Login();
        
        
        
    }
}
