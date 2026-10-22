public class Prostokat
{
    private int a;
    private int b;

    public int GetA()
    {
        return a;
    }

    public int GetB()
    {
        return b;
    }

    public Prostokat(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public int Pole()
    {
        return a * b;
    }
}
