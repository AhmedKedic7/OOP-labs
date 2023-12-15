package Lab8.FirstTask;
@UserPermission(1)
public class User implements MessageSender{
    protected String username;
    public User(String username){
        this.username=username;
    }
    @Override
    public String getUsername(){
        return username;
    }
}
