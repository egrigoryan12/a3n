package com.mycompany.a3;

import com.codename1.charts.models.Point;
import com.codename1.charts.util.ColorUtil;
import com.codename1.ui.Graphics;

public class Flag extends Fixed {
	private int sequenceNumber;

	public Flag(Point location, int sequenceNumber) {
		
		super(10, location, ColorUtil.BLUE, sequenceNumber);
		this.setSequenceNumber(sequenceNumber);
		this.setColor(0,0,255);
 
	}
	
	public void setColor(int color) {
	
	}

	public int getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(int sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	public void draw(Graphics g, Point pCmpRelPrnt) {
	    int px = (int) (getLocation().getX() + pCmpRelPrnt.getX());
	    int py = (int) (getLocation().getY() + pCmpRelPrnt.getY());

	    int scaleFactor = 5; // Adjust this factor as needed
	    int halfSize = getSize() * scaleFactor / 2;
	    int[] xPoints = {px - halfSize, px, px + halfSize};
	    int[] yPoints = {py + halfSize, py - halfSize, py + halfSize}; // Upside-down triangle
	    int nPoints = 3;

	    g.setColor(ColorUtil.rgb(173, 216, 230)); // Light Blue color
	    g.fillPolygon(xPoints, yPoints, nPoints);

	    g.setColor(ColorUtil.rgb(0, 0, 0)); // Set color for the sequence number to black
	    g.drawString(String.valueOf(sequenceNumber), px - halfSize / 4, py);
	}



	public String toString() {
		String parentDesc = super.toString();
		String myDesc = " sequenceNumber = " + sequenceNumber;
		return "Flag:" + parentDesc + myDesc;
	}

	@Override
	public boolean collidesWith(ICollider otherObject) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void handleCollision(ICollider otherObject) {
		// TODO Auto-generated method stub
		
	}


	
}
