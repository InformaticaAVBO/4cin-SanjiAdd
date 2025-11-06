public class App {
    public static void main(String[] args) throws Exception {
        Campionato c=new Campionato("data/serie.csv");
        System.out.println(c);
        System.out.println(c.getSquadraByName("Juventus"));
    }
}
