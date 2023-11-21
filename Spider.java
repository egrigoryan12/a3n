package com.mycompany.a3;

import com.codename1.charts.models.Point;
import com.codename1.charts.util.ColorUtil;
import com.codename1.ui.Graphics;

import java.util.Random;

// randomize size & heading

public class Spider extends Moveable {
	
	private int foodLevel = 100;

	public Spider(int size, Point location, int heading) {
		super(size, location, heading, ColorUtil.BLACK);
		this.setHeading(randomHeading());
		this.setSpeed(randomSpeed());
		this.setColor(0,0,0);

	}
	
	public void setColor(int color) {
		
	}
	
	private int randomSpeed() {
		
		Random random = new Random();
		return this.speed = random.nextInt(6) + 5;
	}

	private int randomHeading() {
		Random random = new Random();
		return this.heading = random.nextInt(359);
		
	}   
	
	
	@Override 
		public int getFoodLevel() {
			return foodLevel;
		}

		public void setFoodLevel(int foodLevel) {
			this.foodLevel = foodLevel;
		}
		public void draw(Graphics g, Point pCmpRelPrnt) {
		    int px = (int) (getLocation().getX() + pCmpRelPrnt.getX());
		    int py = (int) (getLocation().getY() + pCmpRelPrnt.getY());

		    int[] xPoints = {px - getSize() / 2, px + getSize() / 2, px};
		    int[] yPoints = {py - getSize() / 2, py - getSize() / 2, py + getSize() / 2};
		    int nPoints = 3;

		    g.setColor(ColorUtil.rgb(0, 0, 0));
		    g.drawPolygon(xPoints, yPoints, nPoints);
		}

	public String toString() {
		
		String parentDesc = super.toString();
		return "Spider:" + parentDesc;
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
  