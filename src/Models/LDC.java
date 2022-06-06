package Models;

public class LDC {

    private double ldc;
    private double kldc;
    private double esfuerzo;
    private double costo;
    private double productividad;
    private double costo_ldc;

    public LDC(double ldc) {
        this.ldc = ldc;
    }

    public double EstimacionEsfuerzo() {

        this.kldc = this.ldc / 1000.0;

        if (ldc <= 30000) {
            double a = 3.2, b = 1.05, c = 2.5, d = 0.38;
            esfuerzo = a * Math.pow(this.kldc, b);
        } else {
            if (ldc > 30000 && ldc < 100000) {
                double a = 3, b = 1.12, c = 2.5, d = 0.35;
                esfuerzo = a * Math.pow(this.kldc, b);
            } else {
                if (ldc >= 100000) {
                    double a = 2.8, b = 1.20, c = 2.5, d = 0.32;
                    esfuerzo = a * Math.pow(this.kldc, b);
                }
            }
        }
        return esfuerzo;
    }
    
    public double EstimacionCosto(){
        double costoHonorario = 2164;
        costo = esfuerzo * costoHonorario;
        return costo;
    }
    
    public double EstimacionProductividad(){
        this.productividad = this.ldc / this.esfuerzo;
        return this.productividad;
    }
    
    public double CostoLDC(){
        this.costo_ldc = this.costo / this.ldc;
        return this.costo_ldc;
    }
}
