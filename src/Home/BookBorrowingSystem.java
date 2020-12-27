
package Home;
import java.sql.*;
import javax.swing.*;

public class BookBorrowingSystem {
public static Connection con;
public static Statement stm;
public static ResultSet rst;
public static ResultSet rst2;
public static ResultSet rst3;
public static int recno, btn, staff;
public static String booktitle, isbnn;
   
    public static void main(String[] args) {
         try {
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_bbsystem","root","");
          stm = con.createStatement();
          //JOptionPane.showMessageDialog(null, "Connected!","Message",JOptionPane.INFORMATION_MESSAGE);
               HomePage hom= new HomePage();
               hom.show();
           
        }catch (Exception e){
           JOptionPane.showMessageDialog(null, "Disconnected!","Error",JOptionPane.ERROR_MESSAGE );
            
        }
    }
    
}
