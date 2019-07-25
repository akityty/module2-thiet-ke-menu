import java.util.Scanner;

public class ThietKeMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int theChoice = -1;
        while (theChoice != 0) {
            System.out.println("Chon 1: Ve Hinh Chu Nhat");
            System.out.println("Chon 2: Ve Hinh Vuong");
            System.out.println("Chon 3: Ve Hinh Tam Giac");
            System.out.println("Chon 0: Exit!");
            System.out.println("Enter Your Choice");
            theChoice = scanner.nextInt();
            switch (theChoice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("**********");
                    System.out.println("**********");
                    System.out.println("**********");
                    System.out.println("**********");
                    System.out.println("**********");
                    System.out.println("**********");
                    break;
                case 2:
                    System.out.println("******");
                    System.out.println("******");
                    System.out.println("******");
                    System.out.println("******");
                    System.out.println("******");
                    break;
                case 3:
                    System.out.println("*");
                    System.out.println("**");
                    System.out.println("***");
                    System.out.println("****");
                    System.out.println("*****");
                    break;
            }
        }
    }
}
