import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ScheduleM extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScheduleM frame = new ScheduleM();
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
	public ScheduleM() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMonday = new JLabel("Monday");
		lblMonday.setBounds(198, 6, 84, 16);
		contentPane.add(lblMonday);
		
		JButton btnBreakfast = new JButton("Breakfast");
		btnBreakfast.setBounds(165, 34, 117, 29);
		contentPane.add(btnBreakfast);
		
		JButton btnLunch = new JButton("Lunch");
		btnLunch.setBounds(165, 64, 117, 29);
		contentPane.add(btnLunch);
		
		JButton btnDinner = new JButton("Dinner");
		btnDinner.setBounds(165, 92, 117, 29);
		contentPane.add(btnDinner);
		
		JButton btnDessert = new JButton("Dessert");
		btnDessert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hide();
				ChocoCake choco = new ChocoCake();
			}
		});
		btnDessert.setBounds(165, 122, 117, 29);
		contentPane.add(btnDessert);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hide();
				Schedule3 schedule3 = new Schedule3();
			}
		});
		btnBack.setBounds(165, 243, 117, 29);
		contentPane.add(btnBack);
		setVisible(true);
	}
}
