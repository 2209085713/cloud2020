package top.bypen.springcloud.entities;

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
public class CommontResult<T> {

    private Integer code;
    private String message;
    private T t;

    public CommontResult(Integer code, String message){
        this(code,message,null);
    }

}
