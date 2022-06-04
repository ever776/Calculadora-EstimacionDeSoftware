package Models;

public class CocomoIntermedio {

    private double kldc;
    private double en;
    private double epm;
    private double costo;
    private double td;
    private double personas;

    public CocomoIntermedio() {
    }

    public double EsfuerzoNominal(int modelo, double kldc) {
        // 0 = Orgánico, 1 = Semi-acoplado, 2 = Acoplado
        this.kldc = kldc;
        
        if (modelo == 0) {
            double a = 3.2, b = 1.05, c = 2.5, d = 0.38;
            System.out.println("El modelo es organico");
            en = a * Math.pow(this.kldc, b);            
        }else{
            if (modelo == 1) {
                double a = 3, b = 1.12, c = 2.5, d = 0.35;
                System.out.println("El modelo es semi-acoplado");
                en = a * Math.pow(this.kldc, b); 
            }else{
                if (modelo == 2) {
                    double a = 2.8, b = 1.20, c = 2.5, d = 0.32;
                    System.out.println("El modelo es Acoplado");
                    en = a * Math.pow(this.kldc, b); 
                }
            }
        }
        System.out.println("esfuerzo nominal "+en);
        return en;
    }

    public double EsfuerzoPersonaMes(double compSW,double calPro,double expApp) {
            System.out.println("esfuerzo nominalll "+en);
            epm = (en * compSW * calPro * expApp);
            return epm;
    }
    
    public double Costo(double costo){
        this.costo = this.epm * costo;
        return this.costo;
    }
    
    public double TiempoDesarrollo(int modelo){
        
        if (modelo == 0) {
            double a = 3.2, b = 1.05, c = 2.5, d = 0.38;
            System.out.println("El modelo es organico");
            this.td = c * Math.pow(this.epm, d);
        }else{
            if (modelo == 1) {
                double a = 3, b = 1.12, c = 2.5, d = 0.35;
                System.out.println("El modelo es semi-acoplado");
                this.td = c * Math.pow(this.epm, d); 
            }else{
                if (modelo == 2) {
                    double a = 2.8, b = 1.20, c = 2.5, d = 0.32;
                    System.out.println("El modelo es Acoplado");
                    this.td = c * Math.pow(this.epm, d); 
                }
            }
        }
        return this.td;
    }
    
    public double NumeroPersonas(){
        this.personas = this.epm / this.td;
        return this.personas;
    }
}
