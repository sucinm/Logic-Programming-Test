public class Main {
    public static void main(String[] args) {
        Kubus objectKubus = new Kubus(10);
        Balok objectBalok = new Balok(3, 6, 10);
        Tabung objectTabung = new Tabung(7, 10);

        System.out.println("Volume");
        objectKubus.hitungVolume();
        objectBalok.hitungVolume();
        objectTabung.hitungVolume();
    }
}