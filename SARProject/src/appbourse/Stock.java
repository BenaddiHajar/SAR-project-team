package appbourse;

public class Stock {

	private String societe; 
	private double prix; 
	private int nbFlottantes;
	private int totalAction;
	private int demandeAchat;
	private int demandeVente;
	
	public Stock(int totalAction, String societe, double prix){
		this.societe = societe;
		this.totalAction = totalAction;
		this.prix = prix;
		nbFlottantes = totalAction;
		demandeAchat=0;
		demandeVente=0;
	}
	
	public double deltaPrix(){
		
		double delta = (demandeAchat - demandeVente)/totalAction;
		return delta;
	}
	
	public void nouveauPrix(){
		
		prix = prix*(1+ deltaPrix());
	}

	public String getSociete() {
		return societe;
	}

	public void setSociete(String societe) {
		this.societe = societe;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getNbFlottantes() {
		return nbFlottantes;
	}

	public void setNbFlottantes(int nbFlottantes) {
		this.nbFlottantes = nbFlottantes;
	}

	public int getTotalAction() {
		return totalAction;
	}

	public void setTotalAction(int totalAction) {
		this.totalAction = totalAction;
	}

	public int getDemandeAchat() {
		return demandeAchat;
	}

	public void setDemandeAchat(int demandeAchat) {
		this.demandeAchat = demandeAchat;
	}

	public int getDemandeVente() {
		return demandeVente;
	}

	public void setDemandeVente(int demandeVente) {
		this.demandeVente = demandeVente;
	}

	@Override
	public String toString() {
		return "Stock [societe=" + societe + ", prix=" + prix + ", nbFlottantes=" + nbFlottantes + ", totalAction="
				+ totalAction + ", demandeAchat=" + demandeAchat + ", demandeVente=" + demandeVente + "]";
	}
	
	
}
