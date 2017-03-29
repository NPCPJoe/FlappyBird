/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flappybird;

/**
 *
 * @author joeco_000
 */
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author joeco_000
 */
public class Renderer extends JPanel {
    private static final long serialVersionUID = 1l;
   
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        FlappyBird.flappyBird.repaint(g);
    }
}