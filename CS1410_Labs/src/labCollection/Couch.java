package labCollection;

import java.awt.Color;

public class Couch {
    private Color color;
    private Material material;

    public Couch(Color color, Material material) {
        this.color = color;
        this.material = material;
    }

    public Color getColor() {
        return color;
    }

    public Material getMaterial() {
        return material;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Couch)) return false;
        Couch other = (Couch) obj;
        return color.equals(other.color) && material == other.material;
    }

    @Override
    public String toString() {
        String colorString = String.format("#%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue());
        return "Couch: " + colorString + " " + material.toString().toLowerCase();
    }
}