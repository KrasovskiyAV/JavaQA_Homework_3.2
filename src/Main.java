public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 63; // вес в килограммах
        double height = 1.74; // рост в метрах
        int bmi = service.calculate(63, 1.74);
        System.out.println("Индекс массы тела при росте 1,74м и весе 63кг:");
        System.out.println(bmi);

        System.out.println();
        System.out.println("Индекс массы тела при росте 1,87м и весе 98кг:");
        System.out.println(service.calculate(98, 1.87));

        System.out.println();
        System.out.println("Индекс массы тела при росте 2,10м и весе 102кг:");
        System.out.println(service.calculate(102, 2.10));
    }
}
