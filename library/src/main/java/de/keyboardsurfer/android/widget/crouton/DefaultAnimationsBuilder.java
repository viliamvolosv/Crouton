
package de.keyboardsurfer.android.widget.crouton;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

/**
 * Builds the default animations for showing and hiding a {@link  Crouton}.
 */
final class DefaultAnimationsBuilder {
    private static final long DURATION = 400;

    private DefaultAnimationsBuilder() {
    /* no-op */
    }

    /**
     * @param croutonView The croutonView which gets animated.
     * @return The default Animation for a showing {@link  Crouton}.
     */
    static Animation buildDefaultSlideInDownAnimation(View croutonView) {
        Animation slideInDownAnimation = new TranslateAnimation(
                0, 0,                               // X: from, to
                -croutonView.getMeasuredHeight(), 0 // Y: from, to
        );
        slideInDownAnimation.setDuration(DURATION);
        return slideInDownAnimation;
    }

    /**
     * @param croutonView The croutonView which gets animated.
     * @return The default Animation for a hiding {@link  Crouton}.
     */
    static Animation buildDefaultSlideOutUpAnimation(View croutonView) {
        Animation slideOutUpAnimation = new TranslateAnimation(
                0, 0,                               // X: from, to
                0, -croutonView.getMeasuredHeight() // Y: from, to
        );
        slideOutUpAnimation.setDuration(DURATION);
        return slideOutUpAnimation;
    }

}
