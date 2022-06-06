
package Models;

public class Cosmic {
    private double costoPF;
    private double costoProyectoSoftware;
    private double duracionProyecto;
    private double costo;
    private double pf;
    private double kldc;
    private double costaraSoftware;

    public Cosmic(double costo,double pf,double kldc) {
        this.costo = costo;
        this.pf = pf;
        this.kldc = kldc;
    }
    
    public double CostoPuntoFuncion(){
        this.costoPF = this.costo/this.pf;
        return this.costoPF;
    }
    
    public double CostoProyectoSoftware(){
        this.costoProyectoSoftware = this.kldc * this.costoPF;
        return this.costoProyectoSoftware;
    }
    
    public double DuracionProyecto(){
        this.duracionProyecto = this.kldc / this.pf;
        return this.duracionProyecto;
    }
    
    public double CostaraSoftware(){
        this.costaraSoftware = this.costoProyectoSoftware * 6.96;
        return this.costaraSoftware;
    }
}
