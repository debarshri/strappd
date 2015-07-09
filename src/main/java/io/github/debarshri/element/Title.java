package io.github.debarshri.element;

import io.github.debarshri.Html;

public class Title implements HtmlElement{
    private String title;

    public Title(String title) {
        this.title = title;
    }
    
    @Override
    public String toString()
    {
        return title;
    }

    @Override
    public String toElement() {
        return Html.title(title);
    }
}
