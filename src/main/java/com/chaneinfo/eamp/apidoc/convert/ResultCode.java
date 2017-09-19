package com.chaneinfo.eamp.apidoc.convert;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @Description: 响应返回码
 * @author sk.chen
 * @version 2017-06-09
 *
 */
public class ResultCode {

	public static final String SUCCESS = "0";
	public static final String ERROR = "999999";
	public static final String PARAMS_ERROR = "999001";
	public static final String ILLEGAL_REQUEST = "999002";
	public static final String SIGN_ERROR = "999003";
	public static final String TOKEN_TIMEOUT = "999004";
	public static final String PERMISSION_DENIED = "999005";
	public static final String DATA_ERROR = "999006";

	public static final class Common {
		public static final String CAPTCHA_REQUIRED = "100001";
		public static final String CAPTCHA_FAILURE = "100002";
		public static final String CAPTCHA_ERROR = "100003";
		public static final String CAPTCHA_TIMEOUT = "100004";

		public static final String SMS_CODE_REQUIRED = "100005";
		public static final String SMS_CODE_FAILURE = "100006";
		public static final String SMS_CODE_ERROR = "100007";
		public static final String SMS_CODE_TIMEOUT = "100008";
		public static final String SMS_CODE_OUT_LIMIT = "100009";
	}

	public static final class User {
		public static final String MOBILE_EXISTED = "200001";
		public static final String ACCOUNT_PASSWORD_ERROR = "200002";
		public static final String ACCOUNT_NOT_NORMAL = "200003";
		public static final String ACCOUNT_LOCKED = "200004";
		public static final String MOBILE_NOT_EXISTED = "200005";
		public static final String PASSWORD_ERROR = "200006";
		public static final String ENTERPRIESE_UNREGISTER = "200007";
		public static final String ENTERPRIESE_REGISTERING = "200008";
		public static final String ENTERPRIESE_REGISTERED = "200009";
		
		
	}

	public static final class Enterprise {
		public static final String ENTERPRISE_NAME_EXISTED = "300001";
		public static final String MANAGE_PWD_REQUIRED = "300002";
		public static final String MANAGE_PWD_ERROR = "300003";
	}

	public static final class Discount {
		public static final String AMOUNT_GREATER_THAN_ZERO = "400001";
		public static final String AMOUNT_GREATER_THAN_PREVIOUS = "400002";
		public static final String TARGET_GREATER_THAN_DISCOUNT = "400003";
		public static final String GOODS_CATEGORY_MAX_NUM_LIMIT = "400004";
		public static final String GOODS_MAX_NUM_LIMIT = "400005";
		public static final String GOODS_CATEGORY_NOT_EXISTED = "400006";
		public static final String GOODS_WITH_PREPARE_CARDS = "400007";
		public static final String GOODS_REMOVE_FAIL = "400008";
	}

	public static final class Store {
		public static final String STORE_NAME_EXISTED = "500001";
		public static final String STORE_COUNT_LIMIT = "500002";
	}

	public static final class Admin {
		public static final String ADMIN_EXISTED = "600001";
		public static final String ADMIN_COUNT_LIMIT = "600002";
		public static final String UN_DELETE_BOSS = "600003";
	}

	public static final class TradeRecord {
		public static final String START_GREATER_THAN_END = "700001";
		public static final String END_LESS_THAN_TODAY = "700002";
		public static final String RANGE_MUST_INNER_THIRTY = "700003";
		public static final String REFUND_GREATER_THAN_TRADE = "700004";
		public static final String TRADE_HAS_FULL_REFUNDED = "700005";
		public static final String RECHARGE_AMT_MAX_LIMIT = "700006";
	}

	public static final String getMsg(String code) {
		return resultMsg.get(code);
	}

	public static Map<String, String> resultMsg;
	public static Map<String, String> sysMsg;

