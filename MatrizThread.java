/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dayane
 */
public class MatrizThread extends Thread {
    
    int Soma = 0;
    public void run(){
        
    } 
    public int multiplica(int [][]a,int [][]b,int i,int j){
       
        for(int g=0 ;g < a.length; g++){
           Soma += a[j][g]*b[g][i]; 
        }
        return Soma;
    }
}
