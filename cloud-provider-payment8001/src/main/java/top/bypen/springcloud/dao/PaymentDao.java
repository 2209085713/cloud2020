package top.bypen.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import top.byen.springcloud.entities.Payment;


/**
 * @Author: LiangJinpeng
 * @Date: 2020/6/15 11:45
 */

@Mapper
public interface PaymentDao {

    public int create (Payment payment);

    public Payment getPaymentById(Long id);
}
