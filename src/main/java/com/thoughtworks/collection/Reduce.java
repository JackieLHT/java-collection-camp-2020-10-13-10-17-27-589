package com.thoughtworks.collection;

import java.util.List;
import java.util.stream.Collectors;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public double getAverage() {
        double total =  arrayList.stream().reduce(0, (sum,element) -> sum+element);
        return total / arrayList.size();
    }

    public int getMaxValue() {
        return arrayList.stream().reduce(0,Integer::max);
    }

    public int getLastOdd() {
    	return arrayList.stream().filter(num -> num % 2 ==1).reduce(0,(first, second) -> second) ;
    }
}
