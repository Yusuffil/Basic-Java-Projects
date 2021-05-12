
public class Instructor extends User{
    private String Autohirty;

    @Override
    public String getLastName() {
        return super.getLastName() + "(Instructor)"; 
    }

    public String getAutohirty() {
        return Autohirty;
    }

    public void setAutohirty(String Autohirty) {
        this.Autohirty = Autohirty;
    }
    
    
}
