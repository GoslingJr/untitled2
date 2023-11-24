import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class MyFrame extends JFrame implements MouseListener {

    ArrayList<Oval> b = new ArrayList<>();
    ArrayList<Oval> ovals  = new ArrayList<Oval>();
    int n = 0;
    public MyFrame() throws HeadlessException {
        setSize(1500, 1550);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        addMouseListener(this);
        while (true) {
            this.repaint();
        }
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for(int i = 0; i<n; i=i+1){
            g.drawOval(b.get(i).x,b.get(i).y,100,50);
            System.out.println(getX());

        }
        g.drawOval(10, 30, 100,50);


    }

    @Override
    public void mouseClicked(MouseEvent e) {//нажал
        System.out.println("Clicked");
        int x=e.getX();
        int y=e.getY();
        System.out.println(x+" "+ y);
        Oval oval = new Oval(x,y);
        b.add(oval);
        n=n+1;



    }

    @Override
    public void mousePressed(MouseEvent e) {//зажал
        System.out.println("zagal");


    }

    @Override
    public void mouseReleased(MouseEvent e) {//отпустил
        System.out.println("Released");

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Entered");

    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Exited");

    }
}
