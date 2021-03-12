package optional.locations;

import javafx.util.Pair;
import optional.interfaces.Classifiable;
import optional.locations.Location;

import java.time.LocalTime;

public class Restaurant extends Location implements Classifiable {
    private Pair<LocalTime,LocalTime> visitingTime;
    private String name;
    private int rank;


    public Restaurant(String name, Pair<LocalTime, LocalTime> visitingTime, int rank) {
        super(name);
        this.visitingTime = visitingTime;
        this.name = name;
        this.rank = rank;
    }

    public Restaurant(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public int getRank() {
        return rank;
    }

    @Override
    public String getName() {
        return name;
    }


    public void setVisitingTime(Pair<LocalTime, LocalTime> visitingTime) {
        this.visitingTime = visitingTime;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}