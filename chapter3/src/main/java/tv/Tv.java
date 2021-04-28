package tv;

public class Tv {

	private int channel;	// 1~255	
	private int volume;		// 0~100
	private boolean power;

	public Tv() {
		// TODO Auto-generated constructor stub
	}
	
	public Tv(int channel, int volume, boolean power) {
		super();
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public void power(boolean on) {
		this.power = on;
	}

	public void channel(boolean up) {
		if (up == true) {
			this.channel++;
			if (channel>255) {
				this.channel=0;
			}
		}
	}

	public void channel(int channel) {
		this.channel = channel;
	}

	public void volume(boolean up) {
		if (up == true) {
			volume++;
			if (volume > 100) {
				volume = 1;
			}
		}else {
			if (volume > 100) {
				volume = 1;
			}
			return;
		}
	}

	public void volume(int volume) {
		if (volume > 100) {
			volume = 1;
		}
		this.volume=volume;

	}
	
	public void status() {
		System.out.println("TV[power="+power+"," + "channel=" + channel + ", volume="+volume+"]");
	}
}
