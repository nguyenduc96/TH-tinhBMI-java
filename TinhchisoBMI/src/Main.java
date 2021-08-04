import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tính chỉ số BMI");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập cân nặng (Kg) : ");
        float weight = scanner.nextFloat();

        System.out.println("Nhập chiều cao (m) : ");
        float height = scanner.nextFloat();

        float bmi = weight / (height*height);

        if (bmi < 18.5){
            System.out.println("BMI = " + bmi + " bạn thiếu cân !!");
        } else if (bmi < 25.0){
            System.out.println("BMI = " + bmi + " bạn bình thường !!");
        }else if (bmi < 30.0){
            System.out.println("BMI = " + bmi + " bạn hơi béo !!");
        }else {
            System.out.println("BMI = " + bmi + " bạn rất béo !!");
        }
    }
}
