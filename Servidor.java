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
public class Servidor {
    public static void main(String[] args) throws IOException{
        double saldo =0;
        double valor = 0;
        int op = 0;
        ServerSocket servidor = new ServerSocket(12345);
        System.out.println("Porta 1414 aberta!");
        System.out.print("Aguardando conexão do cliente...");
        Socket cliente = servidor.accept();
        //System.out.println("Nova conexao com o cliente " + cliente.getInetAddress().getHostAddress());

        
        ObjectOutputStream resultado = new ObjectOutputStream(cliente.getOutputStream());
        ObjectInputStream dados = new ObjectInputStream(cliente.getInputStream());
        saldo = dados.readDouble();
        valor = dados.readDouble();
        op = dados.readInt();
        if(op == 1){
            saldo+=valor;
        }
        if(op == 2){
            saldo-=valor;
        }
        
        resultado.writeDouble(saldo);
        resultado.flush();
        servidor.close();

    }
    
}
