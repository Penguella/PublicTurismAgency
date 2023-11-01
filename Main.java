package agentie;


//TODO: codul pentru clienti, ca momentan nu e prea ok 
//TODO: scanner pentru citirea inputului de la tastatura (ex. 1 pt adaugare perioada, 2 pt adaugare statiune s.a.m.d)(?)
//TODO: stocarea datelor (?)
//TODO: interfete separate pt lucrul cu statiunea si lucrul cu clientul (?)



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//importuri pt xml (ramane de vazut la care raman, la xml sau MySQL+phpMyAdmin)
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import java.io.File;
import java.io.IOException;
import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
	    AgentieTurism agentie = new AgentieTurism();
//adaugam manual 3 statiuni si 4 perioade
	    List<PerioadaSejur> perioadeStatiune1 = new ArrayList<>();
	    perioadeStatiune1.add(new PerioadaSejur("2023-07-01", "2023-07-15"));
	    agentie.introducereDate("Predeal", perioadeStatiune1);

	    List<PerioadaSejur> perioadeStatiune2 = new ArrayList<>();
	    perioadeStatiune2.add(new PerioadaSejur("2023-08-01", "2023-08-15"));
	    agentie.introducereDate("Sinaia", perioadeStatiune2);

	    List<PerioadaSejur> perioadeStatiune3 = new ArrayList<>();
	    perioadeStatiune3.add(new PerioadaSejur("2023-08-01", "2023-08-15"));
	    agentie.introducereDate("Antalya", perioadeStatiune3);
	    
	    //nu o sa las sysout-urile astea asa
	    System.out.println("Statiuni ordonate alfabetic:");
	    agentie.afisareStatiuniSortate();

	    PerioadaSejur perioadaAdaugata = new PerioadaSejur("2023-08-01", "2023-08-15");
	    agentie.adaugareStatiuneCuPerioade("Sinaia", perioadaAdaugata);
	    
        System.out.println("Statiuni cu sejur in perioada 1-15 august:");
	    agentie.afisareStatiuniCuPerioadeInPerioada("2023-08-01", "2023-08-15");

	    // Afișați perioadele pentru fiecare stațiune
	    for (Statiune statiune : agentie.getStatiuni()) {
	        System.out.println("Perioade pentru " + statiune.getNume() + ":");
	        for (PerioadaSejur perioada : statiune.getPerioade()) {
	            System.out.println("Perioada: " + perioada.getDataInceput() + " - " + perioada.getDataSfarsit());
	        }
	    }

	}
}
