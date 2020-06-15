package top.bypen.springcloud.services;

import org.springframework.stereotype.Service;
import top.bypen.springcloud.entities.Payment;

/**
 * @Author: LiangJinpeng
 * @Date: 2020/6/15 13:36
 */
public interface PaymentService {

    public int create (Payment payment);

    public Payment getPaymentById(Long id);
}
