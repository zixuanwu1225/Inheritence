import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.UUID;

public class VolumeGroups extends LVM{
    private ArrayList<PhysicalVolume> PV;
    public VolumeGroups(String name,UUID uuid,PhysicalVolume PV,LogicalVolumes LV){
        super(name,uuid);
        this.PV = new ArrayList<PhysicalVolume>();
        this.PV.add(PV);
    }

}
