package io.github.debarshri.element;

import io.github.debarshri.Html;

import java.util.List;

import static io.github.debarshri.Utils.merge;

public class Head implements HtmlElement{
    private List<HtmlElement> elementList;

    public Head(List<HtmlElement> elementList) {
        this.elementList = elementList;
    }

    @Override
    public String toString()
    {
        return merge(elementList);
    }

    @Override
    public String toElement() {
        return Html.head(merge(elementList));
    }
}
