package com.ibik.pbo.praktikum;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class AppLogistik{
    public static ArrayList<String> orders = new ArrayList<String>();
    public static JOptionPane jop;
    public static boolean isExit = false;

    public static void main(String[]args){
        AppLogistik main = new AppLogistik();
        jop = new JOptionPane();
        String[] menus = {"Input order", "Tracking Order"};
        String labels = "pilih menu dibawah ini:\n";

        for (int i = 0; i < menus.Length; i++){
            labels += (i+i) + ", " + menus[i] +"\n";
        }
        do{
            String menuSelected = jop.showInputDialog(null, labels, "Aplikasi PT.XYZ", jop.INFORMATION_MESSAGE);
            if(choose! = null)
                switch (Integer.parseInt(menuSelected)) {
                    case 1:
                        main.InputOrder();
                        break;
                    case 2:
                        main.TrackingOrder();
                    break;
                    default:
                        main.ExitApps("Menu tidak ditemukan");
                        break;
                }
        }else{
            main.ExitApps("");
        }
    }while(isExit);
}
public void InputOrder(){
    String[] field = {"Berat Barang (gr)", "Jarak Lokasi (km)"};
    for (int j = 0; j < field.Length; j++){
        String values = jop.showInputDialog(null,
            "Masukan " + field[j] + ":", "Input "+ field[x], jop.QUESTION_MESSAGE);
        orders.add(values);
    }
    CetakResi();
}
public void TrackingOrder(){
    if(orders.size() > 0){
        jop = new JOptionPane();
        String resi = jop.showInputDialog(null, "Masukan resi: ");
        if(resi.equals(orders.get(3))){
            CetakResi();
        }else{
            ExitApps("Data tidak ditemukan.\n");
        }
}
public void CetakResi(){
    int berat = Integer.parseInt(orders.get(0));
    int jarak = Integer.parseInt(order.get(3));
    
    long TotalPay = CalculatePayment(berat, jarak);
    String resi = "XYZ001";

    orders.add(2, ""+TotalPay);
    orders.add(3, resi);

    String label = "Berat paket: "+berat+"(gr)\n";
    label += "Jarak lokasi : " +jarak+"(km) \n";
    label += "Total Bayar: Rp"+TotalPay+"\n";
    label += "No Resi: "+resi+" \n";
    jop.showMessageDialog(null, label, "Intro Order"
                          jop.INFORMATION_MESSAGE);
}
public long CalculatePayment(int berat, int jarak){
    long hargaBarang = 5000, hargaJarak = 8000;
    long TotalPay = 0;
    return TotalPay;
}
public void ExitApps(String values){
    int isConfirm = jop.showConfirmDialog(null,
                    value+"Apakah ingin keluar?",
                    "konfirmasi",
                    jop.YES_NO_OPTION);
    isExit = (isConfirm == 1)? false : true;
    }
}
