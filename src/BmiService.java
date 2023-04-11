public class BmiService {
    public int calculate(int weight, double height) {
        double heightDouble = height * height;
        double bmi = weight / heightDouble;
        return (int) bmi;
    }

}
