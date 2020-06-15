package top.byen.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: LiangJinpeng
 * @Date: 2020/6/15 13:40
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T t;

    public CommonResult(Integer code, String message){
        this(code,message,null);
    }

}
