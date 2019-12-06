public class Coin
{
    private final int HEADS = 0;
    private finals int TAILS = 1;

    private int face;

    public Coin(){
        flip();
    }
    public void flip(){
        face = (int) (Math.random()*2);
    }
}
