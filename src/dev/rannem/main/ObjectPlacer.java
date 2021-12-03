package dev.rannem.main;

import dev.rannem.object.Beer;
import dev.rannem.object.LockedDoor;

public class ObjectPlacer {
    GamePanel gp;

    public ObjectPlacer(GamePanel gp){
        this.gp = gp;
    }

    public void setObject(){
        gp.obj[0] = new Beer();
        gp.obj[0].worldX = gp.tileSize * 2;
        gp.obj[0].worldY = gp.tileSize * 12;

        gp.obj[1] = new LockedDoor();
        gp.obj[1].worldX = gp.tileSize * 7;
        gp.obj[1].worldY = gp.tileSize * 17;
    }

}
