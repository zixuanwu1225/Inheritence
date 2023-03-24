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
    public void createHD(String name, int size){
        list.add(name+" "+size+"GB "+super.getUuid());
        System.out.println("drive " + name+" installed");
    }
    public void listDrives(){
        for(int i=0;i<list.size();i++){
            System.out.println("---------------------------------------------");
            System.out.println(list.get(i));
        }
    }
    public int returnSize(int index){

    }
    public ArrayList<String> returnList(){
        return list;
    }
}
