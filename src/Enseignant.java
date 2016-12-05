import java.util.List;


public class Enseignant {
	private String nom;
	private String prenom;
	private String statut;
	
	private Departement departements;
	private Contrat contrat;
	private List<Service> services;

	public Enseignant(String nom, String prenom, String statut,
			Departement departements, Contrat contrat, List<Service> services) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.statut = statut;
		this.departements = departements;
		this.contrat = contrat;
		this.services = services;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getStatut() {
		return statut;
	}

	public Departement getDepartements() {
		return departements;
	}

	public Contrat getContrat() {
		return contrat;
	}

	public List<Service> getServices() {
		return services;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public void setDepartements(Departement departements) {
		this.departements = departements;
	}

	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}
}
