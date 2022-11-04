import java.util.Scanner;

public class phuongTrinhBac1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so a: " );
        int a = sc.nextInt();
        System.out.print("Nhap vao so b: ");
        int b = sc.nextInt();
        System.out.print("Nhap vao so c: ");
        int c = sc.nextInt();
        int dt;
        if (a == 0)
            System.out.println("Phuong trinh bac mot");
        else {
            dt = (b * b) - 4 * a * c;
            if (dt < 0)
                System.out.println("Phuong trinh vo nghiem");
            else if (dt == 0) {
                System.out.println("Phuong trinh co nghiem kep: " + (-b/(2*a)));
            }else {
                System.out.println("Phuong trinh co 2 nghiem phan biet: " + ((-b + Math.sqrt(dt))/(2*a) + " " + ((-b - Math.sqrt(dt))/(2*a))));
            }
        }
    }
}
