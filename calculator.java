import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class calculator extends JFrame implements ActionListener{
    static JFrame f;
    static JTextField t;
    static JTextField t1;

    String s0, s1, s2;

    calculator(){
        s0=s1=s2="";
    }

    public static void main(String[] args){
        f = new JFrame("Calculator");
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        calculator c = new calculator();

        t = new JTextField(16);

        t.setEditable(false);

        JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, s, a, m, deci, eq, eq1,d;

        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");

        eq1 = new JButton("=");

        a = new JButton("+");
        s = new JButton("-");
        d = new JButton("/");
        m = new JButton("*");
        eq = new JButton("C");

        deci = new JButton(".");

        JPanel p = new JPanel();

        eq.addActionListener(c);
        d.addActionListener(c);
        s.addActionListener(c);
        a.addActionListener(c);
        b9.addActionListener(c);
        b8.addActionListener(c);
        b7.addActionListener(c);
        b6.addActionListener(c);
        b5.addActionListener(c);
        b4.addActionListener(c);
        b3.addActionListener(c);
        b2.addActionListener(c);
        b1.addActionListener(c);
        b0.addActionListener(c);
        deci.addActionListener(c);
        m.addActionListener(c);
        eq1.addActionListener(c);

        p.add(t);

        p.add(eq);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(b0);
        p.add(d);
        p.add(s);
        p.add(a);
        p.add(deci);
        p.add(m);
        p.add(eq1);

        p.setBackground(Color.black);

        f.add(p);

        f.setSize(200,220);
        f.show();
    }
    public void actionPerformed(ActionEvent e){

        String s = e.getActionCommand();

        if((s.charAt(0)>='0'&&s.charAt(0)<='9') || s.charAt(0)=='.'){
            if(!s1.equals(""))
                s2 = s2+s;
            else
                s0 = s0+s;

            t.setText(s0+s1+s2);
        }else if(s.charAt(0)=='C'){
            s0 =s1=s2="";
            t.setText(s0+s1+s2);
        }else if(s.charAt(0)=='='){
            double temp;

            if(s1.equals("+"))
                temp = (Double.parseDouble(s0)+Double.parseDouble(s2));
            else if(s1.equals("-"))
                temp = (Double.parseDouble(s0) - Double.parseDouble(s2));
            else if(s1.equals("/"))
                temp = (Double.parseDouble(s0)/Double.parseDouble(s2));
            else
                temp = (Double.parseDouble(s0)*Double.parseDouble(s2));

            s0 = Double.toString(temp);
            t.setText(Double.toString(temp));

            s1=s2="";
        }else{
            if(s1.equals("")||s2.equals(""))
                s1=s;
            else{
                double temp;

                if(s1.equals("+"))
                    temp = (Double.parseDouble(s0)+Double.parseDouble(s2));
                else if(s1.equals("-"))
                    temp = (Double.parseDouble(s0) - Double.parseDouble(s2));
                else if(s1.equals("/"))
                    temp = (Double.parseDouble(s0)/Double.parseDouble(s2));
                else
                    temp = (Double.parseDouble(s0)*Double.parseDouble(s2));

                s0 = Double.toString(temp);

                s1 = s;

                s2 = "";

            }
            t.setText(s0+s1+s2);
        }
    }
}
