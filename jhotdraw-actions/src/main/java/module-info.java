module Actions {
    requires API;
    requires Datatransfer;
    requires Utils;

    requires java.desktop;

    exports org.jhotdraw.action;
    exports org.jhotdraw.action.edit;
    exports org.jhotdraw.action.window;
    exports org.jhotdraw.action.view;
    requires org.aspectj.weaver;
}