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
import java.awt.Color;

public class AddIngredientFrame extends JFrame {

	private JPanel contentPane;
	private JTextField nameTextField;
	private JTextField unitTextField;
	private JTextField quantityTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		showAddIngredient(new AddIngredientFrame());
	}
	
	public static void showAddIngredient(AddIngredientFrame addIngredient) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addIngredient.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 */
	public AddIngredientFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);	
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel leftPanel = new JPanel();
		contentPane.add(leftPanel, BorderLayout.WEST);
		
		nameTextField = new JTextField();
		nameTextField.setForeground(Color.LIGHT_GRAY);
		nameTextField.setText("Name");
		leftPanel.add(nameTextField);
		nameTextField.setColumns(10);
		
		JPanel rightPanel = new JPanel();
		contentPane.add(rightPanel, BorderLayout.EAST);
		
		unitTextField = new JTextField();
		unitTextField.setForeground(Color.LIGHT_GRAY);
		unitTextField.setText("Unit");
		unitTextField.setColumns(10);
		rightPanel.add(unitTextField);
		
		JPanel centerPanel = new JPanel();
		contentPane.add(centerPanel, BorderLayout.CENTER);
		
		quantityTextField = new JTextField();
		quantityTextField.setForeground(Color.LIGHT_GRAY);
		quantityTextField.setText("Quantity");
		quantityTextField.setColumns(10);
		centerPanel.add(quantityTextField);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			Ingredient newIngredient = new Ingredient(nameTextField.getText(), unitTextField.getText(),
					new Integer(quantityTextField.getText()));
			Start.pantryIngredients.add(newIngredient);
			dispose();
			Pantry pantry = new Pantry();
			Pantry.showPantry(pantry);
			}
		});
		contentPane.add(btnAdd, BorderLayout.SOUTH);
		
	}

}
