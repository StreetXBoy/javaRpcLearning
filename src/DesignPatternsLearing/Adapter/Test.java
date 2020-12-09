package DesignPatternsLearing.Adapter;

import DesignPatternsLearing.Adapter.Phone;
import DesignPatternsLearing.Adapter.VoltageAdapter;

public class Test {
    public static void main(String[] args) {
        Phone phone = new Phone();
        VoltageAdapter adapter = new VoltageAdapter();
        phone.setAdapter(adapter);
        phone.charge();
    }
}