

package com.mycompany.app3;


public class App3 {

    public static void main(String[] args) {
        Produto Produto1 = new Produto();
        
        Produto1.nome = "caderno";
        Produto1.descricao = "Caderno em espiral tamanho médio";
        Produto1.precoUnitario = 4.50;
        Produto1.desconto = 15;
        
        Produto Produto2 = new Produto();
        
        Produto2.nome = "Caneta ESF";
        Produto2.descricao = "Caneta esferográfica 5mm";
        Produto2.precoUnitario = 1.20;
        Produto2.desconto = 2;
        
        Produto Produto3 = new Produto();
        Produto3.nome = "Esquadro";
        Produto3.descricao = "Esquadro de acrílico 20 cm";
        Produto3.precoUnitario = 2.35;
        Produto3.desconto = 10;
        
        System.out.println("\nProduto1"
        + Produto1.nome + ","
        + Produto1.descricao +","
        + Produto1.precoUnitario + ","
        + Produto1.desconto ); 
        
         System.out.println("\nProduto2"
        + Produto2.nome + ","
        + Produto2.descricao +","
        + Produto2.precoUnitario + ","
        + Produto2.desconto );
         
          System.out.println("\nProduto3"
        + Produto3.nome + ","
        + Produto3.descricao +","
        + Produto3.precoUnitario + ","
        + Produto3.desconto ); 
         
         
     
        

               
    }
}
