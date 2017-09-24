/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dayane
 */
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Cliente {
    
    public static void main(String[] args)throws UnknownHostException, IOException{
        String nome;
        double saldo = 0,valor =0;
        int op = 0;
        //Scanner entrada = new Scanner(System.in);
        Socket cliente = new Socket("localHost",12345);
        System.out.println("Cliente conectou o servidor...");
        ObjectInputStream resultado = new ObjectInputStream(cliente.getInputStream());
        ObjectOutputStream dados = new ObjectOutputStream(cliente.getOutputStream());
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        nome = entrada.next();
        System.out.println("Informe seu saldo");
        saldo = entrada.nextDouble();
        System.out.println("Operações:");
        System.out.println("1-Deposito  2-Saque");
        op = entrada.nextInt();
        System.out.println("Informe o valor:");
        valor = entrada.nextDouble();
        if(op!=1 || op!=2){
            System.out.println("Operação Invalida");
        }

        dados.writeDouble(saldo);
        dados.writeDouble(valor);
        dados.writeInt(op);
        dados.flush();
       double NSaldo = 0;
        NSaldo = resultado.readDouble();
        System.out.println("Novo Saldo R$ "+NSaldo);
        
    }
}
