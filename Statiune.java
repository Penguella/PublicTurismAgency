package agentie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Statiune {
	private String nume;
    private List<PerioadaSejur> perioade;


    public Statiune(String nume) {
        this.nume = nume;
        this.perioade = new ArrayList<>(); // Inițializare listă
    }

    public void adaugaPerioada(PerioadaSejur perioada) {
        perioade.add(perioada);
    }

    public void afisarePerioade() {
        Collections.sort(perioade, (p1, p2) -> p1.getDataInceput().compareTo(p2.getDataInceput()));
        for (PerioadaSejur perioada : perioade) {
            System.out.println("Perioada: " + perioada.getDataInceput() + " - " + perioada.getDataSfarsit());
        }
    }

    public String getNume() {
        return nume;
    }

    public List<PerioadaSejur> getPerioade() {
        return perioade;
    }

}
