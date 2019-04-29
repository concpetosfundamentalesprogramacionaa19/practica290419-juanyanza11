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
       
                
        String lugar;
        int edad, estado, cargas;
        double costoi = 1330;
        double matF, mat;
        double d1, d2, d3, d4, tramite;
        // PEDIR DATOS
        
        System.out.println("Ingrese su localidad o ciudad");
            lugar = entrada.nextLine();
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
        
        if (lugar.equals("Loja") || lugar.equals("Zamora")){
            
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
       
       tramite = (1330-d1-d2-d3-d4)*0.02;
       
       matF=1330-d1-d2-d3-d4+tramite;
         
       //MUESTRA DE MATRÍCULA
               
       System.out.printf("El costo de su matricula equivale a: %.3f\n",matF);
    }
    
}
