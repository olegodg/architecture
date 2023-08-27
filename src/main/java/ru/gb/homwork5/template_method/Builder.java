package ru.gb.homwork5.template_method;

abstract class Builder {

    public final void build() {
        test();
        lint();
        assemble();
        deploy();
    }

    public abstract void test();
    public abstract void lint();
    public abstract void assemble();
    public abstract void deploy();
}
