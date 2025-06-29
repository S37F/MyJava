package Interfaces;
interface Moveable {
    public void moveFast();
}
interface Crawable {
    public void Crawl();
}
class Ques implements Moveable, Crawable {
    public void moveFast(){
        System.out.println("This is Moveable Animal ");
    }
    public void Crawl(){
        System.out.println("This is Crawable Animal ");
    }
    public static void main(String[] args) {
        Ques foo = new Ques();
        foo.moveFast();
        foo.Crawl();
    }
}

