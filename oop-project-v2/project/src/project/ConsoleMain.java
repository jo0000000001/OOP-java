
package project;
import java.util.*;
public class ConsoleMain {
    public static void main(String[] args)throws Exception {
       Scanner sc=new Scanner(System.in);
        System_Operations.Create_student("30dddddddddddd", "Fname", "Lname", "012!!!!!!!!", 2003, 2, "12345678");
        System.out.println("_________________________________________");
          System_Operations.Create_student("30dddddddddddd", "Fname", "Lname", "012!!!!!!!!", 2002, 3, "12345678");
              System.out.println("_________________________________________");
            System_Operations.Create_student("30dddddddddddd", "Fname", "Lname", "012!!!!!!!!", 2001, 4, "12345678");
                System.out.println("_________________________________________");
            //System_Operations.print_AllData_inConsole();
//            System.out.println("Enter Your Email");
//            String email=sc.nextLine();
//          System.out.println("Enter Your Password");
//            String password=sc.nextLine();
//           while (System_Operations.login(email, password)==false)
//           {
//                 System.out.println("Enter Your Email");
//               email=sc.nextLine();
//                 System.out.println("Enter Your Password");
//               password=sc.nextLine();
//           }
//           System.out.println("Enter course_ID");
//           String id=sc.nextLine();
//           System.out.println("Enter course_Name");
//           String name=sc.nextLine();
//           System.out.println("Enter course Hours");
//           int hours=sc.nextInt();
//           System_Operations.set_course(id, name, hours);
      // System_Operations.print_AllData_inConsole();
      System_Operations.print_AllData_inFile();
    }
}
