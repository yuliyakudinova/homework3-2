public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float mass = (float) 60.2;
        float high = (float) 1.70;
        float bmi =  service.calculate(mass, high);
        System.out.println("Индекс массы тела");
        System.out.println("Ваш результат: " + bmi);
    }
}
