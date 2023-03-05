
package project;

//import project.Courses;
import java.util.*;
import java.io.*;
/**
 *
 * @author yousef
 */
public class System_Operations { //
    public static int loggedin_user,Modiffyed_user;
    public static Vector<Studentinfo>Std_Database=new Vector(); // temp data base to save student data
    private static Studentinfo savedata(Students s)// method name(savedat) datatype(studentinfo) /parameter s
    {
        // object st (studentinfo)
        Studentinfo st=new Studentinfo();
        st.Age=s.get_Age();
        st.ID=s.get_ID();
        st.password=s.get_password();
        st.fullname=s.get_FullName();
        st.email=s.get_email();
        st.expensis=s.get_Expensis();
        st.Level=s.Get_Level();
        st.student_id=s.get_student_id();
        st.Phone=s.get_Phone();
        st.CreditHours=s.getCreditHours();
        st.courses=s.get_courses();
        return st; // return data after custing
    }
    public static String Create_student(String id,String fn,String ln,String phone,int y,int l,String pass)//year=y level= method <-> create student page
    {
        Students Student =new Students( id, fn, ln, phone, y,l,pass); // object class(Students) -> constructor(Students)
        Studentinfo student_data=savedata(Student); //object custing data class (Students)all data except( course(num/hours)-expenses)
        Std_Database.add(student_data);//push back = add
//        System.out.println("your email : "+Student.get_email());
//        System.out.println("Your password : "+Student.get_password());
        return "Signned in Succesfully\n"+"Your Email : "+Student.get_email()+"\n Your Password : "+Student.get_password();// info message after creating your data
    }
    public static boolean login(String email,String pass)
    {
        int flag=0;
        for(int i=0;i<Std_Database.size();i++) //check fit data(email+pass) / std 0 1 2 3 
        { // 0 email pass - email pass
            if(Std_Database.get(i).email.equals(email)&&Std_Database.get(i).password.equals(pass))//[i]==get(i)
            { 
                flag=1;
                loggedin_user=i;// num of student in data base  
                break;
            } 
        }
          if(flag==1)
                return true;
            else return false;
    }
//    public  static  void print_AllData_inConsole()
//    {
    // each methodes here is inside Students(class)
//        if(Std_Database.isEmpty()==true)
//        {
//            System.out.println("Database is Empty");
//        }
//        else {
//            for(int i=0;i<Std_Database.size();i++)
//            {
//                System.out.println("             "+"STUDENT "+(i+1));
//                System.out.println("Student_ID : "+Std_Database.get(i).student_id);
//                System.out.println("ID : "+Std_Database.get(i).ID);
//                System.out.println("Name : "+Std_Database.get(i).fullname);
//                System.out.println("Age : "+Std_Database.get(i).Age);
//                System.out.println("Level : "+Std_Database.get(i).Level);
//                System.out.println("Expensis : "+Std_Database.get(i).expensis);
//                System.out.println("Email : "+Std_Database.get(i).email);
//                System.out.println("Phone : "+Std_Database.get(i).Phone);
//                System.out.println("registerd courses for the student");
//                for(int j=0;j<Std_Database.get(i).courses.size();j++)
//                {
//                    System.out.println("        Course"+(i+1));
//                    System.out.println(" Course_ID : "+Std_Database.get(i).courses.get(j).Course_ID);
//                    System.out.println(" Course_Name : "+Std_Database.get(i).courses.get(j).course_name);
//                    System.out.println(" Course_CreditHours : "+Std_Database.get(i).courses.get(j).credit_hours);
//                    System.out.println("______________________________");
//                }
//                System.out.println("________________________________________________");
//            }
//               }
//            
//        }
    public static boolean set_course(String cid,String course_name,int credit_hours)
   { //loggedin_user= current student 2 0 1 2 add courses 
       if(Std_Database.get(loggedin_user).Coursenumber==6) // 6 to fit gui(Student information page)
           return false; 
       else
       {
       Courses c=new Courses(cid,course_name,credit_hours);
          Std_Database.get(loggedin_user).courses.add(c); // current student courses vector int Studentinfo (class)
          Std_Database.get(loggedin_user).Coursenumber++;
          Std_Database.get(loggedin_user).CreditHours+=credit_hours;
          return true;
       }
   }
    
    

