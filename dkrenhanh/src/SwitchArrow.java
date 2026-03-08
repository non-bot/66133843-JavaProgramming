public class SwitchArrow {
    public static void main(String[] args) {
        int day = 3;

        // Switch expression với -> (không cần break)
        String dayType = switch (day) {
            case 1, 2, 3, 4, 5 -> "Ngày làm việc";
            case 6, 7 -> "Ngày nghỉ";
            default -> "Ngày không hợp lệ";
        };

        System.out.println("Ngày thứ " + day + " là: " + dayType);
    }
}