package twttr.my.mytwttr.view.component;

import android.graphics.Bitmap;
import android.support.v7.graphics.Palette;
import android.support.v7.graphics.Target;

/**
 * Created by Home on 02/03/2017.
 */

public class CustomPalette {
    private Palette palette;
    private Palette.Swatch swatch;

    /**
     * Creates a palette based on image
     * @param bitmap image that will be based
     */
    public void createPaletteSync(Bitmap bitmap){
        this.palette = Palette.from(bitmap).generate();
    }

    public int getVibrantTitleTextColor(){
        swatch = palette.getVibrantSwatch();
        return swatch.getTitleTextColor();
    }

    public int getVibrantBodyTextColor(){
        swatch = palette.getVibrantSwatch();
        return swatch.getBodyTextColor();
    }

    public int getVibrantRgb(){
        swatch = palette.getVibrantSwatch();
        return swatch.getRgb();
    }

    public int getDominantTitleTextColor(){
        swatch = palette.getDominantSwatch();
        return swatch.getTitleTextColor();
    }

    public int getDominantBodyTextColor(){
        swatch = palette.getDominantSwatch();
        return swatch.getBodyTextColor();
    }

    public int getDominantRgb(){
        swatch = palette.getDominantSwatch();
        return swatch.getRgb();
    }

    public int getMutedTitleTextColor(){
        swatch = palette.getMutedSwatch();
        return swatch.getTitleTextColor();
    }

    public int getMutedBodyTextColor(){
        swatch = palette.getMutedSwatch();
        return swatch.getBodyTextColor();
    }

    public int getMutedRgb(){
        swatch = palette.getMutedSwatch();
        return swatch.getRgb();
    }

    public int getDarkMutedTitleTextColor(){
        swatch = palette.getDarkMutedSwatch();
        return swatch.getTitleTextColor();
    }

    public int getDarkMutedBodyTextColor(){
        swatch = palette.getDarkMutedSwatch();
        return swatch.getBodyTextColor();
    }

    public int getDarkMutedRgb(){
        swatch = palette.getDarkMutedSwatch();
        return swatch.getRgb();
    }

    public int getDarkVibrantTitleTextColor(){
        swatch = palette.getDarkVibrantSwatch();
        return swatch.getTitleTextColor();
    }

    public int getDarkVibrantBodyTextColor(){
        swatch = palette.getDarkVibrantSwatch();
        return swatch.getBodyTextColor();
    }

    public int getDarkVibrantRgb(){
        swatch = palette.getDarkVibrantSwatch();
        return swatch.getRgb();
    }

    public int getLightMutedTitleTextColor(){
        swatch = palette.getLightMutedSwatch();
        return swatch.getTitleTextColor();
    }

    public int getLightMutedBodyTextColor(){
        swatch = palette.getLightMutedSwatch();
        return swatch.getBodyTextColor();
    }

    public int getLightMutedRgb(){
        swatch = palette.getLightMutedSwatch();
        return swatch.getRgb();
    }

    public int getLightVibrantTitleTextColor(){
        swatch = palette.getLightVibrantSwatch();
        return swatch.getTitleTextColor();
    }

    public int getLightVibrantBodyTextColor(){
        swatch = palette.getLightVibrantSwatch();
        return swatch.getBodyTextColor();
    }

    public int getLightVibrantRgb(){
        swatch = palette.getLightVibrantSwatch();
        return swatch.getRgb();
    }

    public int getLightVibrant(int defaultColor){
        return palette.getColorForTarget(Target.LIGHT_VIBRANT, defaultColor);
    }

    public int getVibrant(int defaultColor){
        return palette.getColorForTarget(Target.VIBRANT, defaultColor);
    }

    public int getDarkVibrant(int defaultColor){
        return palette.getColorForTarget(Target.DARK_VIBRANT, defaultColor);
    }

    public int getLightMuted(int defaultColor){
        return palette.getColorForTarget(Target.LIGHT_MUTED, defaultColor);
    }

    public int getMuted(int defaultColor){
        return palette.getColorForTarget(Target.MUTED, defaultColor);
    }

    public int getDarkMuted(int defaultColor){
        return palette.getColorForTarget(Target.DARK_MUTED, defaultColor);
    }
}
