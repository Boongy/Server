import javax.swing.JFrame;


public class ServerInit {
	public static void main(String[] args) {
		Server base = new Server();
		base.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		base.startRunning();
	}
}
