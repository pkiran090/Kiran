package test.web;

import java.util.Arrays;
import java.util.List;

import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import org.jrebirth.af.api.resource.ResourceItem;
import org.jrebirth.af.api.resource.font.FontItem;
import org.jrebirth.af.api.ui.Model;
import org.jrebirth.af.core.application.DefaultApplication;
import test.web.resources.SampleFonts;
import test.web.resources.SampleStyles;
import test.web.ui.SampleModel;
/**
 * The class <strong>SampleApplication</strong>.
 * 
 * @author
 */
public final class SampleApplication extends DefaultApplication<StackPane> {

    /**
     * Application launcher.
     * 
     * @param args the command line arguments
     */
    public static void main(final String... args) {
        preloadAndLaunch(args);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<? extends Model> firstModelClass() {
        return SampleModel.class;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void customizeStage(final Stage stage) {
        stage.setFullScreen(false);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void customizeScene(final Scene scene) {
        addCSS(scene, SampleStyles.MAIN);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected List<? extends ResourceItem<?, ?, ?>> getResourceToPreload() {
        return Arrays.asList(new FontItem[] {
                SampleFonts.SPLASH,
        });
    }

}
