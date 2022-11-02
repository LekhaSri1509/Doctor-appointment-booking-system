/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Lenovo
 */
public class ddeletemodel {
    Connection con1 = null;
    Statement st= null;
    
    public void connectionjdbc(){
        
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/doctorabs?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
            st=con1.createStatement();
            String sql2="Truncate table dcurrentuser";
            st.executeUpdate(sql2);
            
            }
            catch(Exception e){
                System.out.println(e);
}
            
    }
}
