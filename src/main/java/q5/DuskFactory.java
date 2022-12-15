package q5;

/**
 * @Description
 * @Date 2022/12/6 21:06
 * @Author RessMatthew
 * @Version 1.0
 **/

public class DuskFactory implements GameSceneFactory{
    @Override
    public Map createMap() {
        return new DuskMap();
    }

    @Override
    public Sound createSound() {
        return new DuskSound();
    }

    @Override
    public Weather createWeather() {
        return new DuskWeather();
    }
}
