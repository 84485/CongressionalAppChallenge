import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Start extends JFrame {

	private JPanel contentPane;
	public int number;
	
	//these hold the three characteristics of an ingredient: the name, the unit, and the number that the user has
	//these should be indexed identically.
	public static ArrayList<String> pantryNames = new ArrayList<String>();
	public static ArrayList<String> pantryUnits = new ArrayList<String>();
	public static ArrayList<Integer> pantryNumber = new ArrayList<Integer>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start frame = new Start();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		//Testing
		
		pantryUnits.add("lbs");
		pantryUnits.add("g");
		pantryUnits.add("tons");
		pantryUnits.add("cups");
		pantryNumber.add(1);
		pantryNumber.add(5);
		pantryNumber.add(200);
		pantryNumber.add(40);
	}

	/**
	 * Create the frame.
	 */
	public Start() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		createFile();
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblCookingAssistant = new JLabel("Cooking Assistant");
		panel.add(lblCookingAssistant);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("Schedule");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Schedule schedule = new Schedule();
			}
		});
		
		JButton button = new JButton("Shopping List");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ShoppingList shopping = new ShoppingList();
			}
		});
		panel_2.add(button);
		
		JButton btnPantry = new JButton("Pantry");
		btnPantry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Pantry pantry = new Pantry();
				Pantry.showPantry(pantry);
				
			}
			
		});
		panel_2.add(btnPantry);
		panel_2.add(btnNewButton);
		
		JButton btnRecipes = new JButton("Recipes");
		btnRecipes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Recipes recipe = new Recipes();
			}
			
		});
		panel_2.add(btnRecipes);
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
	public static ArrayList<String> getPantryNames(){
		
		return pantryNames;
	}
	public static void setPantryNames(String input){
		pantryNames.add(input);
	}
	public static ArrayList getPantryUnits(){
		
		return pantryUnits;
	}
	public static ArrayList getPantryNumber(){
		
		return pantryNumber;
	}
}
