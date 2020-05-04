package com.zsmall;

//import com.netease.mail.yanxuan.itemcenter.admin.utils.excelwrapper.ExcelColumn;
import lombok.Data;

/**
 * 优惠券
 *
 * @author dongxingong on 2019-01-07
 */
@Data
public class CouponItemTO {
    @ExcelColumn(title = "商品名称")
    private String itemName;

    @ExcelColumn(title = "商品ID")
    private long itemId;

    @ExcelColumn(title = "BU负责人")
    private String buManagerName;//bu负责人姓名

    @ExcelColumn(title = "商品负责人")
    private String itemManagerName;//商品负责人姓名

    @ExcelColumn(title = "销售类目")
    private String category;//销售类目

    @ExcelColumn(title = "物理类目")
    private String phyCategory;

    @ExcelColumn(title = "SKUID")
    private long skuId;

    @ExcelColumn(title = "券力度")
    private String X_Y;

    @ExcelColumn(title = "优惠叠加")
    private String promotion;

    @ExcelColumn(title = "当前售价", type = "price")
    private String originPrice;

    @ExcelColumn(title = "到手价折扣")
    private String discount;

    @ExcelColumn(title = "活动到手价", type = "price")
    private String realPrice;

    @ExcelColumn(title = "预估毛利率")
    private String grossMargin;

    @ExcelColumn(title = "单品活动最低价（除秒杀）", type = "price", hoverMsg = "默认展示18年1月起的历史最低价，hover展示近6个月除秒杀外的其他生效过的最低的三个价格（过滤掉废弃的活动价格），T+1数据")
    private String lowestPrice;

    @ExcelColumn(title = "经营形式")
    private String businessForm;

    private String quoteType; //报价形式

    //报价信息标签详情
    private String assistJudgeInfo;

    @ExcelColumn(title = "成本", type = "price", hoverMsg = "不含税总成本")
    private String skuCostNotaxfee;

    @ExcelColumn(title = "P3折扣")
    private String p3MinDisc;

    @ExcelColumn(title = "P3折扣价", type = "price")
    private String p3MinDiscPrice;

    @ExcelColumn(title = "p3兼容价格", type = "price", hoverMsg = "1、考虑商品实际促销形式会经常结合特殊的营销数字，比如9.9包邮等形式，允许各端在P3P4折扣线基础上做微小调整。<br/>2、各销售端在以上微调范围内的无需审批，超出调控范围的均需走特批流程")
    private String p3MinDiscAdjPrice;//p3兼容价格

    @ExcelColumn(title = "P4折扣")
    private String p4MinDisc;

    @ExcelColumn(title = "P4折扣价", type = "price")
    private String p4MinDiscPrice;

    @ExcelColumn(title = "p4兼容价格", type = "price", hoverMsg = "1、考虑商品实际促销形式会经常结合特殊的营销数字，比如9.9包邮等形式，允许各端在P3P4折扣线基础上做微小调整。<br/>2、各销售端在以上微调范围内的无需审批，超出调控范围的均需走特批流程")
    private String p4MinDiscAdjPrice;//p4兼容价格

    @ExcelColumn(title = "平仓商品")
    private String isPingcang;

    @ExcelColumn(title = "平仓价格", type = "price")
    private String pingcangPrice;

    @ExcelColumn(title = "滞销商品")
    private String isDeadStock; //滞销商品

    @ExcelColumn(title = "滞销商品价格", type="price")
    private String deadStockPrice; //滞销商品价格

    @ExcelColumn(title = "网仓主站可售库存", hoverMsg = "网仓主站某SKU的可售库存数量")
    private String saleStock;

    @ExcelColumn(title = "在途总库存", hoverMsg = "某SKU下单未到货的库存")
    private String shipStock;

    @ExcelColumn(title = "网仓在库周转天数", hoverMsg = "网仓某SKU在库库转天数")
    private String turnOverDays;

    @ExcelColumn(title = "备注")
    private String remark;

    @ExcelColumn(title = "选品处理结果")
    private String status;

    @ExcelColumn(title = "BU商品处理结果")
    private String buStatus;

    @ExcelColumn(title = "选品配置结果")
    private String selectStatus;

    @ExcelColumn(title = "审核结果")
    private String auditStatus;

    private String operator;//选品操作人

    private boolean p3p4;

    private String profitRate;//商品毛利率

    private String performanceProfitRate;//履约毛利率

    private String saleAmountNoTax;//销售额(不含税)

    private String performanceFee;//履约费用

    private String invoiceRate;//消费税率

    private String noTaxCost;//商品不含税总成本

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public String getBuManagerName() {
        return buManagerName;
    }

    public void setBuManagerName(String buManagerName) {
        this.buManagerName = buManagerName;
    }

    public String getItemManagerName() {
        return itemManagerName;
    }

