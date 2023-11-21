package com.mycompany.a3;

import com.codename1.charts.models.Point;
import com.codename1.ui.Graphics;

public class TestObject extends GameObject {

    private int size;

    public TestObject(Point location, int size) {
        super(size, location, 0);
        this.size = size;
        this.setColor(0, 255, 0); // Green color, you can adjust this
    }

    @Override
    public void draw(Graphics g, Point pCmpRelPrnt) {
        int px = (int) (getLocation().getX() + pCmpRelPrnt.getX());
        int py = (int) (getLocation().getY() + pCmpRelPrnt.getY());
        g.setColor(this.getColor());

        int radius = size / 2;

        g.fillArc(px - radius, py - radius, 2 * radius, 2 * radius, 0, 360);
    }

    @Override
    public String toString() {
        return "TestObject: " + super.toString();
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
