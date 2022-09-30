package com.ibik.pertemuan2;
import javax.swing.JOptionPane;
public class Latihan02 {
    public static void main(String[] args) {
        int angka=Integer.parseInt(JOptionPane.showInputDialog("Masukkan bilangan: "));
        boolean prima=false;
        if (angka>=2){
            prima=true;
            for(int a=2;a<angka;a++){
                if(angka%a==0){
                    prima=false;
                    break;
                }
            }
        }
        System.out.println((prima==true?angka+" Termasuk bilangan prima":angka+" bukan termasuk bilangan prima karena habis dibagi 2"));
    }
}