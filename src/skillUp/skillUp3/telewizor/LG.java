package skillUp.skillUp3.telewizor;

import java.util.LinkedList;
import java.util.Queue;

import sun.nio.cs.HistoricallyNamedCharset;

public class LG extends Telewizor implements ILG {

	LinkedList<Integer> historyOfChannel = new LinkedList<Integer>();
	
	int historySize = 10;
	
	
	public void showhistoryOfChannel() {
		System.out.println(historyOfChannel);
	}
	
	public void setChannel(int channel) {
		super.setChannel(channel);
		addChannelToHistory(channel);
	}
	
	public void channelUp() {
		super.channelUp();
		addChannelToHistory(channel);
		
	}
	
	public void channelDown() {
		super.channelDown();
		addChannelToHistory(channel);
		
	}
	
	public void addChannelToHistory(int channel) {
		if (validateChannel(channel)) {
			historyOfChannel.add(channel);
		}
		if (historyOfChannel.size() > historySize) {
			historyOfChannel.remove();
			historyOfChannel.add(channel);
		}
	}
		
	public void printChannelsHistory() {
		System.out.println(historyOfChannel);
	}

	@Override
	public void setPreviousChannel(int historyIndex) {
		setChannel(historyOfChannel.get(historyIndex));
	}
}
