package com.develogical;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;


public class QueryProcessor {

    public String process(String query) {
        if (query.contains("name")) {
            return "MedhaDaveMike";
        }

        else if (query.contains("plus")) {
            String[] values = query.split(" ");
            if(values.length >4){
            return Integer.parseInt(values[3]) + Integer.parseInt(values[5]) + "";
            }
            return "";
        }
        else if (query.contains("largest")) {
            String[] result = query.split(": ");
            if(result.length >2){
                String values[] = result[2].split(", ");
                getMax(values);
                return (Integer.parseInt(values[0])>Integer.parseInt(values[1])? values[0] : values[1] ) ;
            }
            return "";
        }
        else if (query.contains("multiplied")) {
            String[] values = query.split(" ");
            if(values.length >6){
                return Integer.parseInt(values[3]) * Integer.parseInt(values[6]) + "";
            }
            return "";
        }
        return "";
    }

    public static int getMax(String[] vals){
        int currentMax=0;
        for(int i = 1;i<vals.length;i++){
            if(currentMax < Integer.parseInt(vals[i])){
                currentMax = Integer.parseInt(vals[i]);
            }
        }
                        return currentMax;



    }

}
