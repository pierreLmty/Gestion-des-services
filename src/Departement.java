import java.util.List;


public class Departement {
	private String nom;
	private List<Enseignant> enseignants;
	
	public Departement(String nom, List<Enseignant> enseignants) {
		super();
		this.nom = nom;
		this.enseignants = enseignants;
	}
	
	public String getNom() {
		return nom;
	}
	
	public List<Enseignant> getEnseignants() {
		return enseignants;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setEnseignants(List<Enseignant> enseignants) {
		this.enseignants = enseignants;
	}
	
	
}
