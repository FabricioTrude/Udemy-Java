package aulas._event_bus.exemplo_pessoa;

import java.util.ArrayList;
import java.util.List;

public class DoorBell {
    private List<Ear> ears = new ArrayList<>();

    public void addEar(Ear ear){
        ears.add(ear);
    }

    public void ring(){
        for (Ear ear: ears) ear.hear("DIN DON");
    }
}