	static {
		resultMsg = new HashMap<String, String>();
		resultMsg.put(SUCCESS, "成功");
		resultMsg.put(ERROR, "系统异常");
		resultMsg.put(PARAMS_ERROR, "参数错误");
		resultMsg.put(ILLEGAL_REQUEST, "非法请求");
		resultMsg.put(SIGN_ERROR, "签名错误");
		resultMsg.put(TOKEN_TIMEOUT, "登录失效");
		resultMsg.put(PERMISSION_DENIED, "权限不足");
		resultMsg.put(DATA_ERROR, "数据异常");
		
		sysMsg = new HashMap<String, String>();
		sysMsg.put(SUCCESS, "成功");
		sysMsg.put(ERROR, "系统异常");
		sysMsg.put(PARAMS_ERROR, "参数错误");
		sysMsg.put(ILLEGAL_REQUEST, "非法请求");
		sysMsg.put(SIGN_ERROR, "签名错误");
		sysMsg.put(TOKEN_TIMEOUT, "登录失效");
		sysMsg.put(PERMISSION_DENIED, "权限不足");
		sysMsg.put(DATA_ERROR, "数据异常");
		

		resultMsg.put(Common.CAPTCHA_REQUIRED, "请填写图形验证码");
		resultMsg.put(Common.CAPTCHA_FAILURE, "图形验证码获取失败");
		resultMsg.put(Common.CAPTCHA_ERROR, "图形验证码不正确");
		resultMsg.put(Common.CAPTCHA_TIMEOUT, "图形验证码已失效");
		resultMsg.put(Common.SMS_CODE_REQUIRED, "请填写短信验证码");
		resultMsg.put(Common.SMS_CODE_FAILURE, "短信验证码发送失败");
		resultMsg.put(Common.SMS_CODE_ERROR, "短信验证码不正确");
		resultMsg.put(Common.SMS_CODE_TIMEOUT, "短信验证码已失效");
		resultMsg.put(Common.SMS_CODE_OUT_LIMIT, "该手机号今天获取次数已达上限，请明天再试");

		resultMsg.put(User.MOBILE_EXISTED, "该手机号已注册");
		resultMsg.put(User.ACCOUNT_PASSWORD_ERROR, "账号或密码错误");
		resultMsg.put(User.ACCOUNT_NOT_NORMAL, "账号异常");
		resultMsg.put(User.ACCOUNT_LOCKED, "账号或密码错误次数超限，账号已被临时锁定（30分钟）");
		resultMsg.put(User.MOBILE_NOT_EXISTED, "该手机号尚未注册");
		resultMsg.put(User.PASSWORD_ERROR, "密码错误");
		resultMsg.put(User.ENTERPRIESE_UNREGISTER, "企业未认证");
		resultMsg.put(User.ENTERPRIESE_REGISTERING, "企业认证中");
		resultMsg.put(User.ENTERPRIESE_REGISTERED, "企业已认证");

		resultMsg.put(Enterprise.ENTERPRISE_NAME_EXISTED, "该企业名称已存在");
		resultMsg.put(Enterprise.MANAGE_PWD_REQUIRED, "请输入管理密码");
		resultMsg.put(Enterprise.MANAGE_PWD_ERROR, "管理密码错误");
		
		resultMsg.put(Discount.AMOUNT_GREATER_THAN_ZERO, "金额必须大于0");
		resultMsg.put(Discount.AMOUNT_GREATER_THAN_PREVIOUS, "金额必须大于前一条的金额");
		resultMsg.put(Discount.TARGET_GREATER_THAN_DISCOUNT, "目标金额必须大于优惠金额");

		resultMsg.put(Store.STORE_NAME_EXISTED, "该店铺名称已经存在");
		resultMsg.put(Store.STORE_COUNT_LIMIT, "店铺数量已达上限");

		resultMsg.put(Admin.ADMIN_EXISTED, "管理员已存在");
		resultMsg.put(Admin.ADMIN_COUNT_LIMIT, "管理员数量已达到上限");
		resultMsg.put(Admin.UN_DELETE_BOSS, "创办人不能被删除");
		
		
		resultMsg.put(TradeRecord.START_GREATER_THAN_END, "起始时间必须在结束时间之前");
		resultMsg.put(TradeRecord.END_LESS_THAN_TODAY, "结束时间不得大于当前时间");
		resultMsg.put(TradeRecord.RANGE_MUST_INNER_THIRTY, "筛选区间必须在30天以内");
		resultMsg.put(TradeRecord.REFUND_GREATER_THAN_TRADE, "退款金额不得超过交易金额");
		resultMsg.put(TradeRecord.TRADE_HAS_FULL_REFUNDED, "退款总额不得超过实际交易金额");
		resultMsg.put(TradeRecord.RECHARGE_AMT_MAX_LIMIT, "充值金额超过最大限额");
		
	}
}
