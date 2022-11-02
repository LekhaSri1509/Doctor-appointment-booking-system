/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import model.dsignupmodel;

/**
 *
 * @author Lenovo
 */
public class dsignupcontroller extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet dsignupcontroller</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("asdf");
            
            out.println("<script>");
            
            
            out.println("var getSelectedValue = document.querySelector( 'input[name='male']:checked')");   
            out.println("if(getSelectedValue != null) { ");   
            
            out.println("alert('asdf')");
            out.println("}");
            out.println("</script>");
            
            if(request.getParameter("name").isEmpty() || request.getParameter("pass").isEmpty() || request.getParameter("phno").isEmpty() || request.getParameter("specialist").isEmpty() || request.getParameter("fee").isEmpty()){
                out.println("<script>");
                out.println("alert('Field is empty')");
                out.println("window.location='dsignup.jsp'");
                out.println("</script>");
            }
            else{
            String name=request.getParameter("name");
            String password=request.getParameter("pass");
            String regex = "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[@#$%^&+=])"
                       + "(?=\\S+$).{8,20}$";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(password);
            String gender=request.getParameter("male");
            long phone=Long.parseLong(request.getParameter("phno"));
            String specialist=request.getParameter("specialist");
            String day=request.getParameter("day");
            int fees=Integer.parseInt(request.getParameter("fee"));
            
           
            if(m.matches()==false){
                out.println("<script>");
                out.println("alert('password is wrong')");
                out.println("window.location='dsignup.jsp'");
                out.println("</script>");
                
            }
            else{
                 dsignupmodel mod1=new dsignupmodel();
            
            mod1.setName(name);
            mod1.setPassword(password);
            mod1.setGender(gender);
            mod1.setPhone(phone);
            mod1.setSpecialist(specialist);
            mod1.setDay(day);
            mod1.setFees(fees);
            mod1.connectionjdbc();
            request.setAttribute("mod1",mod1);
            boolean status=mod1.validate();
            
                if(status){  
                   RequestDispatcher dispatcher= request.getRequestDispatcher("dhomepage.jsp");
                    dispatcher.forward(request,response);
                }  
                else{  
                    RequestDispatcher dispatcher= request.getRequestDispatcher("dfailure.jsp");
                    dispatcher.forward(request,response);
                }  
            }
      
            }
            out.println("</body>");
            out.println("</html>");
            
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dsignupcontroller.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(dsignupcontroller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dsignupcontroller.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(dsignupcontroller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
