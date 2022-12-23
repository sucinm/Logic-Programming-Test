public class Pengurangan extends Kalkulator {

    public Pengurangan(int operandSatu, int operandDua) {
        setOperandSatu(operandSatu);
        setOperandDua(operandDua);
    }

    void setOperandSatu(int number){
        operandSatu = number;
    }

    void setOperandDua(int number){
        operandDua = number;
    }

    @Override
    void kalkulasi() {
        System.out.println("Hasil pengurangan: " + (operandSatu - operandDua));
    }
}
