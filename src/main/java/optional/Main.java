package optional;

import optional.city.City;
import optional.locations.*;
import optional.travelPlan.TravelPlan;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Hotel v1 = new Hotel("Hotel");
        Museum v2 = new Museum("Museum A");
        Museum v3 = new Museum("Museum B");
        Church v4 = new Church("Church A");
        Church v5 = new Church("Church B");
        Restaurant v6 = new Restaurant("Restaurant");
        v1.setDist(v2, 10);
        v1.setDist(v3, 50);
        v2.setDist(v3, 20);
        v3.setDist(v2, 20);
        v2.setDist(v4, 20);
        v2.setDist(v5, 10);
        v3.setDist(v4, 20);
        v4.setDist(v5, 30);
        v5.setDist(v4, 30);
        v4.setDist(v6, 10);
        v5.setDist(v6, 20);

        List<Location> locationList = new ArrayList<>();
        locationList.add(v1);
        v1.setOpeningTime(LocalTime.of(12,30,0));
        v1.setClosingTime(LocalTime.of(20,50,0));
        locationList.add(v2);
        v2.setOpeningTime(LocalTime.of(12,30,0));
        v2.setClosingTime(LocalTime.of(22,50,0));
        locationList.add(v3);
        v3.setOpeningTime(LocalTime.of(12,30,0));
        v3.setClosingTime(LocalTime.of(23,50,0));
        locationList.add(v4);
        v4.setOpeningTime(LocalTime.of(10,30,0));
        v4.setClosingTime(LocalTime.of(14,50,0));
        locationList.add(v5);
        v5.setOpeningTime(LocalTime.of(12,30,0));
        v5.setClosingTime(LocalTime.of(20,50,0));
        locationList.add(v6);
        v6.setOpeningTime(LocalTime.of(15,30,0));
        v6.setClosingTime(LocalTime.of(19,50,0));

        City city = new City("NewYork", locationList);

        System.out.println("The city and location list are: " + city);

        Collections.sort(locationList);
        System.out.println("The natural ordering of location list given by their names is: \n" + locationList);

        System.out.println("The cost map is: ");
        for (Location location : locationList) {
            for (Location name: location.getDist().keySet()){
                String key = name.getName();
                String value = location.getDist().get(name).toString();
                System.out.println(location.getName()+ "->" + key + "=" + value);
            }
        }

        city.IsVisitableAndNotPay();

        List<Location> preferences = new ArrayList<>();
        preferences.add(v4);
        preferences.add(v3);
        preferences.add(v1);
        preferences.add(v6);
        preferences.add(v2);
        preferences.add(v5);

        TravelPlan travel=new TravelPlan(city,preferences);

        System.out.println(travel.getVisitedCity());
        System.out.println(travel.getLocations());

    }
}