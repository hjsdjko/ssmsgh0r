package com.entity.vo;

import com.entity.KaoshixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 考试信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-22 15:32:18
 */
public class KaoshixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
