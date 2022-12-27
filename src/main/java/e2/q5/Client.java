package e2.q5;

/**
 * @Description
 * @Date 2022/12/6 21:09
 * @Author RessMatthew
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        GameSceneFactory gameSceneFactory = (GameSceneFactory) XMLUtil.getGameScene();
        Map map = gameSceneFactory.createMap();
        Sound sound = gameSceneFactory.createSound();
        Weather weather = gameSceneFactory.createWeather();
        map.display();
        sound.display();
        weather.display();
    }
}
