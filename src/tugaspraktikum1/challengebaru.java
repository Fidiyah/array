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
public class challengebaru {
    public static void main(String args[]) {
        int nilai [] = new int[6];
         nilai[0] = 80;
         nilai[1] = 90;
         nilai[3] = 70;
         nilai[4] = 95;
         nilai[5] = 100;
         double ratarata = 0.0;
         for(int i = 0; i<nilai.length; i++)ratarata+=nilai [i];
        ratarata/=nilai.length;
        System.out.println("Nilai rata-rata = " + ratarata);
        if(ratarata<=75) {
            System.out.println("Nilai rata-rata rendah ");
        }else{
            System.out.println("rata-rata sudah tinggi");
        }
        
    }
    
}
