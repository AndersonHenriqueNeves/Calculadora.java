/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculadora extends JFrame implements ActionListener {
    private JLabel l1,l2,l3;
    private JButton b1,b2,b3,b4,b5,b6,b7,b8;
    private JTextField t1,t2,t3;
    
    public Calculadora() {
        setTitle("Calculadora");
        setSize(350,90);
        getContentPane().setLayout(new GridLayout(3,5));
        l1 = new JLabel ("Num.1");
        l1.setFont(new Font("",Font.BOLD,14));
        l2 = new JLabel ("Num.2");
        l2.setFont(new Font("",Font.BOLD,14));
        l3 = new JLabel ("Total");
        l3.setFont(new Font("",Font.BOLD,14));
        b1 = new JButton ("+");
        b2 = new JButton ("-");
        b3 = new JButton ("x");
        b4 = new JButton ("/");
        b5 = new JButton ("Limpar");
        b6 = new JButton ("Logaritmo");
        b7 = new JButton ("Exp");
        b8 = new JButton ("Seno");
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t3.setEditable(false);
        getContentPane().add(l1);
        getContentPane().add(t1);
        getContentPane().add(b1);
        getContentPane().add(b2);
        getContentPane().add(b6);
        getContentPane().add(l2);
        getContentPane().add(t2);
        getContentPane().add(b3);
        getContentPane().add(b4);
        getContentPane().add(b7);
        getContentPane().add(l3);
        getContentPane().add(t3);
        getContentPane().add(b5);
        getContentPane().add(b8);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        
}
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b5) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            return;
        }
        float n1=0,n2=0,result=0;
        try { 
            n1 = Float.parseFloat(t1.getText());
            n2 = Float.parseFloat(t2.getText());
        } catch(NumberFormatException erro) {
            t3.setText("Erro");
            return;
        }
        if (e.getSource() == b1) {
            result = n1 + n2;
        }
        if(e.getSource() == b2) {
            result = n1 - n2;
        }
        if(e.getSource() == b3) {
            result = n1 * n2;
        }
        if(e.getSource() == b4) {
            result = n1/n2;
        }
        if(e.getSource() == b6) {
            result = (float)Math.log10(n1);
        }
        if(e.getSource() == b7) {
            result = (float) Math.exp(n1);
        }
        if(e.getSource() == b8) {
            result = (float) Math.sin(n1);
        }
        t3.setText(""+result);
 }
    public static void main(String[] args) {
        JFrame Calculadora = new Calculadora();
        Calculadora.show();
    }
    
}
