package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.contains("what%20is%20your%20name")) {
            return "MedhaDaveMike";
        }
        return "";
    }

}
