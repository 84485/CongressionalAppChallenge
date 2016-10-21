import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Pantry extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantry frame = new Pantry();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Pantry() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);	
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPantry = new JLabel("Pantry");
		lblPantry.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblPantry, BorderLayout.NORTH);
		
		ArrayList<JLabel> labels = new ArrayList<JLabel>();
		for(int i = 0; i < FoodApp.getPantryNames().size(); i++){
			JLabel temp = new JLabel((String) FoodApp.getPantryNames().get(i));
			labels.add(temp);
			contentPane.add(temp, BorderLayout.WEST);
		}
		
	}

}
