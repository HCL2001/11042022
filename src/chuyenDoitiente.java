import java.util.Scanner;

public class chuyenDoitiente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int USD = 23000;
        System.out.print("Nhap vao so tien muon doi: ");
        int money = sc.nextInt();
        System.out.print("So tien doi thanh la: " + (money * USD));
    }
}
