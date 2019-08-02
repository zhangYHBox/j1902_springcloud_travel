package com.qf.j1902.pojo;

/**
 * Created by F117 on 2019/7/23.
 */

import lombok.Data;

@Data
public class PageMessage {
    private int pageNum;
    private int pgeSize;
    private int current;
}
