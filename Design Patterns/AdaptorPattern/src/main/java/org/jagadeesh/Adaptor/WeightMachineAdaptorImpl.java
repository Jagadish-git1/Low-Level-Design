package org.jagadeesh.Adaptor;

import org.jagadeesh.Adaptee.WeightMachine;

public class WeightMachineAdaptorImpl implements WeightMachineAdaptor{

    private final WeightMachine weightMachine;

    public WeightMachineAdaptorImpl(WeightMachine weightMachine){
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKg() {
        return weightMachine.getWeightInPound() * 0.45;
    }
}
