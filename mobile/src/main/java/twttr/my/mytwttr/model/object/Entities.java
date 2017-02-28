package twttr.my.mytwttr.model.object;

import java.util.List;

/**
 * Created by Home on 28/02/2017.
 */

public class Entities {
    private List<Object> hashtags;
    private List<Object> media;
    private List<Object> urls;
    private List<Object> user_mentions;

    public List<Object> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<Object> hashtags) {
        this.hashtags = hashtags;
    }

    public List<Object> getMedia() {
        return media;
    }

    public void setMedia(List<Object> media) {
        this.media = media;
    }

    public List<Object> getUrls() {
        return urls;
    }

    public void setUrls(List<Object> urls) {
        this.urls = urls;
    }

    public List<Object> getUser_mentions() {
        return user_mentions;
    }

    public void setUser_mentions(List<Object> user_mentions) {
        this.user_mentions = user_mentions;
    }
}
