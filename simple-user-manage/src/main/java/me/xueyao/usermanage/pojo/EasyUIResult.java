package me.xueyao.usermanage.pojo;

import java.util.List;

/**
 * @author XueYao
 * @date 2017-12-12
 */
public class EasyUIResult {
    private Long total;
    private List<?> rows;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
