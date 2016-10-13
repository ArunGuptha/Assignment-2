package electronics;

public class mobiles extends electronics{

	private String connectivity;
	private int Bstandby;
	public String getConnectivity() {
		return connectivity;
	}
	public void setConnectivity(String connectivity) {
		this.connectivity = connectivity;
	}
	public int getBstandby() {
		return Bstandby;
	}
	public void setBstandby(int bstandby) {
		Bstandby = bstandby;
	}
	
	
}
class smartmobile extends mobiles
{
	private String Screentype;
	private int screensize;
	public String getScreentype() {
		return Screentype;
	}
	public void setScreentype(String screentype) {
		Screentype = screentype;
	}
	public int getScreensize() {
		return screensize;
	}
	public void setScreensize(int screensize) {
		this.screensize = screensize;
	}
	
	
}
