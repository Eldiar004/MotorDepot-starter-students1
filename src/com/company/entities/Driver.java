package com.company.entities;



public class Driver {
    private int idDiver;
    private String name;
    private String truckName;

    public Driver(int idDiver, String name, String truckName) {
        this.idDiver = idDiver;
        this.name = name;
        this.truckName = truckName;
    }
    
    @Override
    public String toString() {
        return "-------DRIVER-------- " +
                "\nDriver      |" + idDiver +
                "\nName        |" + name +
                "\nTruckName   |" + truckName+
                "                         ";
    }

    public int getIdDiver() {
        return idDiver;
    }

    public void setIdDiver(int idDiver) {
        this.idDiver = idDiver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTruckName() {
        return truckName;
    }

    public void setTruckName(String truckName) {
        this.truckName = truckName;
    }
}
