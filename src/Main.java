import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {

	private static final long serialVersionUID = -4788865354490698806L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,Config.WINDOW_WIDTH,Config.WINDOW_HEIGHT);
		contentPane = new Game();
		setContentPane(contentPane);
	}

}
