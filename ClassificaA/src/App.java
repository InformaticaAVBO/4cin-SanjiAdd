public class App {
    public static void main(String[] args) throws Exception {
        Campionato c=new Campionato("data/serie.csv");
        System.out.println(c.getSquadra(1));
        System.out.println(c.getSquadraByName("Juventus"));
        System.out.println("-------------------------------------------------------------");
        c.stampaSquadre();
        System.out.println("-------------------------------------------------------------");
        System.out.println("numero totale di punti: " + c.calcolaPunti());
    }
}
