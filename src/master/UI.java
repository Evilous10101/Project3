package master;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class UI {
	
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI window = new UI();
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
	public UI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnCreateANew = new JButton("Create a new user");
		btnCreateANew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CreateUser.CreateUser56();
				
			}
		});
		btnCreateANew.setBounds(10, 227, 162, 23);
		frame.getContentPane().add(btnCreateANew);
		
		textField = new JTextField();
		textField.setBounds(231, 71, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		textField_1 = new JTextField();
		textField_1.setBounds(231, 114, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnEmail = new JButton("Email");
		btnEmail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnEmail.setBounds(95, 70, 103, 23);
		frame.getContentPane().add(btnEmail);
		
		JButton btnPassword = new JButton("Password");
		btnPassword.setBounds(95, 113, 103, 23);
		frame.getContentPane().add(btnPassword);
		
		JLabel lblLoginToContinue = new JLabel("Login to continue (press the email and password button to verifiy)");
		lblLoginToContinue.setBounds(10, 42, 414, 14);
		frame.getContentPane().add(lblLoginToContinue);
		
		JLabel lblGenericUiFor = new JLabel("Generic UI for Amazon ripoff that doesn't order anything");
		lblGenericUiFor.setBounds(10, 11, 414, 14);
		frame.getContentPane().add(lblGenericUiFor);
		
		JButton btnMakeAnOrder = new JButton("Make an order");
		btnMakeAnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MakeOrder.MakeOrder23();
				
			}
		});
		btnMakeAnOrder.setBounds(182, 227, 116, 23);
		frame.getContentPane().add(btnMakeAnOrder);
		
		
		
		
		JButton btnExit_1 = new JButton("Exit");
		btnExit_1.setForeground(Color.RED);
		btnExit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Shuting down");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.exit(0);
			}
		});
		btnExit_1.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(btnExit_1);
		
		JButton btnPingTest = new JButton("Ping Test");
		btnPingTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PingTest.Test();
			}
		});
		btnPingTest.setBounds(335, 181, 89, 23);
		frame.getContentPane().add(btnPingTest);
	}
}
