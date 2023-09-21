module App {
    exports org.jhotdraw.app;
    exports org.jhotdraw.app.action.file;
    requires Actions;
    requires API;
    requires Utils;
    requires GUI;
    requires org.aspectj.weaver;

    requires featuretracer;
    requires java.desktop;
    requires java.prefs;
    requires java.logging;

}