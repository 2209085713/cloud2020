package top.bypen.springcloud.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.byen.springcloud.entities.Payment;
import top.bypen.springcloud.dao.PaymentDao;
import top.bypen.springcloud.services.PaymentService;

/**
 * @Author: LiangJinpeng
 * @Date: 2020/6/15 13:37
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
