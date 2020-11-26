package PR9;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class PhoneMap {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, String > phonesMap = new TreeMap<String, String>();

        String buffer;

        while(true) {
            buffer = scanner.nextLine();
            if (buffer.equals("LIST")) {
                for (Map.Entry<String,String> entry : phonesMap.entrySet()) {
                    System.out.println("Key: " + entry.getKey() + ". Value: " + entry.getValue());
                }
            }
            else if (isNameCorrect(buffer)) {
                if (phonesMap.containsValue(buffer)) {
                    for (Map.Entry<String, String> entry : phonesMap.entrySet()) {
                        if (entry.getValue().equals(buffer)) {
                            System.out.println(entry.getKey() + "------" + entry.getValue());
                        }
                    }
                } else {
                    System.out.println("Enter number phone");
                    String numberPhone = scanner.nextLine();
                    String name = buffer;
                    if (isNumberCorrect(numberPhone)) {
                        numberPhone = toCorrectForm(numberPhone);
                        phonesMap.put(numberPhone, name);
                        System.out.println("added\n");
                    }
                }
            } else if (isNumberCorrect(buffer)) {
                String numberPhone = buffer;
                numberPhone = toCorrectForm(numberPhone);
                if (phonesMap.containsKey(numberPhone)) {
                    for (Map.Entry<String, String> entry : phonesMap.entrySet()) {
                        if (entry.getKey().equals(numberPhone)) {
                            System.out.println(entry.getKey() + "------" + entry.getValue());
                        }
                    }
                } else {
                    System.out.println("Enter name");
                    String name = scanner.nextLine();
                    if (isNameCorrect(name)) {
                        phonesMap.put(numberPhone, name);
                        System.out.println("added\n");
                    }
                }
            }
        }
    }

    private static String toCorrectForm(String phone) {
        StringBuffer number = new StringBuffer();
        Scanner scanner = new Scanner(System.in);

            phone = scanner.nextLine();
            phone = phone.replaceAll("[^0-9]", "");
            if (phone.charAt(0) == '7' && phone.length() == 11) {
                number.append(phone);
                number.insert(0, "+");
                number.insert(2, " (");
                number.insert(7, ") ");
                number.insert(12, "-");
                number.insert(15, "-");

            } else if (phone.charAt(0) == '8' && phone.length() == 11) {
                number.append(phone);
                number.delete(0,1);
                number.insert(0, "+7");
                number.insert(2, " (");
                number.insert(7, ") ");
                number.insert(12, "-");
                number.insert(15, "-");
            }
            else if (phone.length() == 10) {
                number.append(phone);
                number.insert(0, "+7");
                number.insert(2, " (");
                number.insert(7, ") ");
                number.insert(12, "-");
                number.insert(15, "-");
            } else {
                System.out.println("Input error");
            }
        return number.toString();
    }

    static boolean isNameCorrect(String name) {
        return Pattern.matches("([A-ZА-Я]([a-zа-я]+\\s*)){1,3}", name);
    }

    static boolean isNumberCorrect(String phone) {
        phone = phone.replaceAll("[^0-9]", "");
        return (phone.length() <= 11 && phone.length() >= 10)&&
                ((phone.charAt(0) == '7' && phone.length() == 11) ||
                        (phone.charAt(0) == '8' && phone.length() == 11) ||
                        (phone.length() == 10));
    }
}