
public class insulin {
	private String time;
	private int insulin;
	private int hrate;
	
	public insulin(String t, int i, int hr) {
		time = t;
		insulin = i;
		hrate = hr;
	}

	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getInsulin() {
		return insulin;
	}
	public void setInsulin(int insulin) {
		this.insulin = insulin;
	}
	public int getHrate() {
		return hrate;
	}
	public void setHrate(int hrate) {
		this.hrate = hrate;
	}	
}
