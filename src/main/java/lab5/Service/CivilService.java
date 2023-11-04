package lab5.Service;

public class CivilService implements NationalService {
    private int daysLeft;
    public CivilService(){
        this.daysLeft=362;
    }

    @Override
    public int getDaysLEft() {
        return 0;
    }

    @Override
    public void work() {
        if (daysLeft > 0) {
            daysLeft--;
        }

    }
}
