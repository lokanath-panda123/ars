package ars ;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class Traveling {

	private JFrame frame;
	private JTextField txtTax;
	private JTextField txtSubTotal;
	private JTextField txtTotal;
	private JTextField txtClass;
	private JTextField txtTicket;
	private JTextField txtAdult;
	private JTextField txtChild;
	private JTextField txtForm;
	private JTextField txtTo;
	private JTextField txtTicketNo;
	private JTextField txtDate;
	private JTextField txtTime;
	private JTextField txtPrice;
	private JTextField txtRoute;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Traveling window = new Traveling();
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
	public Traveling() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(0, 0, 1370, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(66, 27, 581, 60);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("MANAGEMENT");
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 38));
		
		JLabel lblNewLabel_1 = new JLabel("Ticket Type");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(65, 112, 103, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Standard");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnNewRadioButton.setBounds(75, 146, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Economy");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnNewRadioButton_1.setBounds(75, 183, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("First Class");
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnNewRadioButton_2.setBounds(75, 219, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Return Ticket");
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnNewRadioButton_3.setBounds(202, 183, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Single Ticket");
		rdbtnNewRadioButton_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnNewRadioButton_4.setBounds(202, 146, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Adult");
		rdbtnNewRadioButton_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnNewRadioButton_5.setBounds(364, 146, 77, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Child");
		rdbtnNewRadioButton_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnNewRadioButton_6.setBounds(364, 183, 77, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_6);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(49, 98, 380, 5);
		frame.getContentPane().add(separator);
		
		JComboBox cmbDestination = new JComboBox();
		cmbDestination.setModel(new DefaultComboBoxModel(new String[] {"Destination", "Delhi", "Kolkata", "Mumbai"}));
		cmbDestination.setFont(new Font("Tahoma", Font.BOLD, 14));
		cmbDestination.setBounds(212, 218, 196, 21);
		frame.getContentPane().add(cmbDestination);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(49, 246, 380, 5);
		frame.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tax");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(66, 274, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Sub Total");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(66, 299, 67, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Total");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(66, 324, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		txtTax = new JTextField();
		txtTax.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtTax.setHorizontalAlignment(SwingConstants.CENTER);
		txtTax.setBounds(155, 272, 86, 20);
		frame.getContentPane().add(txtTax);
		txtTax.setColumns(10);
		
		txtSubTotal = new JTextField();
		txtSubTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtSubTotal.setHorizontalAlignment(SwingConstants.CENTER);
		txtSubTotal.setBounds(155, 297, 86, 20);
		frame.getContentPane().add(txtSubTotal);
		txtSubTotal.setColumns(10);
		
		txtTotal = new JTextField();
		txtTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtTotal.setHorizontalAlignment(SwingConstants.CENTER);
		txtTotal.setBounds(155, 321, 86, 20);
		frame.getContentPane().add(txtTotal);
		txtTotal.setColumns(10);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.setBackground(Color.GREEN);
		btnTotal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				double Tax = 19.50;
				double Milesk8 = 25.78;
				double Milesk12 = 25.10;
				double Milesk20 = 45.23;
		
				double totalCost , eco = 3.85,fclass = 5.60;
				
				if ((rdbtnNewRadioButton.isSelected()) && (rdbtnNewRadioButton_4.isSelected()) && (rdbtnNewRadioButton_5.isSelected())
				&& cmbDestination.getSelectedItem().equals("Delhi"))
				{
				
			
				totalCost=(Tax * Milesk8) / 100;
				String sTax = String.format("$%.2f",totalCost);
				txtTax.setText(sTax);
				String SubTotal = String.format("$%.2f", Milesk8);
				txtSubTotal.setText(SubTotal);
				String Total = String.format("$%.2f", Milesk8 + totalCost);
				txtTotal.setText(Total);
				txtPrice.setText(Total);
				txtClass.setText("STD");
				txtTicket.setText("ONE WAY");
				txtAdult.setText("ONE");
				txtChild.setText("NIL");//1
				}
			else if ((rdbtnNewRadioButton.isSelected()) && (rdbtnNewRadioButton_3.isSelected()) && (rdbtnNewRadioButton_5.isSelected())
					&& cmbDestination.getSelectedItem().equals("Delhi"))
					{
					totalCost=(Tax * (Milesk8*2)) / 100;
					String sTax = String.format("$%.2f",totalCost *2);
					txtTax.setText(sTax);
					String SubTotal = String.format("$%.2f", Milesk8);
					txtSubTotal.setText(SubTotal);
					String Total = String.format("$%.2f", Milesk8 + totalCost *2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("RETURN");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");//2
					}
			else if ((rdbtnNewRadioButton.isSelected()) && (rdbtnNewRadioButton_4.isSelected()) && (rdbtnNewRadioButton_6.isSelected())
					&& cmbDestination.getSelectedItem().equals("Delhi"))
					{
					totalCost=(Tax * Milesk8) / 100;
					String sTax = String.format("$%.2f",totalCost-18);
					txtTax.setText(sTax);
					String SubTotal = String.format("$%.2f", Milesk8);
					txtSubTotal.setText(SubTotal);
					String Total = String.format("$%.2f", Milesk8 + totalCost-18);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("NIL");
					txtChild.setText("ONE");//3
					}
			else if ((rdbtnNewRadioButton.isSelected()) && (rdbtnNewRadioButton_3.isSelected()) && (rdbtnNewRadioButton_6.isSelected())
					&& cmbDestination.getSelectedItem().equals("Delhi"))
					{
					totalCost=(Tax *( Milesk8*2)) / 100;
					String sTax = String.format("$%.2f",totalCost-18);
					txtTax.setText(sTax);
					String SubTotal = String.format("$%.2f", Milesk8*2);
					txtSubTotal.setText(SubTotal);
					String Total = String.format("$%.2f",(( Milesk8 + totalCost)*2)-18);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("RETURN");
					txtAdult.setText("NIL");//ADULT
					txtChild.setText("ONE");//CHILD//4
					}
			else if ((rdbtnNewRadioButton.isSelected()) && (rdbtnNewRadioButton_4.isSelected()) && (rdbtnNewRadioButton_5.isSelected())
					&& cmbDestination.getSelectedItem().equals("Mumbai"))
					{
					totalCost=(Tax * Milesk12) / 100;
					String sTax = String.format("$%.2f",totalCost);
					txtTax.setText(sTax);
					String SubTotal = String.format("$%.2f", Milesk12);
					txtSubTotal.setText(SubTotal);
					String Total = String.format("$%.2f", Milesk12 + totalCost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");//5
					}
			else if ((rdbtnNewRadioButton.isSelected()) && (rdbtnNewRadioButton_3.isSelected()) && (rdbtnNewRadioButton_5.isSelected())
					&& cmbDestination.getSelectedItem().equals("Mumbai"))
					{
					totalCost=(Tax * (Milesk8*2)) / 100;
					String sTax = String.format("$%.2f",totalCost);
					txtTax.setText(sTax);
					String SubTotal = String.format("$%.2f", Milesk8*2);
					txtSubTotal.setText(SubTotal);
					String Total = String.format("$%.2f", (Milesk8 + totalCost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("RETURN");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");//6
					}
			else if ((rdbtnNewRadioButton.isSelected()) && (rdbtnNewRadioButton_4.isSelected()) && (rdbtnNewRadioButton_6.isSelected())
					&& cmbDestination.getSelectedItem().equals("Mumbai"))
					{
					totalCost=(Tax * Milesk12) / 100;
					String sTax = String.format("$%.2f",totalCost-18);
					txtTax.setText(sTax);
					String SubTotal = String.format("$%.2f", Milesk12);
					txtSubTotal.setText(SubTotal);
					String Total = String.format("$%.2f", Milesk12 + totalCost-18);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("NIL");
					txtChild.setText("ONE");//7
					}
			else if ((rdbtnNewRadioButton.isSelected()) && (rdbtnNewRadioButton_3.isSelected()) && (rdbtnNewRadioButton_6.isSelected())
					&& cmbDestination.getSelectedItem().equals("Mumbai"))
					{
					totalCost=(Tax * (Milesk8*2)) / 100;
					String sTax = String.format("$%.2f",totalCost -18);
					txtTax.setText(sTax);
					String SubTotal = String.format("$%.2f", Milesk8*2);
					txtSubTotal.setText(SubTotal);
					String Total = String.format("$%.2f", ((Milesk8 + totalCost)*2)-18);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("RETURN");
					txtAdult.setText("NIL");
					txtChild.setText("ONE");//8
					}
			else if ((rdbtnNewRadioButton.isSelected()) && (rdbtnNewRadioButton_4.isSelected()) && (rdbtnNewRadioButton_5.isSelected())
					&& cmbDestination.getSelectedItem().equals("Kolkata"))
					{
					totalCost=Tax * (Milesk20) / 100;
					String sTax = String.format("$%.2f",totalCost);
					txtTax.setText(sTax);
					String SubTotal = String.format("$%.2f",Milesk20);
					txtSubTotal.setText(SubTotal);
					String Total = String.format("$%.2f", (Milesk20 + totalCost));
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
				txtChild.setText("NIL");//9
					}
			else if ((rdbtnNewRadioButton.isSelected()) && (rdbtnNewRadioButton_3.isSelected()) && (rdbtnNewRadioButton_5.isSelected())
					&& cmbDestination.getSelectedItem().equals("Kolkata"))
					{
					totalCost=(Tax * (Milesk8*2)) / 100;
					String sTax = String.format("$%.2f",totalCost);
					txtTax.setText(sTax);
					String SubTotal = String.format("$%.2f", Milesk8*2);
					txtSubTotal.setText(SubTotal);
					String Total = String.format("$%.2f", (Milesk8 + totalCost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("RETURN");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");//10
					}
			else if ((rdbtnNewRadioButton.isSelected()) && (rdbtnNewRadioButton_4.isSelected()) && (rdbtnNewRadioButton_6.isSelected())
					&& cmbDestination.getSelectedItem().equals("Kolkata"))
					{
					totalCost=Tax * (Milesk20) / 100;
					String sTax = String.format("$%.2f",totalCost -18);
					txtTax.setText(sTax);
					String SubTotal = String.format("$%.2f",Milesk20);
					txtSubTotal.setText(SubTotal);
					String Total = String.format("$%.2f", Milesk20 + totalCost -18);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("NIL");
					txtChild.setText("ONE");//11
					}
			else if ((rdbtnNewRadioButton.isSelected()) && (rdbtnNewRadioButton_3.isSelected()) && (rdbtnNewRadioButton_6.isSelected())
					&& cmbDestination.getSelectedItem().equals("Kolkata"))
					{
					totalCost=(Tax * (Milesk8*2)) / 100;
					String sTax = String.format("$%.2f",totalCost -18);
					txtTax.setText(sTax);
					String SubTotal = String.format("$%.2f", Milesk8*2);
					txtSubTotal.setText(SubTotal);
					String Total = String.format("$%.2f", ((Milesk8 + totalCost)*2)-18);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("RETURN");
					txtAdult.setText("NIL");
					txtChild.setText("ONE");//12
					}
				
				//======================================================================================================================
				
				if ((rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_4.isSelected()) && (rdbtnNewRadioButton_5.isSelected())
						&& cmbDestination.getSelectedItem().equals("Delhi"))
						{
						
					
						totalCost=(Tax *( Milesk8 + eco)) / 100;
						String sTax = String.format("$%.2f",totalCost);
						txtTax.setText(sTax);
						String SubTotal = String.format("$%.2f", Milesk8 + eco);
						txtSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Milesk8 +eco + totalCost);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("ECONOMY");
						txtTicket.setText("ONE WAY");
						txtAdult.setText("ONE");
						txtChild.setText("NIL");//1
						}
				else if ((rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_4.isSelected()) && (rdbtnNewRadioButton_6.isSelected())
						&& cmbDestination.getSelectedItem().equals("Delhi"))
						{
						totalCost=(Tax * (Milesk8 + eco)) / 100;
						String sTax = String.format("$%.2f",(totalCost + eco) -18);
						txtTax.setText(sTax);
						String SubTotal = String.format("$%.2f", Milesk8 + eco);
						txtSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f",( Milesk8 + eco + totalCost) -18);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("ECONOMY");
						txtTicket.setText("ONE WAY");
						txtAdult.setText("NIL");
						txtChild.setText("ONE");//2
						}
				else if ((rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_3.isSelected()) && (rdbtnNewRadioButton_6.isSelected())
						&& cmbDestination.getSelectedItem().equals("Delhi"))
						{
						totalCost=(Tax * (Milesk8 * 2)) / 100;
						String sTax = String.format("$%.2f", totalCost -18);
						txtTax.setText(sTax);
						String SubTotal = String.format("$%.2f", Milesk8 * 2);
						txtSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f",(( Milesk8 + totalCost)*2) -18);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("ECONOMY");
						txtTicket.setText("RETURN");
						txtAdult.setText("NIL");
						txtChild.setText("ONE");//3
						}
				else if ((rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_3.isSelected()) && (rdbtnNewRadioButton_5.isSelected())
						&& cmbDestination.getSelectedItem().equals("Delhi"))
						{
						totalCost=(Tax * (Milesk8 * 2)) / 100;
						String sTax = String.format("$%.2f",totalCost);
						txtTax.setText(sTax);
						String SubTotal = String.format("$%.2f", Milesk8 = eco);
						txtSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f",( Milesk8 + totalCost)*2);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("ECONOMY");
						txtTicket.setText("RETURN");
						txtAdult.setText("ONE");
						txtChild.setText("NIL");//4
						}
				else if ((rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_4.isSelected()) && (rdbtnNewRadioButton_5.isSelected())
						&& cmbDestination.getSelectedItem().equals("Mumbai"))
						{
						totalCost=(Tax *(Milesk12 + eco)) / 100;
						String sTax = String.format("$%.2f",totalCost);
						txtTax.setText(sTax);
						String SubTotal = String.format("$%.2f", Milesk12 + eco);
						txtSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Milesk12 + eco + totalCost);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("ECONOMY");
						txtTicket.setText("ONE WAY");
						txtAdult.setText("ONE");
						txtChild.setText("NIL");//5
						}
				else if ((rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_4.isSelected()) && (rdbtnNewRadioButton_6.isSelected())
						&& cmbDestination.getSelectedItem().equals("Mumbai"))
						{
						totalCost=(Tax *(Milesk12 + eco)) / 100;
						String sTax = String.format("$%.2f",totalCost - 18);
						txtTax.setText(sTax);
						String SubTotal = String.format("$%.2f", Milesk12 + eco);
						txtSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f",( Milesk12 + eco + totalCost) - 18);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("ECONOMY");
						txtTicket.setText("ONE WAY");
						txtAdult.setText("NIL");
						txtChild.setText("ONE");//6
						}
				else if ((rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_3.isSelected()) && (rdbtnNewRadioButton_6.isSelected())
						&& cmbDestination.getSelectedItem().equals("Mumbai"))
						{
						totalCost=(Tax *(Milesk12 * 2)) / 100;
						String sTax = String.format("$%.2f",totalCost - 18);
						txtTax.setText(sTax);
						String SubTotal = String.format("$%.2f", Milesk12 * 2);
						txtSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f",(( Milesk12 + totalCost) * 2)-18);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("ECONOMY");
						txtTicket.setText("RETURN");
						txtAdult.setText("NIL");
						txtChild.setText("ONE");//7
						}
				
				else if ((rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_3.isSelected()) && (rdbtnNewRadioButton_5.isSelected())
						&& cmbDestination.getSelectedItem().equals("Mumbai"))
						{
						totalCost=(Tax *(Milesk12 * 2)) / 100;
						String sTax = String.format("$%.2f",totalCost);
						txtTax.setText(sTax);
						String SubTotal = String.format("$%.2f", Milesk12 * 2);
						txtSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f",( Milesk12 + totalCost) * 2);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("ECONOMY");
						txtTicket.setText("RETURN");
						txtAdult.setText("ONE");
						txtChild.setText("NIL");//8
						}
				else if ((rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_4.isSelected()) && (rdbtnNewRadioButton_5.isSelected())
						&& cmbDestination.getSelectedItem().equals("Kolkata"))
						{
						totalCost=(Tax *(Milesk20 + eco)) / 100;
						String sTax = String.format("$%.2f",totalCost);
						txtTax.setText(sTax);
						String SubTotal = String.format("$%.2f", Milesk12+ eco);
						txtSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Milesk12+ eco + totalCost);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("ECONOMY");
						txtTicket.setText("ONE WAY");
						txtAdult.setText("ONE");
						txtChild.setText("NIL");//9
						}
				else if ((rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_4.isSelected()) && (rdbtnNewRadioButton_6.isSelected())
						&& cmbDestination.getSelectedItem().equals("Kolkata"))
						{
						totalCost=(Tax *(Milesk20 + eco)) / 100;
						String sTax = String.format("$%.2f",totalCost - 18);
						txtTax.setText(sTax);
						String SubTotal = String.format("$%.2f", Milesk20 + eco);
						txtSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f",( Milesk20 + eco + totalCost) - 18);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("ECONOMY");
						txtTicket.setText("ONE WAY");
						txtAdult.setText("NIL");
						txtChild.setText("ONE");//10
						}
				else if ((rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_3.isSelected()) && (rdbtnNewRadioButton_6.isSelected())
						&& cmbDestination.getSelectedItem().equals("Kolkata"))
						{
						totalCost=(Tax *(Milesk20 * 2)) / 100;
						String sTax = String.format("$%.2f",totalCost - 18);
						txtTax.setText(sTax);
						String SubTotal = String.format("$%.2f", Milesk20 * 2);
						txtSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f",(( Milesk20 + totalCost) * 2)-18);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("ECONOMY");
						txtTicket.setText("RETURN");
						txtAdult.setText("NIL");
						txtChild.setText("ONE");//11
						}
				else if ((rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_3.isSelected()) && (rdbtnNewRadioButton_5.isSelected())
						&& cmbDestination.getSelectedItem().equals("Kolkata"))
						{
						totalCost=(Tax *(Milesk20 * 2)) / 100;
						String sTax = String.format("$%.2f",totalCost);
						txtTax.setText(sTax);
						String SubTotal = String.format("$%.2f", Milesk20 * 2);
						txtSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f",( Milesk20 + totalCost) * 2);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("ECONOMY");
						txtTicket.setText("RETURN");
						txtAdult.setText("ONE");
						txtChild.setText("NIL");//12
						}
				
				//====================================================================================================================================
				
				else  if ((rdbtnNewRadioButton_2.isSelected()) && (rdbtnNewRadioButton_4.isSelected()) && (rdbtnNewRadioButton_5.isSelected())
						&& cmbDestination.getSelectedItem().equals("Delhi"))
						{
						totalCost=(Tax *( Milesk8 + fclass)) / 100;
						String sTax = String.format("$%.2f",totalCost);
						txtTax.setText(sTax);
						String SubTotal = String.format("$%.2f", Milesk8 + fclass);
						txtSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Milesk8 + fclass + totalCost);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("FIRST");
						txtTicket.setText("ONE WAY");
						txtAdult.setText("ONE");
						txtChild.setText("NIL");//1
						}
				else if ((rdbtnNewRadioButton_2.isSelected()) && (rdbtnNewRadioButton_4.isSelected()) && (rdbtnNewRadioButton_6.isSelected())
						&& cmbDestination.getSelectedItem().equals("Delhi"))
						{
						totalCost=(Tax * (Milesk8 + fclass)) / 100;
						String sTax = String.format("$%.2f",(totalCost + fclass) -18);
						txtTax.setText(sTax);
						String SubTotal = String.format("$%.2f", Milesk8 + fclass);
						txtSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f",( Milesk8 + fclass + totalCost) -18);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("FIRST");
						txtTicket.setText("ONE WAY");
						txtAdult.setText("NIL");
						txtChild.setText("ONE");//2
						}
				else if ((rdbtnNewRadioButton_2.isSelected()) && (rdbtnNewRadioButton_3.isSelected()) && (rdbtnNewRadioButton_6.isSelected())
						&& cmbDestination.getSelectedItem().equals("Delhi"))
						{
						totalCost=(Tax * (Milesk8 * 2)) / 100;
						String sTax = String.format("$%.2f", totalCost -18);
						txtTax.setText(sTax);
						String SubTotal = String.format("$%.2f", Milesk8 * 2);
						txtSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f",(( Milesk8 + totalCost)*2) -18);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("FIRST");
						txtTicket.setText("RETURN");
						txtAdult.setText("NIL");
						txtChild.setText("ONE");//3
						}
				else if ((rdbtnNewRadioButton_2.isSelected()) && (rdbtnNewRadioButton_3.isSelected()) && (rdbtnNewRadioButton_5.isSelected())
						&& cmbDestination.getSelectedItem().equals("Delhi"))
						{
						totalCost=(Tax * (Milesk8 * 2)) / 100;
						String sTax = String.format("$%.2f",totalCost);
						txtTax.setText(sTax);
						String SubTotal = String.format("$%.2f", Milesk8 = fclass);
						txtSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f",( Milesk8 + totalCost)*2);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("FIRST");
						txtTicket.setText("RETURN");
						txtAdult.setText("ONE");
						txtChild.setText("NIL");//4
						}
				else if ((rdbtnNewRadioButton_2.isSelected()) && (rdbtnNewRadioButton_4.isSelected()) && (rdbtnNewRadioButton_5.isSelected())
						&& cmbDestination.getSelectedItem().equals("Mumbai"))
						{
						totalCost=(Tax *(Milesk12 + fclass)) / 100;
						String sTax = String.format("$%.2f",totalCost);
						txtTax.setText(sTax);
						String SubTotal = String.format("$%.2f", Milesk12 + fclass);
						txtSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Milesk12 + fclass + totalCost);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("FIRST");
						txtTicket.setText("ONE WAY");
						txtAdult.setText("ONE");
						txtChild.setText("NIL");//5
						}
				else if ((rdbtnNewRadioButton_2.isSelected()) && (rdbtnNewRadioButton_4.isSelected()) && (rdbtnNewRadioButton_6.isSelected())
						&& cmbDestination.getSelectedItem().equals("Mumbai"))
						{
						totalCost=(Tax *(Milesk12 + fclass)) / 100;
						String sTax = String.format("$%.2f",totalCost - 18);
						txtTax.setText(sTax);
						String SubTotal = String.format("$%.2f", Milesk12 + fclass);
						txtSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f",( Milesk12 + fclass + totalCost) - 18);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("FIRST");
						txtTicket.setText("ONE WAY");
						txtAdult.setText("NIL");
						txtChild.setText("ONE");//6
						}
				else if ((rdbtnNewRadioButton_2.isSelected()) && (rdbtnNewRadioButton_3.isSelected()) && (rdbtnNewRadioButton_6.isSelected())
						&& cmbDestination.getSelectedItem().equals("Mumbai"))
						{
						totalCost=(Tax *(Milesk12 * 2)) / 100;
						String sTax = String.format("$%.2f",totalCost - 18);
						txtTax.setText(sTax);
						String SubTotal = String.format("$%.2f", Milesk12 * 2);
						txtSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f",(( Milesk12 + totalCost) * 2)-18);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("FIRST");
						txtTicket.setText("RETURN");
						txtAdult.setText("NIL");
						txtChild.setText("ONE");//7
						}
				else if ((rdbtnNewRadioButton_2.isSelected()) && (rdbtnNewRadioButton_3.isSelected()) && (rdbtnNewRadioButton_5.isSelected())
						&& cmbDestination.getSelectedItem().equals("Mumbai"))
						{
						totalCost=(Tax *(Milesk12 * 2)) / 100;
						String sTax = String.format("$%.2f",totalCost);
						txtTax.setText(sTax);
						String SubTotal = String.format("$%.2f", Milesk12 * 2);
						txtSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f",( Milesk12 + totalCost) * 2);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("FIRST");
						txtTicket.setText("RETURN");
						txtAdult.setText("ONE");
						txtChild.setText("NIL");//8
						}
				else if ((rdbtnNewRadioButton_2.isSelected()) && (rdbtnNewRadioButton_4.isSelected()) && (rdbtnNewRadioButton_5.isSelected())
						&& cmbDestination.getSelectedItem().equals("Kolkata"))
						{
						totalCost=(Tax *(Milesk20 + fclass)) / 100;
						String sTax = String.format("$%.2f",totalCost);
						txtTax.setText(sTax);
						String SubTotal = String.format("$%.2f", Milesk12+ fclass);
						txtSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Milesk12+ fclass + totalCost);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("FIRST");
						txtTicket.setText("ONE WAY");
						txtAdult.setText("ONE");
						txtChild.setText("NIL");//9
						}
				else if ((rdbtnNewRadioButton_2.isSelected()) && (rdbtnNewRadioButton_4.isSelected()) && (rdbtnNewRadioButton_6.isSelected())
						&& cmbDestination.getSelectedItem().equals("Kolkata"))
						{
						totalCost=(Tax *(Milesk20 + fclass)) / 100;
						String sTax = String.format("$%.2f",totalCost - 18);
						txtTax.setText(sTax);
						String SubTotal = String.format("$%.2f", Milesk20 + fclass);
						txtSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f",( Milesk20 + fclass + totalCost) - 18);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("FIRST");
						txtTicket.setText("ONE WAY");
						txtAdult.setText("NIL");
						txtChild.setText("ONE");//10
						}
				else if ((rdbtnNewRadioButton_2.isSelected()) && (rdbtnNewRadioButton_3.isSelected()) && (rdbtnNewRadioButton_6.isSelected())
						&& cmbDestination.getSelectedItem().equals("Kolkata"))
						{
						totalCost=(Tax *(Milesk20 * 2)) / 100;
						String sTax = String.format("$%.2f",totalCost - 18);
						txtTax.setText(sTax);
						String SubTotal = String.format("$%.2f", Milesk20 * 2);
						txtSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f",(( Milesk20 + totalCost) * 2)-18);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("FIRST");
						txtTicket.setText("RETURN");
						txtAdult.setText("NIL");
						txtChild.setText("ONE");//11
						}
				else if ((rdbtnNewRadioButton_2.isSelected()) && (rdbtnNewRadioButton_3.isSelected()) && (rdbtnNewRadioButton_5.isSelected())
						&& cmbDestination.getSelectedItem().equals("Kolkata"))
						{
						totalCost=(Tax *(Milesk20 * 2)) / 100;
						String sTax = String.format("$%.2f",totalCost);
						txtTax.setText(sTax);
						String SubTotal = String.format("$%.2f", Milesk20 * 2);
						txtSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f",( Milesk20 + totalCost) * 2);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("FIRST");
						txtTicket.setText("RETURN");
						txtAdult.setText("ONE");
						txtChild.setText("NIL");//12
						}
			}
		});
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		//==========================Time===========================
				
				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				txtTime.setText(tTime.format(timer.getTime()));
				
				
				
				SimpleDateFormat Tdate = new SimpleDateFormat("dd-mmm-yyyy");
				txtDate.setText(Tdate.format(timer.getTime()));
				
				txtForm.setText("Bhubaneswer *");
				txtTo.setText((String) cmbDestination.getSelectedItem()+"*");
				
		//========================Random Number Generator===================================
				int num1;
				String q1 ="";
				num1 =  1325 + (int) (Math.random()*4238);
				q1 += num1 + 1325;
				txtTicketNo.setText(q1);
		//=================================================================================
				txtRoute.setText("any");
				
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnTotal.setBounds(66, 395, 89, 23);
		frame.getContentPane().add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(Color.GREEN);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTax.setText(null);
				txtSubTotal.setText(null);
				txtTotal.setText(null);
				rdbtnNewRadioButton.setSelected(false);
				rdbtnNewRadioButton_1.setSelected(false);
				rdbtnNewRadioButton_2.setSelected(false);
				rdbtnNewRadioButton_3.setSelected(false);
				rdbtnNewRadioButton_4.setSelected(false);
				rdbtnNewRadioButton_5.setSelected(false);
				rdbtnNewRadioButton_6.setSelected(false);
				cmbDestination.setSelectedItem("Destination");
				txtAdult.setText(null);
				txtChild.setText(null);
				txtClass.setText(null);
				txtTicket.setText(null);
				txtDate.setText(null);
				txtTime.setText(null);
				txtTo.setText(null);
				txtForm.setText(null);
				txtTicketNo.setText(null);
				txtPrice.setText(null);
				txtRoute.setText(null);
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnReset.setBounds(178, 395, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(Color.BLACK);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				HomePage obj= new HomePage("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Management",
						JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
						System.exit(0);
						
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnExit.setBounds(293, 395, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(49, 361, 380, 5);
		frame.getContentPane().add(separator_1_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(447, 98, 2, 324);
		frame.getContentPane().add(separator_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("Class");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_1.setBounds(472, 98, 67, 14);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Ticket");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_2.setBounds(576, 98, 67, 14);
		frame.getContentPane().add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Adult");
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_3.setBounds(681, 98, 67, 14);
		frame.getContentPane().add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("Child");
		lblNewLabel_3_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_4.setBounds(780, 98, 67, 14);
		frame.getContentPane().add(lblNewLabel_3_4);
		
		txtClass = new JTextField();
		txtClass.setHorizontalAlignment(SwingConstants.CENTER);
		txtClass.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtClass.setColumns(10);
		txtClass.setBounds(459, 133, 86, 20);
		frame.getContentPane().add(txtClass);
		
		txtTicket = new JTextField();
		txtTicket.setHorizontalAlignment(SwingConstants.CENTER);
		txtTicket.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtTicket.setColumns(10);
		txtTicket.setBounds(565, 133, 86, 20);
		frame.getContentPane().add(txtTicket);
		
		txtAdult = new JTextField();
		txtAdult.setHorizontalAlignment(SwingConstants.CENTER);
		txtAdult.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtAdult.setColumns(10);
		txtAdult.setBounds(672, 133, 86, 20);
		frame.getContentPane().add(txtAdult);
		
		txtChild = new JTextField();
		txtChild.setHorizontalAlignment(SwingConstants.CENTER);
		txtChild.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtChild.setColumns(10);
		txtChild.setBounds(775, 133, 86, 20);
		frame.getContentPane().add(txtChild);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(459, 123, 405, 2);
		frame.getContentPane().add(separator_3);
		
		JSeparator separator_3_1 = new JSeparator();
		separator_3_1.setBounds(456, 164, 405, 2);
		frame.getContentPane().add(separator_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("From");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_1_1.setBounds(472, 183, 67, 14);
		frame.getContentPane().add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("To");
		lblNewLabel_3_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_1_2.setBounds(472, 237, 67, 14);
		frame.getContentPane().add(lblNewLabel_3_1_2);
		
		txtForm = new JTextField();
		txtForm.setHorizontalAlignment(SwingConstants.CENTER);
		txtForm.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtForm.setColumns(10);
		txtForm.setBounds(549, 183, 102, 20);
		frame.getContentPane().add(txtForm);
		
		txtTo = new JTextField();
		txtTo.setHorizontalAlignment(SwingConstants.CENTER);
		txtTo.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtTo.setColumns(10);
		txtTo.setBounds(549, 231, 102, 20);
		frame.getContentPane().add(txtTo);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setOrientation(SwingConstants.VERTICAL);
		separator_2_1.setBounds(681, 175, 2, 191);
		frame.getContentPane().add(separator_2_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Ticket No");
		lblNewLabel_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_1_1_1.setBounds(732, 187, 67, 14);
		frame.getContentPane().add(lblNewLabel_3_1_1_1);
		
		txtTicketNo = new JTextField();
		txtTicketNo.setHorizontalAlignment(SwingConstants.CENTER);
		txtTicketNo.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtTicketNo.setColumns(10);
		txtTicketNo.setBounds(732, 212, 86, 20);
		frame.getContentPane().add(txtTicketNo);
		
		txtDate = new JTextField();
		txtDate.setHorizontalAlignment(SwingConstants.CENTER);
		txtDate.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtDate.setColumns(10);
		txtDate.setBounds(549, 282, 102, 20);
		frame.getContentPane().add(txtDate);
		
		txtTime = new JTextField();
		txtTime.setHorizontalAlignment(SwingConstants.CENTER);
		txtTime.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtTime.setColumns(10);
		txtTime.setBounds(549, 335, 102, 20);
		frame.getContentPane().add(txtTime);
		
		txtPrice = new JTextField();
		txtPrice.setHorizontalAlignment(SwingConstants.CENTER);
		txtPrice.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtPrice.setColumns(10);
		txtPrice.setBounds(732, 272, 86, 20);
		frame.getContentPane().add(txtPrice);
		
		txtRoute = new JTextField();
		txtRoute.setHorizontalAlignment(SwingConstants.CENTER);
		txtRoute.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtRoute.setColumns(10);
		txtRoute.setBounds(732, 335, 86, 20);
		frame.getContentPane().add(txtRoute);
		
		JLabel lblNewLabel_3_1_3 = new JLabel("Date");
		lblNewLabel_3_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_1_3.setBounds(472, 284, 67, 14);
		frame.getContentPane().add(lblNewLabel_3_1_3);
		
		JLabel lblNewLabel_3_1_4 = new JLabel("Time");
		lblNewLabel_3_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_1_4.setBounds(478, 338, 67, 14);
		frame.getContentPane().add(lblNewLabel_3_1_4);
		
		JLabel lblNewLabel_3_1_5 = new JLabel("Price");
		lblNewLabel_3_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_1_5.setBounds(720, 246, 67, 14);
		frame.getContentPane().add(lblNewLabel_3_1_5);
		
		JLabel lblNewLabel_3_1_6 = new JLabel("Route");
		lblNewLabel_3_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_1_6.setBounds(720, 310, 67, 14);
		frame.getContentPane().add(lblNewLabel_3_1_6);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				HomePage obj=new HomePage();
				obj.setVisible(true);
			}
		});
		btnNewButton.setBounds(873, 55, 103, 32);
		frame.getContentPane().add(btnNewButton);
	}
}
