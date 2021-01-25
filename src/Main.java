public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        System.out.println(service.calculate(180F, 60F));
        System.out.println(service.calculate(180F, 100F));
        System.out.println(service.calculate(180F, 180F));
        System.out.println(service.calculate(-100F, -100F));
        System.out.println(service.calculate(0F, 0F));
        System.out.println(service.calculate(100F, -100F));

    }
}