package file.java.Weather;

public class WeatherRunner {

    public static void main(String[] args) {
        Weather weather = new Weather();
        Climate climate = new Climate(weather);
        climate.temperature();
    }
}
