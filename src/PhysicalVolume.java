import java.util.UUID;

public class PhysicalVolume extends PhysicalHD{
    private String actualName = "";
    public PhysicalVolume(String name1, UUID uuid,int size,String name2){
        super(name1,uuid,size);
        actualName = name2;
    }
}
