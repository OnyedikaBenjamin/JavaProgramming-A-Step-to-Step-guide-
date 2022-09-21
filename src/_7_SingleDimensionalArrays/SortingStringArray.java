package _7_SingleDimensionalArrays;

import java.util.Arrays;

public class SortingStringArray {
    public static void main(String[] args) {
        String []arrayList = { "BDG879FX",
                               "AAA477GL",
                               "BDG376GX",
                               "AGL802FM",
                               "AGL882FM-------paid",
                               "EPE987GD",
                               "BDG44FC",
                               "BDG376DZ",
                               "EPE338YA",
                               "KSF895XK",
                               "XS773FKJ",
                               "BDG733YD",
                               "BDG990YD",
                               "APP56YE",
                               "SMK568YE",
                               "KSF970GB",
                               "APP454HH",
                               "LND340XJ",
                               "LSD233FT",
                               "KSF985YE",
                               "AGL969GS",
                               "GGE258GJ",
                               "AAA356AA",
                               "LSR459YD",
                               "MUS748YA",
        };
        Arrays.sort(arrayList);
        for (int i = 0; i < arrayList.length; i++){
            System.out.println("(" + (i+1) + ")" + "  " + arrayList[i]);
        }
    }


}
