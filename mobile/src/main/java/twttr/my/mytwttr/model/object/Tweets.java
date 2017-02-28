package twttr.my.mytwttr.model.object;

import java.util.List;

/**
 * Created by Home on 28/02/2017.
 */

public class Tweets {
    private Contributors[] contributors = null;
    private Coordinates coordinates = null;
    private String created_at = null;
    private Object current_user_retweet = null;
    private Entities entities = null;
    private int favorite_count = 0;
    private boolean favorited = false;
    private String filter_level = null;
    private long id = 0;
    private String id_str = null;
    private String in_reply_to_screen_name = null;
    private long in_reply_to_status_id = 0;
    private String in_reply_to_status_id_str = null;
    private long in_reply_to_user_id = 0;
    private String in_reply_to_user_id_str = null;
    private String lang = null;
    private Places place = null;
    private boolean possibly_sensitive = false;
    private long quoted_status_id = 0;
    private String quoted_status_id_str = null;
    private Tweets quoted_status = null;
    private Object scopes = null;
    private int retweet_count = 0;
    private boolean retweeted = false;
    private Tweets retweeted_status = null;
    private String source = null;
    private String text = null;
    private boolean truncated = false;
    private User user;
    private boolean withheld_copyright = false;
    private List<String> withheld_in_countries = null;
    private String withheld_scope = null;

    public Contributors[] getContributors() {
        return contributors;
    }

    public void setContributors(Contributors[] contributors) {
        this.contributors = contributors;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public Object getCurrent_user_retweet() {
        return current_user_retweet;
    }

    public void setCurrent_user_retweet(Object current_user_retweet) {
        this.current_user_retweet = current_user_retweet;
    }

    public Entities getEntities() {
        return entities;
    }

    public void setEntities(Entities entities) {
        this.entities = entities;
    }

    public int getFavorite_count() {
        return favorite_count;
    }

    public void setFavorite_count(int favorite_count) {
        this.favorite_count = favorite_count;
    }

    public boolean isFavorited() {
        return favorited;
    }

    public void setFavorited(boolean favorited) {
        this.favorited = favorited;
    }

    public String getFilter_level() {
        return filter_level;
    }

    public void setFilter_level(String filter_level) {
        this.filter_level = filter_level;
    }

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

    public String getIn_reply_to_screen_name() {
        return in_reply_to_screen_name;
    }

    public void setIn_reply_to_screen_name(String in_reply_to_screen_name) {
        this.in_reply_to_screen_name = in_reply_to_screen_name;
    }

    public long getIn_reply_to_status_id() {
        return in_reply_to_status_id;
    }

    public void setIn_reply_to_status_id(long in_reply_to_status_id) {
        this.in_reply_to_status_id = in_reply_to_status_id;
    }

    public String getIn_reply_to_status_id_str() {
        return in_reply_to_status_id_str;
    }

    public void setIn_reply_to_status_id_str(String in_reply_to_status_id_str) {
        this.in_reply_to_status_id_str = in_reply_to_status_id_str;
    }

    public long getIn_reply_to_user_id() {
        return in_reply_to_user_id;
    }

    public void setIn_reply_to_user_id(long in_reply_to_user_id) {
        this.in_reply_to_user_id = in_reply_to_user_id;
    }

    public String getIn_reply_to_user_id_str() {
        return in_reply_to_user_id_str;
    }

    public void setIn_reply_to_user_id_str(String in_reply_to_user_id_str) {
        this.in_reply_to_user_id_str = in_reply_to_user_id_str;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Places getPlace() {
        return place;
    }

    public void setPlace(Places place) {
        this.place = place;
    }

    public boolean isPossibly_sensitive() {
        return possibly_sensitive;
    }

    public void setPossibly_sensitive(boolean possibly_sensitive) {
        this.possibly_sensitive = possibly_sensitive;
    }

    public long getQuoted_status_id() {
        return quoted_status_id;
    }

    public void setQuoted_status_id(long quoted_status_id) {
        this.quoted_status_id = quoted_status_id;
    }

    public String getQuoted_status_id_str() {
        return quoted_status_id_str;
    }

    public void setQuoted_status_id_str(String quoted_status_id_str) {
        this.quoted_status_id_str = quoted_status_id_str;
    }

    public Tweets getQuoted_status() {
        return quoted_status;
    }

    public void setQuoted_status(Tweets quoted_status) {
        this.quoted_status = quoted_status;
    }

    public Object getScopes() {
        return scopes;
    }

    public void setScopes(Object scopes) {
        this.scopes = scopes;
    }

    public int getRetweet_count() {
        return retweet_count;
    }

    public void setRetweet_count(int retweet_count) {
        this.retweet_count = retweet_count;
    }

    public boolean isRetweeted() {
        return retweeted;
    }

    public void setRetweeted(boolean retweeted) {
        this.retweeted = retweeted;
    }

    public Tweets getRetweeted_status() {
        return retweeted_status;
    }

    public void setRetweeted_status(Tweets retweeted_status) {
        this.retweeted_status = retweeted_status;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isTruncated() {
        return truncated;
    }

    public void setTruncated(boolean truncated) {
        this.truncated = truncated;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isWithheld_copyright() {
        return withheld_copyright;
    }

    public void setWithheld_copyright(boolean withheld_copyright) {
        this.withheld_copyright = withheld_copyright;
    }

    public List<String> getWithheld_in_countries() {
        return withheld_in_countries;
    }

    public void setWithheld_in_countries(List<String> withheld_in_countries) {
        this.withheld_in_countries = withheld_in_countries;
    }

    public String getWithheld_scope() {
        return withheld_scope;
    }

    public void setWithheld_scope(String withheld_scope) {
        this.withheld_scope = withheld_scope;
    }
}
