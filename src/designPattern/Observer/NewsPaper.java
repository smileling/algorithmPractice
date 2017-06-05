package designPattern.Observer;

public class NewsPaper extends Subject{
	private String content;
	
	public String getContect() {
		return content;
	}
	
	public void setContenct(String content) {
		this.content = content;
		notifyObservers();
	}
}
