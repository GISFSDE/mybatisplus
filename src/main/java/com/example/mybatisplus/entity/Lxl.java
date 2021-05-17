package com.example.mybatisplus.entity;


import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author lxl
 * @since 2021-05-17
 */
@Data
@Accessors(chain = true)
@ApiModel(value="Lxl对象", description="")
public class Lxl{

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    private String sex;


}
