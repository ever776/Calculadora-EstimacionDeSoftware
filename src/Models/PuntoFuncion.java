
package Models;

public class PuntoFuncion {
    private double cuentaTotal;
    private double sumatoriaFi;
    private double puntoFuncion;
    private double personaMes;
    private double esfuerzo;
    private double duracionTiempo;
    
    public PuntoFuncion() {
    }
    
    public double CuentaTotal(int entrada,int salida,int peticiones,int archivos,int interfaces,int parametro){
        
        if (parametro == 0) {
            this.cuentaTotal = (entrada * 3) + (salida * 4) + (peticiones * 3) + (archivos * 7) + (interfaces * 5);
        } else {
            if (parametro == 1) {
                this.cuentaTotal = (entrada * 4) + (salida * 5) + (peticiones * 4) + (archivos * 10) + (interfaces * 7);
            }else{
                if (parametro == 2) {
                    this.cuentaTotal = (entrada * 6) + (salida * 7) + (peticiones * 6) + (archivos * 15) + (interfaces * 10);
                }
            }
        }
        return this.cuentaTotal;
    }
    
    public double SumatoriaFi(int preguntas[]){
        this.sumatoriaFi = 0;
        for (int i = 0; i < preguntas.length; i++) {
            this.sumatoriaFi = preguntas[i] + this.sumatoriaFi;
        }
        return this.sumatoriaFi;
    }
    
    public double PuntoFuncion(){
        this.puntoFuncion = this.cuentaTotal *  (0.65+0.01*this.sumatoriaFi);
        return this.puntoFuncion;
    }
    
    public double PersonaMes(){
        double persona = 1;
        double horas = 8;
        this.personaMes = persona/horas;
        return this.personaMes;
    }
    
    public double Esfuerzo(){
        this.esfuerzo = this.puntoFuncion / this.personaMes;
        return this.esfuerzo;
    }
  
    public double DuracionTiempo(int desarrolladores){
        double precalc = this.esfuerzo/desarrolladores;
        this.duracionTiempo = precalc / 20.0;
        return this.duracionTiempo;
    }
}
