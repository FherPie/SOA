/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soaesfot.examen.tienda.ws.client;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Patricio
 */
@WebServlet(name = "peiliculasconsulta", urlPatterns = {"/peiliculasconsulta"})
public class peiliculasconsulta extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<style> body{    background-color: navy;}</style>");
            out.println("<title>Servlet peiliculasconsulta</title>");
            out.println("</head>");
            out.println("<body>");
            examen.soa.TiendaDvdWS_Service servicio = new examen.soa.TiendaDvdWS_Service();
            examen.soa.TiendaDvdWS port = servicio.getTiendaDvdWSPort();
            
             String nombre= request.getParameter("peliculatitulo");
            
            List<examen.soa.PeliculaTO> listaresuesta = port.buscaDirector(nombre);
            out.println("<h1 style='color:red'>Resultados: </h1>");
            
            if(!listaresuesta.isEmpty()){
                
                for (examen.soa.PeliculaTO pe : listaresuesta) {
                out.println("<p style='color:yellow; font-size:30px; background:green'><b> Director:</b>" + pe.getDirector() + "</p>");
                out.println("<p style='color:yellow; font-size:30px;'><b> Titulo:</b>" + pe.getTitulo() + "</p>");
                out.println("<p style='color:yellow; font-size:30px;'><b> Precio:</b>" + pe.getPrecio() + "</p>");
            }
                
                
            }else{
             out.println("<h1 style='color:red'>No se encontraron Resultados</h1>");
            }

            out.println("<a  style='color:red; font-size:40px;' href='ConsultaPeliculas.jsp'>Regresar</a>");
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

}
