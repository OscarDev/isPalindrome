public class Main {

    public static boolean isPalindrome(String s){
        Boolean isPalindrome = true;

        s = s.trim();
        char[] charArray = s.toCharArray();
        int front = 0;
        int back = charArray.length-1;
        while (front < back){
            if (charArray[front] != charArray[back]) {
                isPalindrome = false;
                break;
            }
            front++;
            back--;
        }

        return isPalindrome;
    }

    public static void main(String[] args) {
        System.out.print(isPalindrome("ocawaco"));
    }
}
