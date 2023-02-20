import org.w3c.dom.Text;

import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class mouseMotionListener extends Frame implements MouseMotionListener {
    Label m;
    Color c = Color.blue;

    mouseMotionListener() {
        m = new Label();
        m.setBounds(20, 40, 100, 20);
        add(m);

        addMouseMotionListener(this);

        setSize(600, 600);
        setLayout(null);
        setVisible(true);
    }

    public void mouseDragged(MouseEvent e) {
        m.setText("x: " + e.getX() + " y: " + e.getY());
        Graphics g = getGraphics();
        g.setColor(Color.red);
        g.fillOval(e.getX(), e.getY(), 20, 20);
    }


    public void mouseMoved(MouseEvent e) {
        m.setText("X: " + e.getX() + " Y: " + e.getY());
    }
    


    public static void main(String[] args) {
        int ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your Choice: \n1. Mouse Event\n2. Keyboard Event");
        ch = sc.nextInt();
        switch (ch) {
            case 1:
                new mouseMotionListener();
                break;
            case 2:
                new KeyListenerEx();
                break;
            default:
                System.out.println("Enter the Value!");
        }

    }
}

class KeyListenerEx extends Frame implements KeyListener{
    Label i;
    TextArea area;

    KeyListenerEx(){
        i = new Label();
        i.setBounds(20,50,200,20);
       area = new TextArea();
       area.setBounds(20,80,800,800);
       area.addKeyListener(this);
       add(i);
       add(area);
       setSize(800,800);
       setLayout(null);
       setVisible(true);
    }

    public void keyPressed(KeyEvent e){}
    public void keyReleased(KeyEvent e){
        String text = area.getText();
        String[] words = text.split("\\s");
        i.setText("Words: "+words.length+" Characters: "+text.length());
    }
    public void keyTyped(KeyEvent e){}

}