package electronics;

public class fridge extends electronics
	{
	private String basic;
	private int time;
	
	public String getBasic() {
		return basic;
	}
	public void setBasic(String basic) {
		this.basic = basic;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
		
	}
		
	class frenchdoor extends fridge
	{
		
		private int  frozencompartment;
		private int unfrozencompartment;
		
		
	public int getFrozencompartment() {
			return frozencompartment;
		}
		public void setFrozencompartment(int frozencompartment) {
			this.frozencompartment = frozencompartment;
		}
		public int getUnfrozencompartment() {
			return unfrozencompartment;
		}
		public void setUnfrozencompartment(int unfrozencompartment) {
			this.unfrozencompartment = unfrozencompartment;
		}
	
	
	}
