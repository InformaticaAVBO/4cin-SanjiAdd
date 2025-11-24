
public class App {
    public static void main(String[] args) throws Exception {
        Vettore<Persona> elenco = new Vettore<>(1, 5);
        elenco.add( new Persona("kazi", "umaki"));
        elenco.add( new Persona("Mario", "Rossi"));
        System.out.println(elenco);

        Coppia<String, Persona> p = new Coppia<>("Prof", new Persona("Sanji", "Adduwa"));
        Coppia<String, Persona> q = new Coppia<>("Comandante", new Persona("Giacomo", "Fari"));
        System.out.println(p);
        System.out.println("Primo: " + q.getPrimo());
        System.out.println("Secondo: " + q.getSecondo());


       
    }
}