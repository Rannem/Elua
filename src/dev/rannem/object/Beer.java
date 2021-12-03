package dev.rannem.object;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.Objects;

public class Beer extends SuperObject{

    public Beer(){
        name = "Beer";
        try {
            image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/objects/bear1.png")));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
