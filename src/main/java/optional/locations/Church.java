package optional.locations;

public class Church extends Location {

    private String name;

    /**
     * constructor
     * @param name
     */
    public Church(String name) {
        super(name);
        this.name = name;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }




}