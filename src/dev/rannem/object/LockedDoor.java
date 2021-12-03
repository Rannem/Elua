package dev.rannem.object;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.Objects;

public class LockedDoor extends SuperObject{
    public LockedDoor(){
        name = "Locked door";
        try {
            image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/objects/door1.png")));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
