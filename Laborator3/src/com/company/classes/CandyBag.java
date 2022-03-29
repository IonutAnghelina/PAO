package com.company.classes;

import java.util.Arrays;

public class CandyBag {

    CandyBox[] boxes;

    public CandyBag() {
        boxes = null;
    }

    public CandyBag(CandyBox[] boxes) {
        this.boxes = boxes;
    }

    public CandyBox[] getBoxes() {
        return boxes;
    }

    public void setBoxes(CandyBox[] boxes) {
        this.boxes = boxes;
    }

    @Override
    public String toString() {
        return "CandyBag{" +
                "boxes=" + Arrays.toString(boxes) +
                '}';
    }
}
