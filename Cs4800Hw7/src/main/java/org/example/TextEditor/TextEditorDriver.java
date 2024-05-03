package org.example.TextEditor;

public class TextEditorDriver {
    public static void main(String[] args){
        // Create some character properties variations
        CharacterProperties arialRed12 = CharacterPropertiesFactory.getCharacterProperties("Arial", "Red", 12);
        CharacterProperties calibriBlue14 = CharacterPropertiesFactory.getCharacterProperties("Calibri", "Blue", 14);
        CharacterProperties verdanaBlack16 = CharacterPropertiesFactory.getCharacterProperties("Verdana", "Black", 16);
        CharacterProperties calibriRed16 = CharacterPropertiesFactory.getCharacterProperties("Calibri", "Red", 16);

        // Create a document and add characters with different properties
        Document document = new Document();
        document.addCharacter('H', arialRed12);
        document.addCharacter('e', calibriBlue14);
        document.addCharacter('l', verdanaBlack16);
        document.addCharacter('l', arialRed12);
        document.addCharacter('o', calibriBlue14);
        document.addCharacter(' ', verdanaBlack16);
        document.addCharacter('W', arialRed12);
        document.addCharacter('o', calibriRed16);
        document.addCharacter('r', verdanaBlack16);
        document.addCharacter('l', arialRed12);
        document.addCharacter('d', calibriBlue14);


        document.saveToFile("document.txt");
        Document loadedDocument = new Document();
        loadedDocument.loadFromFile("document.txt");
    }
}
