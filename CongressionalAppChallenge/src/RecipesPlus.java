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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RecipesPlus extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldName;
	private JLabel lblRecipeIngredients;
	private JTextField textFieldIngred;
	private JTextField textFieldIngred2;

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
		
		comboBoxIngred.addItem("Cup");
		comboBoxIngred.addItem("Teaspoon");
		comboBoxIngred.addItem("Tablespoon");
		comboBoxIngred.addItem("Pint");
		comboBoxIngred.addItem("Pound");
		comboBoxIngred.addItem("Quart");
		comboBoxIngred.addItem("Gallon");
		comboBoxIngred.addItem("Kilogram");
		comboBoxIngred.addItem("Mililiter");
		comboBoxIngred.addItem("Fluid Ounce");
		
		comboBoxIngred.setBounds(320, 94, 114, 27);
		panel.add(comboBoxIngred);
		
		textFieldIngred = new JTextField();
		textFieldIngred.setBounds(6, 92, 198, 28);
		panel.add(textFieldIngred);
		textFieldIngred.setColumns(10);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Recipes recipe = new Recipes();
			}
		});
		btnBack.setBounds(6, 233, 117, 29);
		panel.add(btnBack);
		
		JComboBox comboBoxAmt = new JComboBox();
		
		
		comboBoxAmt.addItem("1");
		comboBoxAmt.addItem("2");
		comboBoxAmt.addItem("3");
		comboBoxAmt.addItem("4");
		comboBoxAmt.addItem("1/2");
		comboBoxAmt.addItem("1/4");
		comboBoxAmt.addItem("1/8");

		
		comboBoxAmt.setBounds(210, 94, 109, 27);
		panel.add(comboBoxAmt);
		
		textFieldIngred2 = new JTextField();
		textFieldIngred2.setBounds(6, 132, 198, 28);
		panel.add(textFieldIngred2);
		textFieldIngred2.setColumns(10);
		
		JComboBox comboBoxAmt2 = new JComboBox();
		
		comboBoxAmt2.addItem("1");
		comboBoxAmt2.addItem("2");
		comboBoxAmt2.addItem("3");
		comboBoxAmt2.addItem("4");
		comboBoxAmt2.addItem("1/2");
		comboBoxAmt2.addItem("1/4");
		comboBoxAmt2.addItem("1/8");

		
		comboBoxAmt2.setBounds(210, 134, 109, 27);
		panel.add(comboBoxAmt2);
		
		JComboBox comboBoxIngred2 = new JComboBox();
		
		comboBoxIngred2.addItem("Cup");
		comboBoxIngred2.addItem("Teaspoon");
		comboBoxIngred2.addItem("Tablespoon");
		comboBoxIngred2.addItem("Pint");
		comboBoxIngred2.addItem("Pound");
		comboBoxIngred2.addItem("Quart");
		comboBoxIngred2.addItem("Gallon");
		comboBoxIngred2.addItem("Kilogram");
		comboBoxIngred2.addItem("Mililiter");
		comboBoxIngred2.addItem("Fluid Ounce");
		
		
		comboBoxIngred2.setBounds(320, 134, 114, 27);
		panel.add(comboBoxIngred2);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnSave.setBounds(320, 233, 117, 29);
		panel.add(btnSave);
		
		JButton btnMore = new JButton("More?");
		btnMore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnMore.setBounds(6, 172, 117, 29);
		panel.add(btnMore);
		setVisible(true);
		
		
		
	}
}
