package usingJavaFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.Toolkit;

public class CalculadoraBasica extends JFrame {

	private JPanel contentPane;
	private JTextField txtResult;
	private JTextField txtNum1;
	private JTextField txtNum2;

	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraBasica frame = new CalculadoraBasica();
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
	public CalculadoraBasica() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CalculadoraBasica.class.getResource("/usingJavaFrame/images/calc (1).png")));
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 280, 270);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
			
		txtNum1 = new JTextField();
		txtNum1.setToolTipText("Digite o primeiro n\u00FAmero");
		txtNum1.setHorizontalAlignment(SwingConstants.CENTER);
		txtNum1.setColumns(10);
		txtNum1.setBounds(10, 41, 90, 28);
		contentPane.add(txtNum1);
		
		txtNum2 = new JTextField();
		txtNum2.setToolTipText("Digite o segundo n\u00FAmero");
		txtNum2.setHorizontalAlignment(SwingConstants.CENTER);
		txtNum2.setColumns(10);
		txtNum2.setBounds(154, 41, 90, 28);
		contentPane.add(txtNum2);
		
		JLabel lblNmero = new JLabel("N\u00FAmero 1");
		lblNmero.setHorizontalAlignment(SwingConstants.CENTER);
		lblNmero.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNmero.setBounds(10, 16, 90, 14);
		contentPane.add(lblNmero);
		
		JLabel lblNmero_1 = new JLabel("N\u00FAmero 2");
		lblNmero_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNmero_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNmero_1.setBounds(154, 21, 90, 14);
		contentPane.add(lblNmero_1);
		
		
		JButton btnSub = new JButton("-");
		btnSub.setToolTipText("Subtra\u00E7\u00E3o");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double minuendo = Double.parseDouble(txtNum1.getText());
				
				double subtraendo = Double.parseDouble(txtNum2.getText());
				
				double subtracao = minuendo - subtraendo;
				
				txtResult.setText(subtracao+"");
				
				txtNum1.setText("");
				
				txtNum2.setText("");
				
				txtNum1.grabFocus();

			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSub.setBounds(72, 80, 48, 48);
		contentPane.add(btnSub);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setToolTipText("Divis\u00E3o");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double dividendo = Double.parseDouble(txtNum1.getText());
				
				double divisor = Double.parseDouble(txtNum2.getText());
				
				double divisao = dividendo / divisor;
				
				txtResult.setText(divisao+"");		
				
				txtNum1.setText("");
				
				txtNum2.setText("");
				
				txtNum1.grabFocus();
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDiv.setBounds(196, 80, 48, 48);
		contentPane.add(btnDiv);
		
		JButton btnSum = new JButton("+");
		btnSum.setToolTipText("Soma");
		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double parcela1 = Double.parseDouble(txtNum1.getText());
				
				double parcela2 = Double.parseDouble(txtNum2.getText());
				
				double soma = parcela1 + parcela2;
				
				txtResult.setText(soma+"");
				
				txtNum1.setText("");
				
				txtNum2.setText("");
				
				txtNum1.grabFocus();
								
			}
		});
		btnSum.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnSum.setBounds(10, 80, 48, 48);
		contentPane.add(btnSum);
		
		JButton btnMult = new JButton("*");
		btnMult.setToolTipText("Multiplica\u00E7\u00E3o");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double fator1 = Double.parseDouble(txtNum1.getText());
				
				double fator2 = Double.parseDouble(txtNum2.getText());
				
				double multiplicacao = fator1 * fator2;
				
				txtResult.setText(multiplicacao+"");
				
				txtNum1.setText("");
				
				txtNum2.setText("");
				
				txtNum1.grabFocus();
				
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnMult.setBounds(134, 80, 48, 48);
		contentPane.add(btnMult);
		
		
		JLabel lblNewLabel = new JLabel("RESULTADO");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(92, 139, 90, 14);
		contentPane.add(lblNewLabel);		
		
		txtResult = new JTextField();
		txtResult.setToolTipText("Resultado da opera\u00E7\u00E3o");
		txtResult.setHorizontalAlignment(SwingConstants.CENTER);
		txtResult.setBackground(Color.WHITE);
		txtResult.setEditable(false);
		txtResult.setBounds(92, 153, 90, 28);
		contentPane.add(txtResult);
		txtResult.setColumns(10);
		
		  
		JButton btnClear = new JButton("LIMPAR");
		btnClear.setToolTipText("Clique aqui para limpar os campos");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtNum1.setText("");
				
				txtNum2.setText("");
				
				txtResult.setText("");
				
				txtNum1.grabFocus();
				
			}
		});
		
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnClear.setBounds(92, 192, 90, 28);
		contentPane.add(btnClear);
		
		
	}
}
