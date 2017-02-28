package twttr.my.mytwttr.model.object;

/**
 * Created by Home on 28/02/2017.
 */

public class Places {
    private Object attributes = null;
    private Object bounding_box = null;
    private String country = null;
    private String country_code = null;
    private String full_name = null;
    private String id = null;
    private String name = null;
    private String place_type = null;
    private String url = null;

    public Object getAttributes() {
        return attributes;
    }

    public void setAttributes(Object attributes) {
        this.attributes = attributes;
    }

    public Object getBounding_box() {
        return bounding_box;
    }

    public void setBounding_box(Object bounding_box) {
        this.bounding_box = bounding_box;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace_type() {
        return place_type;
    }

    public void setPlace_type(String place_type) {
        this.place_type = place_type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
