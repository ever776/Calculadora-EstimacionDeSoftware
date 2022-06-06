
package Models;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // Cocomo Basico
        /*
        Scanner lea = new Scanner(System.in);
        CocomoBasico calc = new CocomoBasico();
        double reslcd = calc.CantidadInstruccionesLCD(100,12);
        double resklcd = calc.conversionKLDC();
        System.out.println("Estimacion de la cantidad de instrucciones");
        System.out.println("LCD: " + reslcd);
        System.out.println("KLCD: " + resklcd);
        System.out.println("Estimacion de Esfuerzo");
        System.out.println(calc.EstimacionEsfuerzo());
        System.out.println("Estimacion Tiempo de desarrollo");
        System.out.println(calc.TiempoDesarrollo());
        System.out.println("Estimacion del Personal Necesario");
        System.out.println(calc.PersonalNecesario());
        System.out.println("Estimacion de Productividad");
        System.out.println(calc.EstimacionProductividad());
        System.out.println("Estimacion de Costo");
        System.out.println(calc.EstimacionCosto());
        */
        // Cocomo Intermedio
        /*
        CocomoIntermedio ci = new CocomoIntermedio();
        
        double esfuerzoNominal = ci.EsfuerzoNominal(0,50);
        System.out.println("Esfuerzo Nominal: "+esfuerzoNominal);
        double epm = ci.EsfuerzoPersonaMes(1.30, 0.70, 0.82);
        System.out.println("Esfuerzo persona Mes: "+Math.round(epm * 100.0) / 100.0 + "");
        */
        // Punto de Funcion
        /*
        PuntoFuncion pf = new PuntoFuncion();
        
        System.out.println("cuenta total " + pf.CuentaTotal(3, 2, 2, 1, 4, 0));
        
        int preguntas[];
        preguntas = new int[14];
        preguntas[0] = 4;
        preguntas[1] = 3;
        preguntas[2] = 2;
        preguntas[3] = 5;
        preguntas[4] = 4;
        preguntas[5] = 3;
        preguntas[6] = 2;
        preguntas[7] = 2;
        preguntas[8] = 5;
        preguntas[9] = 3;
        preguntas[10] = 3;
        preguntas[11] = 4;
        preguntas[12] = 2;
        preguntas[13] = 4;
        
        
        System.out.println("sumatoria fi " + pf.SumatoriaFi(preguntas));
        
        System.out.println("Punto de funcion " + pf.PuntoFuncion());
        
        System.out.println("Calculo persona Mes " + pf.PersonaMes());
        
        System.out.println("Calculo esfuerzo " + pf.Esfuerzo());
        
        System.out.println("Duracion Tiempo " + pf.DuracionTiempo(4));
        */
        
        //ldc
        /*
        
        LDC ldc = new LDC(300);
        System.out.println("esfuerzo: " + ldc.EstimacionEsfuerzo());
        
        System.out.println("costo: " + ldc.EstimacionCosto());
        
        System.out.println("Productividad: " + ldc.EstimacionProductividad());
        
        System.out.println("Cosot de LdC: " + ldc.CostoLDC());
        */
        /*
        Cosmic c = new Cosmic(2407.05,12,5);
        
        System.out.println("Costo por pf: " + c.CostoPuntoFuncion());
        
        System.out.println("Costo de proyecto de sf: " + c.CostoProyectoSoftware());
        
        System.out.println("Duracion de proyecto: " + c.DuracionProyecto());
        
        System.out.println("Costara el Software: " + c.CostaraSoftware());
        */
        
    }
    
}
