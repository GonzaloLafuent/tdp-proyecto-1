package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JLabel luLabel;
	private JTextField luTextField;
	private JTextField apellidoTextField;
	private JTextField nombreTextField;
	private JTextField mailTextField;
	private JTextField gitTextField;

	public SimplePresentationScreen(Student studentData) {
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentacion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 265));
		setResizable(false);
		setContentPane(contentPane);
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		
		init();
	}
	
	private void init() {
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Informacion del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		
		luLabel = new JLabel("LU");
		
		luTextField = new JTextField();
		luTextField.setEditable(false);
		luTextField.setColumns(10);
		
		luTextField.setText(Integer.toString(studentData.getId()));
		
		JLabel apellidoLabel = new JLabel("Apellido");
		
		apellidoTextField = new JTextField();
		apellidoTextField.setEditable(false);
		apellidoTextField.setColumns(10);
		
		apellidoTextField.setText(studentData.getLastName());
		
		JLabel nombreLabel = new JLabel("Nombre");
		
		nombreTextField = new JTextField();
		nombreTextField.setEditable(false);
		nombreTextField.setColumns(10);
		
		nombreTextField.setText(studentData.getFirstName());
		
		JLabel mailLabel = new JLabel("E-mail");
		
		mailTextField = new JTextField();
		mailTextField.setEditable(false);
		mailTextField.setColumns(10);
		
		mailTextField.setText(studentData.getMail());
		
		JLabel gitLabel = new JLabel("Github URL");
		
		gitTextField = new JTextField();
		gitTextField.setEditable(false);
		gitTextField.setColumns(10);
		
		gitTextField.setText(studentData.getGithubURL());
		
		GroupLayout gl_tabInformation = new GroupLayout(tabInformation);
		gl_tabInformation.setHorizontalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(gitLabel)
						.addComponent(nombreLabel)
						.addComponent(mailLabel)
						.addComponent(luLabel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(apellidoLabel))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(apellidoTextField, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
						.addComponent(nombreTextField, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
						.addComponent(mailTextField, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
						.addComponent(gitTextField, GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
						.addComponent(luTextField, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_tabInformation.setVerticalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(luLabel)
						.addComponent(luTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(apellidoLabel)
						.addComponent(apellidoTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(nombreLabel)
						.addComponent(nombreTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(mailLabel)
						.addComponent(mailTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(gitLabel)
						.addComponent(gitTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(15, Short.MAX_VALUE))
		);
		tabInformation.setLayout(gl_tabInformation);
		contentPane.add(tabbedPane, BorderLayout.WEST);
	}
}
