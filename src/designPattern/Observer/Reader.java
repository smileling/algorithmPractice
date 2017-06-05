package designPattern.Observer;

public class Reader implements Observer {
	private String name;
	
	public void update(Subject subject) {
		System.out.println(name + "收到报纸了，报纸内容＝＝" + ((NewsPaper)subject).getContect());
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name= name;
	}
}
