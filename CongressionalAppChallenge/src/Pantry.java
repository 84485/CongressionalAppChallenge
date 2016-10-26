import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Pantry extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		showPantry(new Pantry());
	}
	
	public static void showPantry(Pantry pantry) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pantry.setVisible(true);
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
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		JPanel topPanel = new JPanel();
		contentPane.add(topPanel, BorderLayout.NORTH);
		
		JLabel lblPantry = new JLabel("Pantry");
		topPanel.add(lblPantry);
		
		JPanel leftPanel = new JPanel();
		contentPane.add(leftPanel, BorderLayout.WEST);
		
		JPanel rightPanel = new JPanel();
		contentPane.add(rightPanel, BorderLayout.EAST);
		
		JPanel bottomPanel = new JPanel();
		contentPane.add(bottomPanel, BorderLayout.SOUTH);
		
		JButton btnAddItem = new JButton("Add Item");
		btnAddItem.setHorizontalAlignment(SwingConstants.LEFT);
		bottomPanel.add(btnAddItem);
		setVisible(true);
		
		Start.setPantryNames("cake");
		Start.setPantryNames("pie");
		Start.setPantryNames("chocolate");
		Start.setPantryNames("glue");
		
		JLabel return_statement = new JLabel("<br>");
		//Puts all of the food labels on the left side
		ArrayList<JLabel> labels = new ArrayList<JLabel>();
		ArrayList<JButton> minusButtons = new ArrayList<JButton>();
		ArrayList<JButton> plusButtons = new ArrayList<JButton>();
		ArrayList<String> pantryNames = new ArrayList<String>();
		pantryNames = Start.getPantryNames();
		int listSize = Start.getPantryNames().size();
		
		for(int i = 0; i < listSize; i++){
			JLabel temp = new JLabel(pantryNames.get(i));
			labels.add(temp);
			leftPanel.add(temp, BorderLayout.WEST);	
			leftPanel.add(return_statement, BorderLayout.WEST);	
		}
		
		for(int i = 0; i < listSize; i++){
			
			JLabel temp = new JLabel(pantryNames.get(i));
			labels.add(temp);
			rightPanel.add(temp, BorderLayout.EAST);	
			//rightPanel.add(btnPlus, BorderLayout.EAST);
		}
		
		
	}

}
