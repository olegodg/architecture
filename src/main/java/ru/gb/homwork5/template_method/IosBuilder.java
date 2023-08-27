package ru.gb.homwork5.template_method;

public class IosBuilder extends Builder {

    public void test() {
        System.out.println("1 -Running ios tests");
    }

    public void lint() {
        System.out.println("2 -Linting the ios code");
    }

    public void assemble() {
        System.out.println("3 -Assembling the ios build");
    }

    public void deploy() {
        System.out.println("4 -Deploying ios build to server");
        System.out.println();
    }
}