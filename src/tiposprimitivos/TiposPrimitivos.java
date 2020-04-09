package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

 
    public static void main(String[] args) {
    /* int idade = 20;
     String valor = Integer.toString(idade);
        System.out.println(valor);*/
    
    String valor = "30.5";
    float idade = Float.parseFloat(valor);
        System.out.printf("%.6f \n", idade);
    }
    
}
