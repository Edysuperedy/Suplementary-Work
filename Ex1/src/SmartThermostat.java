import java.util.ArrayList;
public class SmartThermostat {
    private ArrayList<Room> list;
    public void addRoom(Room room)
    {
        this.list.add(room);
    }
    public double getAverageTemperature()
    {
        double avg=0;
        int n= this.list.size();
        for(int i=0;i<n;i++)
        {
            avg = avg + this.list.get(i).getCurrentTemperature();
        }
        return avg / n;
    }

}
