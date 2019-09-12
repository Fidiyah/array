/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum1;

/**
 *
 * @author asd
 */
import java.util.Scanner;
public class challenge {
    public static void main(String args[]) {
        int nilai[],a,b;
        nilai = new int[6];
        double ratarata,jumlah=0;
        Scanner baca = new Scanner(System.in);
        System.out.print("Masukkan nilai ");
        
        b = baca.nextInt();
        
       
        for(a=1; a<=5; a++) {
            
            System.out.print("Nilai " + a + " : ");
            nilai[a] = baca.nextInt();
            jumlah = jumlah + nilai[a];
        }
        ratarata = jumlah/5;
        System.out.println("Nilai total :" +jumlah);
            System.out.println("Nilai rata-rata :" + ratarata);
    if(ratarata<=80) {
        System.out.println("Nilai rata-rata masih rendah");
    }else{
        System.out.println("Nilai rata-rata sudah tinggi");
    
        
    }
            
        
        
            
            
        }
    }
    

