public class Main {
    public static void main(String[] args) {
        Persegi objectPersegi = new Persegi(4);
        Segitiga objectSegitiga = new Segitiga(3, 4);
        PersegiPanjang objectPersegiPanjang = new PersegiPanjang(7, 8);

        System.out.println("Luas");
        objectPersegi.hitungLuas();
        objectSegitiga.hitungLuas();
        objectPersegiPanjang.hitungLuas();

        System.out.println();
        System.out.println("Keliling");
        objectPersegi.hitungKeliling();
        objectSegitiga.hitungKeliling();
        objectPersegiPanjang.hitungKeliling();

    }
}
