package io.github.debarshri.element;

import io.github.debarshri.Html;

public class CSS implements HtmlElement{

    private String css;

    public CSS(String css) {
        this.css = css;
    }
    
    @Override
    public String toString()
    {
        return css;
    }

    @Override
    public String toElement() {
        return Html.css(css);
    }
}
