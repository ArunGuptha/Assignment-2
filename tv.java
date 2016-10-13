package electronics;

import electronics.tv;


public class tv extends electronics

	{
		private String  brandname ;
		private	String remoteaccess;
		
		
		public String getBrandname() {
			return brandname;
		}
		public void setBrandname(String brandname) {
			this.brandname = brandname;
		}
		public String getRemoteaccess() {
			return remoteaccess;
		}
		public void setRemoteaccess(String remoteaccess) {
			this.remoteaccess = remoteaccess;
		}
		}
class plasmatv  extends tv
{
	private int displayquality;
	private String connectivity;
	
	public int getDisplayquality() {
		return displayquality;
	}
	public void setDisplayquality(int displayquality) {
		this.displayquality = displayquality;
	}
	public String getConnectivity() {
		return connectivity;
	}
	public void setConnectivity(String connectivity) {
		this.connectivity = connectivity;
	}

	
	
	}
	
