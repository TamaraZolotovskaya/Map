import java.util.Random;

public class StringUtils {
    public StringUtils() {
    }

    public static boolean IsNullOrBlank(String s) {
        return s == null || s.isBlank();
    }

    public static boolean IsLatinLetters(String s) {
        final String VALID_CHAR = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        for (int i = 0; i < s.length(); i++) {
            if (!VALID_CHAR.contains(String.valueOf(s.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public static String randomString() {

        String symbols = "qwertyuiopasdfghjklzxcvbnm";
        StringBuilder randString = new StringBuilder();
        int count = (int) (Math.random() * 20);
        for (int i = 0; i < count; i++)
            randString.append(symbols.charAt((int) (Math.random() * symbols.length())));

        return randString.toString();

    }

}