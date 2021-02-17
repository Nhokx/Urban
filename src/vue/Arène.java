package vue;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class Arène extends JFrame {

	private JPanel contentPane;
	private JTextField txtMessage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Arène frame = new Arène();
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
	public Arène() {
		setTitle("Ar\u00E9na");
		this.getContentPane().setPreferredSize(new Dimension(800,700));
		this.pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 814, 782);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		String chemin = "fonds/fondarene.jpg";
		URL resource = getClass().getClassLoader().getResource(chemin);
		
		JLabel lblArene = new JLabel("");
		String chemin1 = "fonds/fondarene.jpg";
		URL resource1 = getClass().getClassLoader().getResource(chemin1);
		lblArene.setIcon(new ImageIcon(resource1));
		lblArene.setBounds(0, 0, 800, 600);
		contentPane.add(lblArene);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(0, 627, 800, 73);
		contentPane.add(scrollPane);
		
		txtMessage = new JTextField();
		txtMessage.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtMessage.setText("Message :");
		txtMessage.setBounds(0, 602, 800, 28);
		contentPane.add(txtMessage);
		txtMessage.setColumns(10);
	}
}
