package org.example.TextEditor;

import java.util.HashMap;

import java.io.*;
public class Document {
    private StringBuilder content = new StringBuilder();

    public void addCharacter(char value, CharacterProperties properties) {
        TextCharacter character = new TextCharacter(value, properties);
        content.append(value);
    }

    public void saveToFile(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content.toString());
            System.out.println("Document saved to file: " + filename);
        } catch (IOException e) {
        }
    }

    public void loadFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
            System.out.println("Document loaded from file: " + filename);
        } catch (IOException e) {

        }
    }
}
