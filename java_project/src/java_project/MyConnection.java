package java_project;

public class MyConnection implements IConnection{
	@Override
	public void connect(String connectionDetails) {
		System.out.println("Successfully established conncetions");
	}
}
