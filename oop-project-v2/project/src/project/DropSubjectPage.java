/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author yousef
 */
public class DropSubjectPage extends JFrame implements ActionListener{
    JLabel Student_id;
    JButton Drop,Return;
    JTextField CID;
    DropSubjectPage()
    {
         this.setTitle("Delete Course");
    
    this.setSize(500, 400);
    this.setVisible(true);
    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    this.setLayout(null);
    this.setLocation(450, 150);
    
    this.setResizable(true);
        
        
    Student_id=new JLabel("Course_ID");
    Drop=new JButton();
    CID=new JTextField();
    Return=new JButton();
    Drop.setText("Delete");
    Return.setText("Return");
    Student_id.setBounds(80,75,200,40);
    CID.setBounds(160,75,200,40);
    Drop.setBounds(160,145,200,40);
    Return.setBounds(160,215,200,40);

    Drop.setBackground(Color.GRAY);
    Drop.setForeground(Color.WHITE);

    Return.setBackground(Color.GREEN);
    Return.setForeground(Color.WHITE);

        
    this.add(Student_id);
    this.add(Drop);
    this.add(CID);
    this.add(Return);
    Return.addActionListener(this);
    Drop.addActionListener(this);
       
       
    }
     @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Return)
        {
            Student_information_page pw = new Student_information_page();
            this.dispose();
        }
        if(e.getSource()==Drop)
        {
            String id=CID.getText();
            if(id.isEmpty())
                JOptionPane.showMessageDialog(this,"input is Empty", "Invalid Input",JOptionPane.ERROR_MESSAGE);
            else
            {
              boolean state=System_Operations.DropCourse(id);
        if(state)
        {
                JOptionPane.showMessageDialog(this,"Deleted Successfully", "info",JOptionPane.INFORMATION_MESSAGE);
        }
        else
                 JOptionPane.showMessageDialog(this,"Course_ID not found", "ERROR",JOptionPane.ERROR_MESSAGE);
            }
    }
    }
}
