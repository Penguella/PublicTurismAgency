package agentie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AgentieTurism {
	 private List<Statiune> statiuni;
	    private List<Client> clienti;

	    public AgentieTurism() {
	        statiuni = new ArrayList<>();
	        clienti = new ArrayList<>();
	    }

	    public void introducereDate(String numeStatiune, List<PerioadaSejur> perioadeStatiune1) {
	        Statiune statiune = new Statiune(numeStatiune);
	        for (PerioadaSejur perioada : perioadeStatiune1) {
	            statiune.adaugaPerioada(perioada);
	        }
	        statiuni.add(statiune);
	    }

//sortare alfabetica a statiunilor
	    public void afisareStatiuniSortate() {
	        Collections.sort(statiuni, (s1, s2) -> s1.getNume().compareTo(s2.getNume()));
	        for (Statiune statiune : statiuni) {
	            System.out.println(statiune.getNume());
	        }
	    }

	    public void adaugareStatiuneCuPerioade(String numeStatiune, PerioadaSejur perioada) {
	        for (Statiune statiune : statiuni) {
	            if (statiune.getNume().equals(numeStatiune)) {
	                statiune.adaugaPerioada(perioada);
	            }
	        }
	    }
	    
	    public List<Statiune> getStatiuni() {
	        return statiuni;
	    }

	    public void afisareStatiuniCuPerioadeInPerioada(String dataInceput, String dataSfarsit) {
	        for (Statiune statiune : statiuni) {
	            for (PerioadaSejur perioada : statiune.getPerioade()) {
	                if (dataInceput.compareTo(perioada.getDataInceput()) <= 0 && dataSfarsit.compareTo(perioada.getDataSfarsit()) >= 0) {
	                    System.out.println(statiune.getNume());
	                    break; // Ieșire din bucla internă dacă găsim o potrivire
	                }
	            }
	        }
	    }
	    //fct. pentru adaugare si afisare clienti
	    public void adaugaClient(Client client) {
	        clienti.add(client);
	    }

	    public List<Client> getClienti() {
	        return clienti;
	    }
	    }
