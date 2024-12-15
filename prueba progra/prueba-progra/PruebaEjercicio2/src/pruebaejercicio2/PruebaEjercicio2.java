/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaejercicio2;

import java.util.Scanner;

/**
 *
 * @author 50494
 */
public class PruebaEjercicio2 {

   
    public static void main(String[] args) {
        double agua, TotalAnual, promedioAnual, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12;
        String enero, febrero, marzo, abril, mayo, junio, julio, agosto, septiembre, octubre, noviembre, diciembre;
        
        System.out.println("---Contador de Agua---");
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Porfavor ingrese el consumo mensual de agua que ha consumido durante los siguientes meses. ");
        
        System.out.println("En Enero usted consumio: ");
        enero = entrada.nextLine();
        p1 = ((Double.parseDouble(enero)/30));
        System.out.println("Su promedio mensual es de " + p1);
        
        System.out.println("En Febrero usted consumio: ");
        febrero = entrada.nextLine();
        p2 = ((Double.parseDouble(febrero)/30));
        System.out.println("Su promedio mensual es de " + p2);
        
        System.out.println("En Marzo usted consumio: ");
        marzo = entrada.nextLine();
        p3 = ((Double.parseDouble(marzo)/30));
        System.out.println("Su promedio mensual es de " + p3);
        
        System.out.println("En Abril usted consumio: ");
        abril = entrada.nextLine();
          p4 = ((Double.parseDouble(abril)/30));
        System.out.println("Su promedio mensual es de " + p4);
        
        System.out.println("En Mayo usted consumio: ");
        mayo = entrada.nextLine();
          p5 = ((Double.parseDouble(mayo)/30));
        System.out.println("Su promedio mensual es de " + p5);
        
        System.out.println("En Junio usted consumio: ");
        junio = entrada.nextLine();
          p6 = ((Double.parseDouble(junio)/30));
        System.out.println("Su promedio mensual es de " + p6);
        
        System.out.println("En Julio usted consumio: ");
        julio = entrada.nextLine();
          p7 = ((Double.parseDouble(julio)/30));
        System.out.println("Su promedio mensual es de " + p7);
        
        System.out.println("En Agosto usted consumio: ");
        agosto = entrada.nextLine(); 
          p8 = ((Double.parseDouble(agosto)/30));
        System.out.println("Su promedio mensual es de " + p8);
        
        System.out.println("En Septiembre usted consumio: ");
        septiembre = entrada.nextLine();
        p9 = ((Double.parseDouble(septiembre)/30));
        System.out.println("Su promedio mensual es de " + p9);
        
        System.out.println("En octubre usted consumio: ");
        octubre = entrada.nextLine();
        p10 = ((Double.parseDouble(octubre)/30));
        System.out.println("Su promedio mensual es de " + p10);
        
        System.out.println("En Noviembre usted consumio: ");
        noviembre = entrada.nextLine();
        p11 = ((Double.parseDouble(noviembre)/30));
        System.out.println("Su promedio mensual es de " + p11);
        
        System.out.println("En Diciembre usted consumio: ");
        diciembre = entrada.nextLine();
        p12 = ((Double.parseDouble(diciembre)/30));
        System.out.println("Su promedio mensual es de " + p12);
        
        TotalAnual = (Double.parseDouble(enero) + Double.parseDouble(febrero) + Double.parseDouble(marzo) + Double.parseDouble(abril) 
        + Double.parseDouble(junio) + Double.parseDouble(julio) +Double.parseDouble(agosto) + Double.parseDouble(septiembre) 
        + Double.parseDouble(octubre) + Double.parseDouble(noviembre) + Double.parseDouble(diciembre));
    
        System.out.println("Su total anual es de " + TotalAnual + "Litros de agua");
        
        promedioAnual = (TotalAnual / 12);
        ///hola inge yo se que es promedio por mes, pero no me dio tiempo, y pues solo le deje el del año :(
        
       
     
    }
    
}
