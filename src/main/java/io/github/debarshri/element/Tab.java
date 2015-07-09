package io.github.debarshri.element;

public class Tab implements HtmlElement {
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

    @Override
    public String toElement() {
        return null;
    }
}
