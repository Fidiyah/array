/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.multi;

/**
 *
 * @author asd
 */
public class multidimensi2 {
    
        int nis [][] = {{210651} , {210651} , {2106512}};
        String nama [][]= {{"Ade"} , {"Galih"} , {"Baihagi"}};
        public void tampil(String n) {
            System.out.println("Identitas siswa angkatan 24");
        }
        public void namanis (int n) {
            for(int i=0; i<1; i++) {
                for(int j=0; j<1; j++) {
                    System.out.println(nama[1][j]+" : "+nis[1][j]);
                }
                }
                }
        public static void main(String[]args) {
            multidimensi2 siswa = new multidimensi2();
            siswa.tampil (null);
            siswa.namanis (0);
            
            
                
            }
            
            
        }
        
    
    

