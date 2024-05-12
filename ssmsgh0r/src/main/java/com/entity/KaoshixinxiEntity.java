package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 考试信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-22 15:32:18
 */
@TableName("kaoshixinxi")
public class KaoshixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KaoshixinxiEntity() {
		
	}
	
	public KaoshixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 科目编号
	 */
					
	private String kemubianhao;
	
	/**
	 * 科目名称
	 */
					
	private String kemumingcheng;
	
	/**
	 * 科目分类
	 */
					
	private String kemufenlei;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 考试费
	 */
					
	private Integer kaoshifei;
	
	/**
	 * 科目内容
	 */
					
	private String kemuneirong;
	
	/**
	 * 教练账号
	 */
					
	private String jiaolianzhanghao;
	
	/**
	 * 教练姓名
	 */
					
	private String jiaolianxingming;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：科目编号
	 */
	public void setKemubianhao(String kemubianhao) {
		this.kemubianhao = kemubianhao;
	}
	/**
	 * 获取：科目编号
	 */
	public String getKemubianhao() {
		return kemubianhao;
	}
	/**
	 * 设置：科目名称
	 */
	public void setKemumingcheng(String kemumingcheng) {
		this.kemumingcheng = kemumingcheng;
	}
	/**
	 * 获取：科目名称
	 */
	public String getKemumingcheng() {
		return kemumingcheng;
	}
	/**
	 * 设置：科目分类
	 */
	public void setKemufenlei(String kemufenlei) {
		this.kemufenlei = kemufenlei;
	}
	/**
	 * 获取：科目分类
	 */
	public String getKemufenlei() {
		return kemufenlei;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：考试费
	 */
	public void setKaoshifei(Integer kaoshifei) {
		this.kaoshifei = kaoshifei;
	}
	/**
	 * 获取：考试费
	 */
	public Integer getKaoshifei() {
		return kaoshifei;
	}
	/**
	 * 设置：科目内容
	 */
	public void setKemuneirong(String kemuneirong) {
		this.kemuneirong = kemuneirong;
	}
	/**
	 * 获取：科目内容
	 */
	public String getKemuneirong() {
		return kemuneirong;
	}
	/**
	 * 设置：教练账号
	 */
	public void setJiaolianzhanghao(String jiaolianzhanghao) {
		this.jiaolianzhanghao = jiaolianzhanghao;
	}
	/**
	 * 获取：教练账号
	 */
	public String getJiaolianzhanghao() {
		return jiaolianzhanghao;
	}
	/**
	 * 设置：教练姓名
	 */
	public void setJiaolianxingming(String jiaolianxingming) {
		this.jiaolianxingming = jiaolianxingming;
	}
	/**
	 * 获取：教练姓名
	 */
	public String getJiaolianxingming() {
		return jiaolianxingming;
	}

}
