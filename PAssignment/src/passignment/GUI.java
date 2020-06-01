package passignment;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
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

public class GUI extends JFrame {
	
	private ArrayList<Sort> sort;
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

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					GUI frame = new GUI();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	
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
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drawTable();
			}
		});
		btnNewButton.setBounds(20, 370, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sort Coronavirus");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sortCoronavirusOrder();
			}
		});
		btnNewButton_1.setBounds(121, 370, 113, 23);
		panel.add(btnNewButton_1);
		
		JFormattedTextField frmtdtxtfldEnterCountryHere = new JFormattedTextField();
		frmtdtxtfldEnterCountryHere.setText("Country Name");
		frmtdtxtfldEnterCountryHere.setBounds(244, 371, 113, 20);
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
		btnNewButton_2.setBounds(367, 370, 89, 23);
		panel.add(btnNewButton_2);
		
		drawTable();
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(138, 43, 226));
		tabbedPane.addTab("Graph", null, panel_1, null);
		tabbedPane.setBackgroundAt(1, Color.LIGHT_GRAY);
		
		panel_3 = new JPanel();
		panel_1.add(panel_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(75, 0, 130));
		tabbedPane.addTab("Calculator", null, panel_2, null);
		tabbedPane.setBackgroundAt(2, Color.LIGHT_GRAY);
		
		createAPie();
	}
	
	public void sortCoronavirusOrder()
	{
		ArrayList<String> sortData = new ArrayList<>();
		int max = 0;
		
		tm.setRowCount(0);
		for (int i = 0; i < 250; i++) {
			Object[] object = new Object[5];
			object[0]= sort.get(i).getCountry();
			object[1]= sort.get(i).getCoronavirus();
			object[2]= sort.get(i).getTest();
			object[3]= sort.get(i).getSymptoms();
			object[4]= sort.get(i).getCure();
			
			int test = Integer.parseInt((String) object[1]); 
			
			if (test >= max)
			{
				max = test;
				tm.addRow(object);
			}			
			
		}
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
