package Inlämningsuppgift1;

public enum Dryck {
    KRANVATTEN("Kranvatten"),
    PROTEINDRYCK("Proteindryck"),
    MINERALVATTEN("Mineralvatten");


    public final String dryckSort;

    Dryck(String s){
        dryckSort = s;
    }
}
