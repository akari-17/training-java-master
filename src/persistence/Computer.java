
public class Computer {

    private String name;
    private Date date_introduced;
    private Date date_discontinued;
    private Company company;

    public Computer() {
    }

    public Computer(String name, Date date_introduced, Date date_discontinued, String manufacturer) {
        this.name = name;
        this.date_introduced = date_introduced;
        this.date_discontinued = date_discontinued;
        this.company = new Company();
    }

    public toString() {
        System.out.println("Computer : " + name + " , "
                + date_introduced.toString() + " , "
                + date_discontinued.toString() + " , " +
                + Company.toString());
    }

    public test_méthod_To_String() {
        Computer c1 = new Computer("j1",
                01/08/2013, 01/05/2017, "apple");
        c1.toString();
    }


}
