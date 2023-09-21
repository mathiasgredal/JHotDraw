module API {
    requires java.desktop;

    exports org.jhotdraw.api.app;
    exports org.jhotdraw.api.gui;
    requires org.aspectj.weaver;
}