/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;

/**
 *
 * @author AngelxPM (Angel Adolfo Pacheco Mazuca 1656991)
 */
public class Registro extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            String nombre = request.getParameter("txt-user");
            String pass = request.getParameter("txt-pass");
            String mail = request.getParameter("txt-mail");
            String mes = request.getParameter("sel-Mes");
            String sexo = request.getParameter("rad-sexo");
            String edad = request.getParameter("che-edad");
            String about = request.getParameter("txa-about");
            
            if(edad!="SI")
                edad="NO";
            
            nombre = limpiar(nombre);
            mail = limpiar(mail);
            pass = limpiar(pass);
            about = limpiar(about);
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Registro</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Registro  </h1>");
            out.println("Nombre: " + nombre);
            out.println("<br>");
            out.println("EMAIL: " + mail);
            out.println("<br>");
            out.println("Mes de nacimiento: " + mes);
            out.println("<br>");
            out.println("Sexo: " + sexo);
            out.println("<br>");
            out.println("Es mayor de edad: " + edad);
            out.println("<br>");
            out.println("Acerca de ti: " + about);
            out.println("<br>");
            out.println("<a href=\"index.html\">regresar </a> ");
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
        processRequest(request, response);
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
        processRequest(request, response);
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
    
    
    public String limpiar(String cadena)
    {
        try
        {
            String cadenaS = URLEncoder.encode(cadena, "UTF-8");    
            return cadenaS;
        }
        catch(Exception e)
        {
            return "";
        }
        
    }

}
