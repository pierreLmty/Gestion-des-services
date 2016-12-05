
public abstract class Intervention {
	private Service service;
	private String volume;
	public Intervention(Service service, String volume) {
		super();
		this.service = service;
		this.volume = volume;
	}
	public Service getService() {
		return service;
	}
	public String getVolume() {
		return volume;
	}
	public void setService(Service service) {
		this.service = service;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	
	
}
