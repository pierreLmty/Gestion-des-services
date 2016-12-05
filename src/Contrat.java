import java.util.List;


public class Contrat {
	private Hour min;
	private Hour max;
	
	private List<Enseignant> enseignants;

	public Contrat(Hour min, Hour max, List<Enseignant> enseignants) {
		super();
		this.min = min;
		this.max = max;
		this.enseignants = enseignants;
	}

	public Hour getMin() {
		return min;
	}

	public Hour getMax() {
		return max;
	}

	public List<Enseignant> getEnseignants() {
		return enseignants;
	}

	public void setMin(Hour min) {
		this.min = min;
	}

	public void setMax(Hour max) {
		this.max = max;
	}

	public void setEnseignants(List<Enseignant> enseignants) {
		this.enseignants = enseignants;
	}
}
