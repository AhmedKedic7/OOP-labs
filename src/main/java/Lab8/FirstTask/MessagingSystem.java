package Lab8.FirstTask;

public class MessagingSystem {
    @CanSendMessage
    @RequiresPermission(name = "user")
    public static void sendMessage(MessageSender sender, String message){
        if(sender instanceof Admin){
            System.out.println("Admin "+ ((Admin) sender).username+ " sent message " + message);
        }
        else{
            System.out.println("User "+((User) sender).username+ " is restricted.");
        }
    }
    public static void main(String[] args) {
        User regularUser = new User("Kedi");
        Admin adminUser = new Admin("Kedison");

        sendMessage(regularUser, "Dje ste raja");
        sendMessage(adminUser, "Radim OOP nadam se da je uredu ovo");
    }

}
