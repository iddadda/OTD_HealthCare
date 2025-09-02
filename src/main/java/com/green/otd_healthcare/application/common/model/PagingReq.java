package com.green.otd_healthcare.application.common.model;

import lombok.Getter;
import lombok.ToString;
import org.springframework.web.bind.annotation.BindParam;

@Getter
@ToString
public class PagingReq {
    private Integer page;
    private Integer rowPerPage;

    public PagingReq(Integer page, @BindParam("row_per_page") Integer rowPerPage) {
        this.page = page;
        this.rowPerPage = rowPerPage;
    }
}