    public void setItemManagerName(String itemManagerName) {
        this.itemManagerName = itemManagerName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPhyCategory() {
        return phyCategory;
    }

    public void setPhyCategory(String phyCategory) {
        this.phyCategory = phyCategory;
    }

    public long getSkuId() {
        return skuId;
    }

    public void setSkuId(long skuId) {
        this.skuId = skuId;
    }

    public String getX_Y() {
        return X_Y;
    }

    public void setX_Y(String x_Y) {
        X_Y = x_Y;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    public String getOriginPrice() {
        return originPrice;
    }

    public void setOriginPrice(String originPrice) {
        this.originPrice = originPrice;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(String realPrice) {
        this.realPrice = realPrice;
    }

    public String getGrossMargin() {
        return grossMargin;
    }

    public void setGrossMargin(String grossMargin) {
        this.grossMargin = grossMargin;
    }

    public String getLowestPrice() {
        return lowestPrice;
    }

    public void setLowestPrice(String lowestPrice) {
        this.lowestPrice = lowestPrice;
    }

    public String getBusinessForm() {
        return businessForm;
    }

    public void setBusinessForm(String businessForm) {
        this.businessForm = businessForm;
    }

    public String getQuoteType() {
        return quoteType;
    }

    public void setQuoteType(String quoteType) {
        this.quoteType = quoteType;
    }

    public String getAssistJudgeInfo() {
        return assistJudgeInfo;
    }

    public void setAssistJudgeInfo(String assistJudgeInfo) {
        this.assistJudgeInfo = assistJudgeInfo;
    }

    public String getSkuCostNotaxfee() {
        return skuCostNotaxfee;
    }

    public void setSkuCostNotaxfee(String skuCostNotaxfee) {
        this.skuCostNotaxfee = skuCostNotaxfee;
    }

    public String getP3MinDisc() {
        return p3MinDisc;
    }

    public void setP3MinDisc(String p3MinDisc) {
        this.p3MinDisc = p3MinDisc;
    }

    public String getP3MinDiscPrice() {
        return p3MinDiscPrice;
    }

    public void setP3MinDiscPrice(String p3MinDiscPrice) {
        this.p3MinDiscPrice = p3MinDiscPrice;
    }

    public String getP3MinDiscAdjPrice() {
        return p3MinDiscAdjPrice;
    }

    public void setP3MinDiscAdjPrice(String p3MinDiscAdjPrice) {
        this.p3MinDiscAdjPrice = p3MinDiscAdjPrice;
    }

    public String getP4MinDisc() {
        return p4MinDisc;
    }

    public void setP4MinDisc(String p4MinDisc) {
        this.p4MinDisc = p4MinDisc;
    }

    public String getP4MinDiscPrice() {
        return p4MinDiscPrice;
    }

    public void setP4MinDiscPrice(String p4MinDiscPrice) {
        this.p4MinDiscPrice = p4MinDiscPrice;
    }

    public String getP4MinDiscAdjPrice() {
        return p4MinDiscAdjPrice;
    }

    public void setP4MinDiscAdjPrice(String p4MinDiscAdjPrice) {
        this.p4MinDiscAdjPrice = p4MinDiscAdjPrice;
    }

    public String getIsPingcang() {
        return isPingcang;
    }

    public void setIsPingcang(String isPingcang) {
        this.isPingcang = isPingcang;
    }

    public String getPingcangPrice() {
        return pingcangPrice;
    }

    public void setPingcangPrice(String pingcangPrice) {
        this.pingcangPrice = pingcangPrice;
    }

    public String getIsDeadStock() {
        return isDeadStock;
    }

    public void setIsDeadStock(String isDeadStock) {
        this.isDeadStock = isDeadStock;
    }

    public String getDeadStockPrice() {
        return deadStockPrice;
    }

    public void setDeadStockPrice(String deadStockPrice) {
        this.deadStockPrice = deadStockPrice;
    }

    public String getSaleStock() {
        return saleStock;
    }

    public void setSaleStock(String saleStock) {
        this.saleStock = saleStock;
    }

    public String getShipStock() {
        return shipStock;
    }

    public void setShipStock(String shipStock) {
        this.shipStock = shipStock;
    }

    public String getTurnOverDays() {
        return turnOverDays;
    }

    public void setTurnOverDays(String turnOverDays) {
        this.turnOverDays = turnOverDays;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBuStatus() {
        return buStatus;
    }

    public void setBuStatus(String buStatus) {
        this.buStatus = buStatus;
    }

    public String getSelectStatus() {
        return selectStatus;
    }

    public void setSelectStatus(String selectStatus) {
        this.selectStatus = selectStatus;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public boolean isP3p4() {
        return p3p4;
    }

    public void setP3p4(boolean p3p4) {
        this.p3p4 = p3p4;
    }

    public String getProfitRate() {
        return profitRate;
    }

    public void setProfitRate(String profitRate) {
        this.profitRate = profitRate;
    }

    public String getPerformanceProfitRate() {
        return performanceProfitRate;
    }

    public void setPerformanceProfitRate(String performanceProfitRate) {
        this.performanceProfitRate = performanceProfitRate;
    }

    public String getSaleAmountNoTax() {
        return saleAmountNoTax;
    }

    public void setSaleAmountNoTax(String saleAmountNoTax) {
        this.saleAmountNoTax = saleAmountNoTax;
    }

    public String getPerformanceFee() {
        return performanceFee;
    }

    public void setPerformanceFee(String performanceFee) {
        this.performanceFee = performanceFee;
    }

    public String getInvoiceRate() {
        return invoiceRate;
    }

    public void setInvoiceRate(String invoiceRate) {
        this.invoiceRate = invoiceRate;
    }

    public String getNoTaxCost() {
        return noTaxCost;
    }

    public void setNoTaxCost(String noTaxCost) {
        this.noTaxCost = noTaxCost;
    }
}
