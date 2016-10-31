import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Schedule extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Schedule frame = new Schedule();
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
	public Schedule() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNovember = new JLabel("November");
		lblNovember.setBounds(185, 6, 87, 16);
		contentPane.add(lblNovember);
		
		JButton button = new JButton("11/1-11/7");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Schedule3 schedule = new Schedule3();
			}
		});
		button.setBounds(163, 34, 117, 29);
		contentPane.add(button);
		
		JButton button_1 = new JButton("11/8-11/15");
		button_1.setBounds(163, 80, 117, 29);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("11/16-11/23");
		button_2.setBounds(163, 121, 117, 29);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("11/24-11/31");
		button_3.setBounds(163, 162, 117, 29);
		contentPane.add(button_3);
		setVisible(true);
	}

}
