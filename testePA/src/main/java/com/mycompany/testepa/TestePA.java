/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testepa;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TestePA {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
            /*Entrada de Dados*/
             int valor;
             int Pdesconto;
             int Pjuros;       
             int vdesconto;
             int vjuros;
       
              
              System.out.println("****WINKS!!****");//NOME DA LOJA//
              System.out.println("digite o valor da compra:");
              valor = leia.nextInt();//fazer a leitura do valor//
              System.out.println("digite a porcentagem de desconto");
              Pdesconto =leia.nextInt();//Fazer a leitura//
              System.out.println("digite a porcentagem de juros:");
              Pjuros =leia.nextInt();//fazer aleitura do desconto//
              
              vdesconto = valor * Pdesconto; //calculo de desconto//
              vjuros= valor * Pjuros; //calculo de juros//
              
              valor= 1000;
              vdesconto = (int)(valor*0.9);
              vjuros = (int) (valor*1.1);
              
              
              //saida//
              System
              System.out.println("compras com");
              System.out.println("Compra cm 10% de juros" +vjuros);  
              
    }
}
