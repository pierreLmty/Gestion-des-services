
public class InterventionDepartement extends Intervention{
	private Voeu voeu;

	public InterventionDepartement(Service service, String volume, Voeu voeu) {
		super(service, volume);
		this.voeu = voeu;
	}
	
}
