import java.util.UUID;

public class LogicalVolumes extends LVM{
    private VolumeGroups v;
    private int size =0;
    public LogicalVolumes(String name,int size, UUID uuid,VolumeGroups v){
        super(name,uuid);
        this.size=size;
        this.v=v;
    }
}
