public class Chien extends Animal implements Bruit {
    public void seDeplacer(int x, int y){
        this.abs += x;
        this.ord += y;
    }

    public void faireDuBruit(){
        System.out.println("Je suis un chien waouf!");
    }
}
