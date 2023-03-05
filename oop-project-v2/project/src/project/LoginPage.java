
package project;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;



public class LoginPage  extends JFrame implements ActionListener {

   JButton  Login,loginasadmin;
JTextField EmailText;

JPasswordField PasswordText;

public LoginPage() {
 
     Login=new JButton();
    loginasadmin=new JButton();
    EmailText=new JTextField();
    PasswordText=new JPasswordField();
    JLabel Email_Label=new JLabel("Email:");
    JLabel Password_Label=new JLabel("password:");

//2
    this.setTitle("login page");
    
    this.setSize(650, 450);
    this.setVisible(true);
    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    this.setLayout(null);
    this.setLocation(400, 150);
    
    this.setResizable(true);
    //3
    Login.setBounds(250, 180,200 ,40 );
    loginasadmin.setBounds(250, 250, 200, 40);
    EmailText.setBounds(250,60 , 200, 30);
    PasswordText.setBounds(250, 120, 200, 30);
    Email_Label.setBounds(150, 50,200 ,40 );
    Password_Label.setBounds(150, 110,200 ,40 );
    
    //4
    Login.setText(" Login ");
    
    loginasadmin.setText("Login as Admin");
    Login.setBackground(Color.GRAY);
    
    loginasadmin.setBackground(Color.GREEN);
 
    Login.setForeground(Color.WHITE);
    loginasadmin.setForeground(Color.WHITE);

    this.add(Login);
    this.add(loginasadmin);
    this.add(EmailText);
    this.add(PasswordText);
    this.add(Email_Label); 
    this.add(Password_Label);
 
    Login.addActionListener(this);
    loginasadmin.addActionListener(this);
}
    
    
    
    
  
    

    @Override
    public void actionPerformed(ActionEvent e) {
      
 if(e.getSource()==loginasadmin){
     
   adminlogin ad=new adminlogin();
    this.dispose();
 }

 if(e.getSource()==Login){
       
     String email=EmailText.getText();
     String password=PasswordText.getText();
     boolean info_state= System_Operations.login(email, password);
     if(info_state)
     {
            Student_information_page nn=new Student_information_page();
     }
     else 
         JOptionPane.showMessageDialog(this,"Invalid Email or Password", "ERROR",JOptionPane.ERROR_MESSAGE);
     
           }
    
     }
 
  }
    
    
    
   


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    



    

