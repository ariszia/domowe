package skillUp.skillUp3.telewizor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import sun.nio.cs.HistoricallyNamedCharset;

public class Telewizor {

	List<Integer> favoriteChannelTop10List = new ArrayList<Integer>(10);
	Set<Integer> favoriteChannelSet = new HashSet<Integer>();

	public Telewizor() {
		favoriteChannelTop10List.add(0);
		favoriteChannelTop10List.add(0);
		favoriteChannelTop10List.add(0);
		favoriteChannelTop10List.add(0);
		favoriteChannelTop10List.add(0);
		favoriteChannelTop10List.add(0);
		favoriteChannelTop10List.add(0);
		favoriteChannelTop10List.add(0);
		favoriteChannelTop10List.add(0);
		favoriteChannelTop10List.add(0);
	
	}
	
	public int minChannel = 0;
	public int maxChannel = 99;

	public float minVolume = 0.0f;
	public float maxVolume = 10.0f;

	int channel;
	float volume;
	float volumeStep = 0.5f;
	boolean muted;


	public static void main(String[] args) {

		Telewizor telewizorek = new Telewizor();

		telewizorek.setChannel(15);
		telewizorek.volumeUp(5);
		telewizorek.volumeDown(-1);
		telewizorek.showStatus();
		telewizorek.mute();

		// Top 10 List
		System.out.println("Favorite Top 10 List");
		telewizorek.addToFavoriteTop10(4, 2);
		telewizorek.printFavoriteTop10Channels();

		// Favorite List
		System.out.println("Favorite Infinite List");
		telewizorek.addToFavoriteChannels(5);
		telewizorek.addToFavoriteChannels(5);
		telewizorek.addToFavoriteChannels(10);
		telewizorek.printFavoriteChannels();
		
		LG log = new LG();
		log.setChannel(5);
		log.channelUp();
		log.channelUp();
		log.channelDown();
		log.showStatus();
		
		log.setPreviousChannel(1);
		log.showhistoryOfChannel();

	}

	public boolean validateChannel(int channel) {
		if (channel < maxChannel && channel > minChannel)
			return true;

		else {
			System.out.println("„brak kanalu :" + channel);
			return false;
		}
	}

	public void addToFavoriteChannels(int channel) {
		if (validateChannel(channel))
			favoriteChannelSet.add(channel);
	}

	public void printFavoriteChannels() {
		System.out.println(favoriteChannelSet);
	}

	public void addToFavoriteTop10(int channel, int nrOnTheFavoriteTop10List) {
		if (validateChannel(channel))
			favoriteChannelTop10List.set(nrOnTheFavoriteTop10List, channel);
	}

	public void printFavoriteTop10Channels() {
		System.out.println(favoriteChannelTop10List);
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		if (validateChannel(channel))
			this.channel = channel;
	}

	public void channelUp() {
		if (channel < maxChannel)
			channel = channel + 1;
		else
			System.out.println("„brak kanalu :" + channel);
	}

	public void channelDown() {
		if (channel > minChannel)
			channel = channel - 1;
		else
			System.out.println("„brak kanalu :" + channel);
	}

	public void volumeUp(float up) {
		if (muted) {
			muted = false;
		}
		if (up > maxVolume) {
			up = maxVolume;
		}
		while (volume < up) {
			volume = volume + volumeStep;
			System.out.println(prepareVolumeMessage());
		}
	}

	public void volumeDown(float down) {
		if (muted) {
			muted = false;
		}
		if (down < minVolume) {
			down = minVolume;
		}

		while (volume > down) {
			volume = volume - volumeStep;
			System.out.println(prepareVolumeMessage());
		}

	}

	public String prepareVolumeMessage() {
		float temporaryVolume = volume;
		String result = "";

		if (muted) {
			return "Poziom g³oœnoœci X";
		}
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
		System.out.println(prepareVolumeMessage());
	}
}
