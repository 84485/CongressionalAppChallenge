import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Schedule3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Schedule3 frame = new Schedule3();
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
	public Schedule3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("11/1-11/7");
		label.setBounds(177, 6, 111, 16);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("11/1");
		lblNewLabel.setBounds(13, 78, 39, 16);
		contentPane.add(lblNewLabel);
		
		JButton btnM = new JButton("M");
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ScheduleM scheduleM = new ScheduleM();
			}
		});
		btnM.setBounds(6, 93, 46, 29);
		contentPane.add(btnM);
		
		JLabel lblTuesday = new JLabel("11/2");
		lblTuesday.setBounds(84, 78, 39, 16);
		contentPane.add(lblTuesday);
		
		JButton btnT = new JButton("T");
		btnT.setBounds(77, 93, 46, 29);
		contentPane.add(btnT);
		
		JLabel lblWednesday = new JLabel("11/3");
		lblWednesday.setBounds(144, 78, 39, 16);
		contentPane.add(lblWednesday);
		
		JButton btnW = new JButton("W");
		btnW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnW.setBounds(140, 93, 46, 29);
		contentPane.add(btnW);
		
		JLabel lblNewLabel_1 = new JLabel("11/4");
		lblNewLabel_1.setBounds(203, 78, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("11/5");
		lblNewLabel_2.setBounds(263, 78, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("11/6");
		lblNewLabel_3.setBounds(325, 78, 61, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("11/7");
		lblNewLabel_4.setBounds(383, 78, 61, 16);
		contentPane.add(lblNewLabel_4);
		
		JButton btnT_1 = new JButton("T");
		btnT_1.setBounds(196, 93, 46, 29);
		contentPane.add(btnT_1);
		
		JButton btnF = new JButton("F");
		btnF.setBounds(263, 93, 46, 29);
		contentPane.add(btnF);
		
		JButton btnS = new JButton("S");
		btnS.setBounds(325, 93, 46, 29);
		contentPane.add(btnS);
		
		JButton btnS_1 = new JButton("S");
		btnS_1.setBounds(383, 93, 46, 29);
		contentPane.add(btnS_1);
		setVisible(true);
	}
}
