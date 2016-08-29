
package com.orfi.Servlet;

import com.orfi.Bean.JavaBeanEstado;
import com.orfi.Bean.JavaBeanOrden;
import com.orfi.Entidades.Estado;
import com.orfi.Entidades.Orden;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Conexion extends HttpServlet {

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
            out.println("<title>Servlet Conexion</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Conexion at " + request.getContextPath() + "</h1>");
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
        
        response.setContentType("text/html;charset=UTF-8");
        
            int idESTADO = Integer.parseInt(request.getParameter("idESTADO"));
            String estadoJoya = request.getParameter("estadoJoya");
            String descripcion = request.getParameter("descripcion");
            int estado = Integer.parseInt(request.getParameter("estado"));
            
              Estado est = new Estado();
                est.setIdESTADO(idESTADO);
                est.setEstadoJoya(estadoJoya);
                est.setDescripcion(descripcion);
                est.setEstado(Boolean.TRUE);

              JavaBeanEstado jbord = new JavaBeanEstado();
                jbord.guardar(est);
              System.out.println("Se ha guardado tu venta");            
              
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Conexion</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Quedo guardado felicitaciones lili</h1>");
            out.println("</body>");
            out.println("</html>");
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
        
        response.setContentType("text/html;charset=UTF-8");
        
            int idORDEN = Integer.parseInt(request.getParameter("idORDEN"));
            String fechaEntrega = request.getParameter("fechaEntrega");
            String fechaOrden = request.getParameter("fechaOrden");
            int estado = Integer.parseInt(request.getParameter("estado"));
            int IdCliente = Integer.parseInt(request.getParameter("IdCliente"));
            int IdFabricante = Integer.parseInt(request.getParameter("IdFabricante"));
            
              Orden ord = new Orden();
                ord.setIdORDEN(idORDEN);
                ord.setFechaEntrega(null);
                ord.setFechaOrden(null);
                ord.setEstado(Boolean.TRUE);
                ord.setIdCliente(null);
                ord.setIdFabricante(null);
            
              JavaBeanOrden jbord = new JavaBeanOrden();
                jbord.guardar(ord);
              System.out.println("Se ha guardado tu venta");            
              
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Conexion</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Quedo guardado felicitaciones lili</h1>");
            out.println("</body>");
            out.println("</html>");
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
