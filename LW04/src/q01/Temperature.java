package q01;

public class Temperature {
    private double celsius;

    public Temperature() {
        this.celsius=0;
    }
    public Temperature(double celsius){
        this.celsius=celsius;
    }
    public double toFahrenheit(){
        return celsius * 9 / 5 + 32;
    }
    public double toCelsius(){
        return celsius;
    }
    public void setFahrenheit(double fahrenheit){
        celsius =(fahrenheit - 32)* 5 /9;
    }
    public void setCelcius(double celsius){
        this.celsius = celsius;
    }
}
