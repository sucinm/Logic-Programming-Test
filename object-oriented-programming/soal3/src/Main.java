public class Main {

    public static void main(String[] args) {
        Kalkulator kalkulatorJumlah = new Penjumlahan(3, 4);
        kalkulatorJumlah.kalkulasi();
        Kalkulator kalkulatorKurang = new Pengurangan(15, 4);
        kalkulatorKurang.kalkulasi();
        Kalkulator kalkulatorKali = new Perkalian(10, 10);
        kalkulatorKali.kalkulasi();
        Kalkulator kalkulatorBagi = new Pembagian(12, 3);
        kalkulatorBagi.kalkulasi();
    }
}