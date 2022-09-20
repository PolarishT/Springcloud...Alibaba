package com.example.TicketService;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName alibabaticket
 */
@TableName(value ="alibabaticket")
@Data
public class Alibabaticket implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 总数
     */
    private Long total;

    /**
     * 剩余
     */
    private Long residue;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}