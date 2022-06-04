
package Models;

public class CocomoBasico {
    private double ldc;
    private double kldc;
    private double esfuerzo;
    private double tiempoDesarrollo;
    private double personalNecesario;
    private double productividad;
    private double costo;
    
    public CocomoBasico() {
    }
    
    public double CantidadInstruccionesLCD(double modeloDesarrollo,double entradasSalidas){
        ldc = modeloDesarrollo * entradasSalidas;
        return ldc;
    }
    
    public double conversionKLDC(){
        kldc = this.ldc/1000;
        return kldc;
    }
    
    public double EstimacionEsfuerzo(){
        if (ldc <= 30000) {
            double a = 3.2, b = 1.05, c = 2.5, d = 0.38;
            System.out.println("El modelo es organico");
            esfuerzo = a * Math.pow(this.kldc, b);            
        }else{
            if (ldc > 30000 && ldc < 100000) {
                double a = 3, b = 1.12, c = 2.5, d = 0.35;
                System.out.println("El modelo es semi-acoplado");
                esfuerzo = a * Math.pow(this.kldc, b); 
            }else{
                if (ldc >= 100000) {
                    double a = 2.8, b = 1.20, c = 2.5, d = 0.32;
                    System.out.println("El modelo es Acoplado");
                    esfuerzo = a * Math.pow(this.kldc, b); 
                }
            }
        }
        
        return esfuerzo;
    }
    
    public double TiempoDesarrollo(){
        if (ldc <= 30000) {
            double a = 3.2, b = 1.05, c = 2.5, d = 0.38;
            tiempoDesarrollo = c * Math.pow(esfuerzo, d);
        }else{
            if (ldc > 30000 && ldc < 100000) {
                double a = 3, b = 1.12, c = 2.5, d = 0.35;
                tiempoDesarrollo = c * Math.pow(esfuerzo, d);
            }else{
                if (ldc >= 100000) {
                    double a = 2.8, b = 1.20, c = 2.5, d = 0.32;
                    tiempoDesarrollo = c * Math.pow(esfuerzo, d);
                }
            }
        }
        
        return tiempoDesarrollo;
    }
    
    public double PersonalNecesario(){
        personalNecesario = esfuerzo / tiempoDesarrollo;
        return personalNecesario;
    }
    
    public double EstimacionProductividad(){
        productividad = ldc/esfuerzo;
        return productividad;
    }
    
    public double EstimacionCosto(){
        double costoHonorario = 2164;
        costo = esfuerzo * costoHonorario;
        return costo;
    }
    
}
