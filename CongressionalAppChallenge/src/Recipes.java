import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Recipes extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recipes frame = new Recipes();
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
	public Recipes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 440, 39);
		contentPane.add(panel);
		
		JButton button_1 = new JButton("+");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hide();
				RecipesPlus reciplesPlus = new RecipesPlus();
			}
		});
		panel.add(button_1);
		
		JLabel lblRecipes = new JLabel("Recipes");
		panel.add(lblRecipes);
		
		JButton button = new JButton("-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				RecipesMinus recipeMinus = new RecipesMinus();
			}
		});
		panel.add(button);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(5, 244, 440, 29);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hide();
				Start start = new Start();
			}
		});
		contentPane.add(btnBack);
		
		JButton btnChocolateCake = new JButton("Chocolate Cake");
		btnChocolateCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hide();
				ChocoCake cake = new ChocoCake();
			}
		});
		btnChocolateCake.setBounds(155, 56, 142, 29);
		contentPane.add(btnChocolateCake);
		
		JButton btnGrandmasBrownies = new JButton("Grandma's brownies");
		btnGrandmasBrownies.setBounds(142, 97, 171, 29);
		contentPane.add(btnGrandmasBrownies);
		
		JButton btnSpaghetti = new JButton("Spaghetti");
		btnSpaghetti.setBounds(171, 138, 117, 29);
		contentPane.add(btnSpaghetti);
		setVisible(true);
	
	}

}
