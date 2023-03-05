
package project;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;


public class Student_information_page  extends JFrame implements ActionListener {
    
    JLabel Name_Label,IDField,StudentIDField,AgeField,EmailField,LevelField,ExpensisField,PhoneField,Hello_Label;
    JLabel NameField,Id_Label,Age_Label,Email_Label,Level_Label,Expensis_Label,Phone,Stdid_label;
    JButton ReturnButton,set_subgect,Drop_subject;
    JLabel CreditHours_Label,CreditHoursField,CourseNumbers_Label,CourseNumbersField,line_Label;
     JLabel [] arr=new JLabel[32];
     int num=System_Operations.Std_Database.get(System_Operations.loggedin_user).Coursenumber;
    
  public Student_information_page()  {
    //1 label
   JFrame n1=new JFrame();
   if (num>0)
    num++;
    ReturnButton=new JButton("Return");
    set_subgect =new JButton("set_subgect");
    Drop_subject=new JButton("Drop Course");
    CreditHours_Label=new JLabel();
    CreditHoursField=new JLabel();
    CourseNumbers_Label=new JLabel();
    CourseNumbersField=new JLabel();
    line_Label=new JLabel();
    CourseNumbersField.setText("Courses Numbers : ");
    CreditHoursField.setText("CreditHours Number : ");
    line_Label.setText("____________________________________________________");


     
    //lable
    NameField=new JLabel("FullName :");
    IDField=new JLabel("ID :");
    StudentIDField=new JLabel("StudentID :");
    AgeField=new JLabel("AGE:");
    EmailField=new JLabel("Email :");
    LevelField=new JLabel("level :");
    ExpensisField=new JLabel("Expensis:");
    PhoneField=new JLabel("phone :");
    Hello_Label=new JLabel("HELLO");
    int user=System_Operations.loggedin_user;
    Name_Label=new JLabel(System_Operations.Std_Database.get(user).fullname);
    Id_Label=new JLabel(System_Operations.Std_Database.get(user).ID);
    Age_Label=new JLabel(Integer.toString(System_Operations.Std_Database.get(user).Age));   
    Email_Label=new JLabel(System_Operations.Std_Database.get(user).email);
    Level_Label=new JLabel(Integer.toString(System_Operations.Std_Database.get(user).Level));
    Expensis_Label=new JLabel(Integer.toString(System_Operations.Std_Database.get(user).expensis));
    Phone=new JLabel(System_Operations.Std_Database.get(user).Phone);
    Stdid_label=new JLabel(Integer.toString(System_Operations.Std_Database.get(user).student_id));  
    CourseNumbers_Label.setText(Integer.toString(System_Operations.Std_Database.get(user).Coursenumber));
    CreditHours_Label.setText(Integer.toString(System_Operations.Std_Database.get(user).CreditHours));
    for (int x=0;x<num*4;x++){   
    arr[x]=new JLabel();
   }
      //JFrame
      this.setTitle("Sudent_Information");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setSize(1300, 800);
      this.setVisible(true);
      this .setResizable(false);
      this.setLocation(10, 10);
      this.setLayout(null);
    //location
    
    Name_Label.setBounds(240,40 , 200, 30);
    Id_Label.setBounds(240, 70, 200, 30);
    Stdid_label.setBounds(240, 100, 200, 30);
    Age_Label.setBounds(240,130,200 ,30 );
    Email_Label.setBounds(240, 160, 200, 30);
    Level_Label.setBounds(240, 190, 200, 30); 
    Expensis_Label.setBounds(240, 220,200 ,30 );
    Phone.setBounds(240, 250, 200, 30);
      
      
      
    NameField.setBounds(60, 40,200 ,30 );
    IDField.setBounds(60, 70,200 ,30 );
    StudentIDField.setBounds(60, 100,200 ,30 );
    AgeField.setBounds(60, 130,200 ,30 );
    EmailField.setBounds(60, 160,200 ,30 );
    LevelField.setBounds(60, 190,200 ,30 );
    ExpensisField.setBounds(60, 220,200 ,30 );
    PhoneField.setBounds(60,250,250 ,30 );     
    Hello_Label.setBounds(5,5,50 ,50 ); 
    ReturnButton.setBounds(950,700,200 ,40 );  
    set_subgect  .setBounds(40,320,200 ,40 );  
    Drop_subject.setBounds(300, 320, 200, 40);
    Hello_Label.setForeground(Color.BLUE);
    NameField.setBackground(Color.yellow);

    int y= 400;
    int z= 400;
    int m= 400;
    int h=400;
   
    
    
int x=0;
int k=0;
for(int i=0;i<num;i++)
{
    for(int j=0;j<4;j++)
    {
        if(j==0)
        {
            if(i==0)
                 arr[x].setText("Courses");
            else  arr[x].setText("course "+i);
          arr[x].setBounds(40,y , 200, 30);
        y+=30;
        }
        else  if(j==1)
        {
            if (i==0)
                  arr[x].setText("Course_ID");
            else arr[x].setText(System_Operations.Std_Database.get(user).courses.get(k).Course_ID);
             arr[x].setBounds(240,z, 200, 30);
            z+=30;
        }
        else if(j==2)
        {
            if(i==0)
                arr[x].setText("Course_Name");
            else  arr[x].setText(System_Operations.Std_Database.get(user).courses.get(k).course_name);
             arr[x].setBounds(440,m, 200, 30);
             m+=30;
        }
       else
        {
         if(i==0)
                arr[x].setText("Course_Hours");
            else  arr[x].setText(Integer.toString(System_Operations.Std_Database.get(user).courses.get(k).credit_hours));
             arr[x].setBounds(640,h, 200, 30);
             h+=30;
        }
        x++;
    }
     if(i>0)
            k++;
}

line_Label.setBounds(20,y,200,30);
y+=30;
CourseNumbersField.setBounds(40,y,200,30);
y+=30;
CreditHoursField.setBounds(40,y,200,30);
z+=30;
CourseNumbers_Label.setBounds(240,z,200,30);
z+=30;
CreditHours_Label.setBounds(240,z,200,30);

Drop_subject.setBackground(Color.GRAY);
Drop_subject.setForeground(Color.WHITE);
set_subgect.setBackground(Color.GRAY);
set_subgect.setForeground(Color.WHITE);
    ReturnButton.setBackground(Color.yellow);
    
    //add
    this.add(Name_Label);
    this.add(NameField);
    this.add(NameField);
    this.add(Id_Label);
    this.add(Age_Label);
    this.add(Email_Label);
    this.add(Level_Label);
    this.add(Expensis_Label);
    this.add(Phone);
    this.add(Stdid_label);
    this.add(NameField);
    this.add(IDField);
    this.add(StudentIDField);
    this.add(AgeField);
    this.add(EmailField);
    this.add(LevelField);
    this.add(ExpensisField);
    this.add(PhoneField);
    this.add(Hello_Label);
    this.add(ReturnButton);
    this.add(set_subgect);
    this.add(CreditHoursField);
    this.add(CreditHours_Label);
    this.add(CourseNumbersField);
    this.add(CourseNumbers_Label);
    this.add(line_Label);
    this.add(Drop_subject);
 for(int i=0;i<num*4;i++){
       
        this.add(arr[i]);
    }
 

 
    ReturnButton.addActionListener(this);
    set_subgect   .addActionListener(this);
    Drop_subject.addActionListener(this);

  }

    @Override
    public void actionPerformed(ActionEvent ae) {

if ( ae.getSource()==ReturnButton){  
    
    
    LoginPage shh=new LoginPage();
    
            this.dispose();

}      
if ( ae.getSource()==set_subgect)
{  
    
    
    subjectBage fff=new subjectBage();
    
            this.dispose();

}      
if(ae.getSource()==Drop_subject)
{
DropSubjectPage cc=new DropSubjectPage();
this.dispose();
        }
        }
    
    
    
}
