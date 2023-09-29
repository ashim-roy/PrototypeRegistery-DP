package prototypeRegistry;

import java.util.HashMap;
import java.util.Map;
public class StudentRegistry {
    Map<String, Student> studentMap = new HashMap<>();

    /**
     * this register method inserts the prototype into map.
     * @param key
     * @param student
     */
    void register(String key, Student student) {
        studentMap.put(key, student);
    }

    /**
     * this get method returns a prototype from the map.
     * @param key
     * @return
     */
    Student get(String key) {
        return studentMap.get(key);
    }
}