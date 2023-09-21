open module Core {
    requires Actions;
    requires API;
    requires XML;
    requires Utils;
    requires Datatransfer;

    requires featuretracer;
    requires java.desktop;
    requires java.logging;
    requires org.aspectj.weaver;

    exports org.jhotdraw.draw;
    exports org.jhotdraw.draw.action;
    exports org.jhotdraw.draw.event;
    exports org.jhotdraw.draw.figure;
    exports org.jhotdraw.draw.decoration;
    exports org.jhotdraw.draw.tool;
    exports org.jhotdraw.draw.io;
    exports org.jhotdraw.draw.handle;
    exports org.jhotdraw.draw.locator;
    exports org.jhotdraw.draw.print;
    exports org.jhotdraw.draw.connector;
    exports org.jhotdraw.draw.layouter;
    exports org.jhotdraw.draw.liner;
}