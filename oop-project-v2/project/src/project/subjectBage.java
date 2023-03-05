
package project;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;


 public class subjectBage extends JFrame implements ActionListener{
     JLabel subject_name,subject_hours,subject_ID;
     JTextField subject_nameField,subject_hoursField,subjectIDField;
     JButton Add,Return;
     public subjectBage(){
              JFrame n1=new JFrame() ;
             Return=new JButton();
         subject_ID=new JLabel("Course_ID");
         subjectIDField=new JTextField();
         
              Add=new JButton();
             subject_nameField  =new JTextField();
    subject_hoursField=new JTextField();
           subject_name   =new JLabel("CourseName");
    subject_hours=new JLabel("Cours Credit H"); 
      this.setTitle("subjectBage");
      
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      this.setSize(500, 460);
      this.setVisible(true);
      this .setResizable(false);
      this.setLocation(10, 10);
      
    this.setLayout(null);
    
    this.add(subject_name);
        this.add(subject_hours);
        this.add(subject_nameField);
        this.add(subject_hoursField);
        this.add(Add);
       this.add(subject_ID);
       this.add(subjectIDField);
       this.add(Return);
       subject_ID.setBounds(50,40,250,30);
  subject_name  .setBounds(50,100 , 250, 30);
    subject_hours.setBounds(50, 160, 250, 30);
    subjectIDField.setBounds(130,40,250,30);
  subject_nameField  .setBounds(130,100 , 250, 30);
    subject_hoursField.setBounds(150, 160, 250, 30);
    Add.setBounds(100, 220, 250, 30);
    Return.setBounds(100,280,250,30);
    Add.setBackground(Color.GRAY);
    Add.setForeground(Color.WHITE);
    Add.setText("ADD");
    Return.setText("Return");
    Return.setBackground(Color.BLACK);
    Return.setForeground(Color.WHITE);
    Add.addActionListener(this);
    Return.addActionListener(this);
}
 @Override
    public void actionPerformed(ActionEvent ae) {
   if(ae.getSource()==Add)
   {
       
       if(subject_hoursField.getText().equals("1")&&subject_hoursField.getText().equals("2")&&subject_hoursField.getText().equals("3"))
             JOptionPane.showMessageDialog(this,"Invalid Hours input", "Invalid Input",JOptionPane.ERROR_MESSAGE);
   
       else if (   System_Operations.set_course(subjectIDField.getText(),subject_nameField.getText(),Integer.parseInt(subject_hoursField.getText()) ))
       {
           JOptionPane.showMessageDialog(this,"addedd successfully", "info",JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
      Student_information_page n=new Student_information_page();
       }
       else    JOptionPane.showMessageDialog(this,"cann't add more courses you have exccedded youralowwed Courses Number", "Invalid Input",JOptionPane.ERROR_MESSAGE);
       }
   if(ae.getSource()==Return)
   {
       Student_information_page sss=new Student_information_page();
       this.dispose();
   }
       }
    
    }

