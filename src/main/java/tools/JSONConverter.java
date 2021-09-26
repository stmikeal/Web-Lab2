package tools;

import beans.Point;

public class JSONConverter {
    public static String toJSON(Point point) {
        return String.format("\"x\":\"%f\",\"y\":\"%f\",\"r\":\"%d\","+
                "\"currentTime\":\"%s\",\"scriptTime\":\"%d\",\"hit\":\"%b\",\"ID\":\"%d\"}",
                point.getX(), point.getY(), point.getR(), point.getTime().toString(),
                point.getScript_time()*1000,
                point.getHit() ? "Точное попадание" : "Промах", point.getID());
    }
}
