open module App {
    requires Actions;
    requires API;
    requires Utils;
    requires GUI;

    requires featuretracer;
    requires java.desktop;
    requires java.prefs;
    requires java.logging;
    requires org.aspectj.weaver;

    exports org.jhotdraw.app;
    exports org.jhotdraw.app.action.file;
}