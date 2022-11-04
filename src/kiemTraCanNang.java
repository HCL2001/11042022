import java.util.Scanner;

public class kiemTraCanNang {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chieu cao cua ban: ");
        double h = sc.nextFloat();
        System.out.print("Nhap vao can nang cua ban: ");
        double w = sc.nextFloat();
        w = w * 1000;
        double bmi = w / (h * h);
        if (bmi < 18.5)
            System.out.println("Underwweight");
        else if (bmi >= 18.5 || bmi < 25) {
            System.out.println("Normal");
        } else if (bmi >= 25 || bmi < 30) {
            System.out.println("Overweight");
        }else
            System.out.println("Obese");
    }
}
