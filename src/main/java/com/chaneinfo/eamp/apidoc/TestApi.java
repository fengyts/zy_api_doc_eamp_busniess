package com.chaneinfo.eamp.apidoc;

public class TestAPi{
	
			/** 
 *     
* @apiGroup c端接口
* @api {GET、POST} /api/common/timestamp 获取服务器时间戳
* @apiName 获取服务器时间戳
* @apiVersion v1.0.0
* @apiDescription <code>接口约定</code>
* 1.	参数是大小写敏感的
* 2.	所有接口为标准的 HTTP POST 协议
* 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
* 4.	返回值为JSON对象格式
**/
			void inter1(){}
			/** 
 *     
* @apiGroup c端接口
* @api {POST、GET} /api/tradeRecord/payBarcode 付款二维码
* @apiName 付款二维码
* @apiVersion v1.0.0
* @apiDescription <code>接口约定</code>
* 1.	参数是大小写敏感的
* 2.	所有接口为标准的 HTTP POST 协议
* 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
* 4.	返回值为JSON对象格式
*
* @apiParam (业务参数) {Number} userId <code>【必填】</code> 用户id
* @apiParam (业务参数) {String} token <code>【必填】</code> 用户token
* @apiParam (业务参数) {Numbner} timestamp <code>【必填】</code> 时间戳
* @apiParam (业务参数) {String} sign <code>【必填】</code> 签名信息*/
			void inter15(){}
			/** 
 *     
* @apiGroup c端接口
* @api {POST、GET} /api/user/home 主页（卡包）
* @apiName 主页（卡包）
* @apiVersion v1.0.0
* @apiDescription <code>接口约定</code>
* 1.	参数是大小写敏感的
* 2.	所有接口为标准的 HTTP POST 协议
* 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
* 4.	返回值为JSON对象格式
*
* @apiParam (业务参数) {Number} userId <code>【必填】</code> 用户ID
* @apiParam (业务参数) {String} token <code>【必填】</code> Token
* @apiParam (业务参数) {Numbner} timestamp <code>【必填】</code> 时间戳
* @apiParam (业务参数) {String} sign <code>【必填】</code> 签名*/
			void inter16(){}
			/** 
 *     
* @apiGroup c端接口
* @api {POST} /api/user/authorized 用户信息授权
* @apiName 用户信息授权
* @apiVersion v1.0.0
* @apiDescription <code>接口约定</code>
* 1.	参数是大小写敏感的
* 2.	所有接口为标准的 HTTP POST 协议
* 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
* 4.	返回值为JSON对象格式
*
* @apiParam (业务参数) {String} code <code>【必填】</code> 登陆凭证
* @apiParam (业务参数) {String} rawData <code>【必填】</code> 用户普通信息
* @apiParam (业务参数) {String} encryptedData <code>【必填】</code> 用户敏感加密数据
* @apiParam (业务参数) {String} signature <code>【必填】</code> 用户数据签名
* @apiParam (业务参数) {String} iv <code>【必填】</code> 加密算法的初始向量*/
			void inter0(){}
			/** 
 *     
* @apiGroup c端接口
* @api {POST} /api/user/bindSmsCode 登录/注册
* @apiName 登录/注册
* @apiVersion v1.0.0
* @apiDescription <code>接口约定</code>
* 1.	参数是大小写敏感的
* 2.	所有接口为标准的 HTTP POST 协议
* 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
* 4.	返回值为JSON对象格式
*
* @apiParam (业务参数) {String} mobile <code>【必填】</code> 用户手机号
* @apiParam (业务参数) {String} smsCode <code>【必填】</code> 短信验证码
* @apiParam (业务参数) {String} thirdSessionId <code>【必填】</code> 用户sessionId*/
			void inter3(){}
			/** 
 *     
* @apiGroup c端接口
* @api {POST、GET} /api/trade/consumeQRCode 获取付款二维码内容
* @apiName 获取付款二维码内容
* @apiVersion v1.0.0
* @apiDescription <code>接口约定</code>
* 1.	参数是大小写敏感的
* 2.	所有接口为标准的 HTTP POST 协议
* 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
* 4.	返回值为JSON对象格式
*
* @apiParam (业务参数) {Number} userId <code>【必填】</code> 用户ID
* @apiParam (业务参数) {String} token <code>【必填】</code> Token
* @apiParam (业务参数) {Numbner} timestamp <code>【必填】</code> 时间戳
* @apiParam (业务参数) {String} sign <code>【必填】</code> 签名*/
			void inter17(){}
			/** 
 *     
* @apiGroup c端接口
* @api {POST} /api/user/authorized 用户信息授权
* @apiName 用户信息授权
* @apiVersion v1.0.0
* @apiDescription <code>接口约定</code>
* 1.	参数是大小写敏感的
* 2.	所有接口为标准的 HTTP POST 协议
* 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
* 4.	返回值为JSON对象格式
*
* @apiParam (业务参数) {String} code <code>【必填】</code> 登陆凭证
* @apiParam (业务参数) {String} rawData <code>【必填】</code> 用户普通信息
* @apiParam (业务参数) {String} encryptedData <code>【必填】</code> 用户敏感加密数据
* @apiParam (业务参数) {String} signature <code>【必填】</code> 用户数据签名
* @apiParam (业务参数) {String} iv <code>【必填】</code> 加密算法的初始向量*/
			void inter2(){}
			/** 
 *     
* @apiGroup c端接口
* @api {POST、GET} /api/common/testNotice 获取测试公告
* @apiName 获取测试公告
* @apiVersion v1.0.0
* @apiDescription <code>接口约定</code>
* 1.	参数是大小写敏感的
* 2.	所有接口为标准的 HTTP POST 协议
* 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
* 4.	返回值为JSON对象格式
**/
			void inter18(){}
			/** 
 *     
* @apiGroup c端接口
* @api {POST、GET} /api/card/cardDetails 卡详情
* @apiName 卡详情
* @apiVersion v1.0.0
* @apiDescription <code>接口约定</code>
* 1.	参数是大小写敏感的
* 2.	所有接口为标准的 HTTP POST 协议
* 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
* 4.	返回值为JSON对象格式
*
* @apiParam (业务参数) {Number} userId <code>【必填】</code> 用户id
* @apiParam (业务参数) {String} token <code>【必填】</code> 用户token
* @apiParam (业务参数) {Numbner} timestamp <code>【必填】</code> 时间戳
* @apiParam (业务参数) {String} sign <code>【必填】</code> 签名信息
* @apiParam (业务参数) {String} cardNo <code>【必填】</code> 卡编号*/
			void inter9(){}
			/** 
 *     
* @apiGroup c端接口
* @api {POST、GET} /api/card/cardList 卡包列表
* @apiName 卡包列表
* @apiVersion v1.0.0
* @apiDescription <code>接口约定</code>
* 1.	参数是大小写敏感的
* 2.	所有接口为标准的 HTTP POST 协议
* 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
* 4.	返回值为JSON对象格式
*
* @apiParam (业务参数) {Number} userId <code>【必填】</code> 用户id
* @apiParam (业务参数) {String} token <code>【必填】</code> 用户token
* @apiParam (业务参数) {Numbner} timestamp <code>【必填】</code> 时间戳
* @apiParam (业务参数) {String} sign <code>【必填】</code> 签名信息
* @apiParam (业务参数) {Number} pageNum <code>【必填】</code> 页码*/
			void inter8(){}
			/** 
 *     
* @apiGroup c端接口
* @api {POST、GET} /api/tradeRecord/cardBalanceList 账户余额列表
* @apiName 账户余额列表
* @apiVersion v1.0.0
* @apiDescription <code>接口约定</code>
* 1.	参数是大小写敏感的
* 2.	所有接口为标准的 HTTP POST 协议
* 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
* 4.	返回值为JSON对象格式
*
* @apiParam (业务参数) {Number} userId <code>【必填】</code> 用户id
* @apiParam (业务参数) {String} token <code>【必填】</code> 用户token
* @apiParam (业务参数) {Numbner} timestamp <code>【必填】</code> 时间戳
* @apiParam (业务参数) {String} sign <code>【必填】</code> 签名信息
* @apiParam (业务参数) {String} cardNo <code>【必填】</code> 卡号*/
			void inter10(){}
			/** 
 *     
* @apiGroup c端接口
* @api {POST、GET} /api/tradeRecord/tradeDetails 交易记录详情(消费|充值)
* @apiName 交易记录详情(消费|充值)
* @apiVersion v1.0.0
* @apiDescription <code>接口约定</code>
* 1.	参数是大小写敏感的
* 2.	所有接口为标准的 HTTP POST 协议
* 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
* 4.	返回值为JSON对象格式
*
* @apiParam (业务参数) {Number} userId <code>【必填】</code> 用户id
* @apiParam (业务参数) {String} token <code>【必填】</code> 用户token
* @apiParam (业务参数) {Numbner} timestamp <code>【必填】</code> 时间戳
* @apiParam (业务参数) {String} sign <code>【必填】</code> 签名信息
* @apiParam (业务参数) {Number} tradeId <code>【必填】</code> 交易记录id*/
			void inter11(){}
			/** 
 *     
* @apiGroup c端接口
* @api {} /api/common/captcha 获取图片验证码
* @apiName 获取图片验证码
* @apiVersion v1.0.0
* @apiDescription <code>接口约定</code>
* 1.	参数是大小写敏感的
* 2.	所有接口为标准的 HTTP POST 协议
* 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
* 4.	返回值为JSON对象格式
**/
			void inter5(){}
			/** 
 *     
* @apiGroup c端接口
* @api {POST、GET} /api/store/list 门店列表
* @apiName 门店列表
* @apiVersion v1.0.0
* @apiDescription <code>接口约定</code>
* 1.	参数是大小写敏感的
* 2.	所有接口为标准的 HTTP POST 协议
* 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
* 4.	返回值为JSON对象格式
*
* @apiParam (业务参数) {Number} userId <code>【必填】</code> 用户id
* @apiParam (业务参数) {String} token <code>【必填】</code> 用户token
* @apiParam (业务参数) {Numbner} timestamp <code>【必填】</code> 时间戳
* @apiParam (业务参数) {String} sign <code>【必填】</code> 签名信息
* @apiParam (业务参数) {Number} enterpriseId <code>【必填】</code> 企业编号*/
			void inter12(){}
			/** 
 *     
* @apiGroup c端接口
* @api {} /api/user/sendSms 获取短信验证码
* @apiName 获取短信验证码
* @apiVersion v1.0.0
* @apiDescription <code>接口约定</code>
* 1.	参数是大小写敏感的
* 2.	所有接口为标准的 HTTP POST 协议
* 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
* 4.	返回值为JSON对象格式
*
* @apiParam (业务参数) {String} mobile <code>【必填】</code> 手机号
* @apiParam (业务参数) {String} captcha <code>【必填】</code> 图形验证码
* @apiParam (业务参数) {String} captchaKey <code>【必填】</code> 图形验证码key*/
			void inter4(){}
			/** 
 *     
* @apiGroup c端接口
* @api {POST、GET} /api/discount/list 优惠信息列表
* @apiName 优惠信息列表
* @apiVersion v1.0.0
* @apiDescription <code>接口约定</code>
* 1.	参数是大小写敏感的
* 2.	所有接口为标准的 HTTP POST 协议
* 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
* 4.	返回值为JSON对象格式
*
* @apiParam (业务参数) {Number} userId <code>【必填】</code> 用户id
* @apiParam (业务参数) {String} token <code>【必填】</code> 用户token
* @apiParam (业务参数) {Numbner} timestamp <code>【必填】</code> 时间戳
* @apiParam (业务参数) {String} sign <code>【必填】</code> 签名信息
* @apiParam (业务参数) {Number} enterpriseId <code>【必填】</code> 企业编号*/
			void inter13(){}
			/** 
 *     
* @apiGroup c端接口
* @api {POST、GET} /api/card/addUserCard 开户
* @apiName 开户
* @apiVersion v1.0.0
* @apiDescription <code>接口约定</code>
* 1.	参数是大小写敏感的
* 2.	所有接口为标准的 HTTP POST 协议
* 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
* 4.	返回值为JSON对象格式
*
* @apiParam (业务参数) {Number} userId <code>【必填】</code> 用户id
* @apiParam (业务参数) {String} token <code>【必填】</code> 用户token
* @apiParam (业务参数) {Numbner} timestamp <code>【必填】</code> 时间戳
* @apiParam (业务参数) {String} sign <code>【必填】</code> 签名信息
* @apiParam (业务参数) {Number} enterpriseId <code>【必填】</code> 企业id*/
			void inter7(){}
			/** 
 *     
* @apiGroup c端接口
* @api {POST、GET} /api/tradeRecord/listBill 账单列表
* @apiName 账单列表
* @apiVersion v1.0.0
* @apiDescription <code>接口约定</code>
* 1.	参数是大小写敏感的
* 2.	所有接口为标准的 HTTP POST 协议
* 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
* 4.	返回值为JSON对象格式
*
* @apiParam (业务参数) {Number} userId <code>【必填】</code> 用户id
* @apiParam (业务参数) {String} token <code>【必填】</code> 用户token
* @apiParam (业务参数) {Numbner} timestamp <code>【必填】</code> 时间戳
* @apiParam (业务参数) {String} sign <code>【必填】</code> 签名信息*/
			void inter14(){}
			/** 
 *     
* @apiGroup c端接口
* @api {POST、GET} /api/card/openAccount (扫一扫)开户页面
* @apiName (扫一扫)开户页面
* @apiVersion v1.0.0
* @apiDescription <code>接口约定</code>
* 1.	参数是大小写敏感的
* 2.	所有接口为标准的 HTTP POST 协议
* 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
* 4.	返回值为JSON对象格式
*
* @apiParam (业务参数) {Number} userId <code>【必填】</code> 用户id
* @apiParam (业务参数) {String} token <code>【必填】</code> 用户token
* @apiParam (业务参数) {Numbner} timestamp <code>【必填】</code> 时间戳
* @apiParam (业务参数) {String} sign <code>【必填】</code> 签名信息
* @apiParam (业务参数) {Number} enterpriseId <code>【必填】</code> 企业id*/
			void inter6(){}
	
}