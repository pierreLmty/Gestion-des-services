import java.util.List;


public class Voeu extends Demande {
	private Enseignement enseignement;
	private List<InterventionDepartement> interventionsDepartement;
	
	public Voeu(Enseignement enseignement,List<InterventionDepartement> interventionsDepartement) {
		super();
		this.enseignement = enseignement;
		this.interventionsDepartement = interventionsDepartement;
	}
	
	@Override
	public boolean publie() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Hour heures() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Enseignement getEnseignement() {
		return enseignement;
	}
	
	public List<InterventionDepartement> getInterventionsDepartement() {
		return interventionsDepartement;
	}
	
	public void setEnseignement(Enseignement enseignement) {
		this.enseignement = enseignement;
	}
	
	public void setInterventionsDepartement(
			List<InterventionDepartement> interventionsDepartement) {
		this.interventionsDepartement = interventionsDepartement;
	}
}
