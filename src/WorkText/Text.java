package WorkText;

class Test {
    public static void main(String args[]) {
        Animals an = new Fish();
        //an.swim();
        an.breathe();
        Fish f = (Fish) an;
        f.swim();
    }
}
