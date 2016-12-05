import java.util.List;


public class Service {
	private Integer volume;
	private Integer annee;
	
	private List<Enseignant> enseignants;
	private List<Intervention> interventions;
	
	public Service(Integer volume, Integer annee, List<Enseignant> enseignants, List<Intervention> interventions) {
		super();
		this.volume = volume;
		this.annee = annee;
		this.enseignants = enseignants;
		this.interventions = interventions;
	}
	
	public Integer getVolume() {
		return volume;
	}
	
	public Integer getAnnee() {
		return annee;
	}
	
	public List<Enseignant> getEnseignants() {
		return enseignants;
	}
	
	public List<Intervention> getInterventions() {
		return interventions;
	}
	
	public void setVolume(Integer volume) {
		this.volume = volume;
	}
	
	public void setAnnee(Integer annee) {
		this.annee = annee;
	}
	
	public void setEnseignants(List<Enseignant> enseignants) {
		this.enseignants = enseignants;
	}
	
	public void setInterventions(List<Intervention> interventions) {
		this.interventions = interventions;
	}
}
