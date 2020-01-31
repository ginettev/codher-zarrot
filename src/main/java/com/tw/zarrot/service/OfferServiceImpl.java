package com.tw.zarrot.service;

import com.tw.zarrot.dto.Offer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OfferServiceImpl implements OfferService {

    @Autowired
    RestaurantService restaurantService;

    @Autowired
    CouponService couponService;

    @Override
    public Offer get() {
        return new Offer(restaurantService.get(), couponService.get());
    }
}