 public static void print_AllData_inFile()throws Exception // action button prin data base
    { //saving data 
         File file = new File("JavaFile.txt"); 
            file.createNewFile();
        try (PrintWriter outFile = new PrintWriter("JavaFile.txt")) {
            if(Std_Database.isEmpty()==true)
            {
                outFile.println("Database is Empty");
            }
            else {
                
                for(int i=0;i<Std_Database.size();i++)
                {
                    outFile.println("            "+"STUDENT "+(i+1));
                    outFile.println("Student_ID : "+Std_Database.get(i).student_id);
                    outFile.println("ID : "+Std_Database.get(i).ID);
                    outFile.println("Name : "+Std_Database.get(i).fullname);
                    outFile.println("Age : "+Std_Database.get(i).Age);
                    outFile.println("Level : "+Std_Database.get(i).Level);
                    outFile.println("Expensis : "+Std_Database.get(i).expensis);
                    outFile.println("Email : "+Std_Database.get(i).email);
                    outFile.println("Phone : "+Std_Database.get(i).Phone);
                    outFile.println("Courses Number: "+Std_Database.get(i).Coursenumber);
                    outFile.println("Credit HOurs: "+Std_Database.get(i).CreditHours);
                    outFile.println("registerd courses for the student");
                    for(int j=0;j<Std_Database.get(i).courses.size();j++)
                    {
                        outFile.println("        Course"+(j+1));
                        outFile.println(" Course_Name : "+Std_Database.get(i).courses.get(j).course_name);
                        outFile.println(" Course_CreditHours : "+Std_Database.get(i).courses.get(j).credit_hours);
                        outFile.println("______________________________");
                    }
                    outFile.println("________________________________________________");
                }
            }
        }
        }
public static boolean DropStudent(String Std) //Std text in textfield in drop std gui
{
        boolean state =checkExist(Std);
    if(!state)
        return false;
    else
    {
        Std_Database.remove(Modiffyed_user);
        return true;
    }
}

public static boolean checkExist(String std)
{
    int n=Integer.parseInt(std);
    int i;
    for( i=0;i<Std_Database.size();i++)
    {
        if(Std_Database.get(i).student_id==n)
            break;
     }
    if(i==Std_Database.size())
        return false;
    else
    {
        Modiffyed_user=i;
            return true;
    }

}

public static void modifyStudent(String id,String fn,String ln,String phone,int y,int l,String pass)
{
    Students student=new Students(id,fn,ln,phone,y,l,pass);
    Studentinfo st=savedata(student);
        Std_Database.get(Modiffyed_user).Age=st.Age;
        Std_Database.get(Modiffyed_user).Level=st.Level;
        Std_Database.get(Modiffyed_user).Coursenumber=st.Coursenumber;
        Std_Database.get(Modiffyed_user).email=st.email;
        Std_Database.get(Modiffyed_user).fullname=st.fullname;
        Std_Database.get(Modiffyed_user).student_id=st.student_id;
        Std_Database.get(Modiffyed_user).Phone=st.Phone;
        Std_Database.get(Modiffyed_user).password=st.password;
        Std_Database.get(Modiffyed_user).courses=st.courses;
        Std_Database.get(Modiffyed_user).ID=st.ID;
        Std_Database.get(Modiffyed_user).expensis=st.expensis;
}
public static boolean DropCourse(String id)
{
    int num=Std_Database.get(loggedin_user).Coursenumber; 
     if(num==0)
         return false;
     int i;
     for( i=0;i<num;i++)
     {
     if(Std_Database.get(loggedin_user).courses.get(i).Course_ID.equals(id))
         break;
     }
     if(i==num)
     return false;
     else{
     Std_Database.get(loggedin_user).CreditHours-=Std_Database.get(loggedin_user).courses.get(i).credit_hours;
     Std_Database.get(loggedin_user).courses.remove(i);
     Std_Database.get(loggedin_user).Coursenumber--;

     return true;
     }
     }

}
