public class Squadra {
    private String nome;
    private int partite, vinte, pareggiate, perse, punti;

    public Squadra(String nome, int partite, int vinte, int pareggiate, int perse, int punti) {
        this.nome = nome;
        this.partite = partite;
        this.vinte = vinte;
        this.pareggiate = pareggiate;
        this.perse = perse;
        this.punti = punti;
    }

    public String getNome() {
        return nome;
    }
    public int getPunti() {
    return punti;
}

    @Override
    public String toString() {
        return "nome= " + nome + ", partite= " + partite + ", vinte= " + vinte +
               ", pareggiate= " + pareggiate + ", perse= " + perse + ", punti= " + punti;
    }
}