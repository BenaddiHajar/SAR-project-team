package appbourse;

public class Commande {

	private double prix;
	private int nbActions;
	private String societe;
	private Client client; 
	private Courtier courtier; 
	private String typeCommande;
	
	public Commande(String typeCommande, String societe, Client client, int nbActions, int prixUnitaire){
		this.typeCommande = typeCommande;
		this.societe = societe;
		this.client = client;
		this.nbActions = nbActions;
		prix = prixUnitaire*nbActions;
		courtier= client.getCourtier();
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getNbActions() {
		return nbActions;
	}

	public void setNbActions(int nbActions) {
		this.nbActions = nbActions;
	}

	public String getSociete() {
		return societe;
	}

	public void setSociete(String societe) {
		this.societe = societe;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Courtier getCourtier() {
		return courtier;
	}

	public void setCourtier(Courtier courtier) {
		this.courtier = courtier;
	}

	public String getTypeCommande() {
		return typeCommande;
	}

	public void setTypeCommande(String typeCommande) {
		this.typeCommande = typeCommande;
	}

	@Override
	public String toString() {
		return "Commande [prix=" + prix + ", nbActions=" + nbActions + ", societe=" + societe + ", client=" + client
				+ ", courtier=" + courtier + ", typeCommande=" + typeCommande + "]";
	}
	
	
	
}
