public class Tabung {
    double jariJari;
    double tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public void hitungVolume() {
        double volume = Math.PI * Math.pow(jariJari, 2) * tinggi;
        System.out.println("Tabung: " + Math.ceil(volume));
    }
}
