package com.glp.risk.businessdata.entity.glp.fsw;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "delivery_apply_detail")
public class DeliveryApplyDetail {
    @Id
    private Long id;

    /**
     * 出库单号
     */
    @Column(name = "delivery_apply_no")
    private String deliveryApplyNo;

    /**
     * 商品编码
     */
    @Column(name = "goods_code")
    private String goodsCode;

    /**
     * 商品名称
     */
    @Column(name = "goods_name")
    private String goodsName;

    /**
     * 品牌名称
     */
    @Column(name = "brand_name")
    private String brandName;

    /**
     * 数量
     */
    private Long quantity;

    /**
     * 吊牌额
     */
    @Column(name = "tag_amount")
    private BigDecimal tagAmount;

    /**
     * 进货价
     */
    @Column(name = "purchase_price")
    private BigDecimal purchasePrice;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 创建人
     */
    @Column(name = "create_user")
    private String createUser;

    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

    /**
     * 修改人
     */
    @Column(name = "modify_user")
    private String modifyUser;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取出库单号
     *
     * @return delivery_apply_no - 出库单号
     */
    public String getDeliveryApplyNo() {
        return deliveryApplyNo;
    }

    /**
     * 设置出库单号
     *
     * @param deliveryApplyNo 出库单号
     */
    public void setDeliveryApplyNo(String deliveryApplyNo) {
        this.deliveryApplyNo = deliveryApplyNo == null ? null : deliveryApplyNo.trim();
    }

    /**
     * 获取商品编码
     *
     * @return goods_code - 商品编码
     */
    public String getGoodsCode() {
        return goodsCode;
    }

    /**
     * 设置商品编码
     *
     * @param goodsCode 商品编码
     */
    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode == null ? null : goodsCode.trim();
    }

    /**
     * 获取商品名称
     *
     * @return goods_name - 商品名称
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * 设置商品名称
     *
     * @param goodsName 商品名称
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /**
     * 获取品牌名称
     *
     * @return brand_name - 品牌名称
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * 设置品牌名称
     *
     * @param brandName 品牌名称
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    /**
     * 获取数量
     *
     * @return quantity - 数量
     */
    public Long getQuantity() {
        return quantity;
    }

    /**
     * 设置数量
     *
     * @param quantity 数量
     */
    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    /**
     * 获取吊牌额
     *
     * @return tag_amount - 吊牌额
     */
    public BigDecimal getTagAmount() {
        return tagAmount;
    }

    /**
     * 设置吊牌额
     *
     * @param tagAmount 吊牌额
     */
    public void setTagAmount(BigDecimal tagAmount) {
        this.tagAmount = tagAmount;
    }

    /**
     * 获取进货价
     *
     * @return purchase_price - 进货价
     */
    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    /**
     * 设置进货价
     *
     * @param purchasePrice 进货价
     */
    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取创建人
     *
     * @return create_user - 创建人
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 设置创建人
     *
     * @param createUser 创建人
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * 获取修改时间
     *
     * @return modify_time - 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置修改时间
     *
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 获取修改人
     *
     * @return modify_user - 修改人
     */
    public String getModifyUser() {
        return modifyUser;
    }

    /**
     * 设置修改人
     *
     * @param modifyUser 修改人
     */
    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser == null ? null : modifyUser.trim();
    }
}