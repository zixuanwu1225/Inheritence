import java.util.ArrayList;
import java.util.UUID;

public class LVM{
    private String name="";
    private UUID uuid;
    private ArrayList<VolumeGroups> VG;
    public LVM(String name,UUID uuid){
        this.name=name;
        this.uuid=uuid;
    }

    public ArrayList<VolumeGroups> getVG() {
        return VG;
    }

    public UUID getUuid() {
        return UUID.randomUUID();
    }
    public String getName() {
        return name;
    }
}
