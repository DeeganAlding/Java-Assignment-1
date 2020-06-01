package passignment;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;

public class GUI extends JFrame {
	
	private ArrayList<Sort> sort;
	private Utilities utilities;
	private static JPanel panel_3;

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel tm = new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Country Names", "Coronavirus", "Test", "Symptoms", "Cure"
			}
		);

	
	public GUI(ArrayList<Sort> sort) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\DEEGAN\\OneDrive - Otago Polytechnic\\IN610 Java\\Java-Assignment-1\\PAssignment\\icon.ico"));
		setTitle("Coronavirus Trends");
		
		this.sort = sort;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 532);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.MAGENTA);
		tabbedPane.addTab("Home", null, panel, null);
		tabbedPane.setBackgroundAt(0, Color.LIGHT_GRAY);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 506, 348);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(tm);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Redraw Table");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drawTable();
			}
		});
		btnNewButton.setBounds(10, 370, 117, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reverse Order");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Collections.reverse(sort);
			drawTable();
			}
		});
		btnNewButton_1.setBounds(137, 370, 142, 23);
		panel.add(btnNewButton_1);
		
		JFormattedTextField frmtdtxtfldEnterCountryHere = new JFormattedTextField();
		frmtdtxtfldEnterCountryHere.setText("Country Name");
		frmtdtxtfldEnterCountryHere.setBounds(304, 371, 113, 20);
		panel.add(frmtdtxtfldEnterCountryHere);
		
		JButton btnNewButton_2 = new JButton("Check");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tm.setRowCount(0);
				
				String corona = frmtdtxtfldEnterCountryHere.getText();
				for (Sort s: sort) {									
					
					if (s.getCountry().toString().equals(corona))
					{
						Object[] object = new Object[5];
						object[0]= s.getCountry();
						object[1]= s.getCoronavirus();
						object[2]= s.getTest();
						object[3]= s.getSymptoms();
						object[4]= s.getCure();
						
						tm.addRow(object);
					}				
				}							
			}
		});
		btnNewButton_2.setBounds(427, 370, 89, 23);
		panel.add(btnNewButton_2);
		
		drawTable();
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(127, 255, 0));
		tabbedPane.addTab("Graph", null, panel_1, null);
		tabbedPane.setBackgroundAt(1, Color.LIGHT_GRAY);
		
		panel_3 = new JPanel();
		panel_1.add(panel_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(205, 133, 63));
		tabbedPane.addTab("Calculator", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Max Coronavirus Searches:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 53, 266, 32);
		panel_2.add(lblNewLabel);
		tabbedPane.setBackgroundAt(2, Color.LIGHT_GRAY);
		lblNewLabel.setText("Max Coronavirus Searches: " + Utilities.findMaxCoronavirus());
		
		JLabel lblNewLabel_1 = new JLabel("Max Coronavirus Searches: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 81, 323, 19);
		panel_2.add(lblNewLabel_1);
		lblNewLabel_1.setText("Min Coronavirus Searches: " + Utilities.findMinCoronavirus());
		
		JLabel lblNewLabel_2 = new JLabel("Average Coronavirus Searches:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 102, 323, 19);
		panel_2.add(lblNewLabel_2);
		lblNewLabel_2.setText("Average Coronavirus Searches: " + Utilities.findAverageCoronavirus());
		
		JLabel lblNewLabel_3 = new JLabel("Calculations");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_3.setBounds(10, 11, 323, 45);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Min Test Searches: ");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(10, 154, 276, 26);
		panel_2.add(lblNewLabel_5);
		lblNewLabel_5.setText("Min Test Searches: " + Utilities.findMinTest());
		
		JLabel lblNewLabel_4 = new JLabel("Max Test Searches: ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(10, 132, 292, 32);
		panel_2.add(lblNewLabel_4);
		lblNewLabel_4.setText("Max Test Searches: " + Utilities.findMaxTest());
		
		JLabel lblNewLabel_6 = new JLabel("Average Test Searches:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(10, 175, 266, 25);
		panel_2.add(lblNewLabel_6);
		lblNewLabel_6.setText("Average Test Searches: " + Utilities.findAverageTest());
		
		JLabel lblNewLabel_7 = new JLabel("Max Symptoms Searches:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(10, 211, 323, 32);
		panel_2.add(lblNewLabel_7);
		lblNewLabel_7.setText("Max Symptoms Searches: " + Utilities.findMaxSymptoms());
		
		JLabel lblNewLabel_8 = new JLabel("Min Symptoms Searches:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(10, 236, 292, 26);
		panel_2.add(lblNewLabel_8);
		lblNewLabel_8.setText("Min Symptoms Searches: " + Utilities.findMinSymptoms());
		
		JLabel lblNewLabel_9 = new JLabel("Average Symptoms Searches:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9.setBounds(10, 258, 363, 26);
		panel_2.add(lblNewLabel_9);
		lblNewLabel_9.setText("Average Symptoms Searches: " + Utilities.findAverageSymptoms());
		
		JLabel lblNewLabel_10 = new JLabel("Max Cure Searches:");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_10.setBounds(10, 297, 314, 26);
		panel_2.add(lblNewLabel_10);
		lblNewLabel_10.setText("Max Cure Searches: " + Utilities.findMaxCure());
		
		JLabel lblNewLabel_11 = new JLabel("Min Cure Searches:");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_11.setBounds(10, 319, 276, 26);
		panel_2.add(lblNewLabel_11);
		lblNewLabel_11.setText("Min Cure Searches: " + Utilities.findMinCure());
		
		JLabel lblNewLabel_12 = new JLabel("Average Cure Searches:");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_12.setBounds(10, 344, 292, 19);
		panel_2.add(lblNewLabel_12);
		lblNewLabel_12.setText("Average Cure Searches: " + Utilities.findAverageCure());
		
		createAPie();
	}
	
	
	public void drawTable()
	{
	
		tm.setRowCount(0);
		for (int i = 0; i < 250; i++) {
			Object[] object = new Object[5];
			object[0]= sort.get(i).getCountry();
			object[1]= sort.get(i).getCoronavirus();
			object[2]= sort.get(i).getTest();
			object[3]= sort.get(i).getSymptoms();
			object[4]= sort.get(i).getCure();
			tm.addRow(object);
		}
	}
	
	public void createAPie()
	{
		DefaultPieDataset data = new DefaultPieDataset();
		
		data.setValue(sort.get(157).getCountry(), sort.get(157).getCoronavirus());
		data.setValue(sort.get(13).getCountry(), sort.get(13).getCoronavirus());
		data.setValue(sort.get(236).getCountry(), sort.get(236).getCoronavirus());
		data.setValue(sort.get(235).getCountry(), sort.get(235).getCoronavirus());
		data.setValue(sort.get(203).getCountry(), sort.get(203).getCoronavirus());
		data.setValue(sort.get(110).getCountry(), sort.get(110).getCoronavirus());
		
		JFreeChart chart = ChartFactory.createPieChart("Coronavirus Searches By Country", data, true, true, Locale.ENGLISH);
		
		ChartPanel mypanel = new ChartPanel(chart);

		panel_3.add(mypanel, "name_149179152001100");
		
	}
}
