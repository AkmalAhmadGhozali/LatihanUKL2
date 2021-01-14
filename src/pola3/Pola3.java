/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pola3;

/**
 *
 * @author WINDOWS 10
 */
public class Pola3 {
    public static void main(String[] args) {
        int i,j;
        for (i=1 ; i<= 5 ; i++){
            if(i==1 || i==5){
                for(j=1 ; j<=5 ; j++){
                    System.out.print("@");
                }
                System.out.println("");
            }
            else{
                for(j=1 ; j<=5-i ; j++){
                    System.out.print(" ");
                }
                System.out.println("@");
            }
        }       
    }
    
}
