package src.by.itacademy.hw7.Task2;

public class FahrenheitConverter implements temperatureConverter {
    public double getConvertedValue(double baseValue) {
        return 1.8 * baseValue + 32;
    }
}
