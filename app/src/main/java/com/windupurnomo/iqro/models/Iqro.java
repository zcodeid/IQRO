package com.windupurnomo.iqro.models;

import java.util.List;

/**
 * Created by windupurnomo on 17/01/15.
 */
public class Iqro {
    private int iqro;
    private List<Level> levels;

    public Iqro(int iqro, List<Level> levels) {
        this.iqro = iqro;
        this.levels = levels;
    }

    public int getIqro() {
        return iqro;
    }

    public void setIqro(int iqro) {
        this.iqro = iqro;
    }

    public List<Level> getLevels() {
        return levels;
    }

    public void setLevels(List<Level> levels) {
        this.levels = levels;
    }
}