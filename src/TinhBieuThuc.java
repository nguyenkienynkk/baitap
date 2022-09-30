import java.util.Scanner;

public class TinhBieuThuc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so can tinh : ");
        int n = scanner.nextInt();
        int S = 0 ;
      for (int i = 1 ; i<n ; i++){
          S+=i*(i+1);

      }
        System.out.println("Tong cua so do la" + S);


    }
}
