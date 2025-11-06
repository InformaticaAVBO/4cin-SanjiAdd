import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Campionato{
    Squadra[]elenco;

    public Campionato(String fname) throws FileNotFoundException{
        elenco=new Squadra[20]; 
        File file=new File(fname);
        Scanner leggi =new Scanner(file);
        int i=0;
        while(leggi.hasNextLine()){
            String linea=leggi.nextLine();
            String[] ss=linea.split(";");
            elenco[i] = new Squadra(ss[0], Integer.parseInt(ss[1]), Integer.parseInt(ss[2]), Integer.parseInt(ss[3]), Integer.parseInt(ss[4]), Integer.parseInt(ss[5]));
            if(++i>=20) break;
        }
        leggi.close();
    }
    public Squadra getSquadra(int i){
        return elenco[i];
    }

    public Squadra getSquadraByName(String nome){
        for (Squadra s : elenco) {
            if (s.getNome().equals(nome)) {
                return s;
            }
        }
        return null;
    }
}