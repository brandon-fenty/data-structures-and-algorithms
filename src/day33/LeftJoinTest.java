package day33;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeftJoinTest {

    @Test
    void joinMapsLeft() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("fond", "enamored");
        map1.put("wrath", "anger");
        map1.put("diligent", "employed");
        map1.put("outfit", "garb");
        map1.put("guide", "usher");

        Map<String, String> map2 = new HashMap<>();
        map2.put("fond", "averse");
        map2.put("wrath", "delight");
        map2.put("diligent", "idle");
        map2.put("guide", "follow");
        map2.put("flow", "jam");

        String result = LeftJoin.joinMaps("left", map1, map2).toString();
        String expected = "{diligent=[employed, idle], outfit=[garb, null], wrath=[anger, delight], guide=[usher, follow], fond=[enamored, averse]}";

        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);

        assertEquals(result, expected);
    }

    @Test
    void joinMapsRight() {
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();

        map1.put("fond", "enamored");
        map1.put("wrath", "anger");
        map1.put("diligent", "employed");
        map1.put("outfit", "garb");
        map1.put("guide", "usher");

        map2.put("fond", "averse");
        map2.put("wrath", "delight");
        map2.put("diligent", "idle");
        map2.put("guide", "follow");
        map2.put("flow", "jam");

        String result = LeftJoin.joinMaps("right", map1, map2).toString();
        String expected = "{diligent=[employed, idle], wrath=[anger, delight], guide=[usher, follow], flow=[null, jam], fond=[enamored, averse]}";

        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);

        assertEquals(result, expected);
    }
}