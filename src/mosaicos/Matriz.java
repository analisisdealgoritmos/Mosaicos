/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mosaicos;

/**
 *
 * @author bryan
 */
public class Matriz {
    private int n;
    public static int[][] matriz;
    //public Point p;

    public void CreateMatriz(int n ,Point p){
        
        int ln = 1;
        while(ln<n)
            ln*=2;
        matriz = new int[ln][ln];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i == p.getPx()  && j == p.getPy())
                    matriz[i][j]=-1;
                else
                    matriz[i][j]=0;
            }
        }
    }
    
    public void imprimirMatriz(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(matriz[i][j]+"   ");
            }
            System.out.println("");
        }
    }
}
