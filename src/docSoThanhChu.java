import java.util.Scanner;

public class docSoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so can doc: ");
        int num = sc.nextInt();
        int donVi = (num % 100)%10; //lay don vi
        int hangChuc = (num%100)/10; //lay hang chuc
        int hangTram = num / 100; //lay hang tram
        String donViS = "";
        String hangChucS = "";
        String hangTramS = "";
        if (num >= 0 || num < 10) {
                switch (donVi) {
                    case 1:
                        donViS = "mot";
                        break;
                    case 2:
                        donViS = "hai";
                        break;
                    case 3:
                        donViS = "ba";
                        break;
                    case 4:
                        donViS = "bon";
                        break;
                    case 5:
                        donViS = "nam";
                        break;
                    case 6:
                        donViS = "sau";
                        break;
                    case 7:
                        donViS = "bay";
                        break;
                    case 8:
                        donViS = "tam";
                        break;
                    case 9:
                        donViS = "chin";
                        break;
                }
            }
        if (num >= 10 || num < 20) {
            switch (num) {
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("muoi hai");
                    break;
                case 13:
                    System.out.println("muoi ba");
                    break;
                case 14:
                    System.out.println("muoi bon");
                    break;
                case 15:
                    System.out.println("muoi lam");
                    break;
                case 16:
                    System.out.println("muoi sau");
                    break;
                case 17:
                    System.out.println("muoi bay");
                    break;
                case 18:
                    System.out.println("muoi tam");
                    break;
                case 19:
                    System.out.println("muoi chin");
                    break;
            }
        }
        if (num >= 20 || num < 100){
            if (num == 20)
                System.out.println("Hai muoi");
            else {
                switch (hangChuc){
                    case 2:
                        hangChucS = "hai muoi";
                        break;
                    case 3:
                        hangChucS = "ba muoi";
                        break;
                    case 4:
                        hangChucS = "bon muoi";
                        break;
                    case 5:
                        hangChucS = "nam muoi";
                        break;
                    case 6:
                        hangChucS = "sau muoi";
                        break;
                    case 7:
                        hangChucS = "bay muoi";
                        break;
                    case 8:
                        hangChucS = "tam muoi";
                        break;
                    case 9:
                        hangChucS = "chin muoi";
                        break;
                }
            }
        }
        if (num >= 100 || num < 1000){
            if (num == 100)
                System.out.println("mot tram");
            else {
                switch (hangTram){
                    case 2:
                        hangTramS = "Hai tram";
                        break;
                    case 3:
                        hangTramS = "Ba tram";
                        break;
                    case 4:
                        hangTramS = "Bon tram";
                        break;
                    case 5:
                        hangTramS = "Nam tram";
                        break;
                    case 6:
                        hangTramS = "Sau tram";
                        break;
                    case 7:
                        hangTramS = "Bay tram";
                        break;
                    case 8:
                        hangTramS = "Tam tram";
                        break;
                    case 9:
                        hangTramS = "Chin tram";
                        break;
                }
            }
        }
        System.out.println(hangTramS + " " + hangChucS + " " + donViS);
    }
}
