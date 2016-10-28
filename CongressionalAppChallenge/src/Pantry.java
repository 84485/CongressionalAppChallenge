import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pantry extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantry frame = new Pantry();
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
	public Pantry() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);	
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setVisible(true);
		
		JLabel lblPantry = new JLabel("Pantry");
		lblPantry.setBounds(5, 5, 440, 16);
		lblPantry.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblPantry);
		
		JLabel lblCannedFood = new JLabel("Canned food");
		lblCannedFood.setBounds(15, 33, 80, 16);
		contentPane.add(lblCannedFood);
		
		textField = new JTextField();
		textField.setBounds(35, 54, 393, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(35, 94, 393, 28);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblFreezer = new JLabel("Freezer");
		lblFreezer.setBounds(15, 134, 61, 16);
		contentPane.add(lblFreezer);
		
		textField_2 = new JTextField();
		textField_2.setBounds(35, 163, 393, 28);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(35, 203, 393, 28);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Start start = new Start();
			}
		});
		btnBack.setBounds(15, 243, 117, 29);
		contentPane.add(btnBack);
		
		JButton btnNextPage = new JButton("Next Page");
		btnNextPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Pantry2 pantry2 = new Pantry2();
			}
		});
		btnNextPage.setBounds(311, 243, 117, 29);
		contentPane.add(btnNextPage);
		
		ArrayList<JLabel> labels = new ArrayList<JLabel>();
		for(int i = 0; i < FoodApp.getPantryNames().size(); i++){
			JLabel temp = new JLabel((String) FoodApp.getPantryNames().get(i));
			labels.add(temp);
			contentPane.add(temp, BorderLayout.WEST);
		}
		
	}
}
