public class BmiService {
    public float calculate(float mass, float high) {
        float bmi = mass / (high * high);
        return bmi;
    }
}
