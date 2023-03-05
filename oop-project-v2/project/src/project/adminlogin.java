
package project;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;


 public class adminlogin extends JFrame implements ActionListener {
     JLabel username_label,pass_Label;
     JTextField username;
     JPasswordField pass;
     JButton Submit,Return;
     public adminlogin(){
              JFrame n1=new JFrame() ;

              Submit=new JButton();
              Return=new JButton();
             username  =new JTextField();
    pass=new JPasswordField();
           username_label   =new JLabel("Username");
    pass_Label=new JLabel("Password");
      this.setTitle("Admin login");
      
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      this.setSize(500, 400);
      this.setVisible(true);
      this .setResizable(false);
      this.setLocation(400, 150);
      
    this.setLayout(null);
    
    this.add(username_label);
        this.add(pass_Label);
        this.add(username);
        this.add(pass);
    this.add(Submit);
    this.add(Return);
  username_label  .setBounds(50,40 , 250, 30);
    pass_Label.setBounds(50, 100, 250, 30);
      
  username  .setBounds(130,40 , 250, 30);
    pass.setBounds(130, 100, 250, 30);
    Submit.setBounds(100, 170, 250, 30);
    Return.setBounds(100,220,250,30);
    Submit.setBackground(Color.GRAY);
    Submit.setForeground(Color.WHITE);
    Return.setBackground(Color.BLACK);
    Return.setForeground(Color.WHITE);
    Submit.setText("Submit");
    Return.setText("Return");
    Submit.addActionListener(this);
     Return.addActionListener(this);
}
 @Override
    public void actionPerformed(ActionEvent ae) {
   if(ae.getSource()==Submit)
   {
       String user="yousef",p="123456789";
       if(username.getText().equals(user)&&pass.getText().equals(p))
       {
           AdminPage nn=new AdminPage();
           this.dispose();
       }
       else
        JOptionPane.showMessageDialog(this,"Invalid username or password", "Invalid Input",JOptionPane.ERROR_MESSAGE);

       }
      if(ae.getSource()==Return)
      {
          LoginPage l=new LoginPage();
          this.dispose();
       }
    
    }
}
