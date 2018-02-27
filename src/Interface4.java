import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Interface4 extends JFrame {
	static int résultat;

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface4 frame = new Interface4();
					frame.setTitle("QCM");
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void Close() {
		super.dispose();
		
		
	}

	
	public Interface4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblQuestionQuel = new JLabel("3) Au Moyen-Age, comment appelait-on les villages fortifiés ?");
		lblQuestionQuel.setForeground(Color.BLUE);
		lblQuestionQuel.setBounds(19, 25, 550, 33);
		contentPane.add(lblQuestionQuel);
		
		JButton btnNewButton = new JButton("Tour");
		btnNewButton.setBounds(250, 70, 127, 48);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				résultat++;
				
				Close();
				Interface5 if5 = new Interface5();
				if5.setTitle("QCM");
				if5.setLocationRelativeTo(null);
				if5.setVisible(true);
				
				
			}
		});
		
		JButton btnNewButton_1 = new JButton("Bastide");
		btnNewButton_1.setBounds(250, 130, 127, 48);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				Close();
				Interface5 if5 = new Interface5();
				if5.setLocationRelativeTo(null);
				if5.setVisible(true);
				
			}
		});
		
		JButton btnNewButton_2 = new JButton("Chateau fort");
		btnNewButton_2.setBounds(250, 190, 127, 48);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Close();
				Interface5 if5 = new Interface5();
				if5.setLocationRelativeTo(null);
				if5.setVisible(true);
				
				
			}
		});
	}

	


	}


