package com.ostdlabs.test.service.smsc.impl;

import ru.smsc.sys.soap.*;
import ru.smsc.sys.soap_php.ServiceSoap;

/**
 * Created by aakhmerov on 12/09/14.
 */
public class SmscTestImpl implements ServiceSoap {
    @Override
    public SendResponse sendSms(Send send) {
        return null;
    }

    @Override
    public Send2Response sendSms2(Send2 send2) {
        return null;
    }

    @Override
    public CostResponse getSmsCost(Cost cost) {
        return null;
    }

    @Override
    public BalanceResponse getBalance(Balance balance) {
        return null;
    }

    @Override
    public StatusResponse getStatus(Status status) {
        return null;
    }

    @Override
    public Status2Response getStatus2(Status2 status2) {
        return null;
    }

    @Override
    public Cost2Response getSmsCost2(Cost2 cost2) {
        return null;
    }
}
