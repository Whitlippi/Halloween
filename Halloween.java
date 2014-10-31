/* This applet displays a message moving horizontally
   across the screen. */

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;




public class Halloween extends JApplet
  implements ActionListener
{
  private int xPos, yPos;  // hold the coordinates of the banner

  public void init()
  {
    Container c = getContentPane();
    setSize(660, 500);
    c.setBackground(Color.BLACK);
    setSize(660, 500);
    xPos = c.getWidth();
    yPos = c.getHeight() / 2;
    Timer clock = new Timer(30, this);  // fires every 30 milliseconds
    clock.start();
  }

  // Called automatically after a repaint request
  public void paint(Graphics g)
  {
    super.paint(g);
    g.setColor(Color.WHITE);
    g.drawString("           /\\____/\\       ", xPos, 18);
    g.drawString("____(   ’  .  ’   )____", xPos, 30);
    g.drawString("Vvvvv       ^^      vvvvV", xPos, 42);
    g.drawString("HAPPY HALLOWEEN!", xPos+330, 100);
    g.drawString("Trick or Treat!", xPos, 100);
    g.setColor(Color.ORANGE);
    g.fillOval(200, 200, 24, 48);
    g.fillOval(188, 200, 24, 48);
    g.fillOval(176, 200, 24, 48);
    g.fillOval(164, 200, 24, 48);
    g.setColor(Color.YELLOW);
    int xpoints[] = {170, 172, 172, 179, 179, 190, 190, 198, 198, 209, 209, 216, 216, 218, 218, 207, 207, 200, 200, 188, 188, 181, 181, 170};
    int ypoints[] = {232, 232, 236, 236, 232, 232, 236, 236, 232, 232, 236, 236, 232, 232, 240, 240, 236, 236, 240, 240, 236, 236, 240, 240};
    int npoints = 24;
    g.fillPolygon(xpoints, ypoints, npoints);
    int xpoints1[] = {192,195,197,191};
    int ypoints1[] = {220,220,226,226};
    int npoints1 = 4;
    g.fillPolygon(xpoints1, ypoints1, npoints1);
    int xpoints2[] = {180, 184, 189};
    int ypoints2[] = {214,208,214,};
    int npoints2 = 3;
    g.fillPolygon(xpoints2, ypoints2, npoints2);
    int xpoints3[] = {199, 203, 208};
    int ypoints3[] = {208, 214, 208};
    int npoints3 = 3;
    g.setColor(Color.ORANGE);
    g.fillOval(280, 200, 24, 48);
    g.fillOval(268, 200, 24, 48);
    g.fillOval(256, 200, 24, 48);
    g.fillOval(244, 200, 24, 48);
    g.setColor(Color.YELLOW);
    g.fillPolygon(xpoints3, ypoints3, npoints3);
    int xpoint4[] = {250, 252, 252, 259, 259, 270, 270, 278, 278, 289, 289, 296, 296, 298, 298, 287, 287, 280, 280, 268, 268, 261, 261, 250};
    int ypoint4[] = {232, 232, 236, 236, 232, 232, 236, 236, 232, 232, 236, 236, 232, 232, 240, 240, 236, 236, 240, 240, 236, 236, 240, 240};
    int npoint4 = 24;
    g.fillPolygon(xpoint4, ypoint4, npoint4);
    int xpoints5[] = {272,275,277,271};
    int ypoints5[] = {220,220,226,226};
    int npoints5 = 4;
    g.fillPolygon(xpoints5, ypoints5, npoints5);
    int xpoints6[] = {260, 264, 269};
    int ypoints6[] = {214,208,214,};
    int npoints6 = 3;
    g.fillPolygon(xpoints6, ypoints6, npoints6);
    int xpoints7[] = {279, 283, 288};
    int ypoints7[] = {208, 214, 208};
    int npoints7 = 3;
    g.fillPolygon(xpoints7, ypoints7, npoints7);
    g.setColor(Color.WHITE);
    g.drawLine(0, 500, 0, 275);
    g.drawLine(50, 433, 0, 400);
    g.drawLine(50, 433, 100, 466);
    g.drawLine(150, 500, 100, 466);
    g.drawLine(0, 500, 50, 300);
    g.drawLine(0, 500, 150, 340);
    g.drawLine(0, 500, 250, 380);
    g.drawLine(0, 500, 325, 440);
    g.drawLine(50, 310, 0, 310);
    g.drawLine(50, 310, 150, 345);
    g.drawLine(150, 345, 250, 400);
    g.drawLine(250, 400, 370, 500);
  }

  // Called automatically when the timer fires
  public void actionPerformed(ActionEvent e)
  {
    Container c = getContentPane();

    // Adjust the horizontal position of the banner:
    xPos--;
    if (xPos < -100)
    {
      xPos = c.getWidth();
    }

    // Set the vertical position of the banner:
    yPos = c.getHeight() / 2;

    repaint();
  }
}
