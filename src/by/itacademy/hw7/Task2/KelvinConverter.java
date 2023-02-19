package src.by.itacademy.hw7.Task2;

public class KelvinConverter implements temperatureConverter {
    public double getConvertedValue(double baseValue) {
        return baseValue + 273.15;
    }
}
