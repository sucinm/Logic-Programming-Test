public class Perkalian extends Kalkulator {
    public Perkalian(int operandSatu, int operandDua) {
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
        System.out.println("Hasil perkalian: " + (operandSatu * operandDua));
    }
}
