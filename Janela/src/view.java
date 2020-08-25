import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class view {

	private JFrame frame;
	private JTextField txtPassword;
	private JTextField txtNome;
	private JPasswordField txtPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view window = new view();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public view() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(176, 32, 56, 16);
		frame.getContentPane().add(lblNome);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(146, 125, 116, 22);
		frame.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(176, 96, 77, 16);
		frame.getContentPane().add(lblPassword);
		
		txtNome = new JTextField();
		txtNome.setBounds(146, 61, 116, 22);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JButton btnEntra = new JButton("Entrar");
		btnEntra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if (checkLogin (txtNome.getText(), txtPassword.getText())) {
				if (checkLogin (txtNome.getText(), new String(txtPass.getPassword()))) {
					
					JOptionPane.showMessageDialog(null, "Bem vindo ao sistema");
				}else {
					JOptionPane.showMessageDialog(null, "Dados invalidos");
				}
			}
		});
		btnEntra.setBounds(156, 181, 97, 25);
		frame.getContentPane().add(btnEntra);
		
		txtPass = new JPasswordField();
		txtPass.setBounds(139, 159, 123, 22);
		frame.getContentPane().add(txtPass);
	}
	
	public boolean checkLogin(String login, String senha) {
		return login.equals("usuario") && senha.equals("123");
	}
}
