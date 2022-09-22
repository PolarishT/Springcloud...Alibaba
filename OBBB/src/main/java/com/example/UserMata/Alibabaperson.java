package com.example.UserMata;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 
 * alibabaperson
 */
@TableName(value ="alibabaperson")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Alibabaperson implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 性别
     */
    private String name;

    /**
     * 电话
     */
    private String phone;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}