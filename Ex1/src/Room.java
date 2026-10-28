public class Room {
    private String name;
    private double area;
    private double currentTemperature;
    private double targetTemperature;
    private boolean isWindowOpen;

    public Room(String name, double area) {
        this.name = name;
        this.area = area;
        this.currentTemperature = 20.0;
        this.targetTemperature = 22.0;
        this.isWindowOpen = false;
    }

    public String getName() {
        return this.name;
    }

    public double getArea() {
        return this.area;
    }

    public double getCurrentTemperature() {
        return this.currentTemperature;
    }

    public double getTargetTemperature() {
        return this.targetTemperature;
    }

    public void setTargetTemperature(double temp) {
        this.targetTemperature = temp;
    }

    public void openWindow() {
        this.isWindowOpen = true;
    }

    public void closeWindow() {
        this.isWindowOpen = false;
    }

    public void simulateEnvironment(double externalTemp) {
        if (this.isWindowOpen) {
            double med = Math.abs(externalTemp - this.currentTemperature) / 2.0;
            if (this.currentTemperature > externalTemp) {
                this.currentTemperature = this.currentTemperature - med;
            } else {
                this.currentTemperature = this.currentTemperature + med;
            }
        } else {
            double med = Math.abs(this.targetTemperature - this.currentTemperature) / 2.0;
            if (this.currentTemperature > this.targetTemperature) {
                this.currentTemperature = this.currentTemperature - med;
            } else {
                this.currentTemperature = this.currentTemperature + med;
            }
        }
    }
}