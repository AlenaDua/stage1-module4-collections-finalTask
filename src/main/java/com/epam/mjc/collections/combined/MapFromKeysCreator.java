package com.epam.mjc.collections.combined;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
//Implement the program which gets `Map<String, Integer>` as parameter and returns a new `Map<Integer, Set<String>>`,
//where `key` - the lengths of the key from the source map, `value` - `Set<String>` of keys with corresponding length.
public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> resultMap = new HashMap<>();

        for (String key : sourceMap.keySet()) {
            int keyLength = key.length();

            // If the length is already in the resultMap, add the key to the existing set
            if (resultMap.containsKey(keyLength)) {
                resultMap.get(keyLength).add(key);
            }
            // Otherwise, create a new set and add the key to it
            else {
                Set<String> keySet = new HashSet<>();
                keySet.add(key);
                resultMap.put(keyLength, keySet);
            }
        }
        return resultMap;
    }
}
