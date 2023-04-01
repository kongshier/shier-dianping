package com.shierdp.dto;

import lombok.Data;

import java.util.List;

/**
 * @author Shier
 */
@Data
public class ScrollResult {
    private List<?> list;
    private Long minTime;
    private Integer offset;
}
