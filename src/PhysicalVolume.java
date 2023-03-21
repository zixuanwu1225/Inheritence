import java.util.UUID;

public class PhysicalVolume extends LVM{
    private String actualName = "";
    private int size=0;
    public PhysicalVolume(String name1, UUID uuid,int size,String name2){
        super(name1,uuid);
        this.size=size;
        actualName = name2;
    }
}
