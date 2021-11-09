
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class ArrayProcessing {
    
    //array of integer --> data
    int[] dataBil = new int[100];
    
    //jumlah data 
    int n;
    int maksimum;
    int minimum;
    int urutan;
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan banyaknya data (n): ");
        this.n = input.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Masukan bilangan ke"+(i+1)+": ");
            this.dataBil[i] = input.nextInt();
        }
    }
    
    double hitungRerata(int[] data){
        double sum = 0;
        for(int i=0; i<this.n; i++){
            sum += data[i];
        }
        double rerata = sum/this.n;
        return rerata;
    }
    
    int max(){
        maksimum = this.dataBil[0];
        for(int i=0; i<n; i++){
            if(this.dataBil[i] > maksimum){
                maksimum = this.dataBil[i];
            }
        }
        return maksimum;
        
    }
   
    int min(){
        minimum = this.dataBil[0];
        for(int i=0; i<n; i++){
            if(this.dataBil[i] < minimum){
                minimum = this.dataBil[i];
            }
        }
        return minimum;
        
    }
    
    int urutkan(){
        urutan = this.dataBil[0];
        for(int i=0; i<(this.n -1); i++){
            for(int j=0; j<(this.n-i-1); j++){
                if(this.dataBil[j] < this.dataBil[j+1]){
                    urutan = this.dataBil[j];
                    this.dataBil[j] = this.dataBil[j+1];
                    this.dataBil[j+1] = urutan;
                    
                }
            }
        }
        System.out.println("Urutan Bilangan: ");
        for(int i=0; i<this.n; i++){
            System.out.println(this.dataBil[i] + " ");
        }
        return urutan;
    }
    
    void output(){
        System.out.println("Rerata: " + this.hitungRerata(this.dataBil));
        System.out.println("Nilai Maksimum: " + this.max());
        System.out.println("Nilai Minimum: " + this.min());
//      System.out.print("Urutan bilangan: " + this.urutkan(this.dataBil) + " ");
    }
}
