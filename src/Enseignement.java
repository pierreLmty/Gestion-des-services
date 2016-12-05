
public class Enseignement {
	private Voeu voeux;
	
	private Hour volume;
	private TypeEnseignement type;
	
	public Enseignement(Voeu voeux, Hour volume, TypeEnseignement type) {
		super();
		this.voeux = voeux;
		this.volume = volume;
		this.type = type;
	}

	public Voeu getVoeux() {
		return voeux;
	}

	public Hour getVolume() {
		return volume;
	}

	public TypeEnseignement getType() {
		return type;
	}

	public void setVoeux(Voeu voeux) {
		this.voeux = voeux;
	}

	public void setVolume(Hour volume) {
		this.volume = volume;
	}

	public void setType(TypeEnseignement type) {
		this.type = type;
	}
}
