import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== MENU CHƯƠNG TRÌNH ===");
            System.out.println("1. Tính tổng hai số");
            System.out.println("2. Tính tích hai số");
            System.out.println("3. Thoát chương trình");
            System.out.print("Chọn chức năng (1-3): ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số thứ nhất: ");
                    double a = scanner.nextDouble();
                    System.out.print("Nhập số thứ hai: ");
                    double b = scanner.nextDouble();
                    System.out.println("Tổng: " + (a + b));
                    break;

                case 2:
                    System.out.print("Nhập số thứ nhất: ");
                    double x = scanner.nextDouble();
                    System.out.print("Nhập số thứ hai: ");
                    double y = scanner.nextDouble();
                    System.out.println("Tích: " + (x * y));
                    break;

                case 3:
                    System.out.println("Cảm ơn bạn đã sử dụng!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 3);

        scanner.close();
    }
}