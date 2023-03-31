import java.util.ArrayList;
import java.util.UUID;

public class LogicalVolumes extends LVM{
    String VGname;
    private int size =0;
    private VolumeGroups VG;
    private LogicalVolumes LV;
    private ArrayList<LogicalVolumes> LVs;
    public LogicalVolumes(String LVname,int size,String VGname){
        super(LVname,UUID.randomUUID());
        this.size = size;
        this.VGname = VGname;
    }
    public void LVcreate(String lvName,int size,String vgName){
        for (int i = 0; i < VG.getVGs().size(); i++) {
            for (int j = 0; j < super.getVG().size(); j++) {
                if (!VG.getVGs().contains(vgName)) {
                    System.out.println("Physical Volume does not exist.");
                } else if (super.getVG().get(j).equals(vgName)) {
                    System.out.println("Physical Volume is already in another group.");
                }
                else{
                    LV = new LogicalVolumes(lvName,size,vgName);
                    LVs.add(LV);
                }
            }
        }
    }
    public void listLVs(){
        for(int i=0;i<LVs.size();i++){
            System.out.println("---------------------------------------------");
            System.out.println(LVs.get(i));
        }
    }
}
