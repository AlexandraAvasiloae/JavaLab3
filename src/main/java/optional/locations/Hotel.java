package optional.locations;

import javafx.util.Pair;
import optional.interfaces.Classifiable;
import optional.interfaces.Payable;

import java.time.LocalTime;

public class Hotel extends Location implements Classifiable, Payable {

    private String name;
    private int rank;
    private Pair<LocalTime,LocalTime> visitingTime;
    private double fee;

    public Hotel(String name, int rank, Pair<LocalTime, LocalTime> visitingTime, double fee) {
        super(name);
        this.name = name;
        this.rank = rank;
        this.visitingTime = visitingTime;
        this.fee = fee;
    }

    public Hotel(String name) {
        super(name);
        this.name = name;
    }



    @Override
    public int getRank()
    {
        return rank;
    }

    @Override
    public double getEntryFee()
    {
        return fee;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setRank(int rank) {
        this.rank = rank;
    }


    public void setVisitingTime(Pair<LocalTime, LocalTime> visitingTime) {
        this.visitingTime = visitingTime;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}