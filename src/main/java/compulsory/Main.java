package compulsory;

import java.awt.*;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Hotel v1 = new Hotel("Hotel");
        Museum v2 = new Museum("Museum A");
        Museum v3 = new Museum("Museum B");
        Church v4 = new Church("Church A");
        Church v5 = new Church("Church B");
        Restaurant v6 = new Restaurant("Restaurant");
        v1.setCost(v2, 10);
        v1.setCost(v3, 50);
        v2.setCost(v3, 20);
        v3.setCost(v2, 20);
        v2.setCost(v4, 20);
        v2.setCost(v5, 10);
        v3.setCost(v4, 20);
        v4.setCost(v5, 30);
        v5.setCost(v4, 30);
        v4.setCost(v6, 10);
        v5.setCost(v6, 20);

        List<Location> locationList = new ArrayList<>();
        locationList.add(v1);
        locationList.add(v2);
        locationList.add(v3);
        locationList.add(v4);
        locationList.add(v5);
        locationList.add(v6);


        City city = new City("New York", locationList);

        System.out.println("The city and location list are: " + city);

        Collections.sort(locationList);
        System.out.println("The natural ordering of location list given by their names is: \n" + locationList);

        System.out.println("The cost map is: ");
        for (Location location : locationList) {
            for (Location name: location.getCost().keySet()){
                String key = name.getName();
                String value = location.getCost().get(name).toString();
                System.out.println(location.getName()+ "->" + key + "=" + value);
            }
        }


    }
}
