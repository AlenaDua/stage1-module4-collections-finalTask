package com.epam.mjc.collections.combined;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            String project = entry.getKey();
            Set<String> developers = entry.getValue();
            if (developers.contains(developer)) {
                result.add(project);
            }
        }
        Collections.sort(result, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    return s2.compareTo(s1);
                }
                return s1.length() > s2.length() ? -1 : 1;
            }
        });
        return result;
    }
}
