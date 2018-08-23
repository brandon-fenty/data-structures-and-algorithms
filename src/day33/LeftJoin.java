package day33;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeftJoin {

    public static Map<Object, List<Object>> joinMaps(String joinType, Map mapA, Map mapB) {
        // Initialize a new map to merge keys/values into
        Map<Object, List<Object>> resultMap = new HashMap<>();
        // Parameterize join type for stretch goal
        Map<Object, Object> mapToggle = new HashMap<>();

        if (joinType == "left") {
            mapToggle = mapA;
        } else if (joinType == "right") {
            mapToggle = mapB;
        }

        for (Object key : mapToggle.keySet()) {
            // Declare a array list to put values that resets each time the loop cycles
            List<Object> putValues = new ArrayList<>();
            // Add the values to array list
            putValues.add(mapA.get(key));
            putValues.add(mapB.get(key));
            // Merge keys and array list into the results
            resultMap.put(key, putValues);
        }
        return resultMap;
    }
}
