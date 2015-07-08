package io.github.debarshri.datatype;

import java.util.Map;

public class DataByte {
    private final String key;
    private final Map<String, String> columns;

    public DataByte(String key, Map<String, String> columns) {
        this.key = key;
        this.columns = columns;
    }

    public String getKey() {
        return key;
    }

    public Map<String, String> getColumns() {
        return columns;
    }
}
