import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int jumlahSiswa;
        int jumlahNilai;
        String namaSiswa;
        float hasil = 89.433F;
        double hasilBesar = 89.43312;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilainya:");
        int a = 0;
        a = input.nextInt();
        System.out.println("Nilainya " + a);

        int umur;
        String isEntry = "";
        System.out.println("Masukkan umur");
        umur = input.nextInt();

        if(umur>=18 && umur < 80) {
            isEntry = "Masuk";
        } else if (umur >= 80){
            isEntry = "Masuk, tapi harus laporan";
        }else{
            isEntry="Tidak Masuk";
        }

        System.out.println("Kamu boleh masuk gak: " + isEntry);
    }
}