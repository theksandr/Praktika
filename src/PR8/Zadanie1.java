package PR8;

public class Zadanie1 {
    public static void main(String[] args) {

        String text = "Вася заработал 5500 рублей, Петя - 7563 рубля, а Маша - 300 рублей";

        StringBuilder result = new StringBuilder();
        StringBuilder result1 = new StringBuilder();

        for (int i = 0; i < text.indexOf(","); i++) {
            if (text.charAt(i) >= '0' && text.charAt(i) < '9') {
                result.append(text.charAt(i));
            }
        }

        int sum = Integer.parseInt(String.valueOf(result));

        for (int i = text.indexOf("Маша"); i < text.length(); i++) {
            if (text.charAt(i) >= '0' && text.charAt(i) < '9') {
                result1.append(text.charAt(i));
            }
        }

        sum = sum + Integer.parseInt(String.valueOf(result1));
        System.out.println(sum);

    }
}
