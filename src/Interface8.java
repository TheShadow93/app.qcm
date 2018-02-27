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

public class Interface8 extends JFrame {
	static int résultat;

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface8 frame = new Interface8();
					frame.setVisible(true);
					frame.setTitle("QCM");
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void Close() {
		super.dispose();
		
		
	}

	
	public Interface8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblQuestionQuel = new JLabel("7) Quel joueur de football a été l'objet du plus gros transfert entre deux clubs en 2017 ?");
		lblQuestionQuel.setForeground(Color.BLUE);
		lblQuestionQuel.setBounds(19, 25, 555, 33);
		contentPane.add(lblQuestionQuel, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("Neymar");
		btnNewButton.setBounds(250, 70, 127, 48);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				résultat++;
				Close();
				Interface9 if9 = new Interface9();
				if9.setLocationRelativeTo(null);
				if9.setVisible(true);
				
				
			}
		});
		
		JButton btnNewButton_1 = new JButton("Ronaldo");
		btnNewButton_1.setBounds(250, 130, 127, 48);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Close();
				Interface9 if9 = new Interface9();
				if9.setLocationRelativeTo(null);
				if9.setVisible(true);
				
				
			}
		});
		
		JButton btnNewButton_2 = new JButton("Messi");
		btnNewButton_2.setBounds(250, 190, 127, 48);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Close();
				Interface9 if9 = new Interface9();
				if9.setTitle("QCM");
				if9.setLocationRelativeTo(null);
				if9.setVisible(true);
				
				
			}
		});
	}

	


	}


