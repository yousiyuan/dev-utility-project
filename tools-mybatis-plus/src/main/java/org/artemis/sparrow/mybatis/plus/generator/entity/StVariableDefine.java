package org.artemis.sparrow.mybatis.plus.generator.entity;

import org.artemis.sparrow.entity.base.BaseEntity;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 风控变量定义表（系统设置使用），为规则变量设置提供基础数据
 * </p>
 *
 * @author 流年·公子
 * @since 2019-11-19
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class StVariableDefine extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 变量大分类ID
     */
    private Integer categoryId;

    /**
     * 变量的分组ID
     */
    private Integer groupId;

    /**
     * 变量的分组名称
     */
    private String groupName;

    /**
     * 变量中文名称
     */
    private String chineseName;

    /**
     * 变量描述
     */
    private String description;

    /**
     * 变量名称（英文）
     */
    private String name;

    /**
     * 变量类型（STRING，NUMBER）
     */
    private String type;

    /**
     * 变量控件类型
     */
    private String controlType;

    /**
     * 变量值列表（用逗号分隔）
     */
    private String valueList;

    /**
     * 变量默认值
     */
    private String defaultValue;

    /**
     * 变量状态（ENABLED，DISABLED）

     */
    private String status;

    /**
     * 变量主题
     */
    private String subject;

    /**
     * 主题数据类型
     */
    private String subjectDataType;

    /**
     * 变量来源
     */
    private String variableSource;

    /**
     * 数据类型（A:普通变量，B:业务变量，C:汇数平台变量，D:衍生变量）
     */
    private String dataType;

    private String variableCondition;

    private String variableConditionJs;

    private String variableConditionName;

    /**
     * 创建时间
     */
    private LocalDateTime createdAt;

    /**
     * 更新时间
     */
    private LocalDateTime updatedAt;

    private String createdBy;

    private String updatedBy;

    private Integer version;

    /**
     * 指标号
     */
    private Integer kpiNo;


}
