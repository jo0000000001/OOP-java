/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author yousef
 */
import java.util.*;
import java.time.LocalDate;

public class Students extends Person{
    
    private static int base_student_id=1000;
    private int student_id;
    private int Level;
    private static int base_expensis=1000;
    private int expensis;
    private String password;
    private int creditHours=0;
    Vector<Courses> courses=new Vector();
    @Override
    public  void set_university_id()
    {
        student_id=base_student_id++;
    }
       public int get_student_id()
    {
        return student_id;
    }
 
     public void set_university_email(String pass)
     {
         email="s"+(String)ID+"@cis.dmu.edu.eg";
         password=pass;
     }
    public String get_email()
    {
        return email;
    }
 public void add_credit_Hours(int h)
 {
     creditHours+=h;
 }
 public int getCreditHours()
 {
     return creditHours;
 }
      public int get_student_level()
    {
        return student_id;
    }
        public void set_Expensis()
    {
        switch(Level)
        {
            case 1:
            {
                expensis=base_expensis+100;
                break;
            }
             case 2:
            {
                expensis=base_expensis+200;
                break;
            }
             case 3:
            {
                expensis=base_expensis+300;
                break;
            }
             case 4:
            {
                expensis=base_expensis+400;
                break;
            }
        }
    }
           public int get_expensis()
      {
          return expensis;
      }
   public Students(String id,String fn,String ln,String phone,int y,int l,String pass) //-> system operation ->method(create student)
    {
       // 3 steps from gui interface(create students page)
        ID=id;
        first_Name=fn;
        last_Name=ln;
        Phone=phone;
        year_date=y;
        Level=l;
        set_university_id();
        set_Expensis();
        set_university_email(pass);
        set_Age();
    }
    
  
    public void set_Age()
    {
        LocalDate dt=LocalDate.now();
        Age=dt.getYear()-year_date;
    }
    public int get_Age()
    {
        return Age;
    }
   public String get_password()
   {
           return password;
    }
   public String get_FullName() 
   {
       return first_Name+" "+last_Name;
   }
   public int Get_Level()
   {
       return Level;
   }
   public int Set_Student_ID()
   {
       return student_id;
   }
   public String get_ID()
   {
       return ID;
   }
   public int get_Expensis()
   {
       return expensis;
   }
   public String get_Phone()
   {
       return Phone;
   }
   

   public Vector<Courses> get_courses()
   {
       return courses;
       
   }
}

    
    
    
    

