public class Main {
    private static void DrawXYZ(int n){
        int nilai = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                nilai++;
                if(nilai%3==0){
                    System.out.print("X");
                } else if(nilai%2!=0){
                    System.out.print("Y");
                } else if(nilai%2==0){
                    System.out.print("Z");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DrawXYZ(3);
        DrawXYZ(5);
        DrawXYZ(1);
    }
}