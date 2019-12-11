package org.artemis.sparrow.mybatis.plus.generator.entity;

import org.artemis.sparrow.entity.base.BaseEntity;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 模型产品和业务类型表
 * </p>
 *
 * @author 流年·公子
 * @since 2019-11-19
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class RiskProductBusnissType extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 产品编码
     */
    private String productCode;

    /**
     * 业务编码
     */
    private String businessCode;

    /**
     * 一个平台公司的额度编码
     */
    private String projectCode;

    /**
     * 平台：PLATFORM 、 KA：KA  、小微 ：MICRO 、个人 ：PERSON
     */
    private String custModel;

    /**
     * 模型id
     */
    private String modelId;

    /**
     * 0-正常  1-已删除
     */
    private Integer recordStatus;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;


}
