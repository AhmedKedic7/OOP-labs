package Lab8.FirstTask;

@UserPermission(name = "admin")
public class Admin implements MessageSender {
    protected String username;
    public Admin(String username){
        this.username=username;
    }
    @Override
    public String getUsername(){
        return username;
    }
}
