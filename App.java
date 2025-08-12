
package com.mycompany.app;


public class App {

    public static void main(String[] args) {
        pessoa um = new pessoa();
      
        um.nome = "vic";
        um.sexo = 'f';
        um.data = "08/04/2004";
        
        pessoa dois = new pessoa();
        
        dois.nome = "silvinho";
        dois.sexo = 'm';
        dois.data = "16/01/1991";    
        
        System.out.println("\nPessoa 1: " + um.nome + ", " + um.sexo + ", " + um.data);
        System.out.println("\nPessoa 2: " + dois.nome + ", " + dois.sexo + ", " + dois.data);
        
    }
    
}
