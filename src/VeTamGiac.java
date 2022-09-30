import java.util.Scanner;

public class VeTamGiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so de tao tam giac : ");
        int k = scanner.nextInt();
        for(int i = 1; i<=k ; i++){
            for (int j = 1; j<= i ;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
