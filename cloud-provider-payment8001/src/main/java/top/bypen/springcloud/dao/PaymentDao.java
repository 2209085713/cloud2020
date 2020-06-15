package top.bypen.springcloud.dao;

import top.bypen.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: LiangJinpeng
 * @Date: 2020/6/15 11:45
 */

@Mapper
public interface PaymentDao {

    public int create (Payment payment);

    public Payment getPaymentById(Long id);
}
