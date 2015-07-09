package io.github.debarshri.element;

public class TabContent implements HtmlElement {
    private String format;

    public TabContent(String format) {

        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    @Override
    public String toElement() {
        return null;
    }
}
