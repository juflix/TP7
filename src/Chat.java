public class Chat extends Animal {
    public void seDeplacer(int x, int y){
        this.coordonnees.abs += x;
        this.coordonnees.ord += y;
    }
    public void faireDuBruit(){
        System.out.println("Je suis un chat miaou!");
    }
}
