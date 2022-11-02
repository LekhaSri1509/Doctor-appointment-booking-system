/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Lenovo
 */
public class dsigninmodel {
    public static int check=0;
    private String name;
    private String password;
    private static int id=0;
     Connection con1 = null;
    Statement st= null;

    /**
     * Get the value of password
     *
     * @return the value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the value of password
     *
     * @param password new value of password
     */
    public void setPassword(String password) {
        this.password = password;
    }


    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

    
    
   
    
  
    
    public Exception connectionjdbc(){
       
        String id1=null;
        String id2=null;
        
    
            try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/doctorabs?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
            st=con1.createStatement();
           String s="select * from doctor where docname='"+name+"'";
           
            ResultSet r=st.executeQuery(s);
            while(r.next()){
                id1=r.getString("docname");
                id=r.getInt("docid");
                id2=r.getString("password");
                
               
            }
             if(id1.equals(name) && id2.equals(password)){
                    check=1;
                    String s1="insert into dcurrentuser(id) values("+id+");";
                    st.executeUpdate(s1);

                }
            }
            
            catch(Exception e){
                return e;

            }
            return null;
      
    }
            public boolean validate(){
                if(check==1){
                    return true;
                }
                else{
                    return false;
                }
            }
    
}
