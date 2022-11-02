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
public class dsignupmodel {
    
    private static String name;
    private static String gender;
    private static long phone;
    private static String specialist;
    private static String day;
    private static int fees;
    private static int flag;
    private static String password;
    
    Connection con1 = null;
    Statement st= null;
    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        flag=0;
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
   
    public int getFees() {
        return fees;
    }

    /**
     * Set the value of fees
     *
     * @param fees new value of fees
     */
    public void setFees(int fees) {
        this.fees = fees;
    }


    /**
     * Get the value of day
     *
     * @return the value of day
     */
    public String getDay() {
        return day;
    }

    /**
     * Set the value of day
     *
     * @param day new value of day
     */
    public void setDay(String day) {
        this.day = day;
    }


    /**
     * Get the value of specialist
     *
     * @return the value of specialist
     */
    public String getSpecialist() {
        return specialist;
    }

    /**
     * Set the value of specialist
     *
     * @param specialist new value of specialist
     */
    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }


    /**
     * Get the value of phone
     *
     * @return the value of phone
     */
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
    public void connectionjdbc(){
    
            try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/doctorabs?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
            st=con1.createStatement();
            String sql2="select * from doctor where docname="+name+"and password="+password;
            String sql="insert into doctor(docname,password,gender,phno,specialist,day,fees) values('"+name+"','"+password+"','"+gender+"',"+phone+",'"+specialist+"','"+day+"',"+fees+")";
            st.executeUpdate(sql);
            flag=1;
            }
            catch(Exception e){
                System.out.println(e);
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
