/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2_tugas3;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

/**
 *
 * @author MohamadEsa
 */
public class panelKotak extends JPanel{

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs); 
        final Rectangle2D.Double kotak = new Rectangle2D.Double(5, 5, 100, 100);
        final Graphics2D gd  = (Graphics2D) grphcs.create();
        gd.setColor(Color.white);
        gd.fill(kotak);
        gd.setColor(Color.red);
        gd.draw(kotak);
    }
}
