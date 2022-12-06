package items;

import enums.Colors;
import interfaces.BlinkAble;
import interfaces.IsReplaceable;
import interfaces.IsSeeable;

public class Peephole extends Item implements IsReplaceable, BlinkAble, IsSeeable {
    public Peephole(String name){
        super(name);
    }

    public void blink(Colors color){
        System.out.println(color.getName() + " " + this.getName() + " замигал");
    }
}
