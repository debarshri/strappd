package io.github.debarshri.datatype;

public class Tabulator {
    private String body;
    private String lastKey;
    private String startKey;

    public Tabulator(String body, String lastKey, String startKey) {
        this.body = body;
        this.lastKey = lastKey;
        this.startKey = startKey;
    }

    public String getBody() {
        return body;
    }

    public String getLastKey() {
        return lastKey;
    }

    public String getStartKey() {
        return startKey;
    }
}
