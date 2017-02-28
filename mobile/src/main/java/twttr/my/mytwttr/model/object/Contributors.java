package twttr.my.mytwttr.model.object;

/**
 * Created by Home on 28/02/2017.
 */

public class Contributors {
    private long id = 0;
    private String id_str = null;
    private String scree_name = null;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getId_str() {
        return id_str;
    }

    public void setId_str(String id_str) {
        this.id_str = id_str;
    }

    public String getScree_name() {
        return scree_name;
    }

    public void setScree_name(String scree_name) {
        this.scree_name = scree_name;
    }
}
