public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        float Bmi = service.calculate(180F, 60F);
        String BodyMassIndex = service.BodyMassIndex(Bmi);
        System.out.println(String.format("%.2f", Bmi));
        System.out.println(BodyMassIndex);

        float Bmi1 = service.calculate(180F, 100F);
        BodyMassIndex = service.BodyMassIndex(Bmi1);
        System.out.println(String.format("%.2f", Bmi1));
        System.out.println(BodyMassIndex);

        float Bmi2 = service.calculate(180F, 180F);
        BodyMassIndex = service.BodyMassIndex(Bmi2);
        System.out.println(String.format("%.2f", Bmi2));
        System.out.println(BodyMassIndex);

        float Bmi3 = service.calculate(0F, 0F);
        BodyMassIndex = service.BodyMassIndex(Bmi3);
        System.out.println(String.format("%.2f", Bmi3));
        System.out.println(BodyMassIndex);

        float Bmi4 = service.calculate(-100F, -100F);
        BodyMassIndex = service.BodyMassIndex(Bmi4);
        System.out.println(String.format("%.2f", Bmi4));
        System.out.println(BodyMassIndex);

        float Bmi5 = service.calculate(100F, -100F);
        BodyMassIndex = service.BodyMassIndex(Bmi5);
        System.out.println(String.format("%.2f", Bmi5));
        System.out.println(BodyMassIndex);
    }
}