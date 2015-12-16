package com.lhs.periodic;

import java.util.HashMap;

public class ElectronConfiguration {
    
    public static final String[] energyLevelOrder = {"1s","2s","2p","3s","3p","4s","3d","4p","5s","4d","5p","6s","4f","5d","6p","7s","5f","6d","7p","8s","6f","7d","8p","9s","7f","8d","9p"};
    public HashMap<String,Integer> energyLevels;
    public int electrons;
    public int highestLevel;
    
    public ElectronConfiguration(int electrons) {
        this.electrons = electrons;
        energyLevels = new HashMap<String,Integer>();
        makeConfiguration();
    }
    
    public void makeConfiguration() {
        int left = electrons;
        highestLevel = 0;
        int i;
        for (i = 0; left>0; i++) {
            String level = energyLevelOrder[i];
            if (Integer.parseInt(level.charAt(0)+"")>highestLevel) highestLevel = Integer.parseInt(level.charAt(0)+"");
            int thisLevel = getCapacity(level);
            if (left<thisLevel) thisLevel = left;
            left-=thisLevel;
            energyLevels.put(level, thisLevel);
        }
        for (;i<energyLevelOrder.length;i++) energyLevels.put(energyLevelOrder[i], 0);
    }
    
    public int getValence() {
        return energyLevels.get(highestLevel+"s")+
        		(highestLevel>1 ? energyLevels.get(highestLevel+"p") : 0)+
        		(highestLevel>2 ? energyLevels.get(highestLevel+"d") : 0)+
        		(highestLevel>3 ? energyLevels.get(highestLevel+"f") : 0);
    }
    
    public int getLevels() {
    	int ans = 0;
    	for (Integer i : energyLevels.values()) if (i!=0) ans++; else break;
    	return ans;
    }
    
    public static int getCapacity(String level) { return level.charAt(1)=='s' ? 2 : level.charAt(1)=='p' ? 6 : level.charAt(1)=='d' ? 10 : 14; }
    
    public String toString() {
        String ans = "";
        for (int i = 0; energyLevels.get(energyLevelOrder[i])!=0; i++) {
            ans+=energyLevelOrder[i]+"^"+energyLevels.get(energyLevelOrder[i])+" ";
        }
        return ans;
    }
    
    public static void main(String...strings) {
        ElectronConfiguration c = new ElectronConfiguration(118);
        System.out.println(c.toString());
    }
    
}
