public class Energia
{
    private float stanPoczatkowy;
    private float stanObecny;

    public Energia(float stanPoczatkowy, float stanObecny)
    {
        this.stanPoczatkowy = stanPoczatkowy;
        this.stanObecny = stanObecny;
    }

    public float getStanPoczatkowy()
    {
        return stanPoczatkowy;
    }

    public float getStanObecny()
    {
        return stanObecny;
    }

    public float GetZuzycie()
    {
        return stanObecny - stanPoczatkowy;
    }
}
