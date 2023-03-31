import java.util.ArrayList;
import java.util.UUID;

public class PhysicalVolume extends LVM{
    private String actualName = "";
    private int size=0;
    private PhysicalHD h;
    private ArrayList<String> HDs;
    private VolumeGroups VG;
    private ArrayList<PhysicalVolume> PVs;
    private PhysicalVolume PV;
    public PhysicalVolume(String name1, UUID uuid,int size,String name2){
        super(name1,uuid);
        this.size=size;
        actualName = name2;
        HDs = new ArrayList<String>();
    }

    public String getActualName() {
        return actualName;
    }

    public void pvCreate(String pvName, String hdName){
        ArrayList<String> list;
        list = h.returnList();
        int count = -1;
        boolean check = false;
        for (int i=0;i<list.size();i++){
            if(list.get(i).equals(hdName)){
                check=true;
                count = i;
            }
        }
        if(check){
            HDs.add(pvName+":"+h.returnList().get(count));
            PV = new PhysicalVolume(hdName,UUID.randomUUID(),)
            System.out.println(pvName+"created");
        }
    }
    public void listPVs(){
        if(!VG.getVGs().contains(getActualName())){
            System.out.println("VG does not contain this Physical Volume");
        }
        else{
            f
        }
    }
    public ArrayList<String> getHDs(){
        return HDs;
    }
}
