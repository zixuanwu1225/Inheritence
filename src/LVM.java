import java.util.UUID;

public class LVM{
    private String name="";
    private UUID uuid;
    public LVM(String name,UUID uuid){
        this.name=name;
        this.uuid=uuid;
    }
    public UUID getUuid() {
        return uuid;
    }
    public String getName() {
        return name;
    }
}
