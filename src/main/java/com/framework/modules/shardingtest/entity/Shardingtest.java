package com.framework.modules.shardingtest.entity;

import java.util.Date;

public class Shardingtest {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shardingtest.id
     *
     * @mbg.generated Tue May 08 09:51:48 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shardingtest.tt
     *
     * @mbg.generated Tue May 08 09:51:48 CST 2018
     */
    private Date tt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shardingtest.id
     *
     * @return the value of shardingtest.id
     *
     * @mbg.generated Tue May 08 09:51:48 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shardingtest.id
     *
     * @param id the value for shardingtest.id
     *
     * @mbg.generated Tue May 08 09:51:48 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shardingtest.tt
     *
     * @return the value of shardingtest.tt
     *
     * @mbg.generated Tue May 08 09:51:48 CST 2018
     */
    public Date getTt() {
        return tt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shardingtest.tt
     *
     * @param tt the value for shardingtest.tt
     *
     * @mbg.generated Tue May 08 09:51:48 CST 2018
     */
    public void setTt(Date tt) {
        this.tt = tt;
    }
}