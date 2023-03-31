import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.UUID;

public class VolumeGroups extends LVM {
    private ArrayList<PhysicalVolume> PVs;
    private PhysicalVolume PV;
    private VolumeGroups VG;
    private ArrayList<VolumeGroups> VGs;

    public VolumeGroups(String name, UUID uuid, PhysicalVolume PV) {
        super(name, uuid);
        this.PVs = new ArrayList<PhysicalVolume>();
        this.PVs.add(PV);
    }

    public void vgCreate(String VGname, String pvName) {
        for (int i = 0; i < PV.getHDs().size(); i++) {
            for (int j = 0; j < super.getVG().size(); j++) {
                if (!PV.getHDs().contains(pvName)) {
                    System.out.println("Physical Volume does not exist.");
                } else if (super.getVG().get(j).equals(pvName)) {
                    System.out.println("Physical Volume is already in another group.");
                }
                else{
                    VG = new VolumeGroups(VGname,getUuid(),PV);
                    VGs.add(VG);
                }
            }
        }
    }
    public ArrayList<VolumeGroups> getVGs(){
        return VGs;
    }
    public void listVGs(){
        for(int i=0;i<VGs.size();i++){
            System.out.println("---------------------------------------------");
            System.out.println(VGs.get(i));
        }
    }
}
