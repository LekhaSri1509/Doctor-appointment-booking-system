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
public class psignup {
     private static String name;
    private int age;

    /**
     * Get the value of age
     *
     * @return the value of age
     */
    

    private static String gender;
    private static long phone;
    private static int flag;
    private static String password;
    private static int id;
      Connection con1 = null;
    Statement st= null;
     public String getName() {
        flag=0;
        return name;
    }
     public int getAge() {
        return age;
    }

    /**
     * Set the value of age
     *
     * @param age new value of age
     */
    public void setAge(int age) {
        this.age = age;
    }
    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }
   public long getPhone() {
        return phone;
    }

    /**
     * Set the value of phone
     *
     * @param phone new value of phone
     */
    public void setPhone(long phone) {
        this.phone = phone;
    }


    

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
     * Get the value of gender
     *
     * @return the value of gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Set the value of gender
     *
     * @param gender new value of gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int connectionjdbc(){
    
            try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/doctorabs?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
            st=con1.createStatement();
            String sql="insert into patient(patientname,password,gender,phno,age) values('"+name+"','"+password+"','"+gender+"',"+phone+","+age+")";
            
            
            
            
            
            st.executeUpdate(sql);
            
            flag=1;
            String sql1="select * from patient order by patientid desc limit 1";
            Statement st1=con1.createStatement();
            ResultSet rs=st1.executeQuery(sql1);
            while(rs.next()){
                id=rs.getInt("patientid");
                
            }
            return id;
            
            
            }
            catch(Exception e){
                System.out.println(e);
                return 0;
}
            
    }
    public boolean validate(){
        if(flag==1){
            return true;
        }
        else{
            return false;
        }
    }
}
