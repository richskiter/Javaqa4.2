public class BmiService {
    public String calculate(float height, float weight) {

        float bmi;
        // Calculating body mass index
        if (height > 0 && weight > 0) {
            bmi = weight / (height / 100 * height / 100);
        } else {
            return "Ошибка ввода";
        }

        if (bmi <= 16 && bmi > 0) {
            return String.format("Body mass index: %.2f  %s", bmi, "Выраженный дефицит массы тела");
        } if (bmi > 16 && bmi < 18.5) {
            return String.format("Body mass index: %.2f  %s", bmi, "Недостаточная масса тела (дефицит)");
        } if (bmi > 18.5 && bmi < 25) {
            return String.format("Body mass index: %.2f  %s", bmi, "Нормальная масса тела");
        } if (bmi > 25 && bmi < 25) {
            return String.format("Body mass index: %.2f  %s", bmi, "Избыточная масса тела (предожирение)");
        } if (bmi > 30 && bmi < 35) {
            return String.format("Body mass index: %.2f  %s", bmi, "Ожирение I степени");
        } if (bmi > 35 && bmi < 40) {
            return String.format("Body mass index: %.2f  %s", bmi, "Ожирение II степени");
        } if (bmi >= 40) {
            return String.format("Body mass index: %.2f  %s", bmi, "Ожирение III степени");
        }
        return "Ошибка ввода";
    }
}