public class Pembagian extends Kalkulator {

    public Pembagian(int operandSatu, int operandDua) {
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
        System.out.println("Hasil pembagian: " + (operandSatu / operandDua));
    }
}
