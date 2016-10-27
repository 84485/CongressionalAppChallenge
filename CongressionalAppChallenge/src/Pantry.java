import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.Panel;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
		
		JPanel rightPanel = new JPanel();
		contentPane.add(rightPanel, BorderLayout.EAST);
		rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
		
		JPanel bottomPanel = new JPanel();
		contentPane.add(bottomPanel, BorderLayout.SOUTH);
		
		JButton btnAddItem = new JButton("Add Item");
		btnAddItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AddIngredientFrame ingredientFrame = new AddIngredientFrame();
				AddIngredientFrame.showAddIngredient(ingredientFrame);
			}
		});
		bottomPanel.add(btnAddItem);
		
		JButton returntomenu = new JButton("Return to Main Menu");
		returntomenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Start start = new Start();
				Start.showStart(start);
			}
		});
		bottomPanel.add(returntomenu);
		
		JPanel centerPanel = new JPanel();
		contentPane.add(centerPanel, BorderLayout.CENTER);
		centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
		setVisible(true);
		
		
		//Puts all of the food labels on the left side
		ArrayList<JLabel> labels = new ArrayList<JLabel>();
		ArrayList<JButton> minusButtons = new ArrayList<JButton>();
		ArrayList<JButton> plusButtons = new ArrayList<JButton>();
		ArrayList<String> pantryNames = new ArrayList<String>();
		int listSize = Start.pantryIngredients.size();
		
		for(int i = 0; i < listSize; i++){
			JLabel temp = new JLabel(Start.pantryIngredients.get(i).getName());
			labels.add(temp);
			leftPanel.add(temp, BorderLayout.WEST);	
		}
		
		for(int i = 0; i < listSize; i++){
			JLabel temp = new JLabel(Start.pantryIngredients.get(i).getUnit());
			labels.add(temp);
			rightPanel.add(temp, BorderLayout.EAST);	
		}
		for(int i = 0; i < listSize; i++){
			JLabel temp = new JLabel(Start.pantryIngredients.get(i).getQuantity().toString());
			temp.setAlignmentX(CENTER_ALIGNMENT);
			labels.add(temp);
			centerPanel.add(temp);	
		}
		
	}

}
