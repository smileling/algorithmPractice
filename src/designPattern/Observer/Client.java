package designPattern.Observer;

public class Client {

	public static void main(String[] args) {
		NewsPaper subject = new NewsPaper();
		Reader reader1 = new Reader();
		reader1.setName("张三");
		
		Reader reader2 = new Reader();
		reader2.setName("李四");
		
		Reader reader3 = new Reader();
		reader3.setName("王五");
		
		subject.attach(reader1);
		subject.attach(reader2);
		subject.attach(reader3);
		
		subject.setContenct("本期内容是观察者模式");
		
		subject.detach(reader1);
		
		subject.setContenct("本期内容是观察者模式2");
	}

}
