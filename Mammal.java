class Mammal {
    void mam() {
        System.out.println("Inside mmamal class");
    }
}

class Koala extends Mammal {
    void sleeping() {
        System.out.println("Inside Koala class");
    }
}

class Human extends Mammal {
    void hum() {
        System.out.println("Inside Human class");
    }
}

class Ex {
    public static void main(String[] args) {
        Koala object = new Koala();

        object.sleeping();
        object.mam();

        Human obj2 = new Human();

        obj2.hum();
        obj2.mam();
    }
}