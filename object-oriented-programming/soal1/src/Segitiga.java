public class Segitiga {
    double alas;
    double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public void hitungLuas() {
        double luas = alas * tinggi / 2;
        System.out.println("Segitiga : " + luas);
    }

    public void hitungKeliling() {
        double sisiMiring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        double keliling = alas + tinggi + sisiMiring;
        System.out.println("Segitiga: " + keliling);
    }
}
