package com.zsmall.dao;

import com.zsmall.dataobject.OrderDO;

import java.util.List;

public interface OrderDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated Sat Feb 29 22:26:58 GMT+08:00 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated Sat Feb 29 22:26:58 GMT+08:00 2020
     */
    int insert(OrderDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated Sat Feb 29 22:26:58 GMT+08:00 2020
     */
    int insertSelective(OrderDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated Sat Feb 29 22:26:58 GMT+08:00 2020
     */
    OrderDO selectByPrimaryKey(Integer id);

    List<OrderDO> listOrder();

    Double selectPrice(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated Sat Feb 29 22:26:58 GMT+08:00 2020
     */
    int updateByPrimaryKeySelective(OrderDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated Sat Feb 29 22:26:58 GMT+08:00 2020
     */
    int updateByPrimaryKey(OrderDO record);


}