package basic.selenium;

import java.util.Random;
import java.util.UUID;

public class Interview {

    public static void main(String[] args) {
        String alphaNumeric = generateRandomString(8); // Generates an 8-character alphanumeric string
        System.out.println(alphaNumeric);

        String alStr= UUID.randomUUID().toString().replace("-","").substring(0,6);
        System.out.println(alStr);
    }

    public static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }

        return sb.toString();
    }
}
