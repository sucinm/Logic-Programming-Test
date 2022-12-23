public class Kubus {
    double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    public void hitungVolume() {
        double volume = Math.pow(sisi, 3);
        System.out.println("Kubus: " + volume);
    }
}
