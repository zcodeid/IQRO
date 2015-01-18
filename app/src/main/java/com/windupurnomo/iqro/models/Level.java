package com.windupurnomo.iqro.models;

import java.util.List;

/**
 * Created by windupurnomo on 18/01/15.
 */
public class Level {
    private int level;
    private List<Letter> letters;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<Letter> getLetters() {
        return letters;
    }

    public void setLetters(List<Letter> letters) {
        this.letters = letters;
    }
}
