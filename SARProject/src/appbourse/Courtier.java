package appbourse;

import java.util.List;
import java.util.Map;

public class Courtier {

	private String nom;
	private List <Client> clients;
	private Map <Client, List<Commande>> commandesClient;
	private final int commission=0;
	private double gain;
	
	public Courtier(){
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public Map<Client, List<Commande>> getCommandesClient() {
		return commandesClient;
	}

	public void setCommandesClient(Map<Client, List<Commande>> commandesClient) {
		this.commandesClient = commandesClient;
	}

	public double getGain() {
		return gain;
	}

	public void setGain(double gain) {
		this.gain = gain;
	}

	public int getCommission() {
		return commission;
	}
}
