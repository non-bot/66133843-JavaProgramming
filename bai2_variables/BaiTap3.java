package bai2_variables;
public class BaiTap3 {
    public static void main(String[] args) {
        // BMI = cân nặng (kg) / (chiều cao (m) * chiều cao (m))
        
        double weight = 68.7;    // kg
        double height = 1.63;    // m
        double bmi = weight / (height * height);
        
        System.out.println("Cân nặng: " + weight + " kg");
        System.out.println("Chiều cao: " + height + " m");
        System.out.println("Chỉ số BMI: " + bmi);
        
        // Phân loại BMI
        if (bmi >= 30) {
            System.out.println("Phân loại: Béo phì");
        } else if (bmi >= 25) {
            System.out.println("Phân loại: Thừa cân");
        } else if (bmi >=18.5) {
            System.out.println("Phân loại: Bình thường");
        } else {
            System.out.println("Phân loại: Thiếu cân");
        }
    }
}