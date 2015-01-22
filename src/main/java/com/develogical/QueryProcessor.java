package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.contains("name")) {
            return "MedhaDaveMike";
        }

        else if (query.contains("plus")) {
            String[] values = query.split(" ");
            if(values.length >4){
            return Integer.parseInt(values[2]) + Integer.parseInt(values[4]) + "";
            }
            return "";
        }
        else if (query.contains("largest")) {
            String[] result = query.split(": ");
            if(result.length >2){
                String values[] = result[2].split(", ");
                return (Integer.parseInt(values[0])>Integer.parseInt(values[1])? values[0] : values[1] ) ;
            }
            return "";
        }
        return "";
    }

}
