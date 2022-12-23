public class Penjumlahan extends Kalkulator {
    public Penjumlahan(int operandSatu, int operandDua) {
        setOperandSatu(operandSatu);
        setOperandDua(operandDua);
    }

    void setOperandSatu(int number) {
        operandSatu = number;
    }

    void setOperandDua(int number) {
        operandDua = number;
    }

    @Override
    void kalkulasi() {
        System.out.println("Hasil penjumlahan: " + (operandSatu + operandDua));
    }
}
