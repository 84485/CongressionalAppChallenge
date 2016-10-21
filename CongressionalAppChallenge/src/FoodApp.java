import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.List;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FoodApp extends JFrame {

	private JPanel contentPane;
	public int number;
	public static ArrayList<String> pantryNames = new ArrayList<String>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FoodApp frame = new FoodApp();
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
	public FoodApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblCookingAssistant = new JLabel("Cooking Assistant");
		panel.add(lblCookingAssistant);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
	}
	public static void createFile(){
		  File f = null;
	      boolean bool = false;
	      try{
	         // create new file
	         f = new File("data.txt");
	         // tries to create new file in the system
	         bool = f.createNewFile();
	      }catch(Exception e){
	         e.printStackTrace();
	      }
	}
	public static ArrayList getPantryNames(){
		pantryNames.add("test1");
		pantryNames.add("test2");
		pantryNames.add("cupcake");
		pantryNames.add("stone");
		return pantryNames;
	}

}
