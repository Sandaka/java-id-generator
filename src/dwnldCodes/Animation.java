/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dwnldCodes;

/**
 *
 * @author Sandaka Geethaj
 */
	import java.awt.*;
	 
	public class Animation
	{
	    public static void main (String[] args) throws java.lang.InterruptedException
	    {
	        final int HEIGHT = 500;
	        final int WIDTH = 600;
	 
	        //Create frame
	        Frame df = new Frame("Ball");
	        df.setVisible(true);
	        df.setSize(WIDTH, HEIGHT);
	 
	        Ball b = new Ball (0, 0, 20);
	        df.add(b);
	        b.run();
	 
	        df.repaint();
	 
	    }
	}
	 
	class Ball extends Canvas
	{
	    private int myX;
	    private int myY;
	    private int myHeight;
	 
	    public Ball (int x, int y, int height)
	    {
	        myX = x;
	        myY = y;
	        myHeight = height;
	    }
	 
	    public void paint (Graphics g)
	    {
	        g.setColor(Color.red);
	        g.fillOval(myX, myY, myHeight, myHeight);
	    }
	 
	    public void animate ()
	    {
	        myX += 20;
	        myY += 20;
	        repaint();
	      }
	 
	    public void run ()
	    {
	        int i = 0;
	 
	        while (i < 10)
	        {
	             animate();
	             try
	             {
	                 Thread.sleep(500);
	             }
	             catch (InterruptedException e) {}
	 
	             i++;
	        }
	    }
	}
