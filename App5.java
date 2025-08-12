
package com.mycompany.app5;

public class App5 {

    public static void main(String[] args) {
        Empregado pessoa = new Empregado();

        pessoa.identificacao  = "13483015973";
        pessoa.nome = "victoria";
        pessoa.sobrenome = "kozloski";
        pessoa.salario = 2500.0;

        System.out.println("\npessoa.Identificação: " +
             pessoa.identificacao +
             "\nnome: " + pessoa.nome +
             "\nsobrenome: " + pessoa.sobrenome +
             "\nsalario: " + pessoa.salario);

        pessoa.aumentarSal(10);

        System.out.println("salario mensal após aumento de 10%: " + pessoa.salario);

        System.out.println("salario anual: " + pessoa.obterSalarioAnual(0));
    }
}

