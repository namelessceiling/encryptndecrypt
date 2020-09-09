import java.util.Scanner;

public class EncryptDecrypt {
    public static void main(String[] args) {
    
    }
    
    public static void caesarCipherEncrypt(String message, int key) {
        StringBuilder str = new StringBuilder();
        char[] c = message.toCharArray();
        for(int i = 0; i < c.length; i++) {
            char encrypted = (char) ((c[i] + key) % 128); //Assumes ASCII with 128 chars
            str.append(encrypted);
        }
        System.out.println(str.toString());
    }
    
    public static void caesarDecrypt(String message, int key) {
    	StringBuilder str = new StringBuilder();
    	char[] c = message.toCharArray();
    	for(int i = 0; i < c.length; i++) {
    	    char decrepted = (char) Math.abs((c[i] - key) % 128); //ensures it stays in the ASCII 128 chars range of 0-127
    	    str.append(decrypted);
    	}
    	System.out.println(str.toString());
    }
}
