import open_weather.CityOwResponse;
import services.WeatherService;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        boolean isRunning = true;
        boolean isFirstRun = true;

        while(isRunning) {
            if (isFirstRun) {
                System.out.println("----------------------\nWELCOME!\ntype X to quit\ntype Y to get a weather stats\n----------------------\n");
                isFirstRun = false;
            }

            Scanner sc = new Scanner(System.in);
            switch (sc.nextLine()) {
                case "X":
                    isRunning = false;
                    break;
                case "Y":
                    CityOwResponse weatherFromOpenWeather = (new WeatherService()).getWeatherFromOpenWeather();
                    System.out.println("City name: " + weatherFromOpenWeather.getName());
                    break;
                default:
                    System.out.println("ERROR!!! INVALID INPUT");
            }
        }

    }
}
