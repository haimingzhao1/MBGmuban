package com.bm.dao;

import com.bm.model.BStock;
import com.bm.model.BStockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BStockMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_stock
     *
     * @mbg.generated Mon May 13 14:28:00 CST 2019
     */
    long countByExample(BStockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_stock
     *
     * @mbg.generated Mon May 13 14:28:00 CST 2019
     */
    int deleteByExample(BStockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_stock
     *
     * @mbg.generated Mon May 13 14:28:00 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_stock
     *
     * @mbg.generated Mon May 13 14:28:00 CST 2019
     */
    int insert(BStock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_stock
     *
     * @mbg.generated Mon May 13 14:28:00 CST 2019
     */
    int insertSelective(BStock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_stock
     *
     * @mbg.generated Mon May 13 14:28:00 CST 2019
     */
    List<BStock> selectByExample(BStockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_stock
     *
     * @mbg.generated Mon May 13 14:28:00 CST 2019
     */
    BStock selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_stock
     *
     * @mbg.generated Mon May 13 14:28:00 CST 2019
     */
    int updateByExampleSelective(@Param("record") BStock record, @Param("example") BStockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_stock
     *
     * @mbg.generated Mon May 13 14:28:00 CST 2019
     */
    int updateByExample(@Param("record") BStock record, @Param("example") BStockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_stock
     *
     * @mbg.generated Mon May 13 14:28:00 CST 2019
     */
    int updateByPrimaryKeySelective(BStock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_stock
     *
     * @mbg.generated Mon May 13 14:28:00 CST 2019
     */
    int updateByPrimaryKey(BStock record);
}