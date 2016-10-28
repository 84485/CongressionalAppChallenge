import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChocoCake extends JFrame {

	private JPanel contentPane;
	private Icon pic;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChocoCake frame = new ChocoCake();
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
	public ChocoCake() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel headerPanel = new JPanel();
		contentPane.add(headerPanel, BorderLayout.NORTH);
	
		
		JLabel picLbl = new JLabel("");
		headerPanel.add(picLbl);
		
		JLabel titleLbl = new JLabel("Chocolate Cake");
		headerPanel.add(titleLbl);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		
		JButton btnRecipe = new JButton("Recipe");
		btnRecipe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hide();
				ChocoCake2 chocolate = new ChocoCake2();
			}
		});
		
		JButton btnNewButton = new JButton("Back");
		panel_1.add(btnNewButton);
		panel_1.add(btnRecipe);
		setVisible(true);
		
		pic = new ImageIcon("cake.jpeg");
		picLbl.setIcon(pic);	
		
	}
}
