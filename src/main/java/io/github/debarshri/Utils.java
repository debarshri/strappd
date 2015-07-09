package io.github.debarshri;

import com.google.common.collect.Collections2;
import io.github.debarshri.element.ElementTransformation;
import io.github.debarshri.element.HtmlElement;

import java.util.Collection;
import java.util.List;

public class Utils {

    public static String merge(String[] datas) {
        String content = "";
        for (String data : datas) {
            content = content + data;
        }
        return content.trim();
    }

    public static String merge(List<HtmlElement> datas) {
        Collection<String> transform = Collections2.transform(datas, new ElementTransformation());
        return Utils.merge(transform.toArray(new String[transform.size()]));
    }
}
