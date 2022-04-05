import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1.Перевести число из 10-ной в 16-ную");
        System.out.println("2.Перевести число из 10-ной в 2-ную");
        System.out.println("3.Перевести число из 2-ной в 10-ную");
        int y = new Scanner(System.in).nextInt();
        String chislo = "";
        int chislo2 = 0;
        switch (y) {
            case 1:
                System.out.println("Введите число от 1 до 10000");
                int number = new Scanner(System.in).nextInt();
                while (number != 0) {
                    switch (number) {
                        case 10:
                            chislo = 'A' + chislo;
                            break;
                        case 11:
                            chislo = 'B' + chislo;
                            break;
                        case 12:
                            chislo = 'C' + chislo;
                            break;
                        case 13:
                            chislo = 'D' + chislo;
                            break;
                        case 14:
                            chislo = 'E' + chislo;
                            break;
                        case 15:
                            chislo = 'F' + chislo;
                            break;
                        default:
                            chislo = number % 16 + chislo;
                            break;
                    }
                    number = number / 16;
                }
                System.out.println("Число в шестнадцатиричной системе исчисления: " + chislo);
                break;

            case 2:
                System.out.println("Введите число от 1 до 10000");
                number = new Scanner(System.in).nextInt();
                while (number != 0) {
                    chislo = number % 2 + chislo;
                    number = number / 2;
                }
                System.out.println("Число в двоичной системе исчисления: " + chislo);
                break;

            case 3:
                System.out.println("Введите число в двоичной системе исчисления");
                String forBin = new Scanner(System.in).nextLine();
                for (int i = 0; i < forBin.length(); i++) {
                    number = Character.getNumericValue(forBin.charAt(i));
                    int stepen = forBin.length() - 1 - i;
                    chislo2 = chislo2 + (int) Math.pow(2, stepen) * number;
                }
                System.out.println("Число в десятичной системе исчисления: " + chislo2);
                break;
        }
    }
}