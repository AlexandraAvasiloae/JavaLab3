package optional.locations;

import javafx.util.Pair;
import optional.interfaces.Payable;
import optional.locations.Location;

import java.time.LocalTime;

public class Museum extends Location implements Payable {

    private String name;
    private double fee;
    private Pair<LocalTime,LocalTime> visitingTime;

    /**
     * constructor
     * @param name
     * @param fee
     * @param visitingTime
     */
    public Museum(String name,  double fee, Pair<LocalTime, LocalTime> visitingTime) {
        super(name);
        this.name = name;
        this.fee = fee;
        this.visitingTime = visitingTime;
    }

    /**
     * constructor
     * @param name
     */
    public Museum(String name) {
        super(name);
        this.name = name;
    }


    @Override
    public String getName() {
        return name;
    }

    public double getEntryFee() {
        return fee;
    }



    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public void setVisitingTime(Pair<LocalTime, LocalTime> visitingTime) {
        this.visitingTime = visitingTime;
    }
}