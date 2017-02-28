package twttr.my.mytwttr.model.object;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Home on 28/02/2017.
 */

public class User {
    private boolean contributors_enabled = false;
    private String created_at = null;
    private boolean default_profile = false;
    private boolean default_profile_image = false;
    private String description = null;
    private Entities entities = null;
    private int favourites_count = 0;
    private boolean follow_request_sent = false;//na api está tipo Type
    private boolean following = false;//na api está tipo Type
    private int followers_count = 0;
    private int friends_count = 0;
    private boolean geo_enabled = false;
    private long id = 0;
    private String id_str = null;
    private boolean is_translator = false;
    private String lang = null;
    private int listed_count = 0;
    private String location = null;
    private String name = null;
    private boolean notifications = false;
    private String profile_background_color = null;
    private String profile_background_image_url = null;
    private String profile_background_image_url_https = null;
    private boolean profile_background_title = false;
    private String profile_banner_url = null;
    private String profile_image_url = null;
    private String profile_image_url_https = null;
    private String profile_link_color = null;
    private String profile_sidebar_border_color = null;
    private String profile_sidebar_fill_color = null;
    private String profile_text_color = null;
    private boolean profile_use_background_image = false;
    @SerializedName("protected")
    private boolean protect;
    private String screen_name = null;
    private boolean show_all_inline_media = false;
    private Tweets status = null;
    private int statuses_count = 0;
    private String time_zone = null;
    private String url = null;
    private int utc_offset = 0;
    private boolean verified = false;
    private String withheld_in_countries = null;
    private String withheld_scope = null;

    public boolean isContributors_enabled() {
        return contributors_enabled;
    }

    public void setContributors_enabled(boolean contributors_enabled) {
        this.contributors_enabled = contributors_enabled;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public boolean isDefault_profile() {
        return default_profile;
    }

    public void setDefault_profile(boolean default_profile) {
        this.default_profile = default_profile;
    }

    public boolean isDefault_profile_image() {
        return default_profile_image;
    }

    public void setDefault_profile_image(boolean default_profile_image) {
        this.default_profile_image = default_profile_image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Entities getEntities() {
        return entities;
    }

    public void setEntities(Entities entities) {
        this.entities = entities;
    }

    public int getFavourites_count() {
        return favourites_count;
    }

    public void setFavourites_count(int favourites_count) {
        this.favourites_count = favourites_count;
    }

    public boolean isFollow_request_sent() {
        return follow_request_sent;
    }

    public void setFollow_request_sent(boolean follow_request_sent) {
        this.follow_request_sent = follow_request_sent;
    }

    public boolean isFollowing() {
        return following;
    }

    public void setFollowing(boolean following) {
        this.following = following;
    }

    public int getFollowers_count() {
        return followers_count;
    }

    public void setFollowers_count(int followers_count) {
        this.followers_count = followers_count;
    }

    public int getFriends_count() {
        return friends_count;
    }

    public void setFriends_count(int friends_count) {
        this.friends_count = friends_count;
    }

    public boolean isGeo_enabled() {
        return geo_enabled;
    }

    public void setGeo_enabled(boolean geo_enabled) {
        this.geo_enabled = geo_enabled;
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

    public boolean is_translator() {
        return is_translator;
    }

    public void setIs_translator(boolean is_translator) {
        this.is_translator = is_translator;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public int getListed_count() {
        return listed_count;
    }

    public void setListed_count(int listed_count) {
        this.listed_count = listed_count;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNotifications() {
        return notifications;
    }

    public void setNotifications(boolean notifications) {
        this.notifications = notifications;
    }

    public String getProfile_background_color() {
        return profile_background_color;
    }

    public void setProfile_background_color(String profile_background_color) {
        this.profile_background_color = profile_background_color;
    }

    public String getProfile_background_image_url() {
        return profile_background_image_url;
    }

    public void setProfile_background_image_url(String profile_background_image_url) {
        this.profile_background_image_url = profile_background_image_url;
    }

    public String getProfile_background_image_url_https() {
        return profile_background_image_url_https;
    }

    public void setProfile_background_image_url_https(String profile_background_image_url_https) {
        this.profile_background_image_url_https = profile_background_image_url_https;
    }

    public boolean isProfile_background_title() {
        return profile_background_title;
    }

    public void setProfile_background_title(boolean profile_background_title) {
        this.profile_background_title = profile_background_title;
    }

    public String getProfile_banner_url() {
        return profile_banner_url;
    }

    public void setProfile_banner_url(String profile_banner_url) {
        this.profile_banner_url = profile_banner_url;
    }

    public String getProfile_image_url() {
        return profile_image_url;
    }

    public void setProfile_image_url(String profile_image_url) {
        this.profile_image_url = profile_image_url;
    }

    public String getProfile_image_url_https() {
        return profile_image_url_https;
    }

    public void setProfile_image_url_https(String profile_image_url_https) {
        this.profile_image_url_https = profile_image_url_https;
    }

    public String getProfile_link_color() {
        return profile_link_color;
    }

    public void setProfile_link_color(String profile_link_color) {
        this.profile_link_color = profile_link_color;
    }

    public String getProfile_sidebar_border_color() {
        return profile_sidebar_border_color;
    }

    public void setProfile_sidebar_border_color(String profile_sidebar_border_color) {
        this.profile_sidebar_border_color = profile_sidebar_border_color;
    }

    public String getProfile_sidebar_fill_color() {
        return profile_sidebar_fill_color;
    }

    public void setProfile_sidebar_fill_color(String profile_sidebar_fill_color) {
        this.profile_sidebar_fill_color = profile_sidebar_fill_color;
    }

    public String getProfile_text_color() {
        return profile_text_color;
    }

    public void setProfile_text_color(String profile_text_color) {
        this.profile_text_color = profile_text_color;
    }

    public boolean isProfile_use_background_image() {
        return profile_use_background_image;
    }

    public void setProfile_use_background_image(boolean profile_use_background_image) {
        this.profile_use_background_image = profile_use_background_image;
    }

    public boolean isProtect() {
        return protect;
    }

    public void setProtect(boolean protect) {
        this.protect = protect;
    }

    public String getScreen_name() {
        return screen_name;
    }

    public void setScreen_name(String screen_name) {
        this.screen_name = screen_name;
    }

    public boolean isShow_all_inline_media() {
        return show_all_inline_media;
    }

    public void setShow_all_inline_media(boolean show_all_inline_media) {
        this.show_all_inline_media = show_all_inline_media;
    }

    public Tweets getStatus() {
        return status;
    }

    public void setStatus(Tweets status) {
        this.status = status;
    }

    public int getStatuses_count() {
        return statuses_count;
    }

    public void setStatuses_count(int statuses_count) {
        this.statuses_count = statuses_count;
    }

    public String getTime_zone() {
        return time_zone;
    }

    public void setTime_zone(String time_zone) {
        this.time_zone = time_zone;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getUtc_offset() {
        return utc_offset;
    }

    public void setUtc_offset(int utc_offset) {
        this.utc_offset = utc_offset;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public String getWithheld_in_countries() {
        return withheld_in_countries;
    }

    public void setWithheld_in_countries(String withheld_in_countries) {
        this.withheld_in_countries = withheld_in_countries;
    }

    public String getWithheld_scope() {
        return withheld_scope;
    }

    public void setWithheld_scope(String withheld_scope) {
        this.withheld_scope = withheld_scope;
    }
}
