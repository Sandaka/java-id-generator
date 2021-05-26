///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//package dwnldCodes;
//
//import java.awt.Graphics;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.JPanel;
//import javax.swing.Timer;
//
///**
// *
// * @author Sandaka Geethaj
// */
//public class MovingRectangle extends JPanel {
//    private final Timer timer;
//
//    private int rectWidth = 100;
//
//    public MovingRectangle() {
//        this.timer = new Timer(500, new ActionListener() {
//            public void actionPerformed(ActionEvent event) {
//                rectWidth += 100;
//                repaint();
//            }
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//        };
//    }
//
//    public void paintComponent(Graphics g) {
//         super.paintComponent(g);
//         g.drawRect(0, 0, 100. rectWidth);
//    }
//
//    public void start() {
//        timer.start();
//    }
//
//    public void stop() {
//        timer.stop();
//    }
//
//    public void reset() {
//        rectWidth = 100;
//        repaint();
//    }
//}
