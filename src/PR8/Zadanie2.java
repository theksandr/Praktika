package PR8;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        String name;
        StringBuilder firstname = new StringBuilder("Имя: ");
        StringBuilder middlename = new StringBuilder("Фамилия: ");
        StringBuilder lastname = new StringBuilder("Отчество: ");

        Scanner scanner = new Scanner(System.in);

        name = scanner.nextLine();
        name = name.trim() + " ";
        int count = 0;
        if (name.length() > 1) {

            for (int i = 0; i < name.indexOf(" "); i++, count++) {
                if ((name.charAt(i) >= 'a' && name.charAt(i) <= 'z') ||
                        (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') ||
                        ((name.charAt(i) >= 'а' && name.charAt(i) <= 'я') ||
                                (name.charAt(i) >= 'А' && name.charAt(i) <= 'Я') ||
                                (name.charAt(i) == 'ё'))) {
                    middlename.append(name.charAt(i));
                } else {
                    System.out.println("Неправильная фамилия");
                    return;
                }
            }


            if (!(name.indexOf(" ") == name.length() - 1)) {
                for (int i = count + 1; i < name.indexOf(" ", count + 1); i++, count++) {
                    if ((name.charAt(i) >= 'a' && name.charAt(i) <= 'z') ||
                            (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') ||
                            ((name.charAt(i) >= 'а' && name.charAt(i) <= 'я') ||
                                    (name.charAt(i) >= 'А' && name.charAt(i) <= 'Я') ||
                                    (name.charAt(i) == 'ё'))) {
                        firstname.append(name.charAt(i));
                    } else {
                        System.out.println("Неправильное имя");
                        return;
                    }
                }
            } else {
                System.out.println("Вы не ввели имя");
                return;
            }

            name = name.trim();
            if (!(count == name.length() - 1)) {
                for (int i = count + 2; i < name.length(); i++, count++) {
                    if ((name.charAt(i) >= 'a' && name.charAt(i) <= 'z') ||
                            (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') ||
                            ((name.charAt(i) >= 'а' && name.charAt(i) <= 'я') ||
                                    (name.charAt(i) >= 'А' && name.charAt(i) <= 'Я') ||
                                    (name.charAt(i) == 'ё'))) {
                        lastname.append(name.charAt(i));
                    } /*else if (name.charAt(i) == ' ') {
                        System.out.println("Неверный ввод");
                        return;
                    } else {
                        System.out.println("Неправильное Отчество");
                        return;
                    }*/
                }
            }

            if (count + 2 == name.length()) {
                System.out.println(middlename);
                System.out.println(firstname);
                System.out.println(lastname);
            } else if (count + 1 == name.length()) {
                System.out.println(middlename);
                System.out.println(firstname);
            } else {
                System.out.println("Неверный ввод");
            }
        }
    }
}

