import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.ScrollPane;
import javax.swing.JScrollBar;

public class ChocoCake2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChocoCake2 frame = new ChocoCake2();
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
	public ChocoCake2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCups = new JLabel("2 c sugar");
		lblCups.setBounds(6, 6, 81, 16);
		contentPane.add(lblCups);
		
		JLabel lblNewLabel = new JLabel("3/4 all-purpose flour");
		lblNewLabel.setBounds(6, 34, 135, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("3/4 cup Hersey's choclate ");
		lblNewLabel_1.setBounds(6, 62, 173, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("1/2 t bp.");
		lblNewLabel_2.setBounds(6, 90, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("1/2 t bs.");
		lblNewLabel_3.setBounds(6, 118, 61, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("1 t salt");
		lblNewLabel_4.setBounds(6, 146, 61, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblEggs = new JLabel("2 eggs");
		lblEggs.setBounds(189, 6, 61, 16);
		contentPane.add(lblEggs);
		
		JLabel lblCupMilk = new JLabel("1 c milk");
		lblCupMilk.setBounds(189, 34, 72, 16);
		contentPane.add(lblCupMilk);
		
		JLabel lblNewLabel_5 = new JLabel("1/2 c vege oil");
		lblNewLabel_5.setBounds(191, 62, 87, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("2 t vanilla");
		lblNewLabel_6.setBounds(189, 90, 89, 16);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblCBoiling = new JLabel("1 c boiling water");
		lblCBoiling.setBounds(189, 118, 127, 16);
		contentPane.add(lblCBoiling);
		
		JLabel lblNewLabel_7 = new JLabel("choclate frosting");
		lblNewLabel_7.setBounds(189, 146, 115, 16);
		contentPane.add(lblNewLabel_7);
		setVisible(true);
	}
}
