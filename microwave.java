package electronics;

public class microwave extends electronics
{
	private int time;
	private int heat;
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getHeat() {
		return heat;
	}
	public void setHeat(int heat) {
		this.heat = heat;
	}
	
	
	class convectionmicrowave extends microwave
	{
		private int time1;
		private int heat;
		public int getTime1() {
			return time1;
		}
		public void setTime1(int time1) {
			this.time1 = time1;
		}
		public int getHeat() {
			return heat;
		}
		public void setHeat(int heat) {
			this.heat = heat;
		}
		
		
	}
	
}
