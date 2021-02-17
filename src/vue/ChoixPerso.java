package vue;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.net.URL;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ChoixPerso extends JFrame {
	
	private JPanel contentPane;
	private JTextField txtPseudo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChoixPerso frame = new ChoixPerso();
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
	
	public ChoixPerso() {
		this.getContentPane().setPreferredSize(new Dimension(400, 275));
		this.pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 427, 339);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPseudo = new JTextField();
		txtPseudo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPseudo.setText("Pseudo");
		txtPseudo.setHorizontalAlignment(SwingConstants.LEFT);
		txtPseudo.setBounds(138, 243, 128, 22);
		contentPane.add(txtPseudo);
		txtPseudo.setColumns(10);
		
		
		/**
		 * Changement de perso vers la droite
		 */
		JLabel btnRight = new JLabel("");
		btnRight.setForeground(Color.RED);
		btnRight.setBackground(new Color(240, 240, 240));
		btnRight.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnRight.setText("Suivant");
			}
		});
		
		
		
		/**
		 * Validation des choix
		 */
		JLabel lblGo = new JLabel("");
		lblGo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Arène.main(null);
			}
		});
		lblGo.setBounds(310, 196, 68, 69);
		contentPane.add(lblGo);
		btnRight.setBounds(288, 135, 38, 60);
		contentPane.add(btnRight);
		
		
		/**
		 * Changement de perso vers la gauche
		 */
		JLabel btnLeft = new JLabel("");
		btnLeft.setForeground(Color.RED);
		btnLeft.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnLeft.setText("Précédent");
			}
		});
		btnLeft.setBackground(new Color(240, 240, 240));
		btnLeft.setBounds(63, 141, 38, 54);
		contentPane.add(btnLeft);
		String chemin = "personnages/perso1marche1d1.gif";
		URL resource = getClass().getClassLoader().getResource(chemin);
		
		JLabel lblPerso1 = new JLabel("");
		lblPerso1.setHorizontalAlignment(SwingConstants.CENTER);
		String chemin1 = "personnages/perso1marche1d1.gif";
		URL resource1 = getClass().getClassLoader().getResource(chemin1);
		lblPerso1.setIcon(new ImageIcon(resource1));
		lblPerso1.setBounds(148, 120, 114, 113);
		contentPane.add(lblPerso1);
		
		JLabel lblFondChoix = new JLabel("");
		String chemin11 = "fonds/fondchoix.jpg";
		URL resource11 = getClass().getClassLoader().getResource(chemin11);
		lblFondChoix.setIcon(new ImageIcon(resource11));
		lblFondChoix.setBounds(0, 0, 408, 270);
		contentPane.add(lblFondChoix);
	}
}
