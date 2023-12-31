package lab11.FourthTask;

public class AdapterMain {
    public static void main(String[] args) {
        OldDevice oldDevice = new OldDeviceImpl();
        NewDevice newDevice = new NewDeviceImpl();
        oldDevice.operateOldFunction();
        newDevice.operateNewFunction();
        DeviceAdapter adapter = new DeviceAdapter(oldDevice);
        adapter.operateNewFunction();
    }
}
