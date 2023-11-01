package agentie;


public class Client {
	 private String nume;
	    private String serieCi;
	    private String numarCi;
	    private String adresa;
	    private String telefon;
	    private PerioadaSejur perioadaDorita;
	    private Statiune statiuneDorita;

	    public Client(String nume, String serieCi, String numarCi,String adresa, String telefon, PerioadaSejur perioadaDorita, Statiune statiuneDorita) {
	        this.nume = nume;
	        this.serieCi = serieCi;
	        this.numarCi = numarCi;
	        this.adresa = adresa;
	        this.telefon = telefon;
	        this.perioadaDorita = perioadaDorita;
	        this.statiuneDorita = statiuneDorita;
	    }

	    public PerioadaSejur getPerioadaDorita() {
	        return perioadaDorita;
	    }

	    public Statiune getStatiuneDorita() {
	        return statiuneDorita;
	    }
}
