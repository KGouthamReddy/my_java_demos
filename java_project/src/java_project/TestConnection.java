package java_project;

public class TestConnection {
	public static void main(String[] args) {
		IConnection newcon = new IConnection() {
			@Override
			public void connect(String connectDetails) {
				System.out.println("new coonnections");
			}
		};
		
		newcon.connect("productionServer");
		
		Thread t1= new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Annonymous connection");
			}
		});
		
		t1.start();
	}
}
