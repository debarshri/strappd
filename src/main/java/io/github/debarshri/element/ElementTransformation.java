package io.github.debarshri.element;

public class ElementTransformation implements com.google.common.base.Function<HtmlElement, java.lang.String> {
    @Override
    public String apply(HtmlElement htmlElement) {
        return htmlElement.toElement();
    }
}