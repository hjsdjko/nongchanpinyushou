package com.entity.vo;

import com.entity.DipiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 地皮
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("dipi")
public class DipiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 地皮名称
     */

    @TableField(value = "dipi_name")
    private String dipiName;


    /**
     * 地皮位置
     */

    @TableField(value = "dipi_weizhi")
    private String dipiWeizhi;


    /**
     * 地皮缩略图
     */

    @TableField(value = "dipi_photo")
    private String dipiPhoto;


    /**
     * 地皮价格
     */

    @TableField(value = "dipi_new_money")
    private Double dipiNewMoney;


    /**
     * 地皮详情
     */

    @TableField(value = "dipi_content")
    private String dipiContent;


    /**
     * 是否被使用
     */

    @TableField(value = "dipi_types")
    private Integer dipiTypes;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：地皮名称
	 */
    public String getDipiName() {
        return dipiName;
    }


    /**
	 * 获取：地皮名称
	 */

    public void setDipiName(String dipiName) {
        this.dipiName = dipiName;
    }
    /**
	 * 设置：地皮位置
	 */
    public String getDipiWeizhi() {
        return dipiWeizhi;
    }


    /**
	 * 获取：地皮位置
	 */

    public void setDipiWeizhi(String dipiWeizhi) {
        this.dipiWeizhi = dipiWeizhi;
    }
    /**
	 * 设置：地皮缩略图
	 */
    public String getDipiPhoto() {
        return dipiPhoto;
    }


    /**
	 * 获取：地皮缩略图
	 */

    public void setDipiPhoto(String dipiPhoto) {
        this.dipiPhoto = dipiPhoto;
    }
    /**
	 * 设置：地皮价格
	 */
    public Double getDipiNewMoney() {
        return dipiNewMoney;
    }


    /**
	 * 获取：地皮价格
	 */

    public void setDipiNewMoney(Double dipiNewMoney) {
        this.dipiNewMoney = dipiNewMoney;
    }
    /**
	 * 设置：地皮详情
	 */
    public String getDipiContent() {
        return dipiContent;
    }


    /**
	 * 获取：地皮详情
	 */

    public void setDipiContent(String dipiContent) {
        this.dipiContent = dipiContent;
    }
    /**
	 * 设置：是否被使用
	 */
    public Integer getDipiTypes() {
        return dipiTypes;
    }


    /**
	 * 获取：是否被使用
	 */

    public void setDipiTypes(Integer dipiTypes) {
        this.dipiTypes = dipiTypes;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
