package com.epam.mjc.collections.combined;

import java.util.*;

//Implement the program which gets timetable and returns `set` of all lessons without duplicates.
// Implement the program which gets timetable and returns `set` of all lessons without duplicates.
// Timetable is a `Map<String, List<String>>`,where the `key` - the day of the week
// and the `value` - `List<String> `of lessons for that day.
public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
       Set<String> lessons = new HashSet<>();
       for (List<String> dayLessons : timetable.values()) {
           lessons.addAll(dayLessons);
       }
       return lessons;
    }
}
