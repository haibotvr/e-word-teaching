package com.simon.cloud.word.urp.mapper;

import com.simon.cloud.word.api.entities.UrpUserBase;
import com.simon.cloud.word.api.entities.UrpUserBaseExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UrpUserBaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table urp_user_base
     *
     * @mbg.generated Thu Oct 25 09:26:00 CST 2018
     */
    long countByExample(UrpUserBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table urp_user_base
     *
     * @mbg.generated Thu Oct 25 09:26:00 CST 2018
     */
    int deleteByExample(UrpUserBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table urp_user_base
     *
     * @mbg.generated Thu Oct 25 09:26:00 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table urp_user_base
     *
     * @mbg.generated Thu Oct 25 09:26:00 CST 2018
     */
    int insert(UrpUserBase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table urp_user_base
     *
     * @mbg.generated Thu Oct 25 09:26:00 CST 2018
     */
    int insertSelective(UrpUserBase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table urp_user_base
     *
     * @mbg.generated Thu Oct 25 09:26:00 CST 2018
     */
    List<UrpUserBase> selectByExample(UrpUserBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table urp_user_base
     *
     * @mbg.generated Thu Oct 25 09:26:00 CST 2018
     */
    UrpUserBase selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table urp_user_base
     *
     * @mbg.generated Thu Oct 25 09:26:00 CST 2018
     */
    int updateByExampleSelective(@Param("record") UrpUserBase record, @Param("example") UrpUserBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table urp_user_base
     *
     * @mbg.generated Thu Oct 25 09:26:00 CST 2018
     */
    int updateByExample(@Param("record") UrpUserBase record, @Param("example") UrpUserBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table urp_user_base
     *
     * @mbg.generated Thu Oct 25 09:26:00 CST 2018
     */
    int updateByPrimaryKeySelective(UrpUserBase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table urp_user_base
     *
     * @mbg.generated Thu Oct 25 09:26:00 CST 2018
     */
    int updateByPrimaryKey(UrpUserBase record);
}