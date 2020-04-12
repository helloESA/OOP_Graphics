/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2_tugas3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javafx.scene.shape.Ellipse;
import javax.swing.JPanel;

/**
 *
 * @author MohamadEsa
 */
public class panelLingkaran extends JPanel{

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs); 
        Ellipse2D.Double r = new Ellipse2D.Double(5, 5, 100, 100);
        Graphics2D gd = (Graphics2D) grphcs.create();
        gd.setColor(Color.green);
        gd.fill(r);
        gd.setColor(Color.black);
        gd.draw(r);
    }
    
}
