import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class RecipesPlus extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldName;
	private JLabel lblRecipeIngredients;
	private JTextField textFieldIngred;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecipesPlus frame = new RecipesPlus();
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
	public RecipesPlus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblRecipeName = new JLabel("Recipe Name");
		lblRecipeName.setBounds(169, 6, 114, 16);
		panel.add(lblRecipeName);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(6, 26, 428, 28);
		panel.add(textFieldName);
		textFieldName.setColumns(10);
		
		lblRecipeIngredients = new JLabel("Recipe Ingredient's");
		lblRecipeIngredients.setBounds(156, 66, 137, 16);
		panel.add(lblRecipeIngredients);
		
		JComboBox comboBoxIngred = new JComboBox();
		comboBoxIngred.setBounds(282, 94, 152, 27);
		panel.add(comboBoxIngred);
		
		textFieldIngred = new JTextField();
		textFieldIngred.setBounds(6, 92, 277, 28);
		panel.add(textFieldIngred);
		textFieldIngred.setColumns(10);
		setVisible(true);
		
		
		
	}
}
