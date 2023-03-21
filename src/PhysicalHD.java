import java.util.ArrayList;
import java.util.UUID;

public class PhysicalHD extends LVM{
    private int size = 0;
    private ArrayList<String> list;
    public PhysicalHD(String name, UUID uuid,int size){
        super(name,uuid);
        this.size=size;
        list = new ArrayList<String>();
    }
    public String createHD(String name, int size){
        list.add(name+""+size+""+getUuid());
    }
}
