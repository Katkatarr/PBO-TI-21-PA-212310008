package com.ibik.pbo.praktikum;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MainApps{
    MainApps(){
        ConnectionDB coon = new ConnectionDB();
        try{
            coon.connect();
        JOptionPane.showMessageDialog(null,"Koneksi Berhasil");
        }catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Koneksi Gagal");
        }
    }
    public static void main (String[] args){
        new MainApps();
    }
}
