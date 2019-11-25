package pertemuan10;

interface MProvides {
    void func();
}

interface MRequires {

    int getValue();
}

class Mixin implements MProvides {

    private final MRequires parent;

    public Mixin(MRequires parent) {
        this.parent = parent;
    }

    public
            void func() {
        System.out.println("Nilai dari method func: " + parent.getValue());
    }
}

class Parent {

    private int value;

    public Parent(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}

class Child extends Parent implements MRequires, MProvides{
private final MProvides mixin;

    public Child(int value) {
        super(value);
        this.mixin = new Mixin(this);
    }

    public void func() {
        mixin.func();
    }
}

class TestInherInterface {

    public static void main(String[] arg) {
        Child anak = new Child(5);
        anak.func();
        System.out.println("nilai dari method getValue:" + anak.getValue());
    }
}
