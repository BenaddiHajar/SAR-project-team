package appbourse;

import java.util.List;
import java.util.Map;

public class Client {

	private String nom; 
	private Courtier courtier;
	private Map <String,Integer> portefeuille;
	private double disponibilite;
	private List <Commande> commandes;
	
	public Client(){
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Courtier getCourtier() {
		return courtier;
	}

	public void setCourtier(Courtier courtier) {
		this.courtier = courtier;
	}

	public Map<String, Integer> getPortefeuille() {
		return portefeuille;
	}

	public void setPortefeuille(Map<String, Integer> portefeuille) {
		this.portefeuille = portefeuille;
	}

	public double getDisponibilite() {
		return disponibilite;
	}

	public void setDisponibilite(double disponibilite) {
		this.disponibilite = disponibilite;
	}

	public List<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}
	
}
