public class SwitchYield {
    public static void main(String[] args) {
        String color = "RED";

        // Switch với yield
        int colorCode = switch (color) {
            case "RED" -> {
                System.out.println("Xử lý màu đỏ...");
                yield 1;  // Trả về giá trị
            }
            case "GREEN" -> {
                System.out.println("Xử lý màu xanh lá...");
                yield 2;
            }
            case "BLUE" -> {
                System.out.println("Xử lý màu xanh dương...");
                yield 3;
            }
            default -> {
                System.out.println("Màu không xác định");
                yield 0;
            }
        };

        System.out.println("Mã màu: " + colorCode);
    }
}