package Lab8.FirstTask;
@UserPermission(name= "user")
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
