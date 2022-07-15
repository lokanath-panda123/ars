package ars;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class booking extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField pId;
	private JTextField mob;
	private JTextField age;
	private JTextField src;
	private JTextField dest;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					booking frame = new booking();
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
	public booking() {
		setBackground(Color.YELLOW);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 612);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BOOKING");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(0, 0, 254, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name\r\n");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 88, 81, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Passport Id");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2.setBounds(10, 145, 105, 24);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Mobile\r\n");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_3.setBounds(10, 202, 105, 24);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Age\r\n");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_4.setBounds(10, 258, 66, 29);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Gender");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_5.setBounds(10, 320, 81, 19);
		contentPane.add(lblNewLabel_5);
		
		JComboBox gender = new JComboBox();
		gender.setFont(new Font("Times New Roman", Font.BOLD, 18));
		gender.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "Others"}));
		gender.setBounds(135, 320, 192, 22);
		contentPane.add(gender);
		
		JLabel lblNewLabel_6 = new JLabel("Seat No");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6.setBounds(10, 372, 81, 24);
		contentPane.add(lblNewLabel_6);
		
		JComboBox sNo = new JComboBox();
		sNo.setFont(new Font("Times New Roman", Font.BOLD, 20));
		sNo.setModel(new DefaultComboBoxModel(new String[] {"Seat No-1", "Seat No-2", "Seat No-3", "Seat No-4", "Seat No-5", "Seat No-6", "Seat No-7", "Seat No-8", "Seat No-9", "Seat No-10"}));
		sNo.setBounds(135, 375, 192, 22);
		contentPane.add(sNo);
		
		name = new JTextField();
		name.setBounds(134, 92, 193, 20);
		contentPane.add(name);
		name.setColumns(10);
		
		pId = new JTextField();
		pId.setBounds(134, 149, 193, 20);
		contentPane.add(pId);
		pId.setColumns(10);
		
		mob = new JTextField();
		mob.setBounds(134, 206, 193, 20);
		contentPane.add(mob);
		mob.setColumns(10);
		
		age = new JTextField();
		age.setBounds(135, 264, 192, 20);
		contentPane.add(age);
		age.setColumns(10);
		
		src = new JTextField();
		src.setBounds(135, 427, 192, 20);
		contentPane.add(src);
		src.setColumns(10);
		
		
		JLabel lblNewLabel_8 = new JLabel("Destination");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_8.setBounds(10, 468, 105, 14);
		contentPane.add(lblNewLabel_8);
		
		dest = new JTextField();
		dest.setBounds(135, 467, 192, 20);
		contentPane.add(dest);
		dest.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gen=gender.getSelectedItem().toString();
				String seat=sNo.getSelectedItem().toString();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
			          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ars", "root","loka1234");
					  System.out.println("Connection Established is success");
					  Statement st=con.createStatement();
			            String query="insert into bookind_details  values('"+name.getText()+"','"+pId.getText()+"','"+mob.getText()+"','"+gen+"','"+seat+"','"+src.getText()+"','"+dest.getText()+"','"+age.getText()+"');";
			            int x=st.executeUpdate(query);
			            if(x>0) {
			            	JOptionPane.showMessageDialog(btnNewButton,"Booking done");
			            	dispose();
			            	HomePage obj=new HomePage();
			            	obj.setVisible(true);
			            }
			            else {
			            	JOptionPane.showMessageDialog(btnNewButton,"Booking Error");
			            }
					
				}catch(Exception q) {
					System.out.print(q);
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(10, 521, 105, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_7 = new JLabel("Source");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_7.setBounds(10, 428, 123, 14);
		contentPane.add(lblNewLabel_7);
		
		
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				name.setText(null);
				pId.setText(null);
				mob.setText(null);
				src.setText(null);
				dest.setText(null);
				age.setText(null);
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1.setBounds(241, 521, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.setBackground(Color.GREEN);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				HomePage obj=new HomePage();
				obj.setVisible(true);
				
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_2.setBounds(425, 27, 89, 23);
		contentPane.add(btnNewButton_2);
		
		
		
		
	}
}
