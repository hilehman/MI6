package bgu.spl.mics.application.passiveObjects;

import bgu.spl.mics.application.publishers.Intelligence;

public class InputData {
    private String[] inventoryData;
    private services services;
    private Agent[] squad;



    //getters
    public String[] getInventoryData(){return inventoryData;}
    public services getServices() {return services;}
    public Agent[] getSquad() {return squad;}

}
