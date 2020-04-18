package com.shan.meet.System.util;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class TableR {
    private Integer code = 0;
    private String msg = "";
    private int count;
    private List data;
 }
