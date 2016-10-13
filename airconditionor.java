package electronics;

public class airconditionor extends electronics{
private int temperature;

public int getTemperature() {
	return temperature;
}

public void setTemperature(int temperature) {
	this.temperature = temperature;
}



	
}
class splitac extends airconditionor
{
	private String autosence;
	private String swing;
	
	public String getAutosence() {
		return autosence;
	}
	public void setAutosence(String autosence) {
		this.autosence = autosence;
	}
	public String getSwing() {
		return swing;
	}
	public void setSwing(String swing) {
		this.swing = swing;
	}
	
	
}