
package project;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class ModifyStudentPage extends JFrame implements ActionListener {
    JButton  Modiffy,Return;
    JTextField firstName;
    JPasswordField Email_Password;
    JTextField  ID;
    JTextField  Phone;
    JTextField  LastName;
    JTextField Year;
    JTextField Level;
    JLabel First_Name_Label,LastName_Label,Password_Label,ID_Label,Level_Label,Phone_Label,Year_Label;

public ModifyStudentPage()
{
  
    //1
    JFrame n1=new JFrame();
    Modiffy=new JButton();
    Return=new JButton();
    Return.setText("Return");
    firstName=new JTextField();
    LastName=new JTextField();
    ID=new JTextField();
    Phone=new JTextField();
    Level=new JTextField();
    Year=new JTextField();
    Email_Password=new JPasswordField();

    Phone_Label=new JLabel("Phone: ");
    First_Name_Label=new JLabel("First Name :");
    LastName_Label=new JLabel("Last Name :");
    ID_Label=new JLabel("ID: ");
    Password_Label=new JLabel("Email password:");
    Level_Label=new JLabel("Level: ");
    Year_Label=new JLabel("BirthDate Year: ");
    Modiffy.setText("Modiffy");
    Return.setText("Return");
   //2 location
 
    firstName.setBounds(325,60, 200, 30);
    LastName.setBounds(325, 120, 200, 30);
    ID.setBounds(325, 180,200 ,30 );
    Email_Password.setBounds(325, 240, 200, 30);
    Phone.setBounds(325, 300, 200, 30);
    Year.setBounds(325, 360, 200, 30);
    Level.setBounds(325, 420, 200, 30);
   
  
    Modiffy.setBounds(325, 500,200 ,40 );
    Return.setBounds(325, 570,200 , 40);
    First_Name_Label.setBounds(225, 55,200 ,40 );
    LastName_Label.setBounds(225, 115,200 ,40 );
    ID_Label.setBounds(225, 175,200 ,40 );
    Password_Label.setBounds(225, 235,200 ,40 );
    Phone_Label.setBounds(225, 295,200 ,40 );
    Year_Label.setBounds(225, 355, 200, 40);
    Level_Label.setBounds(225, 415,200 ,40 );
         
         //3 frame
          this.setTitle("login student");
    
    this.setSize(800, 700);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    this.setLayout(null);
    this.setLocation(100, 100);
    
    this.setResizable(false);
    
    //4 color
    ID.setBackground(Color.WHITE);
    
    Phone.setBackground(Color.WHITE);    
      
    ID.setForeground(Color.black);
    
    Phone.setForeground(Color.black);
//5 add
    
    this.add(Modiffy);
    this.add(ID);
    this.add(Phone);
    this.add(firstName);
    this.add(LastName);
    this.add(Year);
    this.add(Year_Label);
    this.add(First_Name_Label);    
    this.add(LastName_Label);    
    this.add(Password_Label);   
    this.add(ID_Label); 
    this.add(Level_Label);
    this.add(Email_Password); 
    this.add(Level);
    this.add(Phone_Label);
    this.add(Return);
    //6 action
    Modiffy.addActionListener(this);
    Return.addActionListener(this);
} 

    @Override
    public void actionPerformed(ActionEvent ae) {


if(ae.getSource()==Modiffy){
    String fn,ln,id,phone;
    fn=firstName.getText();
    ln=LastName.getText();
    id=ID.getText();
    phone=Phone.getText();
    String p=Email_Password.getText(); 
    String y=Year.getText();
    String l=Level.getText();
    String empty=checkempty(fn,ln,id,phone);
    if(empty!="")
  {
    JOptionPane.showMessageDialog(this,empty , "Invalid Input",JOptionPane.ERROR_MESSAGE);
  }
  else if(p.length()<8)
     {
        JOptionPane.showMessageDialog(this,"password must be more than or equal 8", "Invalid Input",JOptionPane.ERROR_MESSAGE);
     }     
     else if(checknumber(y)||Integer.parseInt(y)<2000)
             {
                 JOptionPane.showMessageDialog(this,"Invalid birthyear input", "Invalid Input",JOptionPane.ERROR_MESSAGE);
             }
     else if(checknumber(l)||Integer.parseInt(l)<1||Integer.parseInt(l)>4)
     {
     JOptionPane.showMessageDialog(this,"Invalid Level input", "Invalid Input",JOptionPane.ERROR_MESSAGE);
     }
     else
     {
  
    System_Operations.modifyStudent(ID.getText(), firstName.getText(), LastName.getText(), Phone.getText(),
            Integer.parseInt(y),Integer.parseInt(l), p);
  
   JOptionPane.showMessageDialog(this,"Modiffyed successfully", "info",JOptionPane.INFORMATION_MESSAGE);
this.dispose();
AdminPage Return=new AdminPage();
}
}
if(ae.getSource()==Return)
{
    AdminPage nn=new AdminPage();
    this.dispose();
}
    }  
    public static String checkempty(String fn,String ln,String id,String ph)
    {
        String empty="";
        if(fn.isEmpty())
            empty="Invaild input firstname is empty";
        else if(ln.isEmpty())
            empty="Invaild input lastname is empty";
        else if(id.isEmpty())
            empty="Invaild input ID is empty";
        else if(ph.isEmpty())
            empty="Invaild input Phone is empty";
        return empty;
    }
    
     public boolean checknumber(String n)
 {
    
     if(n==null)
    return false;
     try
     {
        int num=Integer.parseInt(n);
        
     }catch(NumberFormatException e)
     {
        return true; 
     }
     return false;
 }
    
} 

    










    

