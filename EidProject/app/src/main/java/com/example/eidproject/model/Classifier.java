package com.example.eidproject.model;

public interface Classifier {
    String name();

    Classification recognize(final float[] pixels);
}
