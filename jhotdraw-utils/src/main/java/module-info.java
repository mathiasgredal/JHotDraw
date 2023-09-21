module Utils {
    requires java.desktop;
    requires java.prefs;
    requires org.aspectj.weaver;

    exports org.jhotdraw.util;
    exports org.jhotdraw.util.prefs;
    exports org.jhotdraw.beans;
    exports org.jhotdraw.net;
    exports org.jhotdraw.geom;
    exports org.jhotdraw.util.undo;
    exports org.jhotdraw.io;
    exports org.jhotdraw.formatter;
}