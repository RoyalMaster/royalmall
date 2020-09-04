package com.royal.royalmall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 退款信息
 * 
 * @author jia.huang
 * @email jia.huang@gmail.com
 * @date 2020-09-01 20:40:58
 */
@Data
@TableName("oms_refund_info")
public class RefundInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Long id;
	/**
	 * $column.comments
	 */
	private Long orderReturnId;
	/**
	 * $column.comments
	 */
	private BigDecimal refund;
	/**
	 * $column.comments
	 */
	private String refundSn;
	/**
	 * $column.comments
	 */
	private Integer refundStatus;
	/**
	 * $column.comments
	 */
	private Integer refundChannel;
	/**
	 * $column.comments
	 */
	private String refundContent;

}
