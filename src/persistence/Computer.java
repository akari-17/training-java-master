import


public class Computer {

    private String name;
    protected Date date_introduced;
    private Date date_discontinued;
    private String manufacturer;

    public Computer() {
    }

    public Computer(String name, Date date_introduced, Date date_discontinued, String manufacturer) {
        this.name = name;
        this.date_introduced = date_introduced;
        this.date_discontinued = date_discontinued;
        this.manufacturer = manufacturer;
    }


}
