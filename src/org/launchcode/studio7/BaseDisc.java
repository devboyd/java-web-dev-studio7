package org.launchcode.studio7;

import java.util.HashMap;

public abstract class BaseDisc {
    public String name;
    public int maxCapacity;
    public int capacityBeingUsed;
    public int availiableCapacity;
    public HashMap<String, String> contents;
    public boolean computerCompatible;

    public BaseDisc(String aName, int capacity, HashMap<String, String> contents, boolean computerCompatible) {
        this.name = aName;
        this.capacity = capacity;
        this.contents = contents;
        this.computerCompatible = computerCompatible;
    }

    public int checkForSpace() {
        return ;
    }

    public int deleteSpace() {
        return 0;
    }
}
