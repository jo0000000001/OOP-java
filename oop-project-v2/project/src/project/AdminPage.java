/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author yousef
 */
public class AdminPage extends JFrame implements ActionListener{
JButton CreateStudent,dropstudent,ModifyStudent,Return,printdata;
public AdminPage()
{
    CreateStudent=new JButton();
    dropstudent=new JButton();
    ModifyStudent=new JButton();
    
    Return=new JButton();
    printdata=new JButton();
      this.setTitle("Admin Page Control");
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    this.setLayout(null);
    this.setLocation(400, 150);
    
    this.setResizable(true);
    this.setSize(650, 450);
    this.setVisible(true);
    CreateStudent.setText("Add New Student");
    ModifyStudent.setText("Modify Student Data");
    dropstudent.setText("Drop Student");
    Return.setText("Return");
    printdata.setText("Print Students DataBase");
    
    CreateStudent.setBounds(220,60,200,40);
    ModifyStudent.setBounds(220,140,200,40);
    dropstudent.setBounds(220,210,200,40);
    Return.setBounds(420, 320, 200,40);
    printdata.setBounds(10,320,200,40);
    
    
    CreateStudent.setBackground(Color.GRAY);
    CreateStudent.setForeground(Color.WHITE);
     ModifyStudent.setBackground(Color.GREEN);
    ModifyStudent.setForeground(Color.WHITE);
     dropstudent.setBackground(Color.BLUE);
    dropstudent.setForeground(Color.WHITE);
     Return.setBackground(Color.BLACK);
     Return.setForeground(Color.WHITE);
    printdata.setBackground(Color.BLACK);
    printdata.setForeground(Color.WHITE);
    this.add(CreateStudent);
    this.add(ModifyStudent);
    this.add(dropstudent);
    this.add(Return);
    this.add(printdata);
    CreateStudent.addActionListener(this);
    ModifyStudent.addActionListener(this);
    dropstudent.addActionListener(this);
    Return.addActionListener(this);
    printdata.addActionListener(this);
}
      @Override
    public void actionPerformed(ActionEvent e)
    {
    if(e.getSource()==Return)
    {
        adminlogin n=new adminlogin();
        this.dispose();
    }
    if(e.getSource()==CreateStudent)
    {
        CreateStudentPage p=new CreateStudentPage();
        this.dispose();
    }
    if(e.getSource()==printdata)
    {
                   try {
               System_Operations.print_AllData_inFile();
           } catch (Exception ex) {
               Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
           }
         
           JOptionPane.showMessageDialog(this,"Printed successfully", "info",JOptionPane.INFORMATION_MESSAGE);
             
              
    }
    if(e.getSource()==dropstudent)
    {
     
    DropStudent ccc=new DropStudent();
    this.dispose();
    }
   
    if(e.getSource()==ModifyStudent)
    {
         inputModiffyedStudent kkkk=new inputModiffyedStudent();
    this.dispose();
    }
    }
    }


