/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class DatabaseConnection {

//    public void fillDataList (JList jlist) {
//        
//         try {       
//             DefaultListModel<String> listmodel = new DefaultListModel<>();
//               Class.forName("com.mysql.cj.jdbc.Driver");
//               Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/project?user=root&password=edebiyat23");           
//               Statement state = con.createStatement();
//               // mysql query to run
//               String sql = "select message_body from messages where to_email= " ;
//               ResultSet result = state.executeQuery(sql);
//               listmodel.clear();
//               
//               if (result.next()) {
//                   
//                  while (result.next()) {
//                     String messagebody = result.getString("message_body");
//                     listmodel.addElement(messagebody);                    
//                   } 
//                       //itemlist.setModel(listmodel);    
//                      
//               }
//               else {
//                   JOptionPane.showMessageDialog(null, "No messages found for this email.");
//               }
//               result.close();
//               con.close();
//              } 
//             catch (Exception e) {
//                 JOptionPane.showMessageDialog(null, "Connection invalid" , "WARNING", JOptionPane.WARNING_MESSAGE);
//             }
//        }
//    
    
    
    public static void main(String[] args) {
       Login log = new Login();
       log.show();
       
       Signup sign = new Signup();
       sign.show();
       
       
    }
}
