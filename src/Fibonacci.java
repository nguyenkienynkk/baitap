import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("CAC GIA TRI FIBONANCCI THU : ");
        num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print(fibonancci(i) + " ");

        }
    }
        public static int fibonancci( int num){
            int soFinancci0 = 0;
            int soFinancci1 = 1;
            int soFinanccin = 1;
            if (num == 0 || num == 1) {
                return num;
            } else {
                for (int i = 2; i < num; i++){
                    soFinancci0 = soFinancci1;
                    soFinancci1 = soFinanccin;
                    soFinanccin = soFinancci0 + soFinancci1;
                }
                return soFinanccin;
            }
        }
    }