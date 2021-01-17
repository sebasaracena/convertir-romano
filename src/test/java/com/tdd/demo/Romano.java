package com.tdd.demo;

import java.io.*; 
import java.util.Arrays;

public class Romano{
 
    public String Indentificador_Romano(int num){
        String romano="";
         romano=this.numero_romano_fact(num);
         //romano=this.numero_romano(num);
        return romano;
    }

    //codigo no factorizado
public String numero_romano(int num){
    int unidad=0, decena=0, centena=0, mil=0;
    String romano="";
    
    
    //Millar
    mil=num/1000;
    num=num%1000;
    //Centena
    centena=num/100;
    num=num%100;
    //Decena
    decena=num/10;
    num=num%10;
    //Unidad
    unidad=num/1;
    
    //1 al 9 en Romano
    switch (unidad) {
    case 1:
    romano="I";
    break;
    case 2:
    romano="II";
    break;
    case 3:
    romano="III";
    break;
    case 4:
    romano="IV";
    break;
    case 5:
    romano="V";
    break;
    case 6:
    romano="VI";
    break;
    case 7:
    romano="VII";
    break;
    case 8:
    romano="VIII";
    break;
    case 9:
    romano="IX";
    break;
    }
    
    //10 al 99 en Romano
    switch (decena) {
    case 1:
    romano="X"+romano;
    break;
    case 2:
    romano="XX"+romano;
    break;
    case 3:
    romano="XXX"+romano;
    break;
    case 4:
    romano="XL"+romano;
    break;
    case 5:
    romano="L"+romano;
    break;
    case 6:
    romano="LX"+romano;
    break;
    case 7:
    romano="LXX"+romano;
    break;
    case 8:
    romano="LXXX"+romano;
    break;
    case 9:
    romano="XC"+romano;
    break;
    }
    
    //100 al 999 en Romano
    switch (centena) {
    case 1:
    romano="C"+romano;
    break;
    case 2:
    romano="CC"+romano;
    break;
    case 3:
    romano="CCC"+romano;
    break;
    case 4:
    romano="CD"+romano;
    break;
    case 5:
    romano="D"+romano;
    break;
    case 6:
    romano="DC"+romano;
    break;
    case 7:
    romano="DCC"+romano;
    break;
    case 8:
    romano="DCCC"+romano;
    break;
    case 9:
    romano="CM"+romano;
    break;
    }
    
    //1000 al 3999 en Romano
    switch (mil) {
    case 1:
    romano="M"+romano;
    break;
    case 2:
    romano="MM"+romano;
    break;
    case 3:
    romano="MMM"+romano;
    }
    
       return romano;
    }
    


public String numero_romano_fact(int num){
 

    
     String M[] = {"", "M", "MM", "MMM"};
         
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
         
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
         
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
         
        return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
}

}



