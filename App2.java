

package com.mycompany.app2;


public class App2 {

    public static void main(String[] args) {
     Mercado unidadeDeBlumenau = new Mercado();
        unidadeDeBlumenau.nome = "fort";
        unidadeDeBlumenau.vendas = 203;
        unidadeDeBlumenau.preco = 1.0;
        unidadeDeBlumenau.vendasLaranja = 10;
        unidadeDeBlumenau.precoLaranja = 2.0;

        Mercado unidadeDeJoinville = new Mercado();
        unidadeDeJoinville.nome = "cooper";
        unidadeDeJoinville.vendas = 105;
        unidadeDeJoinville.preco = 5.0;
        unidadeDeJoinville.vendasLaranja = 5;
        unidadeDeJoinville.precoLaranja = 2.0;

        Mercado unidadeDeFlorianopolis = new Mercado();
        unidadeDeFlorianopolis.nome = "bistek";
        unidadeDeFlorianopolis.vendas = 1000;
        unidadeDeFlorianopolis.preco = 3.00;
        unidadeDeFlorianopolis.vendasLaranja = 200;
        unidadeDeFlorianopolis.precoLaranja = 2.50;

        // Imprime dados da unidadeDeBlumenau tudo em uma linha
        System.out.println("\nunidadeDeBlumenau " 
            + unidadeDeBlumenau.nome + ", " 
            + unidadeDeBlumenau.vendas + ", " 
            + unidadeDeBlumenau.preco + ", " 
            + unidadeDeBlumenau.vendasLaranja + ", " 
            + unidadeDeBlumenau.precoLaranja);
        
        System.out.println("\nunidadeDeJoinville"
        + unidadeDeJoinville.nome + ", " 
        + unidadeDeJoinville.vendas + ", "
        + unidadeDeJoinville.preco + ", " 
        + unidadeDeBlumenau.vendasLaranja + ", "
        + unidadeDeJoinville.precoLaranja);
        
        System.out.println("\nunidadeDeFlorianopolis"
        +unidadeDeFlorianopolis.nome + ", "
        +unidadeDeFlorianopolis.vendas + ", "
        +unidadeDeFlorianopolis.preco + ", " 
        +unidadeDeFlorianopolis.vendasLaranja + ", "
        +unidadeDeFlorianopolis.precoLaranja);       
                
    }
}