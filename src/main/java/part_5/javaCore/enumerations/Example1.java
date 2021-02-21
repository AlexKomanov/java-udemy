package part_5.javaCore.enumerations;

public class Example1 {
    public static void main(String[] args) {

        checkWeather(Weather.CLOUDY);
        checkWeather(Weather.SUNNY);
        checkWeatherWithSwitch(Weather.SNOWY);
        checkWeatherWithSwitch(Weather.RAINY);

    }

    public static void checkWeather(Weather weather) {
        if (weather == Weather.CLOUDY) {
            System.out.println("The weather is Cloudy");
        } else if (weather == Weather.SUNNY) {
            System.out.println("The weather is Sunny");
        }
    }

    public static void checkWeatherWithSwitch(Weather weather) {
        switch (weather) {
            case RAINY:
                System.out.println("The weather is Rainy");
                break;
            case SNOWY:
                System.out.println("The weather is Snowy");
                break;
        }
    }
}
