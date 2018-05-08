package skillUp.skillUp3.telewizor;

public class Telewizor {

	public final int minChannel = 0;
	public final int maxChannel = 99;

	public final float minVolume = 0.0f;
	public final float maxVolume = 10.0f;

	int channel;
	float volume;
	boolean muted;

	public static void main(String[] args) {
		Telewizor telewizorek = new Telewizor();
		telewizorek.showStatus();
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public void channelUp() {
		if (channel < maxChannel)
			channel = channel + 1;
		else
			System.out.println("„brak kana³u :" + channel);
	}

	public void channelDown() {
		if (channel > minChannel)
			channel = channel - 1;
		else
			System.out.println("„brak kana³u :" + channel);

	}

	public void volumeUp() {
		volume = volume + 0.5f;
		System.out.println(prepareVolumeMessage());
	}

	public void volumeDown() {
		
		if (muted==true)
		volume = volume - 0.5f;
		System.out.println(prepareVolumeMessage());
	}

	public String prepareVolumeMessage() {
		float temporaryVolume = volume;
		String result = "";
		for (int n = 0; n < 10; ++n) {
			if (temporaryVolume >= 1) {
				result += "|";
				temporaryVolume -= 1;
			} else if (temporaryVolume >= 0.5) {
				result += "i";
				temporaryVolume -= 0.5;
			} else {
				result += ".";
			}
		}
		return result;
	}
	
	public String getStatus() {
		String status = getChannel() + "\n" + prepareVolumeMessage();
		return status;
	}
	
	public void showStatus() {
		System.out.println(getStatus());
		
	}
	public void mute() {
		muted = !muted;
	}
	
}
