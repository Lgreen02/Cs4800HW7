package org.example.TextEditor;

public class CharacterProperties {
    String font;
    int size;
    String color;
    public CharacterProperties(String font, String color, int size){
        this.font = font;
        this.color = color;
        this.size = size;
    }
    public String getFont(){
        return font;
    }
    public String getColor(){
        return color;
    }
    public int getSize(){
        return size;
    }
    public void setFont(String newFont){
        this.font = newFont;
    }
    public void setColor(String newColor){
        this.color = newColor;
    }
    public void setSize(int newSize){
        this.size = newSize;
    }
}
