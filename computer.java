package electronics;
 



public class computer extends electronics
{
	private String cpu;
	private int harddisk;
	
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public int getHarddisk() {
		return harddisk;
	}
	public void setHarddisk(int harddisk) {
		this.harddisk = harddisk;
	}
		
	}

 class laptop extends computer
{
	private int batterylife;
	private int convertable;
	
	public int getBatterylife() {
		return batterylife;
	}
	public void setBatterylife(int batterylife) {
		this.batterylife = batterylife;
	}
	public int getConvertable() {
		return convertable;
	}
	public void setConvertable(int convertable) {
		this.convertable = convertable;
	}
	
	
	
}
	