package com.zsmall;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author :zhangshuo7@corp.netease.com
 * @date :20:02 2020/4/13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActReportDpsRealtimeSkuData {
    //skuId
    private Long skuId;

    //itemId

    private Long itemId;

    //经营形式 0-自营 3-严选贴牌代销 4-他方品牌代销

    private Long itemBusinessForm;

    //代销阶段类型

    private Long settleMode;

    //固定结算价

    private Double settlePrice;

    //扣减比例

    private Double deductRatio;

    //是否支持毛保 1-是 0-否

    private Long isGrossMarginProtect;

    //毛保比例

    private Double grossMarginProtectPercent;

    //绑定仓库类型

    private Long bindStoreType;
}
