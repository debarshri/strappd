package io.github.debarshri.datatype;

public class Tab {
    private final String navTab;
    private final String tabContent;

    public Tab(String navTab, String tabContent) {
        this.navTab = navTab;
        this.tabContent = tabContent;
    }

    public String getNavTab() {
        return navTab;
    }

    public String getTabContent() {
        return tabContent;
    }
}
