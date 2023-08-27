package ru.gb.homwork5.visitor;

public class Jump implements AnimalOperation{
    @Override
    public void visitLion(Lion lion) {
        System.out.println("Лев пыгнул 10 метров");
    }

    @Override
    public void visitDog(Dog dog) {
        System.out.println("Собака пыгнула 5 метров");
    }

    @Override
    public void visitCat(Cat cat) {
        System.out.println("Кот пыгнул 2 метра");
    }
}
