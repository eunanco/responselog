package com.allstate.xp;

import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * Created by localadmin on 11/24/16.
 */
final class OurReqParams {
    @Id
    private String id;

    private String reqParamsString;

    private Date reqDate;


    OurReqParams(final String reqParamsString)
    {
        this.reqParamsString = reqParamsString;
        this.reqDate = new Date();
    }

    public String getReqParamsString() {
        return reqParamsString;
    }

    public Date getReqDate() {
        return reqDate;
    }


    @Override
    public String toString() {
        return "OurReqParams{" +
                "id='" + id + '\'' +
                ", reqParamsString='" + reqParamsString + '\'' +
                ", reqDate=" + reqDate +
                '}';
    }
}
