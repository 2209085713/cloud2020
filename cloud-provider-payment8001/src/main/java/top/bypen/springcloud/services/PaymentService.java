package top.bypen.springcloud.services;


import top.byen.springcloud.entities.Payment;

/**
 * @Author: LiangJinpeng
 * @Date: 2020/6/15 13:36
 */
public interface PaymentService {

    public int create (Payment payment);

    public Payment getPaymentById(Long id);
}
