package io.github.debarshri.datatype;

import java.util.List;

public class DataSchema implements IDataSchema {
    private List<DataByte> data;
    private List<String> schema;

    public DataSchema(List<DataByte> data, List<String> schema) {
        this.data = data;
        this.schema = schema;
    }

    @Override
    public List<DataByte> getData() {
        return data;
    }

    @Override
    public List<String> getSchema() {
        return schema;
    }
}
