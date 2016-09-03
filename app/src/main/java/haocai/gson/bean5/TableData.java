package haocai.gson.bean5;

import java.util.List;

/**
 * Created by xionhgu on 2016/9/3.
 * Email：965705418@qq.com
 */
public class TableData {

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List getTableData() {
        return tableData;
    }

    public void setTableData(List tableData) {
        this.tableData = tableData;
    }

    private String tableName;

    private List tableData;
}
