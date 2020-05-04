package com.zsmall;

/**
 * @author :zhangshuo7@corp.netease.com
 * @date :21:27 2020/4/16
 */
public class ActReportDpsSkuGrossMarginData {

    //
    private Long skuId;
    //活动到手价
    private Double price;
    //销售额
    private Double saleAmountNoTax;
    //履约费用
    private Double performanceFee;
    //商品毛利率
    private Double profitRate;
    //履约毛利率
    private Double performanceProfitRate;
    //消费税率
    private Double invoiceRate;
    //商品不含税总成本
    private Double noTaxCost;
    //p4折扣
    private Double p4Discount;

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getSaleAmountNoTax() {
        return saleAmountNoTax;
    }

    public void setSaleAmountNoTax(Double saleAmountNoTax) {
        this.saleAmountNoTax = saleAmountNoTax;
    }

    public Double getPerformanceFee() {
        return performanceFee;
    }

    public void setPerformanceFee(Double performanceFee) {
        this.performanceFee = performanceFee;
    }

    public Double getProfitRate() {
        return profitRate;
    }

    public void setProfitRate(Double profitRate) {
        this.profitRate = profitRate;
    }

    public Double getPerformanceProfitRate() {
        return performanceProfitRate;
    }

    public void setPerformanceProfitRate(Double performanceProfitRate) {
        this.performanceProfitRate = performanceProfitRate;
    }

    public Double getInvoiceRate() {
        return invoiceRate;
    }

    public void setInvoiceRate(Double invoiceRate) {
        this.invoiceRate = invoiceRate;
    }

    public Double getNoTaxCost() {
        return noTaxCost;
    }

    public void setNoTaxCost(Double noTaxCost) {
        this.noTaxCost = noTaxCost;
    }

    public Double getP4Discount() {
        return p4Discount;
    }

    public void setP4Discount(Double p4Discount) {
        this.p4Discount = p4Discount;
    }
}
