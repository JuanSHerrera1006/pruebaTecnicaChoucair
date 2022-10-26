package co.com.choucair.certification.pruebatecnica.util;

import java.util.Random;

public class EmailGeneratorUtil {
    public static String getRandomString() {
        String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder rndString = new StringBuilder();
        Random rnd = new Random();
        while (rndString.length() < 10) {
            int index = (int) (rnd.nextFloat() * LETTERS.length());
            rndString.append(LETTERS.charAt(index));
        }
        String newString = rndString.toString();
        return newString;
    }

    public static String getNewEmail(String domain) {
        return getRandomString() + domain;
    }
}
