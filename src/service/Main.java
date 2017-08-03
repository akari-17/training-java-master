public class Main {

    public static void main() {
        Computer computer1;
        Computer computer2;
        Computer computer3;
        Computer computer4;
        Computer computer5;

        List<Computers> _listComputers;

        list_Computers = new List<Computer>();

        computer1 = new Computer("c1", 01 / 07 / 2012, 01 / 08 / 2014, apple);
        computer2 = new Computer("c2", 01 / 07 / 2012, 01 / 08 / 2014, microsoft);
        computer3 = new Computer("c3", 01 / 07 / 2012, 01 / 08 / 2014, apple);
        computer4 = new Computer("c4", 01 / 07 / 2012, 01 / 08 / 2014, apple);
        computer5 = new Computer("c5", 01 / 07 / 2012, 01 / 08 / 2014, apple);

        _listComputers.add(computer1);
        _listComputers.add(computer2);
        _listComputers.add(computer3);
        _listComputers.add(computer4);
        _listComputers.add(computer5);

        listComputers(List < Computer > listComputers) {
            Iterator<Computer> it;
            it = new Iterator<Computer>;

            it = listComputers.next();
            while (it != NULL) {
                System.out.println("Computer : " + it.next().toString());
                it = it.next();
            }
            //fin de la liste des c omputer
        }

        testlistComputers() {
            Computer computer1 = new Computer("k1", 05 / 05 / 2011, 01 / 08 / 2017, apple);
            Computer computer2 = new Computer("j2", 05 / 05 / 2012, 01 / 08 / 2014, microsoft);
            Computer computer3 = new Computer("j3", 05 / 05 / 2013, 01 / 08 / 2019, apple);
            Computercomputer4 = new Computer("j4", 05 / 08 / 2014, 01 / 08 / 2015, apple);

            List<Computer> listComputers = new List<Computers>;
            listComputers.add(computer1);
            listComputers.add(computer2);
            listComputers.add(computer3);
            listComputers.add(computer4);
            listComputers.add(computer5);

            listComputers.listComputers();
        }

    }

}