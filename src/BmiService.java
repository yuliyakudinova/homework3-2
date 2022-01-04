public class BmiService {
    float mass;
    float high;
    float bmi;
    public float calculate(float mass, float high) {
        bmi = mass / (high * high);
        return bmi;
    }
}
