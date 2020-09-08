import java.util.Scanner;

public class EncryptDecrypt {
    public static void main(String[] args) {
    
    }
    
    public static void caesarCipher(String message, int key) {
        StringBuilder str = new StringBuilder();
        char[] c = message.toCharArray();
        for(int i = 0; i < c.length; i++) {
            if(Character.isLetter(c[i])) {
                char newRes = (char) ((c[i] + key - 'a') % 26 + 'a'); //shifts the letter "key" spaces
                str.append(newRes);
            } else {
                str.append(c[i]);
            }
        }
        System.out.println(str.toString());
    }
}
