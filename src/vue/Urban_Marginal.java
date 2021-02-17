package vue;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Urban_Marginal extends JFrame {

	private JPanel contentPane;
	private JTextField txtIPserver;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Urban_Marginal frame = new Urban_Marginal();
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
	public Urban_Marginal() {
		setTitle("Urban Marginal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 235);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Start a server :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(21, 20, 157, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Connect an existing server :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(21, 76, 242, 28);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("IP server :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(27, 114, 92, 28);
		contentPane.add(lblNewLabel_2);
		
		txtIPserver = new JTextField();
		txtIPserver.setHorizontalAlignment(SwingConstants.CENTER);
		txtIPserver.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtIPserver.setText("127.0.0.1");
		txtIPserver.setBounds(118, 114, 110, 27);
		contentPane.add(txtIPserver);
		txtIPserver.setColumns(10);
		
		/*
		 *Démarre le serveur et affiche l'arène
		 */
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Arène.main(null);
			}
		});
		btnStart.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnStart.setBounds(277, 20, 135, 28);
		contentPane.add(btnStart);
		
		/**
		 *Affiche l'écran de choix perso et du pseudo
		 */
		JButton btnConnect = new JButton("Connect");
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChoixPerso.main(null);
			}
		});
		btnConnect.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnConnect.setBounds(277, 114, 135, 28);
		contentPane.add(btnConnect);
		
		/**
		 * Quitte l'application
		 */
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(EXIT_ON_CLOSE);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnExit.setBounds(277, 152, 135, 40);
		contentPane.add(btnExit);
	}
}
