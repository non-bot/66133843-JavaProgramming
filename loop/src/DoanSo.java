import java.util.Random;
import java.util.Scanner;

public class DoanSo {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random a = new Random();
        int x = a.nextInt(101), dem = 10;
        int da = 0;
        while (dem > 0) {
            System.out.println("Nhap so (1 -> 100): ");
            da = sc.nextInt();
            if (da == x){
                System.out.println("Dung");
                do{
                    System.out.println("Choi lai khong?\n 1.Co\n 2.Khong");
                    sc.nextLine();
                    da =  sc.nextInt();
                    if (da == 1) {
                        dem = 10;
                        x = a.nextInt(101);
                        break;
                    }
                    else if (da == 2)
                        return;
                    else
                        System.out.println("Nhap lai");
                }while(da != 2);
                continue;
            }
            else if (da > x)
                System.out.print("Nho hon");
            else
                System.out.print("Lon hon");
            System.out.printf(", con %d lan\n", dem-=1);
            if (dem == 0){
                do{
                    System.out.println("Choi lai khong?\n 1.Co\n 2.Khong");
                    sc.nextLine();
                    da =  sc.nextInt();
                    if (da == 1) {
                        dem = 10;
                        a = new Random();
                        break;
                    }
                    else if (da == 2)
                        return;
                    else
                        System.out.println("Nhap lai");
                }while(da != 2);
            }
        }
    }
}
