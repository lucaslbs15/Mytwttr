package twttr.my.mytwttr.model.object;

/**
 * Created by Home on 28/02/2017.
 */

public class BoundingBox {
    private Coordinates[] coordinates = null;
    private String type = null;

    public Coordinates[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates[] coordinates) {
        this.coordinates = coordinates;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
