package org.example;

public class Word {
    private int id;
    private int level;
    private String vocab;
    private String def;

    public Word(int id, int level, String vocab, String def) {
        this.id = id;
        this.level = level;
        this.vocab = vocab;
        this.def = def;
    }

    //Encapsulation for better security
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getVocab() {
        return vocab;
    }

    public void setVocab(String vocab) {
        this.vocab = vocab;
    }

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
    }

    @Override
    public String toString() {
        //Code to get the number of "*" depending on level user had input
        String displayLevel = "";
        for(int i = 0; i < level; i++)
            displayLevel = displayLevel + "*";

        //Return the entire information of each vocab from level, word, then meaning
        return String.format("%-3s", displayLevel)+ String.format("%15s", vocab) + "  " + def;
    }

    //function that will write the format of our file
    public String fileString() {
        return this.level + "|" + this.vocab + "|" + this.def;
    }
}
