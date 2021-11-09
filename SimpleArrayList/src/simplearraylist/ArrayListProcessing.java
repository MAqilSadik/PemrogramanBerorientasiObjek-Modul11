/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ArrayListProcessing {
    ArrayList<String> dataBil = new ArrayList<String>();
    
    //input
    void input(){
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Menu Data ArrayList:");
            System.out.println("1. Tambah Data");
            System.out.println("2. Cari Data");
            System.out.println("3. Hapus Data");
            System.out.println("4. Tampil Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih nomor berapa: ");
            
            int pilihan = input.nextInt();
            switch(pilihan){
                case 1:
                    System.out.print("Masukan data string: ");
                    input.nextLine();
                    this.dataBil.add(input.nextLine());
                    System.out.println("Daftar string dalam array list:" + this.dataBil);
                    input.nextLine();
                    break;
                    
                case 2:
                    System.out.print("String yang mau dicari: ");
                    input.nextLine();
                    String find = input.nextLine();
                    int index = this.dataBil.indexOf(find);
                    if(index >= 0){
                        System.out.println("String '" + find + "' ada di index " + index + " di dalam data");
                        input.nextLine();
                    } else{
                        System.out.println("String '" + find + "' tidak ada dalam data");
                        input.nextLine();
                    }
                    break;
                    
                case 3:
                    System.out.print("String yang mau dihapus: ");
                    input.nextLine();
                    String delete = input.nextLine();
                    int indexDelete = this.dataBil.indexOf(delete);
                    if(indexDelete >= 0){
                        this.dataBil.remove(indexDelete);
                        System.out.println("String '" + delete + "' sudah dihapus di dalam data");
                    } else{
                        System.out.println("String '" + delete + "' tidak ada dalam data");
                    }
                    System.out.println("Daftar string dalam array list: " + this.dataBil);
                    input.nextLine();
                    
                    break;
                    
                case 4:
                    System.out.println("Daftar string dalam array list: " + this.dataBil + "\n");
                    break;
                
                case 5:
                    System.exit(0);
                
            }
        }
    }
}
