package io.github.debarshri.element;

import com.google.common.collect.Lists;
import io.github.debarshri.Utils;

import java.util.List;

public class FreeElement implements HtmlElement {
    private List<String> freeText;

    public FreeElement(String freeText) {
        this.freeText = Lists.newArrayList(freeText);
    }

    public FreeElement(String...freeText) {
        this.freeText = Lists.newArrayList(freeText);
    }

    @Override
    public String toElement() {
        return Utils.merge(freeText.toArray(new String[freeText.size()]));
    }
}
