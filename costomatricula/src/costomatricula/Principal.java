/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package costomatricula;
import porcentajes.Porcentajes;
import java.util.Scanner;
/**
 *
 * @author juanyanza11
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner (System.in);
       
                
        
        int edad, estado, cargas, lugar;
        double costoi = 1330;
        double matF;
        double d1, d2, d3, d4;
        // PEDIR DATOS
        
        System.out.println("Ingrese su localidad o ciudad\n1.Loja\n2.Zamora \n3.Otro.");
            lugar = entrada.nextInt();
        System.out.println("Ingrese su edad");
            edad = entrada.nextInt();
        System.out.println("Ingrese su estado civil\n1.Casado\n2.Soltero");
            estado=entrada.nextInt();
        System.out.println("Tiene usted cargas familiares \n1.Si\n2.No");
            cargas=entrada.nextInt();
        // Importacion de variables de paquete dos
        double descL = Porcentajes.porcentajeL;
        double descE = Porcentajes.porcentajeE;
        double descEc= Porcentajes.porcentajeEc;
        double descCf= Porcentajes.porcentajeCf;
        double descT= Porcentajes.porcentajeT;
        // Condiciones de descuento
        
        if (lugar==1 || lugar==2){
            
            d1=descL;
            
        }else {
            d1 = 0;
        
        }
        
       if (edad>=17 && edad<20){
       
           d2=descE;
       }else{
           d2=0;
       }
       if(estado==1){
       
           d3=descEc;
           
       }else{
       
           d3=0;
       }
       if(cargas==1){
       
           d4= descCf;
       }else{
       
           d4=0;
       }
       
       
       matF=costoi-d1-d2-d3-d4+(1330-d1-d2-d3-d4)*0.02;
         
       //MUESTRA DE MATRÍCULA
               
       System.out.printf("El costo de su matricula equivale a: %.3f\n",matF);
    }
    
}
