public class signupTwo {

    package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class SignupThree extends JFrame implements ActionListener {
    JRadioButton r1 ,r2 ,r3 , r4;
    JCheckBox c1 , c2 , c3, c4 , c5 , c6 ,c7;
    JButton sumbit , cancel;
    String formno;
    
    SignupThree( String formno){
        this.formno = formno;
     
       setLayout(null);
   JLabel ll = new JLabel("Page 3: Account Datel's");
  ll.setFont(new Font("Raleway" , Font.BOLD,22));
   ll.setBounds(280 , 40 , 400 , 40);
   add(ll);
   
   
   JLabel type= new JLabel("Account Type: ");
   type.setFont(new Font("Raleway" , Font.BOLD,22));
    type.setBounds(100 , 140 , 200 , 30);
    add(type);
    
    
    r1 =  new  JRadioButton("Saving Account");
    r1.setFont(new Font( "Raleway", Font.BOLD ,16));
    r1.setBackground(Color.white);
    r1.setBounds(100 , 180 , 150 ,20);
    add(r1);
    
    r2 =  new  JRadioButton("Fixed Deposit Account");
    r2.setFont(new Font( "Raleway", Font.BOLD ,16));
    r2.setBackground(Color.white);
    r2.setBounds(350 , 180 , 250 ,20);
    add(r2);
    
    r3 =  new  JRadioButton("Current Account ");
    r3.setFont(new Font( "Raleway", Font.BOLD ,16));
    r3.setBackground(Color.white);
    r3.setBounds(100 , 220 , 250,20);
    add(r3);
    
    r4 =  new  JRadioButton("Recuring Deposit Account");
    r4.setFont(new Font( "Raleway", Font.BOLD ,16));
    r4.setBackground(Color.white);
    r4.setBounds(350 , 220 , 250 ,20);
    add(r4);
    
    ButtonGroup groupaccount = new ButtonGroup();
    groupaccount.add(r1);
    groupaccount.add(r2);
    groupaccount.add(r3);
    groupaccount.add(r4);
    
    
    JLabel card= new JLabel("Card number: ");
   card.setFont(new Font("Raleway" , Font.BOLD,22));
    card.setBounds(100 , 300 , 200 , 30);
    add(card);
    
    
    JLabel number =  new JLabel("XXXX-XXXX-XXXX-4311");
   number.setFont(new Font("Raleway" , Font.BOLD,22));
    number.setBounds(350 , 300, 300 , 30);
    add(number);
    
     JLabel carddetail =  new JLabel("Your 16 - Digite Card Number:");
   carddetail.setFont(new Font("Raleway" , Font.BOLD,15));
    carddetail.setBounds(100, 330, 300 , 20);
    add(carddetail);
            
    
    
    JLabel pin= new JLabel("PIN: ");
   pin.setFont(new Font("Raleway" , Font.BOLD,22));
    pin.setBounds(100 , 370 , 200 , 30);
    add(pin);
    
    JLabel pnumber =  new JLabel("XXXX");
   pnumber.setFont(new Font("Raleway" , Font.BOLD,22));
    pnumber.setBounds(350 , 370, 300 , 30);
    add(pnumber);
    
    JLabel pindetail =  new JLabel("Your 4 - Digit Pin");
   pindetail.setFont(new Font("Raleway" , Font.BOLD,15));
    pindetail.setBounds(100, 400, 300 , 20);
    add(pindetail);
    
    
    JLabel services= new JLabel("Services Requried ");
   services.setFont(new Font("Raleway" , Font.BOLD,20));
    services.setBounds(100 , 450 , 200 , 30);
    add(services);
    
    
    c1 = new JCheckBox("ATM Card");
    c1.setBackground(Color.white);
    c1.setFont(new Font("Raleway " , Font.BOLD , 16));
    c1.setBounds(100 , 500 ,200 ,20);
    add(c1);
    
    
    c2 = new JCheckBox("Internet Banking");
    c2.setBackground(Color.white);
    c2.setFont(new Font("Raleway " , Font.BOLD , 16));
    c2.setBounds(350, 500 ,200 ,20);
    add(c2);
    
    c3= new JCheckBox("Moblie Banking");
    c3.setBackground(Color.white);
    c3.setFont(new Font("Raleway " , Font.BOLD , 16));
    c3.setBounds(100 , 550 ,200 ,20);
    add(c3);
    
    c4 = new JCheckBox("Email & SMS Aleart");
    c4.setBackground(Color.white);
    c4.setFont(new Font("Raleway " , Font.BOLD , 16));
    c4.setBounds(350 , 550 ,200 ,30);
    add(c4);
    
    c5 = new JCheckBox("Cheque Book");
    c5.setBackground(Color.white);
    c5.setFont(new Font("Raleway " , Font.BOLD , 16));
    c5.setBounds(100 , 600 ,200 ,20);
    add(c5);
    
    c6 = new JCheckBox("E-Statement");
    c6.setBackground(Color.white);
    c6.setFont(new Font("Raleway " , Font.BOLD , 16));
    c6.setBounds(350, 600 ,200 ,20);
    add(c6);
    
    c7= new JCheckBox("i here by declares that the above entered details are correct to the best ");
    c7.setBackground(Color.white);
    c7.setFont(new Font("Raleway " , Font.BOLD , 16));
    c7.setBounds(100 , 680 ,600 ,20);
    add(c7);
    
    sumbit = new JButton("Sumbit");
    sumbit.setBackground(Color.black);
    sumbit.setForeground(Color.white);
    sumbit.setFont(new Font("Raleway" , Font.BOLD ,14));
    sumbit.setBounds(220 , 720 ,100 ,30);
    sumbit.addActionListener(this);
    add(sumbit);
    
    cancel= new JButton("Cancel");
    cancel.setBackground(Color.black);
    cancel.setForeground(Color.white);
    cancel.setFont(new Font("Raleway" , Font.BOLD ,14));
    cancel.setBounds(420 , 720 ,100 ,30);
    cancel.addActionListener(this);
    add(cancel);
    
    getContentPane().setBackground(Color.red);
    
    
    setSize(850, 820);
    setLocation(350 , 0);
    setVisible(true);
        
    
}
     public void actionPerformed(ActionEvent ae){
         if(ae.getSource() == sumbit){
           //  System.out.print("Move your next page");
           String accountType =null;
           if(r1.isSelected()){
               accountType = "Saving Account";
               
           }
           else if(r2.isSelected()){
              accountType  = "Fixed Deposit Account";
               
           }
           else if(r3.isSelected()){
               accountType = " Current Account";
               
           }
           else if (r4.isSelected()){
               accountType = "Recouring Deposit Account"; 
           }
           Random random = new Random();
           String cardnumber = "" + Math.abs((random.nextLong () % 90000000L)+50409360000000L);
           
           String pinnumber  = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
           
           String facility = "";
           if(c1.isSelected()){
               facility = facility + " ATm Card ";
               
           }
           else if(c2.isSelected()){
               facility = facility + " Internet Babnking ";
               
           }
           else if(c3.isSelected()){
               facility = facility + " Mobile Banking ";
                
           }
           else if(c4.isSelected()){
               facility = facility +  " Email & SMS Alert";
           }
           else if(c5.isSelected()){
               facility  = facility + " Cheque Book";
               
           }
           else if(c6.isSelected()){
               facility = facility + " E-Statement";
           }
           try {
               if(accountType.equals("")){
                   JOptionPane.showMessageDialog(null, "Account Type  is Requeied ");
               }
               else {
                   Conn conn =new Conn();
                   String queryl = "insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"' )";
                  String query2 = "insert into login values('"+ formno +"', '"+ cardnumber +"','"+ pinnumber +"')";
                   
                   conn.s.executeUpdate(queryl);
                  conn.s.executeUpdate(query2);
                   
                   
                   
                   JOptionPane.showMessageDialog(null , "Card Number: " + cardnumber + "\n pin: " + pinnumber);
                   setVisible(false);
                   new Deposit(pinnumber).setVisible(false);
               }
           } catch (Exception e){
               System.out.print(e);
               
           }
             
         }
         else if(ae.getSource()==cancel){
             setVisible(false);
             new Login().setVisible(true);
             
         }
     }

    
    public static void main(String args[]) {
        // TODO code application logic here
        new SignupThree("");
    }
}

}