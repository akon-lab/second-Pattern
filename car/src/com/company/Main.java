package com.company;

import com.company.type_enum.BMVEnum;
import com.company.type_enum.ToyotaEnum;

import java.util.Scanner;

public class Main {
    Car car;
    Model model;
    Color color;
    Scanner sc = new Scanner(System.in);

    public void main() {
        System.out.println("Choose model:");
        model = model();

        System.out.println("Choose type:");
        if (model.equals(Model.KIA)) {

        } else if (model.equals(Model.TOYOTA)) {


        } else if (model.equals(Model.BMV)) {


        }

        System.out.println("Choose color:");
        color = color();
    }

    public Model model() {
        for (Model m : Model.values()) {
            System.out.println(m);
        }
        String m = sc.next();
        for (Model model : Model.values()) {
            if (m.equals(model)) {
                return model;
            }
        }
        return null;
    }

    public Color color() {
        for (Color c : Color.values()) {
            System.out.println(c);
        }
        String c = sc.next();
        for (Color color : Color.values()) {
            if (c.equals(color)) {
                return color;
            }
        }
        return null;
    }

}
