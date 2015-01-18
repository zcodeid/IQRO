package com.windupurnomo.iqro.models;

import java.util.List;

/**
 * Created by windupurnomo on 17/01/15.
 */
public class Letter {
    private int id;
    private List<Integer> sounds;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Integer> getSounds() {
        return sounds;
    }

    public void setSounds(List<Integer> sounds) {
        this.sounds = sounds;
    }
}
