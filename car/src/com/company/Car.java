package com.company;

public abstract class Car {
    Model model;
    Color color;

    public Car() {
        model = Model.KIA;
        color = Color.pink;
    }

    public Car(Model model, Color color) {
        setColor(color);
        setModel(model);
    }

    //getter
    public Model getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    //setter
    public void setColor(Color color) {
        this.color = color;
    }

    public void setModel(Model modal) {
        this.model = modal;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model=" + model +
                ", color=" + color +
                '}';
    }
}
