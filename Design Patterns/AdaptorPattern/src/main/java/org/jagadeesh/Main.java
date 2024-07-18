package org.jagadeesh;

import org.jagadeesh.Adaptee.WeightMachineForBabies;
import org.jagadeesh.Adaptor.WeightMachineAdaptor;
import org.jagadeesh.Adaptor.WeightMachineAdaptorImpl;

public class Main {
    public static void main(String[] args) {
        WeightMachineAdaptor weightMachineAdaptor = new WeightMachineAdaptorImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdaptor.getWeightInKg());
    }
}