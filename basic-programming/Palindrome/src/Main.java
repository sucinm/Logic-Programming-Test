public class Main {
    private static boolean palindrome(String value){
        char[] valueArray = value.toCharArray();
        String reverseValue = "";
        for(int i=0; i<value.length(); i++){
            reverseValue = value.charAt(i) + reverseValue;
        }
        if(value.equals(reverseValue)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("kupu-kupu"));
        System.out.println(palindrome("lion"));
    }
}