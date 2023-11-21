package com.mycompany.a3;
import java.util.Observable;
import java.util.Observer;
import com.codename1.ui.Graphics;
import com.codename1.charts.models.Point;
import com.codename1.charts.util.ColorUtil;
import com.codename1.ui.Container;
import com.codename1.ui.plaf.Border;

public class MapView extends Container implements Observer {
    
    private int height;
    private int width;
    private GameWorld gw;

    public MapView(Observable GameWorld) {
        this.setHeight(1000);
        this.setWidth(1000);
        gw = (GameWorld) GameWorld;
        GameWorld.addObserver(this);
        
        
        this.getAllStyles().setBorder(Border.createLineBorder(4, ColorUtil.rgb(255, 0, 0)));
        

    }

 
    public void paint(Graphics g) {
        super.paint(g);
        Point pCmpRelPrnt = new Point(getX(), getY());
        IIterator currentObject = gw.objects.getIterator();
        while (currentObject.hasNext()) {
            GameObject object = ((GameObject) currentObject.getNext());
            object.draw(g, pCmpRelPrnt);
        }
    }
    
    

    @Override
    public void update(Observable observable, Object o) {
        this.repaint();
        gw.map();
    }
    
    public void setMapHeight(int h) {
        height = h;
    }

    public int getMapHeight() {
        return height;
    }

    public void setMapWidth(int w) {
        width = w;
    }

    public int getMapWidth() {
        return width;
    }
}
