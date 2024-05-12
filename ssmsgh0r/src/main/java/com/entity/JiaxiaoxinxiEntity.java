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
 * 驾校信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-22 15:32:18
 */
@TableName("jiaxiaoxinxi")
public class JiaxiaoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaxiaoxinxiEntity() {
		
	}
	
	public JiaxiaoxinxiEntity(T t) {
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
	 * 驾校名称
	 */
					
	private String jiaxiaomingcheng;
	
	/**
	 * 封面
	 */
					
	private String fengmian;
	
	/**
	 * 电话
	 */
					
	private String dianhua;
	
	/**
	 * 驾校简介
	 */
					
	private String jiaxiaojianjie;
	
	/**
	 * 成立时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date chenglishijian;
	
	/**
	 * 经度
	 */
					
	private Float longitude;
	
	/**
	 * 纬度
	 */
					
	private Float latitude;
	
	/**
	 * 地址
	 */
					
	private String fulladdress;
	
	
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
	 * 设置：驾校名称
	 */
	public void setJiaxiaomingcheng(String jiaxiaomingcheng) {
		this.jiaxiaomingcheng = jiaxiaomingcheng;
	}
	/**
	 * 获取：驾校名称
	 */
	public String getJiaxiaomingcheng() {
		return jiaxiaomingcheng;
	}
	/**
	 * 设置：封面
	 */
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
	/**
	 * 设置：电话
	 */
	public void setDianhua(String dianhua) {
		this.dianhua = dianhua;
	}
	/**
	 * 获取：电话
	 */
	public String getDianhua() {
		return dianhua;
	}
	/**
	 * 设置：驾校简介
	 */
	public void setJiaxiaojianjie(String jiaxiaojianjie) {
		this.jiaxiaojianjie = jiaxiaojianjie;
	}
	/**
	 * 获取：驾校简介
	 */
	public String getJiaxiaojianjie() {
		return jiaxiaojianjie;
	}
	/**
	 * 设置：成立时间
	 */
	public void setChenglishijian(Date chenglishijian) {
		this.chenglishijian = chenglishijian;
	}
	/**
	 * 获取：成立时间
	 */
	public Date getChenglishijian() {
		return chenglishijian;
	}
	/**
	 * 设置：经度
	 */
	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}
	/**
	 * 获取：经度
	 */
	public Float getLongitude() {
		return longitude;
	}
	/**
	 * 设置：纬度
	 */
	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}
	/**
	 * 获取：纬度
	 */
	public Float getLatitude() {
		return latitude;
	}
	/**
	 * 设置：地址
	 */
	public void setFulladdress(String fulladdress) {
		this.fulladdress = fulladdress;
	}
	/**
	 * 获取：地址
	 */
	public String getFulladdress() {
		return fulladdress;
	}

}
