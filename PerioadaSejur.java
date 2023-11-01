package agentie;

public class PerioadaSejur {
	private String dataInceput;
    private String dataSfarsit;

    public PerioadaSejur(String dataInceput, String dataSfarsit) {
        this.dataInceput = dataInceput;
        this.dataSfarsit = dataSfarsit;
    }

    public String getDataInceput() {
        return dataInceput;
    }

    public String getDataSfarsit() {
        return dataSfarsit;
    }
}
