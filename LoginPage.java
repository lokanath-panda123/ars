package ars;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class LoginPage extends JFrame {
	
	
	Connection con;
	Statement st;

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
		setBackground(Color.YELLOW);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 726, 458);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("USER_NAME :-");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(26, 127, 115, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD :-");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2.setBounds(26, 207, 104, 29);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField.setBackground(Color.WHITE);
		textField.setForeground(Color.BLACK);
		textField.setBounds(172, 132, 238, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.WHITE);
		textField_1.setForeground(Color.BLACK);
		textField_1.setBounds(172, 212, 238, 36);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
			          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ars", "root","loka1234");
					  System.out.println("Connection Established is success");
					  Statement st=con.createStatement();
			            String query="select * from login_info where u_id='"+textField.getText()+"'";
			            ResultSet rs=st.executeQuery(query);
			            String password="";
			            String pass1= textField_1.getText();
			            String id="";
			            String id1=textField.getText();
			            while(rs.next()) {
			            	id=rs.getString("u_id");
			                password=rs.getString("pass");
			            }
			            if(pass1.equals(password) && id.equals(id1)) {
			            	JOptionPane.showMessageDialog(btnNewButton,"Sucess");
			            	dispose();
			            	HomePage obj=new HomePage();
			            	obj.setVisible(true);
			            }else {
			            	JOptionPane.showMessageDialog(btnNewButton,"Not");
			            }
				}catch(Exception ea) {
					System.out.print(ea);
				}
			}
		});
		btnNewButton.setBounds(26, 307, 115, 36);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("RESET\r\n");
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_1) {
					textField.setText("");
					textField_1.setText("");
				}
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1.setBounds(293, 307, 115, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.setForeground(Color.RED);
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_2.setBounds(568, 22, 104, 29);
		contentPane.add(btnNewButton_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.CYAN);
		panel_2.setBounds(0, 0, 712, 421);
		contentPane.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		panel_2.add(lblNewLabel);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
	}
}
