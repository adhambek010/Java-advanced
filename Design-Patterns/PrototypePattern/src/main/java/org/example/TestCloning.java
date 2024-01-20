package org.example;

public class TestCloning {
    public static void main(String[] args) {
        CloneFactory factory = new CloneFactory();
        Sheep sally = new Sheep();
        Sheep clonedSheep = (Sheep) factory.getClone(sally);

        System.out.println(sally);
        System.out.println(clonedSheep);

        System.out.println("Sally HashCode : " + System.identityHashCode(sally));
        System.out.println("ClonedSheep HashCode " + System.identityHashCode(clonedSheep));
    }
}
