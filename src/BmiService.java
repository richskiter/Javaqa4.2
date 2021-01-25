public class BmiService {
    public float calculate(float height, float weight) {
        if (height > 0) {
            if (weight > 0) {
                return weight / (height / 100 * height / 100);
            }
        }
        return 0;
    }

    public String BodyMassIndex(float BMI) {
        if (BMI <= 16) {
            if (BMI > 0) {
                return "Выраженный дефицит массы тела";
            }
        }
        if (BMI > 16) {
            if (BMI < 18.5) {
                return "Недостаточная масса тела (дефицит)";
            }
        }
        if (BMI > 18.5) {
            if (BMI < 25) {
                return "Нормальная масса тела";
            }
        }
        if (BMI > 25) {
            if (BMI < 30) {
                return "Избыточная масса тела (предожирение)";
            }
        }
        if (BMI > 30) {
            if (BMI < 35) {
                return "Ожирение I степени";
            }
        }
        if (BMI > 35) {
            if (BMI < 40) {
                return "Ожирение II степени";
            }
        }
        if (BMI >= 40) {
            return "Ожирение III степени";
        }

        return "Ошибка ввода";
    }
}