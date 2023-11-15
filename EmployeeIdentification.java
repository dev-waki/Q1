package employeeidentification;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class EmployeeIdentification {

	private JFrame frmGeorgetownCleaningServices;
	private JTextField txtEmployeeName;
	private JTextField txtHourlySalary;
	private JTextField txtMon1;
	private JTextField txtTue1;
	private JTextField txtWed1;
	private JTextField txtThur1;
	private JTextField txtFri1;
	private JTextField txtSat1;
	private JTextField txtSun1;
	private JTextField txtSun2;
	private JTextField txtSat2;
	private JTextField txtFri2;
	private JTextField txtThur2;
	private JTextField txtWed2;
	private JTextField txtTue2;
	private JTextField txtMon2;
	private JButton btnProcess;
	private JLabel lblMonday;
	private JLabel lblTuesday;
	private JLabel lblWednesday;
	private JLabel lblThursday;
	private JLabel lblFriday;
	private JLabel lblSaturday;
	private JLabel lblSunday;
	private JButton btnClose;
	private JTextField txtRegularHours;
	private JTextField txtRegularAmt;
	private JTextField txtOvertimeHours;
	private JTextField txtOvertimeAmt;
	private JLabel lblHours;
	private JLabel lblAmount;
	private JTextField txtNetPay;
	private JLabel lblNetPay;
	private JLabel lblRegular;
	private JLabel lblOvertime;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeIdentification window = new EmployeeIdentification();
					window.frmGeorgetownCleaningServices.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EmployeeIdentification() {
		initialize();
	}
	static double[] getHours(double[] weekHours){
		double[] hours = new double[2];
		for(int i = 0 ; i< weekHours.length ; i++){
			if(weekHours[i] > 8){
				hours[1] += weekHours[i] - 8;
				hours[0] += 8;
			}
			else{
				hours[0] += weekHours[i];
			}
		}
		return hours;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGeorgetownCleaningServices = new JFrame();
		frmGeorgetownCleaningServices.setFont(new Font("Cooper Black", Font.BOLD, 14));
		frmGeorgetownCleaningServices.setTitle("GeorgeTown Cleaning Services-Employee Payroll");
		frmGeorgetownCleaningServices.setBounds(100, 100, 1001, 584);
		frmGeorgetownCleaningServices.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGeorgetownCleaningServices.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Employee Identification", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(15, 38, 949, 101);
		frmGeorgetownCleaningServices.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblEmployeeName = new JLabel("Employee Name:");
		lblEmployeeName.setBounds(60, 51, 131, 20);
		panel.add(lblEmployeeName);
		
		txtEmployeeName = new JTextField();
		lblEmployeeName.setLabelFor(txtEmployeeName);
		txtEmployeeName.setBounds(206, 48, 229, 26);
		panel.add(txtEmployeeName);
		txtEmployeeName.setColumns(10);
		
		JLabel lblHourlySalary = new JLabel("Hourly Salary:");
		lblHourlySalary.setBounds(471, 51, 101, 20);
		panel.add(lblHourlySalary);
		
		txtHourlySalary = new JTextField();
		txtHourlySalary.setBounds(587, 48, 208, 26);
		panel.add(txtHourlySalary);
		txtHourlySalary.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Time Sheet", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(15, 167, 949, 172);
		frmGeorgetownCleaningServices.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblFirstWeek = new JLabel("First Week:");
		lblFirstWeek.setBounds(34, 78, 103, 20);
		panel_1.add(lblFirstWeek);
		
		JLabel lblSecondWeek = new JLabel("Second Week:");
		lblSecondWeek.setBounds(34, 122, 103, 20);
		panel_1.add(lblSecondWeek);
		
		txtMon1 = new JTextField();
		txtMon1.setBounds(137, 75, 87, 26);
		panel_1.add(txtMon1);
		txtMon1.setColumns(10);
		
		txtTue1 = new JTextField();
		txtTue1.setColumns(10);
		txtTue1.setBounds(239, 75, 87, 26);
		panel_1.add(txtTue1);
		
		txtWed1 = new JTextField();
		txtWed1.setColumns(10);
		txtWed1.setBounds(341, 75, 87, 26);
		panel_1.add(txtWed1);
		
		txtThur1 = new JTextField();
		txtThur1.setColumns(10);
		txtThur1.setBounds(443, 75, 87, 26);
		panel_1.add(txtThur1);
		
		txtFri1 = new JTextField();
		txtFri1.setColumns(10);
		txtFri1.setBounds(545, 75, 87, 26);
		panel_1.add(txtFri1);
		
		txtSat1 = new JTextField();
		txtSat1.setColumns(10);
		txtSat1.setBounds(647, 75, 87, 26);
		panel_1.add(txtSat1);
		
		txtSun1 = new JTextField();
		txtSun1.setColumns(10);
		txtSun1.setBounds(749, 75, 87, 26);
		panel_1.add(txtSun1);
		
		txtSun2 = new JTextField();
		txtSun2.setColumns(10);
		txtSun2.setBounds(749, 116, 87, 26);
		panel_1.add(txtSun2);
		
		txtSat2 = new JTextField();
		txtSat2.setColumns(10);
		txtSat2.setBounds(647, 116, 87, 26);
		panel_1.add(txtSat2);
		
		txtFri2 = new JTextField();
		txtFri2.setColumns(10);
		txtFri2.setBounds(545, 116, 87, 26);
		panel_1.add(txtFri2);
		
		txtThur2 = new JTextField();
		txtThur2.setColumns(10);
		txtThur2.setBounds(443, 116, 87, 26);
		panel_1.add(txtThur2);
		
		txtWed2 = new JTextField();
		txtWed2.setColumns(10);
		txtWed2.setBounds(341, 116, 87, 26);
		panel_1.add(txtWed2);
		
		txtTue2 = new JTextField();
		txtTue2.setColumns(10);
		txtTue2.setBounds(239, 116, 87, 26);
		panel_1.add(txtTue2);
		
		txtMon2 = new JTextField();
		txtMon2.setColumns(10);
		txtMon2.setBounds(137, 116, 87, 26);
		panel_1.add(txtMon2);
		
		lblMonday = new JLabel("Monday");
		lblMonday.setHorizontalAlignment(SwingConstants.CENTER);
		lblMonday.setBounds(137, 39, 87, 26);
		panel_1.add(lblMonday);
		
		lblTuesday = new JLabel("Tuesday");
		lblTuesday.setHorizontalAlignment(SwingConstants.CENTER);
		lblTuesday.setBounds(239, 39, 87, 26);
		panel_1.add(lblTuesday);
		
		lblWednesday = new JLabel("Wednesday");
		lblWednesday.setHorizontalAlignment(SwingConstants.CENTER);
		lblWednesday.setBounds(341, 39, 87, 26);
		panel_1.add(lblWednesday);
		
		lblThursday = new JLabel("Thursday");
		lblThursday.setHorizontalAlignment(SwingConstants.CENTER);
		lblThursday.setBounds(443, 39, 87, 26);
		panel_1.add(lblThursday);
		
		lblFriday = new JLabel("Friday");
		lblFriday.setHorizontalAlignment(SwingConstants.CENTER);
		lblFriday.setBounds(545, 39, 87, 26);
		panel_1.add(lblFriday);
		
		lblSaturday = new JLabel("Saturday");
		lblSaturday.setHorizontalAlignment(SwingConstants.CENTER);
		lblSaturday.setBounds(647, 39, 87, 26);
		panel_1.add(lblSaturday);
		
		lblSunday = new JLabel("Sunday");
		lblSunday.setHorizontalAlignment(SwingConstants.CENTER);
		lblSunday.setBounds(749, 39, 87, 26);
		panel_1.add(lblSunday);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Payroll Processing", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(15, 362, 949, 139);
		frmGeorgetownCleaningServices.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		btnProcess = new JButton("Process It");
		btnProcess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				double[] week1Hours = {Double.valueOf(txtMon1.getText()),Double.valueOf(txtTue1.getText()),Double.valueOf(txtWed1.getText()),Double.valueOf(txtThur1.getText()),Double.valueOf(txtFri1.getText()),Double.valueOf(txtSat1.getText()),Double.valueOf(txtSun1.getText())};
				double[] week2Hours = {Double.valueOf(txtMon2.getText()),Double.valueOf(txtTue2.getText()),Double.valueOf(txtWed2.getText()),Double.valueOf(txtThur2.getText()),Double.valueOf(txtFri2.getText()),Double.valueOf(txtSat2.getText()),Double.valueOf(txtSun2.getText())};
				double[] time = getHours(week1Hours);
				double[] time1 = getHours(week2Hours);
				double regularHours = time[0] + time1[0];
				double overtimeHours = time[1] + time1[1];
				double hourlySalary = Double.valueOf(txtHourlySalary.getText());
				double regularPay = regularHours * hourlySalary;
				double overtimePay = overtimeHours * hourlySalary;
				double netPay = regularPay + overtimePay;
				txtRegularHours.setText(String.valueOf(regularHours));
				txtRegularAmt.setText(String.valueOf(regularPay));
				txtOvertimeHours.setText(String.valueOf(overtimeHours));
				txtOvertimeAmt.setText(String.valueOf(overtimePay));
				txtNetPay.setText(String.valueOf(netPay));
			}
		});
		btnProcess.setBounds(15, 35, 121, 88);
		panel_2.add(btnProcess);
		
		btnClose = new JButton("Close");
		btnClose.setBounds(807, 35, 127, 88);
		panel_2.add(btnClose);
		
		txtRegularHours = new JTextField();
		txtRegularHours.setColumns(10);
		txtRegularHours.setBounds(285, 66, 87, 26);
		panel_2.add(txtRegularHours);
		
		txtRegularAmt = new JTextField();
		txtRegularAmt.setColumns(10);
		txtRegularAmt.setBounds(406, 66, 87, 26);
		panel_2.add(txtRegularAmt);
		
		txtOvertimeHours = new JTextField();
		txtOvertimeHours.setColumns(10);
		txtOvertimeHours.setBounds(285, 97, 87, 26);
		panel_2.add(txtOvertimeHours);
		
		txtOvertimeAmt = new JTextField();
		txtOvertimeAmt.setColumns(10);
		txtOvertimeAmt.setBounds(406, 97, 87, 26);
		panel_2.add(txtOvertimeAmt);
		
		lblHours = new JLabel("Hours");
		lblHours.setHorizontalAlignment(SwingConstants.CENTER);
		lblHours.setBounds(285, 35, 87, 26);
		panel_2.add(lblHours);
		
		lblAmount = new JLabel("Amount");
		lblAmount.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmount.setBounds(406, 35, 87, 26);
		panel_2.add(lblAmount);
		
		txtNetPay = new JTextField();
		txtNetPay.setColumns(10);
		txtNetPay.setBounds(680, 66, 87, 26);
		panel_2.add(txtNetPay);
		
		lblNetPay = new JLabel("Net Pay:");
		lblNetPay.setHorizontalAlignment(SwingConstants.CENTER);
		lblNetPay.setBounds(578, 66, 87, 26);
		panel_2.add(lblNetPay);
		
		lblRegular = new JLabel("Regular:");
		lblRegular.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegular.setBounds(170, 66, 87, 26);
		panel_2.add(lblRegular);
		
		lblOvertime = new JLabel("Overtime:");
		lblOvertime.setHorizontalAlignment(SwingConstants.CENTER);
		lblOvertime.setBounds(170, 97, 87, 26);
		panel_2.add(lblOvertime);
	}
}
