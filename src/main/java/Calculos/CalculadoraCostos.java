package Calculos;

public class CalculadoraCostos {
    public static double calcularCostoLimpieza(double costoBase, double descuento, double costoExtra) {
        return costoBase - (costoBase * (descuento / 100)) + costoExtra;
    }
    
    // Agrega métodos similares para otros tipos de tratamiento
}
