package q5;

/**
 * @Description
 * @Date 2022/12/6 21:07
 * @Author RessMatthew
 * @Version 1.0
 **/

public class DawnFactory implements GameSceneFactory{
    @Override
    public Map createMap() {
        return new DawnMap();
    }

    @Override
    public Sound createSound() {
        return new DawnSound();
    }

    @Override
    public Weather createWeather() {
        return new DawnWeather();
    }
}
