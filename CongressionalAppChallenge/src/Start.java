import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Start extends JFrame {

	private JPanel contentPane;
	public int number;
	public static ArrayList<Ingredient> pantryIngredients = new ArrayList<Ingredient>();
	/**
	 * Launch the application.
	 */
	public static void showStart(Start start) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					start.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

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
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblCookingAssistant = new JLabel("Cooking Assistant");
		panel.add(lblCookingAssistant);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		panel_1.add(btnExit);
		
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

}
