package day33;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeftJoin {

    public static Map<String, List<String>> joinMaps(String joinType, Map<String, String> mapA, Map<String, String> mapB) {
        // Initialize a new map to merge keys/values into
        Map<String, List<String>> resultMap = new HashMap<>();
        // Parameterize join type for stretch goal
        Map<String, String> mapToggle = new HashMap<>();

        if (joinType == "left") {
            mapToggle = mapA;
        } else if (joinType == "right") {
            mapToggle = mapB;
        }

        for (String key : mapToggle.keySet()) {
            // Declare a array list to put values that resets each time the loop cycles
            List<String> putValues = new ArrayList<>();
            // Add the values to array list
            putValues.add(mapA.get(key));
            putValues.add(mapB.get(key));
            // Merge keys and array list into the results
            resultMap.put(key, putValues);
        }
        return resultMap;
    }
}
