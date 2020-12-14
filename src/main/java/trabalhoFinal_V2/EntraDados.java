/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoFinal_V2;

import java.util.*;

/**@authors
 * Alessandra Siciliano Orlando
 * José Augusto Ramos Belmont 
 * Bruno Cipriani Cerqueira 
 */
public class EntraDados {
    Scanner entra = new Scanner (System.in);
    
    public String entraString (){
        try{
            String var = entra.nextLine();
            return var;
        }
        catch (InputMismatchException e){
            System.out.println("Tipo de entrada incompatível, tente outra vez ");
            this.entraString();
        }
    return null;   
    }
    
    public double entraDouble(){
        try{
            double var = entra.nextDouble();
            return var;
        }
        catch (InputMismatchException e){
            System.out.println("Tipo de entrada incompatível, tente outra vez ");
            this.entraDouble();
        }
    return -1;
    }
    
    public boolean escolha(){
        String dec;        
        boolean result = false;
        int i = 0;        
        do{    
            dec = entraString();
            if (dec.compareTo("S")==0){
                result = true;
                i = 1;
            }
            if (dec.compareTo("N")==0){
                result = false;
                i = 1;
            }
        }while (i==0);
        //System.out.println(result);
        return result;
    }
    
}
