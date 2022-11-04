import java.util.Scanner;

public class toanTu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chieu dai va chieu rong");
        float w = sc.nextFloat(), h = sc.nextFloat();
        System.out.println("Area: " + (w * h));

    }
}
