package com.bookstore.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class USConstants {
    public final String US = "US";

    public final static Map<String,String> mapOfUSStates = new HashMap<String, String>(){
        {
            put("AL","ALABAMA");
            put("AK","ALASKA");
            put("AZ","ARIZONA");
        }
    };

    public final static List<String> listOfUSStatesCode = new ArrayList<>(mapOfUSStates.keySet());
    public final static List<String> ListOfUSStatesName = new ArrayList<>(mapOfUSStates.values());
}
