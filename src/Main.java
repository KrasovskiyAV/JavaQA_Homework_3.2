public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 63; // вес в килограммах
        double height = 1.74; // рост в метрах
        int bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}
