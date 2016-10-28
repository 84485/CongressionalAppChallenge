import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RecipesMinus extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecipesMinus frame = new RecipesMinus();
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
	public RecipesMinus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRecipes = new JLabel("Recipes");
		lblRecipes.setBounds(6, 6, 61, 16);
		contentPane.add(lblRecipes);
		
		JLabel lblChocolateCake = new JLabel("Chocolate Cake");
		lblChocolateCake.setBounds(6, 63, 98, 16);
		contentPane.add(lblChocolateCake);
		
		JButton button = new JButton("-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblChocolateCake.hide();
				button.hide();
			}
		});
		button.setBounds(400, 58, 44, 29);
		contentPane.add(button);
		
		JLabel lblGrandmasBrownies = new JLabel("Grandma's brownies");
		lblGrandmasBrownies.setBounds(6, 91, 141, 16);
		contentPane.add(lblGrandmasBrownies);
		
		JButton button_1 = new JButton("-");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblGrandmasBrownies.hide();
				button_1.hide();
			}
		});
		button_1.setBounds(400, 86, 44, 29);
		contentPane.add(button_1);
		
		JLabel lblSpaghetti = new JLabel("Spaghetti");
		lblSpaghetti.setBounds(6, 119, 61, 16);
		contentPane.add(lblSpaghetti);
		
		JButton button_2 = new JButton("-");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblSpaghetti.hide();
				button_2.hide();
			}
		});
		button_2.setBounds(400, 114, 44, 29);
		contentPane.add(button_2);
		setVisible(true);
	}
}
