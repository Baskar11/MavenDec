package classActivity.day5;

public class SmartMobile extends BasicMobile{
	public void useCam() {
		System.out.println("Camera invoked");
	}
	
	public void browseWeb() {
		System.out.println("Browser opened, enter the URL");
	}
	
	public void playMusic() {
		System.out.println("Playlist started");
	}


public static void main(String args[]) {
	SmartMobile sm = new SmartMobile();
	AndroidMobile am = new AndroidMobile();
//	sm.sendMessage();
	sm.makeCall();
	am.makeCall();
	sm.receiveCall();
	sm.useCam();
	sm.browseWeb();
	sm.playMusic();
}
}
