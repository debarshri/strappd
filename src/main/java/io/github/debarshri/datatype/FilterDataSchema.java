package io.github.debarshri.datatype;

import java.util.List;

public class FilterDataSchema implements IDataSchema {
    private final List<DataByte> data;
    private final List<String> schema;
    private final List<String> actual;

    public FilterDataSchema(List<DataByte> data, List<String> schema, List<String> actual) {
        this.data = data;
        this.schema = schema;
        this.actual = actual;
    }

    @Override
    public List<DataByte> getData() {
        return data;
    }

    @Override
    public List<String> getSchema() {
        return schema;
    }

    public List<String> getActual() {
        return actual;
    }
}
