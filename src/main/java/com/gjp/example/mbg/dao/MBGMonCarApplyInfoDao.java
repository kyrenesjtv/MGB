package com.gjp.example.mbg.dao;

import com.gjp.example.mbg.model.MonCarApplyInfo;
import com.gjp.example.mbg.model.MonCarApplyInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MBGMonCarApplyInfoDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_car_apply_info
     *
     * @mbggenerated Sat Sep 29 16:11:36 CST 2018
     */
    int countByExample(MonCarApplyInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_car_apply_info
     *
     * @mbggenerated Sat Sep 29 16:11:36 CST 2018
     */
    int deleteByExample(MonCarApplyInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_car_apply_info
     *
     * @mbggenerated Sat Sep 29 16:11:36 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_car_apply_info
     *
     * @mbggenerated Sat Sep 29 16:11:36 CST 2018
     */
    int insert(MonCarApplyInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_car_apply_info
     *
     * @mbggenerated Sat Sep 29 16:11:36 CST 2018
     */
    int insertSelective(MonCarApplyInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_car_apply_info
     *
     * @mbggenerated Sat Sep 29 16:11:36 CST 2018
     */
    List<MonCarApplyInfo> selectByExample(MonCarApplyInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_car_apply_info
     *
     * @mbggenerated Sat Sep 29 16:11:36 CST 2018
     */
    MonCarApplyInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_car_apply_info
     *
     * @mbggenerated Sat Sep 29 16:11:36 CST 2018
     */
    int updateByExampleSelective(@Param("record") MonCarApplyInfo record, @Param("example") MonCarApplyInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_car_apply_info
     *
     * @mbggenerated Sat Sep 29 16:11:36 CST 2018
     */
    int updateByExample(@Param("record") MonCarApplyInfo record, @Param("example") MonCarApplyInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_car_apply_info
     *
     * @mbggenerated Sat Sep 29 16:11:36 CST 2018
     */
    int updateByPrimaryKeySelective(MonCarApplyInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_car_apply_info
     *
     * @mbggenerated Sat Sep 29 16:11:36 CST 2018
     */
    int updateByPrimaryKey(MonCarApplyInfo record);
}