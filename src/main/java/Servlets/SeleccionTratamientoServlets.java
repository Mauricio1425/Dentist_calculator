package Servlets;

import Calculos.CalculadoraCostos;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SeleccionTratamientoServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtener parámetros del formulario
        double costoBase = Double.parseDouble(request.getParameter("costoBase"));
        double descuento = Double.parseDouble(request.getParameter("descuento"));
        double costoExtra = Double.parseDouble(request.getParameter("costoExtra"));
        String tratamiento = request.getParameter("tratamiento");
        
        // Calcular el costo del tratamiento seleccionado
        double costoTotal = 0;
        if(tratamiento.equals("limpieza")) {
            costoTotal = CalculadoraCostos.calcularCostoLimpieza(costoBase = 200, descuento, costoExtra);
        }
        if(tratamiento.equals("Ortodoncia")) {
            costoTotal = CalculadoraCostos.calcularCostoLimpieza(costoBase = 1000, descuento, costoExtra);
        }
        if(tratamiento.equals("Extraccion")) {
            costoTotal = CalculadoraCostos.calcularCostoLimpieza(costoBase = 450, descuento, costoExtra);
        }
        if(tratamiento.equals("Blanqueamiento")) {
            costoTotal = CalculadoraCostos.calcularCostoLimpieza(costoBase = 300, descuento, costoExtra);
        }
        if(tratamiento.equals("Periodoncia")) {
            costoTotal = CalculadoraCostos.calcularCostoLimpieza(costoBase = 350, descuento, costoExtra);
        }
        
        // Enviar resultado a la página JSP
        request.setAttribute("costoTotal", costoTotal);
        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }
}
