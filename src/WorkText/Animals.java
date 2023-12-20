package WorkText;

class Animals {
    void breathe() {
        System.out.println("Animal breathe ...");
    }

    final static void live(Animals an) {
        an.breathe();
    }
}