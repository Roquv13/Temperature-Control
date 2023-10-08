public class TemperatureManual {
    private double temperature;
    public TemperatureManual(double initialTemperature) {
        this.temperature = initialTemperature;
    }

    public double getTemperature() {
        return this.temperature;
    }

    public void setTemperature(double value) {
        this.temperature = value;
    }
}

