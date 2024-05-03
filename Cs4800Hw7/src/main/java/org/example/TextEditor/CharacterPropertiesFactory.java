package org.example.TextEditor;

import java.util.HashMap;

public class CharacterPropertiesFactory {
    public static HashMap<String, CharacterProperties> characterPropertiesHashMap = new HashMap<>();
    public static CharacterProperties getCharacterProperties(String font, String color, int size) {
        String key = font + color + size;
        return characterPropertiesHashMap.computeIfAbsent(key, k -> new CharacterProperties(font, color, size));
    }
}
