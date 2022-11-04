import java.util.Scanner;

public class kiemTraNamNhuan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao nam: ");
        int year = sc.nextInt();
        if (year % 4 == 0 || year % 100 != 0)
            System.out.println(year + " la nam nhuan");
        else if (year % 100 == 0 || year % 400 != 0) {
            System.out.println(year + " khong phai la nam nhuan");
        } else if (year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " la nam nhuan");
        }
    }
}
