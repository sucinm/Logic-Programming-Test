import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int bilangan;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bilangan: ");
        bilangan = input.nextInt();

        for(int i=1; i<= bilangan; i++){
            if(bilangan%i==0){
                System.out.println(i);
            }
        }
    }
}