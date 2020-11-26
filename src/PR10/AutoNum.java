package PR10;

import java.util.*;
public class AutoNum {
    public static void main(String[] args) {

        ArrayList<String> autoList = new ArrayList<>();
        HashSet<String> autoHash = new HashSet<>();
        TreeSet<String> autoTree = new TreeSet<>();

        int N=0, r1=1, x=0, y=0, z=0, count=0;

        StringBuilder sb = new StringBuilder();
            while (r1<200) {

                if (count==100)
                {
                    r1++;
                    count=0;
                }

                for (int i = 0; i < 7; i++) {
                    if (i == 6) {
                        if (r1 < 10) {
                            sb.insert(i, 0);
                            sb.insert(i + 1, 0);
                            sb.insert(i + 2, r1);
                        } else if (r1 < 100) {
                            sb.insert(i, 0);
                            sb.insert(i + 1, r1);
                        } else sb.insert(i, r1);
                    }

                    if (i > 0 && i < 4) {
                        sb.insert(i, N);
                    }
                    if (N == 9) N = 0;

                    if (i == 0) {
                        if (x == 12) x = 0;
                        switch (x) {
                            case 0:
                                sb.insert(i, 'A');
                                break;
                            case 1:
                                sb.insert(i, 'B');
                                break;
                            case 2:
                                sb.insert(i, 'E');
                                break;
                            case 3:
                                sb.insert(i, 'K');
                                break;
                            case 4:
                                sb.insert(i, 'M');
                                break;
                            case 5:
                                sb.insert(i, 'H');
                                break;
                            case 6:
                                sb.insert(i, 'O');
                                break;
                            case 7:
                                sb.insert(i, 'P');
                                break;
                            case 8:
                                sb.insert(i, 'C');
                                break;
                            case 9:
                                sb.insert(i, 'T');
                                break;
                            case 10:
                                sb.insert(i, 'Y');
                                break;
                            case 11:
                                sb.insert(i, 'X');
                                break;
                        }
                    }
                    if (i == 4) {
                        if (y == 12)
                        {
                            y = 0;
                            x++;
                        }
                        switch (y) {
                            case 11:
                                sb.insert(i, 'A');
                                break;
                            case 0:
                                sb.insert(i, 'B');
                                break;
                            case 1:
                                sb.insert(i, 'E');
                                break;
                            case 2:
                                sb.insert(i, 'K');
                                break;
                            case 3:
                                sb.insert(i, 'M');
                                break;
                            case 4:
                                sb.insert(i, 'H');
                                break;
                            case 5:
                                sb.insert(i, 'O');
                                break;
                            case 6:
                                sb.insert(i, 'P');
                                break;
                            case 7:
                                sb.insert(i, 'C');
                                break;
                            case 8:
                                sb.insert(i, 'T');
                                break;
                            case 9:
                                sb.insert(i, 'Y');
                                break;
                            case 10:
                                sb.insert(i, 'X');
                                break;
                        }
                    }
                    if (i == 5) {
                        if (z == 12)
                        {
                            z = 0;
                            y++;
                        }
                        switch (z) {
                            case 10:
                                sb.insert(5, 'A');
                                break;
                            case 11:
                                sb.insert(5, 'B');
                                break;
                            case 0:
                                sb.insert(5, 'E');
                                break;
                            case 1:
                                sb.insert(5, 'K');
                                break;
                            case 2:
                                sb.insert(5, 'M');
                                break;
                            case 3:
                                sb.insert(5, 'H');
                                break;
                            case 4:
                                sb.insert(5, 'O');
                                break;
                            case 5:
                                sb.insert(5, 'P');
                                break;
                            case 6:
                                sb.insert(5, 'C');
                                break;
                            case 7:
                                sb.insert(5, 'T');
                                break;
                            case 8:
                                sb.insert(5, 'Y');
                                break;
                            case 9:
                                sb.insert(5, 'X');
                                break;
                        }
                        z++;
                    }
                }
                N++;
                count++;
                //if(!autoList.contains(sb.toString())){
                /*try {
                    if (!autoList.get(autoList.size() - 1).equals(sb.toString())) {
                        autoList.add(sb.toString());
                        sb.delete(0, 9);
                    } else {
                        sb.delete(0, 9);
                        r1++;
                    }
                } catch (Exception ex) {*/
                    autoList.add(sb.toString());
                    sb.delete(0, 9);
                //}
                //}
            }
                autoHash.addAll(autoList);
                autoTree.addAll(autoList);
                for (int i = 0; i < autoList.size(); i++) {
                    System.out.println(autoList.get(i));
                }

        /*Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();*/
                long start = System.nanoTime();
                if (autoList.contains("B123EP125"))
                    System.out.println("Поиск перебором: номер найден, поиск занял " + (System.nanoTime() - start) + "нс");
                else
                    System.out.println("Поиск перебором: номер не найден, поиск занял " + (System.nanoTime() - start) + "нс");


                Collections.sort(autoList);
                start = System.nanoTime();
                if (Collections.binarySearch(autoList, "B123EP125") > -1)
                    System.out.println("Бинарный поиск: номер найден, поиск занял " + (System.nanoTime() - start) + "нс");
                else
                    System.out.println("Бинарный поиск: номер не найден, поиск занял " + (System.nanoTime() - start) + "нс");

                start = System.nanoTime();
                if (autoHash.contains("B123EP125"))
                    System.out.println("Поиск в HashSet: номер найден, поиск занял " + (System.nanoTime() - start) + "нс");
                else
                    System.out.println("Поиск в HashSet: номер не найден, поиск занял " + (System.nanoTime() - start) + "нс");

                start = System.nanoTime();
                if (autoTree.contains("B123EP125"))
                    System.out.println("Поиск в TreeSet: номер найден, поиск занял " + (System.nanoTime() - start) + "нс");
                else
                    System.out.println("Поиск в TreeSet: номер не найден, поиск занял " + (System.nanoTime() - start) + "нс");

            }
        }
