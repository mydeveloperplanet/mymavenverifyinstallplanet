package com.mydeveloperplanet.mymavenverifyinstallplanet;

public class MultiModuleDependencies {

    public static void main(String[] args) {
        MultiModuleNoDependencies noDependencies = new MultiModuleNoDependencies();
        System.out.println("Dependencies has artifact: " + noDependencies.out());
    }

}
