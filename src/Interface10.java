import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class Interface10 extends JFrame {
	static int résultat;

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface10 frame = new Interface10();
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

	
	public Interface10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblQuestionQuel = new JLabel("9) Choisissez la bonne forme : Il est ... être la à 17 heures.");
		lblQuestionQuel.setForeground(Color.BLUE);
		lblQuestionQuel.setBounds(19, 25, 550, 33);
		contentPane.add(lblQuestionQuel);
		
		JButton btnNewButton = new JButton("sense");
		btnNewButton.setBounds(250, 70, 127, 48);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Close();
				Interface11 if11 = new Interface11();
				if11.setLocationRelativeTo(null);
				if11.setVisible(true);
				
				
			}
		});
		
		JButton btnNewButton_1 = new JButton("sence");
		btnNewButton_1.setBounds(250, 130, 127, 48);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Close();
				Interface11 if11 = new Interface11();
				if11.setLocationRelativeTo(null);
				if11.setVisible(true);
				
				
			}
		});
		
		JButton btnNewButton_2 = new JButton("censé");
		btnNewButton_2.setBounds(250, 190, 127, 48);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				résultat++;
				Close();
				Interface11 if11 = new Interface11();
				if11.setLocationRelativeTo(null);
				if11.setVisible(true);
				
				
			}
		});
	}

	


	}


