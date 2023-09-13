public class signupTrhree {
    package bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class SignupTwo extends JFrame implements ActionListener{
    
    
    JTextField pan , aadhar;
    
    
    JButton next ;
    JRadioButton syes ,sno , eyes ,eno;
    //JDateChooser dateChooser;
    JComboBox religion , category , occupation , education , income;
    String formno;
    
    SignupTwo(String formno){
        this.formno = formno;
        setLayout(null);
        
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        JLabel additionalDetails = new JLabel (" page 2: Additional  Detail's ");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290 ,80 , 400 ,30);
        add(additionalDetails);
        
        JLabel name = new JLabel ("Religion:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100 ,140 , 100 ,30);
        add(name);  
        
        
        String ValReligion [] = {"Hindu" , "Muslim" , "Sikh" , "Christian" , "Other"};
         religion = new JComboBox(ValReligion); 
        religion.setBounds(300 ,140 , 400 ,30);
        religion.setBackground(Color.white);
        add(religion);
        
        
         // this is 4 kota wala line
         
         
       
        JLabel fname = new JLabel ("Category:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100 ,190 , 200 ,30);
        add(fname);
        
         String Valcategory[] = {"General" , "OBC" , "SC", "ST", "Other"};
          category  = new JComboBox(Valcategory);
         category.setBounds(300 ,190 , 400 ,30);
         category.setBackground(Color.white);
        add(category);
        
        
         // this is 4 kota wala line
                 
         
        JLabel dob= new JLabel ("Income:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100 ,240 , 200 ,30);
        add(dob); 
        
        String Valincomecategory[] = {"NULL" , "< 1,50,000" , "< 2,50,0000", "< 3,50,000", "10,00,0000"};
          income = new JComboBox(Valincomecategory);
         income.setBounds(300 ,240 , 400 ,30);
         income.setBackground(Color.white);
        add(income);
        
         // this is 4 kota wala line       
                             
        
        JLabel gender= new JLabel ("Educational:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100 ,290 , 200 ,30);
        add(gender); 
            
        
        JLabel email = new JLabel ("Qulification:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100 ,315 , 200 ,30);
        add(email);
        
        String educationValues[] = {"Non-Gradution" , "Gradution" , "Post-Gradution", "Doctrate", "Others"};
          education = new JComboBox(educationValues);
         education.setBounds(300 ,315 , 400 ,30);
         education.setBackground(Color.white);
        add(education);
        
        // this is 4 kota wala line
        
//      emailTextField = new JTextField();
//     emailTextField.setFont(new Font("Raleway",Font.BOLD , 14));
//     emailTextField.setBounds(300 ,340 , 400 ,30);
//     add(emailTextField);
//        
        
        JLabel marital = new JLabel ("Occupation:");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100 ,390 , 200 ,30);
        add(marital); 
        
        
        String occuptionValues[] = {"Salaried" , "Self-Empolyed" , "Bussiness", "Student", "Retired",  "Others"};
         occupation = new JComboBox(occuptionValues);
         occupation.setBounds(300 ,390 , 400 ,30);
         occupation.setBackground(Color.white);
        add(occupation);
        
        
       
        
        
        JLabel address = new JLabel ("PAN Number:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100 ,440 , 200 ,30);
        add(address); 
        
        // this is 4 kota wala line
        
       pan = new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD , 14));
        pan.setBounds(300 ,440 , 400 ,30);
        add(pan);
        
        
        JLabel city = new JLabel ("Aadhar Number:");
         city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100 ,490 , 200 ,30);
        add(city); 
        
        // this is 4 kota wala line
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway",Font.BOLD , 14));
        aadhar.setBounds(300 ,490 , 400 ,30);
        add(aadhar);
        
        
        
        
         JLabel state = new JLabel ("Senior Citizen:");
         state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100 ,540 , 200 ,30);
        add(state); 
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300 , 540 ,100 , 30);
        syes.setBackground(Color.white);
        add(syes);
        
        sno  = new JRadioButton("No");
        sno.setBounds(450 , 540 ,100 , 30);
        sno.setBackground(Color.white);
        add(sno);
        
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);
        
        
        
        
        
        
        
        JLabel exisiting = new JLabel ("Exisiting Account:");
         exisiting.setFont(new Font("Raleway", Font.BOLD, 20));
        exisiting.setBounds(100 ,590 , 200 ,30);
        add(exisiting); 
        
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300 , 590 ,100 , 30);
        eyes.setBackground(Color.white);
        add(eyes);
        
        eno  = new JRadioButton("No");
        eno.setBounds(450 , 590 ,100 , 30);
        eno.setBackground(Color.white);
        add(eno);
        
        ButtonGroup emaritalgroup = new ButtonGroup();
        emaritalgroup.add(eyes);
        emaritalgroup.add(eno);
        
        
        // this is 4 kota wala line
//         stateTextField = new JTextField();
//        stateTextField.setFont(new Font("Raleway",Font.BOLD , 14));
//        stateTextField.setBounds(300 ,540 , 400 ,30);
//        add(stateTextField);
        
        
        next = new JButton ("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway" , Font.BOLD , 14));
        next.setBounds(620 , 660 , 80 ,30);
        next.addActionListener(this);
        add(next);
        
       
        
        getContentPane().setBackground(Color.red);
        setSize (850 ,800);
        setLocation(350 , 10);
        setVisible (true);
    }
        
        public void actionPerformed(ActionEvent ae){
           // String formno = "" + random;
            String sreligion = (String) religion.getSelectedItem();
            String scategory = (String) category.getSelectedItem();
            String sincome  = (String) income.getSelectedItem();
            String seducation = (String)education.getSelectedItem();
            String soccupation = (String) occupation.getSelectedItem();
            String seniorcitizen = null;
           // String marital = null;
            
            if(syes.isSelected()){
                seniorcitizen = "Yes";                                          //gender
                
            }
            else if(sno.isSelected()){
                 seniorcitizen = "No";
            }
            
           // String email = emailTextField.getText();
            
            String existingaccount = null; 
            
            if(eyes.isSelected()){
             existingaccount = "Yes";
                
            }
            
            else if(eno.isSelected()){
                existingaccount = "No";
            
            }
            
            String span = pan.getText();
            String saadhar = aadhar.getText(); 
            
            
            try {
               
                    Conn c = new Conn();
                    String query = "insert into signuptwo values('" + formno + "' ,'" + sreligion+ "','" + scategory +"','" + sincome + "','" + seducation + "', '" + soccupation + "' ,'" + span + "','" + saadhar + "','" + seniorcitizen + "','" + existingaccount +  "')";
                    c.s.executeUpdate(query);
                    
                    setVisible(false);
                    new SignupThree(formno).setVisible(true);

            }
            catch(Exception e){
                System.out.println(e);
            }
        
    }


    public static void main(String args[]) {
        new SignupTwo(" ");
    }
}
    
}
