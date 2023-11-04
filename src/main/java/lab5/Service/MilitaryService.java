package lab5.Service;

public class MilitaryService implements NationalService {
    private int daysLeft;
    public MilitaryService(int daysLeft){
        this.daysLeft=daysLeft;
    }

    @Override
    public int getDaysLEft() {
        return 0;
    }

    @Override
    public void work() { if (daysLeft > 0) {
        daysLeft--;
    }

    }
}
