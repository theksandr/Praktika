package PR3.Zadanie3;
import java.util.Scanner;
public class FurnitureShop
{
    //public int money = 3000;
    public static void main(String[] args)
    {
        Chair chairwooden = new Chair(100, 5, "Wooden Chair", 0);
        Chair chairiron = new Chair(300, 3, "Iron Chair", 0);
        Table tablewooden = new Table(200, 4, "Wooden Table", 0);
        Table tableiron = new Table(600, 2, "Iron Table", 0);
        Sofa sofahard = new Sofa(150, 3, "Hard Sofa", 0);
        Sofa sofasoft = new Sofa(450, 1, "Soft Sofa", 0);


        Scanner scanner = new Scanner(System.in);
        int cmd=0;
        int buy = 0;
        int q=0;
        while (cmd!=3) {
            if (chairwooden.stock!=0) System.out.println("1."+chairwooden.toString());
            if (chairiron.stock!=0) System.out.println("2."+chairiron.toString());
            if (tablewooden.stock!=0) System.out.println("3."+tablewooden.toString());
            if (tableiron.stock!=0) System.out.println("4."+tableiron.toString());
            if (sofahard.stock!=0) System.out.println("5."+sofahard.toString());
            if (sofasoft.stock!=0) System.out.println("6."+sofasoft.toString());
            System.out.println("Welcome to FurnitureShop.\n1.Buy furniture\n2.Cancel purchase\n3.Exit");
            cmd = scanner.nextInt();
            if (cmd == 1) {
                buy=0;
                while (buy!=7) {
                    //System.out.print("\033[H\033[2J]");
                    //System.out.flush();
                    if (chairwooden.stock!=0) System.out.println("1."+chairwooden.toString());
                    if (chairiron.stock!=0) System.out.println("2."+chairiron.toString());
                    if (tablewooden.stock!=0) System.out.println("3."+tablewooden.toString());
                    if (tableiron.stock!=0) System.out.println("4."+tableiron.toString());
                    if (sofahard.stock!=0) System.out.println("5."+sofahard.toString());
                    if (sofasoft.stock!=0) System.out.println("6."+sofasoft.toString());
                    System.out.println("7.Back");
                    System.out.println("What furniture would you like to buy?");
                    //System.out.println("1.Wooden Chair\n2.Iron Chair\n3.Wooden Table\n4.Iron Table\n5.Hard Sofa\n6.Soft Sofa\n7.Back");
                    buy = scanner.nextInt();
                    if (buy == 1)
                    {
                        System.out.println("How many?");
                        q = scanner.nextInt();
                        chairwooden.buyFurniture(q);
                    }
                    else if (buy == 2)
                    {
                        System.out.println("How many?");
                        q = scanner.nextInt();
                        chairiron.buyFurniture(q);
                    }
                    else if (buy == 3)
                    {
                        System.out.println("How many?");
                        q = scanner.nextInt();
                        tablewooden.buyFurniture(q);
                    }
                    else if (buy == 4)
                    {
                        System.out.println("How many?");
                        q = scanner.nextInt();
                        tableiron.buyFurniture(q);
                    }
                    else if (buy == 5)
                    {
                        System.out.println("How many?");
                        q = scanner.nextInt();
                        sofahard.buyFurniture(q);
                    }
                    else if (buy == 6)
                    {
                        System.out.println("How many?");
                        q = scanner.nextInt();
                        sofasoft.buyFurniture(q);
                    }
                }
            } else if (cmd == 2) {
                buy=0;
                while (buy!=7) {
                    if (chairwooden.owned!=0) System.out.println("1."+chairwooden.toString());
                    if (chairiron.owned!=0) System.out.println("2."+chairiron.toString());
                    if (tablewooden.owned!=0) System.out.println("3."+tablewooden.toString());
                    if (tableiron.owned!=0) System.out.println("4."+tableiron.toString());
                    if (sofahard.owned!=0) System.out.println("5."+sofahard.toString());
                    if (sofasoft.owned!=0) System.out.println("6."+sofasoft.toString());
                    System.out.println("7.Back");
                    System.out.println("What purchase would you like to cancel?");
                    buy = scanner.nextInt();
                    if (buy == 1)
                    {
                        System.out.println("How many?");
                        q = scanner.nextInt();
                        chairwooden.sellFurniture(q);
                    }
                    else if (buy == 2)
                    {
                        System.out.println("How many?");
                        q = scanner.nextInt();
                        chairiron.sellFurniture(q);
                    }
                    else if (buy == 3)
                    {
                        System.out.println("How many?");
                        q = scanner.nextInt();
                        tablewooden.sellFurniture(q);
                    }
                    else if (buy == 4)
                    {
                        System.out.println("How many?");
                        q = scanner.nextInt();
                        tableiron.sellFurniture(q);
                    }
                    else if (buy == 5)
                    {
                        System.out.println("How many?");
                        q = scanner.nextInt();
                        sofahard.sellFurniture(q);
                    }
                    else if (buy == 6)
                    {
                        System.out.println("How many?");
                        q = scanner.nextInt();
                        sofasoft.sellFurniture(q);
                    }
                }
            }
        }
    }
}
