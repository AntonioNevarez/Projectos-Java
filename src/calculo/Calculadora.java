/*
Ejercicio Calculadora Basica
Autor: Jesus Antonio Nevarez Lopez
Fecha: 11/02/2026

Se utilizo los componentes swing y awt para realizar una calculadoras
con operaciones sencillas, el desafio fue principalmente la logica
del operador = debido a que no se podia trabajar realizar calculos
con los numeros si tenian operadores (strings), por lo que con el metodo
split se pudo solucionar.
 */

package calculo;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Font;

public class Calculadora {
	protected static JFrame ventana;
	private JTextField resultado;
	private JButton suma;
	private JButton resta;
	private JButton multiplicacion;
	private JButton division;
	private JButton limpiar;
	private JButton igual;
	private JButton uno;
	private JButton dos;
	private JButton tres;
	private JButton cuatro;
	private JButton cinco;
	private JButton seis;
	private JButton siete;
	private JButton ocho;
	private JButton nueve;
	private JButton cero;
	String textoActual;
	CalcularOperadores operador;

	
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try{
					Calculadora abaco = new Calculadora(); 
					abaco.ventana.setVisible(true); 
				} catch(Exception e){
					e.printStackTrace();
					
				}
			}
		});
	}
	public Calculadora(){
		initializate();
	}
	private void initializate() {
		ventana = new JFrame("Calculadora Sencilla");
		ventana.setBounds(123,321,395,513);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.getContentPane().setLayout(null);
		
		resultado = new JTextField();
		resultado.setBounds(0,0,380,78);
		resultado.setFont(new Font("Unispace", Font.PLAIN, 52));
		ventana.getContentPane().add(resultado);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 76, 380, 2);
		ventana.getContentPane().add(separator);

		JButton borrarTotal = new JButton("Limpiar");
		borrarTotal.setFont(new Font("Unispace", Font.PLAIN, 20));
		borrarTotal.setBounds(0,78,190,58);
		borrarTotal.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent args0){
				try{
					resultado.setText("");
					}
				
				catch(Exception e){
					e.printStackTrace();

				}
			}
		});
		ventana.getContentPane().add(borrarTotal);

		JButton borrar = new JButton("<--");
		borrar.setFont(new Font("Unispace", Font.PLAIN, 26));
		borrar.setBounds(190,78,190,58);
		borrar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent args0){
				
				try{
					StringBuilder sb = new StringBuilder(resultado.getText());
					if (sb.length() > 0) {
					    sb.deleteCharAt(sb.length() - 1);
					    resultado.setText(sb.toString());
					}
				
				}catch(Exception e){
					e.printStackTrace();

				}
			}
		});
		ventana.getContentPane().add(borrar);
		
		uno = new JButton("1");
		uno.setFont(new Font("Unispace", Font.PLAIN, 26));
		uno.setBounds(0,136,95,86);
		uno.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent args0){
				try{
					textoActual=resultado.getText();
					resultado.setText(textoActual+"1");
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		});
		ventana.getContentPane().add(uno);

		dos = new JButton("2");
		dos.setFont(new Font("Unispace", Font.PLAIN, 26));
		dos.setBounds(95,136,95,86);
		dos.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent args0){
				try{
					textoActual=resultado.getText();
					resultado.setText(textoActual+"2");
				
				
				}catch(Exception e){
				}
			}
		});
		ventana.getContentPane().add(dos);

		tres = new JButton("3");
		tres.setFont(new Font("Unispace", Font.PLAIN, 26));
		tres.setBounds(190,136,95,86);
		tres.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent args0){
				try{
					textoActual=resultado.getText();
					resultado.setText(textoActual+"3");

				}catch(Exception e){
					e.printStackTrace();

				}
			}
		});
		ventana.getContentPane().add(tres);

		suma = new JButton("+");
		suma.setBounds(285,136,95,86);
		suma.setFont(new Font("Unispace", Font.PLAIN, 26));
		suma.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent args0){
				try{
					textoActual=resultado.getText();
					resultado.setText(textoActual+"+");

					
				}catch(Exception e){
					e.printStackTrace();
					
				}
				
			}
		});
		ventana.getContentPane().add(suma);

		cuatro = new JButton("4");
		cuatro.setFont(new Font("Unispace", Font.PLAIN, 26));
		cuatro.setBounds(0,222,95,86);
		cuatro.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent args0){
				try{
					textoActual=resultado.getText();
					resultado.setText(textoActual+"4");

				}catch(Exception e){
					e.printStackTrace();

				}
			}
		});
		ventana.getContentPane().add(cuatro);

		cinco = new JButton("5");
		cinco.setFont(new Font("Unispace", Font.PLAIN, 26));
		cinco.setBounds(95,222,95,86);
		cinco.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent args0){
				try{
					textoActual=resultado.getText();
					resultado.setText(textoActual+"5");
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		});
		ventana.getContentPane().add(cinco);

		seis = new JButton("6");
		seis.setFont(new Font("Unispace", Font.PLAIN, 26));
		seis.setBounds(190,222,95,86);
		seis.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent args0){
				try{
					textoActual=resultado.getText();
					resultado.setText(textoActual+"6");
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		});
		ventana.getContentPane().add(seis);

		resta= new JButton("-");
		resta.setBounds(285,222,95,86);
		resta.setFont(new Font("Unispace", Font.PLAIN, 26));
		resta.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent args0){
				try{
					textoActual=resultado.getText();
					resultado.setText(textoActual+"-");

					
				}catch(Exception e){
					e.printStackTrace();
					
				}
				
			}
		});
		ventana.getContentPane().add(resta);

		siete = new JButton("7");
		siete.setFont(new Font("Unispace", Font.PLAIN, 26));
		siete.setBounds(0,308,95,86);
		siete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent args0){
				try{
					textoActual=resultado.getText();
					resultado.setText(textoActual+"7");
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		});
		ventana.getContentPane().add(siete);

		ocho = new JButton("8");
		ocho.setFont(new Font("Unispace", Font.PLAIN, 26));
		ocho.setBounds(95,308,95,86);
		ocho.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent args0){
				try{
					textoActual=resultado.getText();
					resultado.setText(textoActual+"8");
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		});
		ventana.getContentPane().add(ocho);

		nueve = new JButton("9");
		nueve.setFont(new Font("Unispace", Font.PLAIN, 26));
		nueve.setBounds(190,308,95,86);
		nueve.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent args0){
				try{
					textoActual=resultado.getText();
					resultado.setText(textoActual+"9");
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		});
		ventana.getContentPane().add(nueve);

		multiplicacion = new JButton("X");
		multiplicacion.setBounds(285,308,95,86);
		multiplicacion.setFont(new Font("Unispace", Font.PLAIN, 26));
		multiplicacion.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent args0){
				try{
					textoActual=resultado.getText();
					resultado.setText(textoActual+"*");
				}catch(Exception e){
					e.printStackTrace();
					
				}
				
			}
		});
		ventana.getContentPane().add(multiplicacion);

		cero = new JButton("0");
		cero.setFont(new Font("Unispace", Font.PLAIN, 26));
		cero.setBounds(0,394,95,86);
		cero.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent args0){
				try{
					textoActual=resultado.getText();
					resultado.setText(textoActual+"0");
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		});
		ventana.getContentPane().add(cero);

		igual = new JButton("=");
		igual.setFont(new Font("Unispace", Font.PLAIN, 26));
		igual.setBounds(95,394,190,86);
		igual.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent args0){
				try{
					textoActual = resultado.getText();
					operador = new CalcularOperadores();
					String resfinal=operador.calcular(textoActual);
					resultado.setText(resfinal);
				}catch(Exception e){
					e.printStackTrace();
					JOptionPane.showMessageDialog(ventana, "Ingrese valores correctos","!!!!!",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		ventana.getContentPane().add(igual);

		division = new JButton("/");
		division.setFont(new Font("Unispace", Font.PLAIN, 26));
		division.setBounds(285,394,95,86);
		division.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent args0){
				try{
					textoActual=resultado.getText();
					resultado.setText(textoActual+"/");
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		});
		ventana.getContentPane().add(division);
	}
}
