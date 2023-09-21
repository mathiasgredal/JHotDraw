open module GUI {
    requires Actions;
    requires Core;
    requires API;
    requires Utils;
    requires XML;

    requires featuretracer;
    requires java.desktop;
    requires java.prefs;
    requires org.aspectj.weaver;

    exports org.jhotdraw.gui;
    exports org.jhotdraw.gui.event;
    exports org.jhotdraw.gui.plaf.palette;
    exports org.jhotdraw.gui.action;
    exports org.jhotdraw.draw.gui;
    exports org.jhotdraw.text;
}