import java.util.UUID;

public class PhysicalHD extends LVM{
    private int size = 0;
    public PhysicalHD(String name, UUID uuid,int size){
        super(name,uuid);
        this.size=size;
    }
}
