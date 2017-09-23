/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dayane
 */
public class CriaMatriz {
    public static void main(String[] args){
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];
        MatrizThread m[]= new MatrizThread[4];
        int cont = 0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j] = j+1;
            }
        }
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                b[i][j] = j+1;
            }
        }
        for(int i=0; i < a.length; i++){
            for(int j=0; j < a[i].length; j++){
                //O elemento da matriz m será sempre zero    
                m[cont] = new MatrizThread();//criando um thread 
                m[cont].start();//iniciando o Thread
                c[j][i] = m[cont].multiplica(a, b, j, i); //Os elementos da matriz C são gerados pelo metodo que está na classe MatrizThread
                //(a,b,j,i)são passados como parametro para o metodo
                //System.out.println(cont);Permite acompanhar a criação dos Threads
                
            }
        }
        //printa a matriz 
        for(int i=0; i < c.length; i++){
            for(int j=0; j < c[i].length; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println("");
        }
        
    }
}
