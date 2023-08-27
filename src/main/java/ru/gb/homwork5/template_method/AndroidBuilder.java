package ru.gb.homwork5.template_method;

public class AndroidBuilder extends Builder {
    public void test() { System.out.println("1 -Running android tests"); }

    public void lint() {
        System.out.println("2 -Linting the android code");
    }

    public void assemble() {
        System.out.println("3 -Assembling the android build");
    }

    public void deploy() {
        System.out.println("4 -Deploying android build to server");
        System.out.println();
    }
}
