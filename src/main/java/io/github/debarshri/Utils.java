package io.github.debarshri;

import io.github.debarshri.datatype.Elemental;

public class Utils {

    public static String merge(String[] datas) {
        String content = "";
        for (String data : datas) {
            content = content + data;
        }
        return content.trim();
    }

    public static String merge(Elemental[] datas) {
        String content = "";
        for (Elemental data : datas) {
            content = content + data.getFormat();
        }
        return content.trim();
    }
}
