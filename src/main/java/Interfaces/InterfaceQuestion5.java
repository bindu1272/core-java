package main.java.Interfaces;
interface HomeConstruction{
    public void home1(int measurements);
}
interface BuildingConstruction{
    public void home1(int measurements);
}
class Construction implements HomeConstruction,BuildingConstruction{
    int meas;
    public void home1(int measurements){
        this.meas = measurements;
        System.out.println(meas);
    }
}
public class InterfaceQuestion5 {
    public static void main(String args[]){
        Construction construction = new Construction();
        construction.home1(100);
    }
}
