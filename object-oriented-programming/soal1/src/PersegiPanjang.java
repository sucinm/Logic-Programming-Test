public class PersegiPanjang {

    double panjang;
    double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void hitungLuas() {
        double luas = panjang * lebar;
        System.out.println("Persegi Panjang: " + luas);
    }

    public void hitungKeliling() {
        double keliling = 2 * (panjang + lebar);
        System.out.println("Persegi Panjang: " + keliling);
    }
}
