package org.example;

public class Word {
    private int level;
    private String vocab;
    private String def;

    public Word(int level, String vocab, String def) {
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
        return super.toString();
    }
}
