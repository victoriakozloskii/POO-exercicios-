
package com.mycompany.app5;


public class Empregado {
    
    
    
    String identificacao;
    String nome ;
    String sobrenome;
    double salario;

  
    public double obterSalarioAnual(double porc){
       return  salario * 12 ;
       
       
    }
    public void aumentarSal (double percentual){
        salario = salario + (salario * percentual /100);
        
    }
                
    
}


