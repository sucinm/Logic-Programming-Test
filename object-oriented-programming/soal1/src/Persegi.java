public class Persegi {
    double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public void hitungLuas() {
        double luas = sisi * sisi;
        System.out.println("Persegi : " + luas);
    }

    public void hitungKeliling() {
        double keliling = sisi * 4;
        System.out.println("Persegi : " + keliling);
    }
}
