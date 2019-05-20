package app;
import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Display {
    private JFrame frame;
    private Canvas canvas;
    private String title;
    private int width, height;

    public Display(String title,int width,int height) {
        this.title = title;
        this.width = width;
        this.height = height;

        createDisplay();
    }

    private void createDisplay() {
        frame = new JFrame(title);
        frame.setSize(width,height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close window
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);//window location at center
        frame.setVisible(true);//window visible
        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width,height));
        frame.add(canvas);
        frame.pack();
    }

}