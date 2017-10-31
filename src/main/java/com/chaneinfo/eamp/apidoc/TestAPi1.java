package com.chaneinfo.eamp.apidoc;

public class TestAPi1{
	
			/**
			 * 
			 * @apiGroup c端接口
			 * @api {POST、GET} /api/trade/consumeQRCode 获取付款二维码内容
			 * @apiName inter17
			 * @apiVersion 1.0.0
			 

			 * @apiDescription <code>接口约定</code>
			 * 1.	参数是大小写敏感的
			 * 2.	所有接口为标准的 HTTP POST 协议
			 * 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
			 * 4.	返回值为JSON对象格式
			 

			* @apiParam (业务参数) {Number} userId<code>【必填】</code> 用户ID
			* @apiParam (业务参数) {String} token<code>【必填】</code> Token
			* @apiParam (业务参数) {Numbner} timestamp<code>【必填】</code> 时间戳
			* @apiParam (业务参数) {String} sign<code>【必填】</code> 签名
		
			 *@apiParamExample {json} 请求示例:
			 *  {
			 *	"storeName": "店铺1号",
			 *	"province": "100011",
			 *	"city": "100111",
			 *	"country": "100112",
			 *	"address": "虹桥路2208",
			 *	"contactPhone": "13564088666"
			 *	}    
			 * 
			 
			 * @apiSuccess {String} code 是否成功,0:成功;其他:失败.
			 * @apiSuccess {String} msg  返回码对应的描述.
			 * @apiSuccess {Object} jsonData  返回数据对象.
			* @apiSuccess {String} jsonData.consumeQRCodeContent 付款二维码内容

			 *
			 * @apiSuccessExample 请求成功返回数据示例:
			 *     Json  code=0 成功
			 *     {
			 *       "code": "0",
			 *       "msg": "成功",
			 *       "jsonData": {}
			 *     }
			 *
			 * @apiErrorExample 请求失败返回数据示例:
			 *      Json  errorCode =1 失败
			 *     {
			 *       "code": "1",
			 *       "msg": "参数错误",
			 *       "jsonData": {}
			 *     }
			 
			
			* @apiError (错误码) {String} 0 登录成功，跳转至首页    
			* @apiError (错误码) {String} 999011 toast提示    
			* @apiError (错误码) {String} 999999 toast提示    
			 * @apiPermission admin
			 * 
			 */
			void inter17(){}
			
			/**
			 * 
			 * @apiGroup c端接口
			 * @api {POST、GET} /api/common/testNotice 获取测试公告
			 * @apiName inter18
			 * @apiVersion 1.0.0
			 

			 * @apiDescription <code>接口约定</code>
			 * 1.	参数是大小写敏感的
			 * 2.	所有接口为标准的 HTTP POST 协议
			 * 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
			 * 4.	返回值为JSON对象格式
			 

		
			 *@apiParamExample {json} 请求示例:
			 *  {
			 *	"storeName": "店铺1号",
			 *	"province": "100011",
			 *	"city": "100111",
			 *	"country": "100112",
			 *	"address": "虹桥路2208",
			 *	"contactPhone": "13564088666"
			 *	}    
			 * 
			 
			 * @apiSuccess {String} code 是否成功,0:成功;其他:失败.
			 * @apiSuccess {String} msg  返回码对应的描述.
			 * @apiSuccess {Object} jsonData  返回数据对象.
			* @apiSuccess {String } jsonData.testNotice 测试公告

			 *
			 * @apiSuccessExample 请求成功返回数据示例:
			 *     Json  code=0 成功
			 *     {
			 *       "code": "0",
			 *       "msg": "成功",
			 *       "jsonData": {}
			 *     }
			 *
			 * @apiErrorExample 请求失败返回数据示例:
			 *      Json  errorCode =1 失败
			 *     {
			 *       "code": "1",
			 *       "msg": "参数错误",
			 *       "jsonData": {}
			 *     }
			 
			
			* @apiError (错误码) {String} 0 登录成功，跳转至首页    
			* @apiError (错误码) {String} 999011 toast提示    
			* @apiError (错误码) {String} 999999 toast提示    
			 * @apiPermission admin
			 * 
			 */
			void inter18(){}
			
			/**
			 * 
			 * @apiGroup c端接口
			 * @api {POST、GET} /api/tradeRecord/payBarcode 付款二维码
			 * @apiName inter15
			 * @apiVersion 1.0.0
			 

			 * @apiDescription <code>接口约定</code>
			 * 1.	参数是大小写敏感的
			 * 2.	所有接口为标准的 HTTP POST 协议
			 * 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
			 * 4.	返回值为JSON对象格式
			 

			* @apiParam (业务参数) {Number} userId<code>【必填】</code> 用户id
			* @apiParam (业务参数) {String} token<code>【必填】</code> 用户token
			* @apiParam (业务参数) {Numbner} timestamp<code>【必填】</code> 时间戳
			* @apiParam (业务参数) {String} sign<code>【必填】</code> 签名信息
		
			 *@apiParamExample {json} 请求示例:
			 *  {
			 *	"storeName": "店铺1号",
			 *	"province": "100011",
			 *	"city": "100111",
			 *	"country": "100112",
			 *	"address": "虹桥路2208",
			 *	"contactPhone": "13564088666"
			 *	}    
			 * 
			 
			 * @apiSuccess {String} code 是否成功,0:成功;其他:失败.
			 * @apiSuccess {String} msg  返回码对应的描述.
			 * @apiSuccess {Object} jsonData  返回数据对象.

			 *
			 * @apiSuccessExample 请求成功返回数据示例:
			 *     Json  code=0 成功
			 *     {
			 *       "code": "0",
			 *       "msg": "成功",
			 *       "jsonData": {}
			 *     }
			 *
			 * @apiErrorExample 请求失败返回数据示例:
			 *      Json  errorCode =1 失败
			 *     {
			 *       "code": "1",
			 *       "msg": "参数错误",
			 *       "jsonData": {}
			 *     }
			 
			
			* @apiError (错误码) {String} 0 登录成功，跳转至首页    
			* @apiError (错误码) {String} 999011 toast提示    
			* @apiError (错误码) {String} 999999 toast提示    
			 * @apiPermission admin
			 * 
			 */
			void inter15(){}
			
			/**
			 * 
			 * @apiGroup c端接口
			 * @api {POST、GET} /api/user/home 主页（卡包）
			 * @apiName inter16
			 * @apiVersion 1.0.0
			 

			 * @apiDescription <code>接口约定</code>
			 * 1.	参数是大小写敏感的
			 * 2.	所有接口为标准的 HTTP POST 协议
			 * 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
			 * 4.	返回值为JSON对象格式
			 

			* @apiParam (业务参数) {Number} userId<code>【必填】</code> 用户ID
			* @apiParam (业务参数) {String} token<code>【必填】</code> Token
			* @apiParam (业务参数) {Numbner} timestamp<code>【必填】</code> 时间戳
			* @apiParam (业务参数) {String} sign<code>【必填】</code> 签名
		
			 *@apiParamExample {json} 请求示例:
			 *  {
			 *	"storeName": "店铺1号",
			 *	"province": "100011",
			 *	"city": "100111",
			 *	"country": "100112",
			 *	"address": "虹桥路2208",
			 *	"contactPhone": "13564088666"
			 *	}    
			 * 
			 
			 * @apiSuccess {String} code 是否成功,0:成功;其他:失败.
			 * @apiSuccess {String} msg  返回码对应的描述.
			 * @apiSuccess {Object} jsonData  返回数据对象.
			* @apiSuccess {String} jsonData.myQRCodeContent 我的二维码内容
			* @apiSuccess {Object[]} jsonData.cards 卡包
			* @apiSuccess {Number} jsonData.enterpriseId -企业ID
			* @apiSuccess {String} jsonData.enterpriseName -企业名称
			* @apiSuccess {String} jsonData.enterpriseAvatarSrc -企业头像源
			* @apiSuccess {String} jsonData.cardNo -卡号
			* @apiSuccess {String} jsonData.cardName -卡名称
			* @apiSuccess {String} jsonData.cardImageSrc -卡图片源
			* @apiSuccess {Number} jsonData.cardBalance -卡余额

			 *
			 * @apiSuccessExample 请求成功返回数据示例:
			 *     Json  code=0 成功
			 *     {
			 *       "code": "0",
			 *       "msg": "成功",
			 *       "jsonData": {}
			 *     }
			 *
			 * @apiErrorExample 请求失败返回数据示例:
			 *      Json  errorCode =1 失败
			 *     {
			 *       "code": "1",
			 *       "msg": "参数错误",
			 *       "jsonData": {}
			 *     }
			 
			
			 * @apiPermission admin
			 * 
			 */
			void inter16(){}
			
			/**
			 * 
			 * @apiGroup c端接口
			 * @api {POST、GET} /api/discount/list 优惠信息列表
			 * @apiName inter13
			 * @apiVersion 1.0.0
			 

			 * @apiDescription <code>接口约定</code>
			 * 1.	参数是大小写敏感的
			 * 2.	所有接口为标准的 HTTP POST 协议
			 * 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
			 * 4.	返回值为JSON对象格式
			 

			* @apiParam (业务参数) {Number} userId<code>【必填】</code> 用户id
			* @apiParam (业务参数) {String} token<code>【必填】</code> 用户token
			* @apiParam (业务参数) {Numbner} timestamp<code>【必填】</code> 时间戳
			* @apiParam (业务参数) {String} sign<code>【必填】</code> 签名信息
			* @apiParam (业务参数) {Number} enterpriseId<code>【必填】</code> 企业编号
		
			 *@apiParamExample {json} 请求示例:
			 *  {
			 *	"storeName": "店铺1号",
			 *	"province": "100011",
			 *	"city": "100111",
			 *	"country": "100112",
			 *	"address": "虹桥路2208",
			 *	"contactPhone": "13564088666"
			 *	}    
			 * 
			 
			 * @apiSuccess {String} code 是否成功,0:成功;其他:失败.
			 * @apiSuccess {String} msg  返回码对应的描述.
			 * @apiSuccess {Object} jsonData  返回数据对象.
			* @apiSuccess {Array} jsonData.rechangeList 充值赠送列表
			* @apiSuccess {String} jsonData.targetAmount -充值金额
			* @apiSuccess {String} jsonData.discountAmount -充值赠送金额
			* @apiSuccess {Array} jsonData.tradeList 消费满减列表
			* @apiSuccess {String} jsonData.targetAmount -消费金额
			* @apiSuccess {String} jsonData.discountAmount -消费满减金额

			 *
			 * @apiSuccessExample 请求成功返回数据示例:
			 *     Json  code=0 成功
			 *     {
			 *       "code": "0",
			 *       "msg": "成功",
			 *       "jsonData": {}
			 *     }
			 *
			 * @apiErrorExample 请求失败返回数据示例:
			 *      Json  errorCode =1 失败
			 *     {
			 *       "code": "1",
			 *       "msg": "参数错误",
			 *       "jsonData": {}
			 *     }
			 
			
			* @apiError (错误码) {String} 0 登录成功，跳转至首页    
			* @apiError (错误码) {String} 999011 toast提示    
			* @apiError (错误码) {String} 999999 toast提示    
			 * @apiPermission admin
			 * 
			 */
			void inter13(){}
			
			/**
			 * 
			 * @apiGroup c端接口
			 * @api {POST、GET} /api/tradeRecord/listBill 账单列表
			 * @apiName inter14
			 * @apiVersion 1.0.0
			 

			 * @apiDescription <code>接口约定</code>
			 * 1.	参数是大小写敏感的
			 * 2.	所有接口为标准的 HTTP POST 协议
			 * 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
			 * 4.	返回值为JSON对象格式
			 

			* @apiParam (业务参数) {Number} userId<code>【必填】</code> 用户id
			* @apiParam (业务参数) {String} token<code>【必填】</code> 用户token
			* @apiParam (业务参数) {Numbner} timestamp<code>【必填】</code> 时间戳
			* @apiParam (业务参数) {String} sign<code>【必填】</code> 签名信息
		
			 *@apiParamExample {json} 请求示例:
			 *  {
			 *	"storeName": "店铺1号",
			 *	"province": "100011",
			 *	"city": "100111",
			 *	"country": "100112",
			 *	"address": "虹桥路2208",
			 *	"contactPhone": "13564088666"
			 *	}    
			 * 
			 
			 * @apiSuccess {String} code 是否成功,0:成功;其他:失败.
			 * @apiSuccess {String} msg  返回码对应的描述.
			 * @apiSuccess {Object} jsonData  返回数据对象.
			* @apiSuccess {Array} jsonData.records 数据列表集
			* @apiSuccess {String} jsonData.enterpriseName -企业名称
			* @apiSuccess {Number} jsonData.tradeId -交易记录id
			* @apiSuccess {String} jsonData.tradeNo -交易流水号
			* @apiSuccess {String} jsonData.tradeType -交易类型
			* @apiSuccess {String} jsonData.tradeTypeDesc -交易类型描述
			* @apiSuccess {String} jsonData.tradeTime -交易时间
			* @apiSuccess {String} jsonData.tradeAmount -交易余额
			* @apiSuccess {String} jsonData.discountAmount -优惠金额

			 *
			 * @apiSuccessExample 请求成功返回数据示例:
			 *     Json  code=0 成功
			 *     {
			 *       "code": "0",
			 *       "msg": "成功",
			 *       "jsonData": {}
			 *     }
			 *
			 * @apiErrorExample 请求失败返回数据示例:
			 *      Json  errorCode =1 失败
			 *     {
			 *       "code": "1",
			 *       "msg": "参数错误",
			 *       "jsonData": {}
			 *     }
			 
			
			* @apiError (错误码) {String} 0 登录成功，跳转至首页    
			* @apiError (错误码) {String} 999011 toast提示    
			* @apiError (错误码) {String} 999999 toast提示    
			 * @apiPermission admin
			 * 
			 */
			void inter14(){}
			
			/**
			 * 
			 * @apiGroup c端接口
			 * @api {POST、GET} /api/tradeRecord/tradeDetails 交易记录详情(消费|充值)
			 * @apiName inter11
			 * @apiVersion 1.0.0
			 

			 * @apiDescription <code>接口约定</code>
			 * 1.	参数是大小写敏感的
			 * 2.	所有接口为标准的 HTTP POST 协议
			 * 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
			 * 4.	返回值为JSON对象格式
			 

			* @apiParam (业务参数) {Number} userId<code>【必填】</code> 用户id
			* @apiParam (业务参数) {String} token<code>【必填】</code> 用户token
			* @apiParam (业务参数) {Numbner} timestamp<code>【必填】</code> 时间戳
			* @apiParam (业务参数) {String} sign<code>【必填】</code> 签名信息
			* @apiParam (业务参数) {Number} tradeId<code>【必填】</code> 交易记录id
		
			 *@apiParamExample {json} 请求示例:
			 *  {
			 *	"storeName": "店铺1号",
			 *	"province": "100011",
			 *	"city": "100111",
			 *	"country": "100112",
			 *	"address": "虹桥路2208",
			 *	"contactPhone": "13564088666"
			 *	}    
			 * 
			 
			 * @apiSuccess {String} code 是否成功,0:成功;其他:失败.
			 * @apiSuccess {String} msg  返回码对应的描述.
			 * @apiSuccess {Object} jsonData  返回数据对象.
			* @apiSuccess {String} jsonData.tradeType 交易类型
			* @apiSuccess {String} jsonData.tradeTypeDesc 交易类型描述
			* @apiSuccess {String} jsonData.tradeNo 交易流水号
			* @apiSuccess {String} jsonData.tradeTime 交易时间
			* @apiSuccess {String} jsonData.cardNo 卡号
			* @apiSuccess {String} jsonData.totalAmount 交易金额
			* @apiSuccess {String} jsonData.tradeAmount 已付款|充值金额
			* @apiSuccess {Boolean} jsonData.hasDiscount 是否有优惠
			* @apiSuccess {String} jsonData.discountAmount 优惠金额
			* @apiSuccess {String} jsonData.balance 卡余额
			* @apiSuccess {String} jsonData.enterpriseName 商户
			* @apiSuccess {String} jsonData.storeName 门店
			* @apiSuccess {String} jsonData.bizUserName 收银员

			 *
			 * @apiSuccessExample 请求成功返回数据示例:
			 *     Json  code=0 成功
			 *     {
			 *       "code": "0",
			 *       "msg": "成功",
			 *       "jsonData": {}
			 *     }
			 *
			 * @apiErrorExample 请求失败返回数据示例:
			 *      Json  errorCode =1 失败
			 *     {
			 *       "code": "1",
			 *       "msg": "参数错误",
			 *       "jsonData": {}
			 *     }
			 
			
			* @apiError (错误码) {String} 0 登录成功，跳转至首页    
			* @apiError (错误码) {String} 999011 toast提示    
			* @apiError (错误码) {String} 999999 toast提示    
			 * @apiPermission admin
			 * 
			 */
			void inter11(){}
			
			/**
			 * 
			 * @apiGroup c端接口
			 * @api {POST、GET} /api/store/list 门店列表
			 * @apiName inter12
			 * @apiVersion 1.0.0
			 

			 * @apiDescription <code>接口约定</code>
			 * 1.	参数是大小写敏感的
			 * 2.	所有接口为标准的 HTTP POST 协议
			 * 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
			 * 4.	返回值为JSON对象格式
			 

			* @apiParam (业务参数) {Number} userId<code>【必填】</code> 用户id
			* @apiParam (业务参数) {String} token<code>【必填】</code> 用户token
			* @apiParam (业务参数) {Numbner} timestamp<code>【必填】</code> 时间戳
			* @apiParam (业务参数) {String} sign<code>【必填】</code> 签名信息
			* @apiParam (业务参数) {Number} enterpriseId<code>【必填】</code> 企业编号
		
			 *@apiParamExample {json} 请求示例:
			 *  {
			 *	"storeName": "店铺1号",
			 *	"province": "100011",
			 *	"city": "100111",
			 *	"country": "100112",
			 *	"address": "虹桥路2208",
			 *	"contactPhone": "13564088666"
			 *	}    
			 * 
			 
			 * @apiSuccess {String} code 是否成功,0:成功;其他:失败.
			 * @apiSuccess {String} msg  返回码对应的描述.
			 * @apiSuccess {Object} jsonData  返回数据对象.
			* @apiSuccess {Array} jsonData.stores 商铺列表
			* @apiSuccess {String} jsonData.storeName -商铺名称
			* @apiSuccess {String} jsonData.address -商铺地址
			* @apiSuccess {Number} jsonData.storeId -商铺id
			* @apiSuccess {String} jsonData.contactPhone -商铺联系电话

			 *
			 * @apiSuccessExample 请求成功返回数据示例:
			 *     Json  code=0 成功
			 *     {
			 *       "code": "0",
			 *       "msg": "成功",
			 *       "jsonData": {}
			 *     }
			 *
			 * @apiErrorExample 请求失败返回数据示例:
			 *      Json  errorCode =1 失败
			 *     {
			 *       "code": "1",
			 *       "msg": "参数错误",
			 *       "jsonData": {}
			 *     }
			 
			
			* @apiError (错误码) {String} 0 登录成功，跳转至首页    
			* @apiError (错误码) {String} 999011 toast提示    
			* @apiError (错误码) {String} 999999 toast提示    
			 * @apiPermission admin
			 * 
			 */
			void inter12(){}
			
			/**
			 * 
			 * @apiGroup c端接口
			 * @api {POST} /api/user/bindSmsCode 登录/注册
			 * @apiName inter3
			 * @apiVersion 1.0.0
			 

			 * @apiDescription <code>接口约定</code>
			 * 1.	参数是大小写敏感的
			 * 2.	所有接口为标准的 HTTP POST 协议
			 * 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
			 * 4.	返回值为JSON对象格式
			 

			* @apiParam (业务参数) {String} mobile<code>【必填】</code> 用户手机号
			* @apiParam (业务参数) {String} smsCode<code>【必填】</code> 短信验证码
			* @apiParam (业务参数) {String} thirdSessionId<code>【必填】</code> 用户sessionId
		
			 *@apiParamExample {json} 请求示例:
			 *  {
			 *	"storeName": "店铺1号",
			 *	"province": "100011",
			 *	"city": "100111",
			 *	"country": "100112",
			 *	"address": "虹桥路2208",
			 *	"contactPhone": "13564088666"
			 *	}    
			 * 
			 
			 * @apiSuccess {String} code 是否成功,0:成功;其他:失败.
			 * @apiSuccess {String} msg  返回码对应的描述.
			 * @apiSuccess {Object} jsonData  返回数据对象.
			* @apiSuccess {Number} jsonData.userId -用户id
			* @apiSuccess {String} jsonData.token -用户token

			 *
			 * @apiSuccessExample 请求成功返回数据示例:
			 *     Json  code=0 成功
			 *     {
			 *       "code": "0",
			 *       "msg": "成功",
			 *       "jsonData": {}
			 *     }
			 *
			 * @apiErrorExample 请求失败返回数据示例:
			 *      Json  errorCode =1 失败
			 *     {
			 *       "code": "1",
			 *       "msg": "参数错误",
			 *       "jsonData": {}
			 *     }
			 
			
			* @apiError (错误码) {String} 0 登录成功，跳转至首页    
			* @apiError (错误码) {String} 999011 toast提示    
			* @apiError (错误码) {String} 999999 toast提示    
			* @apiError (错误码) {String} 100001 toast提示    
			* @apiError (错误码) {String} 100002 toast提示，显示验证码，刷新验证码    
			* @apiError (错误码) {String} 100003 toast提示    
			* @apiError (错误码) {String} 100004 toast提示，显示验证码，刷新验证码    
			 * @apiPermission admin
			 * 
			 */
			void inter3(){}
			
			/**
			 * 
			 * @apiGroup c端接口
			 * @api {POST} /api/user/authorized 用户信息授权
			 * @apiName inter2
			 * @apiVersion 1.0.0
			 

			 * @apiDescription <code>接口约定</code>
			 * 1.	参数是大小写敏感的
			 * 2.	所有接口为标准的 HTTP POST 协议
			 * 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
			 * 4.	返回值为JSON对象格式
			 

			* @apiParam (业务参数) {String} code<code>【必填】</code> 登陆凭证
			* @apiParam (业务参数) {String} rawData<code>【必填】</code> 用户普通信息
			* @apiParam (业务参数) {String} encryptedData<code>【必填】</code> 用户敏感加密数据
			* @apiParam (业务参数) {String} signature<code>【必填】</code> 用户数据签名
			* @apiParam (业务参数) {String} iv<code>【必填】</code> 加密算法的初始向量
		
			 *@apiParamExample {json} 请求示例:
			 *  {
			 *	"storeName": "店铺1号",
			 *	"province": "100011",
			 *	"city": "100111",
			 *	"country": "100112",
			 *	"address": "虹桥路2208",
			 *	"contactPhone": "13564088666"
			 *	}    
			 * 
			 
			 * @apiSuccess {String} code 是否成功,0:成功;其他:失败.
			 * @apiSuccess {String} msg  返回码对应的描述.
			 * @apiSuccess {Object} jsonData  返回数据对象.
			* @apiSuccess {String} jsonData.thirdSessionId 用户sessionId

			 *
			 * @apiSuccessExample 请求成功返回数据示例:
			 *     Json  code=0 成功
			 *     {
			 *       "code": "0",
			 *       "msg": "成功",
			 *       "jsonData": {}
			 *     }
			 *
			 * @apiErrorExample 请求失败返回数据示例:
			 *      Json  errorCode =1 失败
			 *     {
			 *       "code": "1",
			 *       "msg": "参数错误",
			 *       "jsonData": {}
			 *     }
			 
			
			* @apiError (错误码) {String} 0 登录成功，跳转至首页    
			* @apiError (错误码) {String} 999011 toast提示    
			* @apiError (错误码) {String} 999999 toast提示    
			* @apiError (错误码) {String} 100001 toast提示    
			* @apiError (错误码) {String} 100002 toast提示，显示验证码，刷新验证码    
			* @apiError (错误码) {String} 100003 toast提示    
			* @apiError (错误码) {String} 100004 toast提示，显示验证码，刷新验证码    
			 * @apiPermission admin
			 * 
			 */
			void inter2(){}
			
			/**
			 * 
			 * @apiGroup c端接口
			 * @api {POST、GET} /api/tradeRecord/cardBalanceList 账户余额列表
			 * @apiName inter10
			 * @apiVersion 1.0.0
			 

			 * @apiDescription <code>接口约定</code>
			 * 1.	参数是大小写敏感的
			 * 2.	所有接口为标准的 HTTP POST 协议
			 * 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
			 * 4.	返回值为JSON对象格式
			 

			* @apiParam (业务参数) {Number} userId<code>【必填】</code> 用户id
			* @apiParam (业务参数) {String} token<code>【必填】</code> 用户token
			* @apiParam (业务参数) {Numbner} timestamp<code>【必填】</code> 时间戳
			* @apiParam (业务参数) {String} sign<code>【必填】</code> 签名信息
			* @apiParam (业务参数) {String} cardNo<code>【必填】</code> 卡号
		
			 *@apiParamExample {json} 请求示例:
			 *  {
			 *	"storeName": "店铺1号",
			 *	"province": "100011",
			 *	"city": "100111",
			 *	"country": "100112",
			 *	"address": "虹桥路2208",
			 *	"contactPhone": "13564088666"
			 *	}    
			 * 
			 
			 * @apiSuccess {String} code 是否成功,0:成功;其他:失败.
			 * @apiSuccess {String} msg  返回码对应的描述.
			 * @apiSuccess {Object} jsonData  返回数据对象.
			* @apiSuccess {String} jsonData.balance 账户余额
			* @apiSuccess {Array} jsonData.records 列表数据集
			* @apiSuccess {String} jsonData.storeName -店铺名称
			* @apiSuccess {String} jsonData.enterpriseName -企业名称
			* @apiSuccess {Number} jsonData.tradeId -交易记录id
			* @apiSuccess {String} jsonData.tradeNo -交易流水号
			* @apiSuccess {String} jsonData.tradeType -交易类型
			* @apiSuccess {String} jsonData.tradeTypeDesc -交易类型描述
			* @apiSuccess {String} jsonData.tradeTime -交易时间
			* @apiSuccess {String} jsonData.tradeAmount -交易余额
			* @apiSuccess {String} jsonData.discountAmount -优惠金额

			 *
			 * @apiSuccessExample 请求成功返回数据示例:
			 *     Json  code=0 成功
			 *     {
			 *       "code": "0",
			 *       "msg": "成功",
			 *       "jsonData": {}
			 *     }
			 *
			 * @apiErrorExample 请求失败返回数据示例:
			 *      Json  errorCode =1 失败
			 *     {
			 *       "code": "1",
			 *       "msg": "参数错误",
			 *       "jsonData": {}
			 *     }
			 
			
			* @apiError (错误码) {String} 0 登录成功，跳转至首页    
			* @apiError (错误码) {String} 999011 toast提示    
			* @apiError (错误码) {String} 999999 toast提示    
			 * @apiPermission admin
			 * 
			 */
			void inter10(){}
			
			/**
			 * 
			 * @apiGroup c端接口
			 * @api {GET、POST} /api/common/timestamp 获取服务器时间戳
			 * @apiName inter1
			 * @apiVersion 1.0.0
			 

			 * @apiDescription <code>接口约定</code>
			 * 1.	参数是大小写敏感的
			 * 2.	所有接口为标准的 HTTP POST 协议
			 * 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
			 * 4.	返回值为JSON对象格式
			 

		
			 *@apiParamExample {json} 请求示例:
			 *  {
			 *	"storeName": "店铺1号",
			 *	"province": "100011",
			 *	"city": "100111",
			 *	"country": "100112",
			 *	"address": "虹桥路2208",
			 *	"contactPhone": "13564088666"
			 *	}    
			 * 
			 
			 * @apiSuccess {String} code 是否成功,0:成功;其他:失败.
			 * @apiSuccess {String} msg  返回码对应的描述.
			 * @apiSuccess {Object} jsonData  返回数据对象.
			* @apiSuccess {Number} jsonData.timestamp 服务器时间戳

			 *
			 * @apiSuccessExample 请求成功返回数据示例:
			 *     Json  code=0 成功
			 *     {
			 *       "code": "0",
			 *       "msg": "成功",
			 *       "jsonData": {}
			 *     }
			 *
			 * @apiErrorExample 请求失败返回数据示例:
			 *      Json  errorCode =1 失败
			 *     {
			 *       "code": "1",
			 *       "msg": "参数错误",
			 *       "jsonData": {}
			 *     }
			 
			
			* @apiError (错误码) {String} 0 成功    
			* @apiError (错误码) {String} 999999 系统异常    
			 * @apiPermission admin
			 * 
			 */
			void inter1(){}
			
			/**
			 * 
			 * @apiGroup c端接口
			 * @api {POST} /api/user/authorized 用户信息授权
			 * @apiName inter0
			 * @apiVersion 1.0.0
			 

			 * @apiDescription <code>接口约定</code>
			 * 1.	参数是大小写敏感的
			 * 2.	所有接口为标准的 HTTP POST 协议
			 * 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
			 * 4.	返回值为JSON对象格式
			 

			* @apiParam (业务参数) {String} code<code>【必填】</code> 登陆凭证
			* @apiParam (业务参数) {String} rawData<code>【必填】</code> 用户普通信息
			* @apiParam (业务参数) {String} encryptedData<code>【必填】</code> 用户敏感加密数据
			* @apiParam (业务参数) {String} signature<code>【必填】</code> 用户数据签名
			* @apiParam (业务参数) {String} iv<code>【必填】</code> 加密算法的初始向量
		
			 *@apiParamExample {json} 请求示例:
			 *  {
			 *	"storeName": "店铺1号",
			 *	"province": "100011",
			 *	"city": "100111",
			 *	"country": "100112",
			 *	"address": "虹桥路2208",
			 *	"contactPhone": "13564088666"
			 *	}    
			 * 
			 
			 * @apiSuccess {String} code 是否成功,0:成功;其他:失败.
			 * @apiSuccess {String} msg  返回码对应的描述.
			 * @apiSuccess {Object} jsonData  返回数据对象.
			* @apiSuccess {String} jsonData.thirdSessionId 用户sessionId

			 *
			 * @apiSuccessExample 请求成功返回数据示例:
			 *     Json  code=0 成功
			 *     {
			 *       "code": "0",
			 *       "msg": "成功",
			 *       "jsonData": {}
			 *     }
			 *
			 * @apiErrorExample 请求失败返回数据示例:
			 *      Json  errorCode =1 失败
			 *     {
			 *       "code": "1",
			 *       "msg": "参数错误",
			 *       "jsonData": {}
			 *     }
			 
			
			* @apiError (错误码) {String} 0 登录成功，跳转至首页    
			* @apiError (错误码) {String} 999011 toast提示    
			* @apiError (错误码) {String} 999999 toast提示    
			* @apiError (错误码) {String} 100001 toast提示    
			* @apiError (错误码) {String} 100002 toast提示，显示验证码，刷新验证码    
			* @apiError (错误码) {String} 100003 toast提示    
			* @apiError (错误码) {String} 100004 toast提示，显示验证码，刷新验证码    
			 * @apiPermission admin
			 * 
			 */
			void inter0(){}
			
			/**
			 * 
			 * @apiGroup c端接口
			 * @api {POST、GET} /api/card/addUserCard 开户
			 * @apiName inter7
			 * @apiVersion 1.0.0
			 

			 * @apiDescription <code>接口约定</code>
			 * 1.	参数是大小写敏感的
			 * 2.	所有接口为标准的 HTTP POST 协议
			 * 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
			 * 4.	返回值为JSON对象格式
			 

			* @apiParam (业务参数) {Number} userId<code>【必填】</code> 用户id
			* @apiParam (业务参数) {String} token<code>【必填】</code> 用户token
			* @apiParam (业务参数) {Numbner} timestamp<code>【必填】</code> 时间戳
			* @apiParam (业务参数) {String} sign<code>【必填】</code> 签名信息
			* @apiParam (业务参数) {Number} enterpriseId<code>【必填】</code> 企业id
		
			 *@apiParamExample {json} 请求示例:
			 *  {
			 *	"storeName": "店铺1号",
			 *	"province": "100011",
			 *	"city": "100111",
			 *	"country": "100112",
			 *	"address": "虹桥路2208",
			 *	"contactPhone": "13564088666"
			 *	}    
			 * 
			 
			 * @apiSuccess {String} code 是否成功,0:成功;其他:失败.
			 * @apiSuccess {String} msg  返回码对应的描述.
			 * @apiSuccess {Object} jsonData  返回数据对象.
			* @apiSuccess {String} jsonData.imageSrc 企业logo
			* @apiSuccess {String} jsonData.enterpriseName 企业名称
			* @apiSuccess {String} jsonData.cardName 卡名称
			* @apiSuccess {String} jsonData.cardBgImg 卡背景图片
			* @apiSuccess {String} jsonData.cardNo 卡编号

			 *
			 * @apiSuccessExample 请求成功返回数据示例:
			 *     Json  code=0 成功
			 *     {
			 *       "code": "0",
			 *       "msg": "成功",
			 *       "jsonData": {}
			 *     }
			 *
			 * @apiErrorExample 请求失败返回数据示例:
			 *      Json  errorCode =1 失败
			 *     {
			 *       "code": "1",
			 *       "msg": "参数错误",
			 *       "jsonData": {}
			 *     }
			 
			
			* @apiError (错误码) {String} 0 登录成功，跳转至首页    
			* @apiError (错误码) {String} 999011 toast提示    
			* @apiError (错误码) {String} 999999 toast提示    
			* @apiError (错误码) {String} 200007 账户已经存在    
			 * @apiPermission admin
			 * 
			 */
			void inter7(){}
			
			/**
			 * 
			 * @apiGroup c端接口
			 * @api {POST、GET} /api/card/openAccount (扫一扫)开户页面
			 * @apiName inter6
			 * @apiVersion 1.0.0
			 

			 * @apiDescription <code>接口约定</code>
			 * 1.	参数是大小写敏感的
			 * 2.	所有接口为标准的 HTTP POST 协议
			 * 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
			 * 4.	返回值为JSON对象格式
			 

			* @apiParam (业务参数) {Number} userId<code>【必填】</code> 用户id
			* @apiParam (业务参数) {String} token<code>【必填】</code> 用户token
			* @apiParam (业务参数) {Numbner} timestamp<code>【必填】</code> 时间戳
			* @apiParam (业务参数) {String} sign<code>【必填】</code> 签名信息
			* @apiParam (业务参数) {Number} enterpriseId<code>【必填】</code> 企业id
		
			 *@apiParamExample {json} 请求示例:
			 *  {
			 *	"storeName": "店铺1号",
			 *	"province": "100011",
			 *	"city": "100111",
			 *	"country": "100112",
			 *	"address": "虹桥路2208",
			 *	"contactPhone": "13564088666"
			 *	}    
			 * 
			 
			 * @apiSuccess {String} code 是否成功,0:成功;其他:失败.
			 * @apiSuccess {String} msg  返回码对应的描述.
			 * @apiSuccess {Object} jsonData  返回数据对象.
			* @apiSuccess {Number} jsonData.enterpriseId 企业id
			* @apiSuccess {String} jsonData.imageSrc 企业logo
			* @apiSuccess {String} jsonData.enterpriseName 企业名称
			* @apiSuccess {String} jsonData.rechangeTargetAmt 充值优惠目标金额
			* @apiSuccess {String} jsonData.rechangeDiscountAmt 充值优惠优惠金额
			* @apiSuccess {String} jsonData.expenseTargetAmt 消费优惠目标金额
			* @apiSuccess {String} jsonData.expenseDiscountAmt 消费优惠优惠金额
			* @apiSuccess {String} jsonData.cardName 卡名称
			* @apiSuccess {String} jsonData.cardBgImg 卡背景图片
			* @apiSuccess {Boolean} jsonData.hasOpenAccount 是否已经开户

			 *
			 * @apiSuccessExample 请求成功返回数据示例:
			 *     Json  code=0 成功
			 *     {
			 *       "code": "0",
			 *       "msg": "成功",
			 *       "jsonData": {}
			 *     }
			 *
			 * @apiErrorExample 请求失败返回数据示例:
			 *      Json  errorCode =1 失败
			 *     {
			 *       "code": "1",
			 *       "msg": "参数错误",
			 *       "jsonData": {}
			 *     }
			 
			
			* @apiError (错误码) {String} 0 登录成功，跳转至首页    
			* @apiError (错误码) {String} 999011 toast提示    
			* @apiError (错误码) {String} 999999 toast提示    
			 * @apiPermission admin
			 * 
			 */
			void inter6(){}
			
			/**
			 * 
			 * @apiGroup c端接口
			 * @api {} /api/common/captcha 获取图片验证码
			 * @apiName inter5
			 * @apiVersion 1.0.0
			 

			 * @apiDescription <code>接口约定</code>
			 * 1.	参数是大小写敏感的
			 * 2.	所有接口为标准的 HTTP POST 协议
			 * 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
			 * 4.	返回值为JSON对象格式
			 

		
			 *@apiParamExample {json} 请求示例:
			 *  {
			 *	"storeName": "店铺1号",
			 *	"province": "100011",
			 *	"city": "100111",
			 *	"country": "100112",
			 *	"address": "虹桥路2208",
			 *	"contactPhone": "13564088666"
			 *	}    
			 * 
			 
			 * @apiSuccess {String} code 是否成功,0:成功;其他:失败.
			 * @apiSuccess {String} msg  返回码对应的描述.
			 * @apiSuccess {Object} jsonData  返回数据对象.
			* @apiSuccess {Object} jsonData.dataSource 数据源
			* @apiSuccess {Object} jsonData.captchaModel 图形验证码对象
			* @apiSuccess {String} jsonData.captchaKey -图形验证码key
			* @apiSuccess {String} jsonData.captcha -图片验证码

			 *
			 * @apiSuccessExample 请求成功返回数据示例:
			 *     Json  code=0 成功
			 *     {
			 *       "code": "0",
			 *       "msg": "成功",
			 *       "jsonData": {}
			 *     }
			 *
			 * @apiErrorExample 请求失败返回数据示例:
			 *      Json  errorCode =1 失败
			 *     {
			 *       "code": "1",
			 *       "msg": "参数错误",
			 *       "jsonData": {}
			 *     }
			 
			
			* @apiError (错误码) {String} 0     
			* @apiError (错误码) {String} 300001 toast提示    
			* @apiError (错误码) {String} 999999 toast提示    
			 * @apiPermission admin
			 * 
			 */
			void inter5(){}
			
			/**
			 * 
			 * @apiGroup c端接口
			 * @api {} /api/user/sendSms 获取短信验证码
			 * @apiName inter4
			 * @apiVersion 1.0.0
			 

			 * @apiDescription <code>接口约定</code>
			 * 1.	参数是大小写敏感的
			 * 2.	所有接口为标准的 HTTP POST 协议
			 * 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
			 * 4.	返回值为JSON对象格式
			 

			* @apiParam (业务参数) {String} mobile<code>【必填】</code> 手机号
			* @apiParam (业务参数) {String} captcha<code>【必填】</code> 图形验证码
			* @apiParam (业务参数) {String} captchaKey<code>【必填】</code> 图形验证码key
		
			 *@apiParamExample {json} 请求示例:
			 *  {
			 *	"storeName": "店铺1号",
			 *	"province": "100011",
			 *	"city": "100111",
			 *	"country": "100112",
			 *	"address": "虹桥路2208",
			 *	"contactPhone": "13564088666"
			 *	}    
			 * 
			 
			 * @apiSuccess {String} code 是否成功,0:成功;其他:失败.
			 * @apiSuccess {String} msg  返回码对应的描述.
			 * @apiSuccess {Object} jsonData  返回数据对象.
			* @apiSuccess {Object} jsonData.captchaModel 图形验证码数据
			* @apiSuccess {String} jsonData.captchaKey -图形验证码key
			* @apiSuccess {base64编码字符串} jsonData.captcha -图形验证码

			 *
			 * @apiSuccessExample 请求成功返回数据示例:
			 *     Json  code=0 成功
			 *     {
			 *       "code": "0",
			 *       "msg": "成功",
			 *       "jsonData": {}
			 *     }
			 *
			 * @apiErrorExample 请求失败返回数据示例:
			 *      Json  errorCode =1 失败
			 *     {
			 *       "code": "1",
			 *       "msg": "参数错误",
			 *       "jsonData": {}
			 *     }
			 
			
			* @apiError (错误码) {String} 0     
			* @apiError (错误码) {String} 300001 toast提示    
			* @apiError (错误码) {String} 999999 toast提示    
			* @apiError (错误码) {String} 100001 需要验证码时提示    
			* @apiError (错误码) {String} 100003 toast提示    
			* @apiError (错误码) {String} 100004 toast提示    
			* @apiError (错误码) {String} 100010 该手机号今天获取次数已达上限，请明天再试    
			 * @apiPermission admin
			 * 
			 */
			void inter4(){}
			
			/**
			 * 
			 * @apiGroup c端接口
			 * @api {POST、GET} /api/card/cardDetails 卡详情
			 * @apiName inter9
			 * @apiVersion 1.0.0
			 

			 * @apiDescription <code>接口约定</code>
			 * 1.	参数是大小写敏感的
			 * 2.	所有接口为标准的 HTTP POST 协议
			 * 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
			 * 4.	返回值为JSON对象格式
			 

			* @apiParam (业务参数) {Number} userId<code>【必填】</code> 用户id
			* @apiParam (业务参数) {String} token<code>【必填】</code> 用户token
			* @apiParam (业务参数) {Numbner} timestamp<code>【必填】</code> 时间戳
			* @apiParam (业务参数) {String} sign<code>【必填】</code> 签名信息
			* @apiParam (业务参数) {String} cardNo<code>【必填】</code> 卡编号
		
			 *@apiParamExample {json} 请求示例:
			 *  {
			 *	"storeName": "店铺1号",
			 *	"province": "100011",
			 *	"city": "100111",
			 *	"country": "100112",
			 *	"address": "虹桥路2208",
			 *	"contactPhone": "13564088666"
			 *	}    
			 * 
			 
			 * @apiSuccess {String} code 是否成功,0:成功;其他:失败.
			 * @apiSuccess {String} msg  返回码对应的描述.
			 * @apiSuccess {Object} jsonData  返回数据对象.
			* @apiSuccess {Number} jsonData.enterpriseId 企业id
			* @apiSuccess {String} jsonData.enterpriseName （商户）企业名称
			* @apiSuccess {String} jsonData.cardNo 卡号
			* @apiSuccess {String} jsonData.cardName 卡名称
			* @apiSuccess {String} jsonData.addTime 开户时间
			* @apiSuccess {String} jsonData.balance 账户余额
			* @apiSuccess {String} jsonData.cardBgImgSrc 卡背景图片
			* @apiSuccess {String} jsonData.enterpriseAvatarSrc 企业头像

			 *
			 * @apiSuccessExample 请求成功返回数据示例:
			 *     Json  code=0 成功
			 *     {
			 *       "code": "0",
			 *       "msg": "成功",
			 *       "jsonData": {}
			 *     }
			 *
			 * @apiErrorExample 请求失败返回数据示例:
			 *      Json  errorCode =1 失败
			 *     {
			 *       "code": "1",
			 *       "msg": "参数错误",
			 *       "jsonData": {}
			 *     }
			 
			
			* @apiError (错误码) {String} 0 登录成功，跳转至首页    
			* @apiError (错误码) {String} 999011 toast提示    
			* @apiError (错误码) {String} 999999 toast提示    
			 * @apiPermission admin
			 * 
			 */
			void inter9(){}
			
			/**
			 * 
			 * @apiGroup c端接口
			 * @api {POST、GET} /api/card/cardList 卡包列表
			 * @apiName inter8
			 * @apiVersion 1.0.0
			 

			 * @apiDescription <code>接口约定</code>
			 * 1.	参数是大小写敏感的
			 * 2.	所有接口为标准的 HTTP POST 协议
			 * 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
			 * 4.	返回值为JSON对象格式
			 

			* @apiParam (业务参数) {Number} userId<code>【必填】</code> 用户id
			* @apiParam (业务参数) {String} token<code>【必填】</code> 用户token
			* @apiParam (业务参数) {Numbner} timestamp<code>【必填】</code> 时间戳
			* @apiParam (业务参数) {String} sign<code>【必填】</code> 签名信息
			* @apiParam (业务参数) {Number} pageNum<code>【必填】</code> 页码
		
			 *@apiParamExample {json} 请求示例:
			 *  {
			 *	"storeName": "店铺1号",
			 *	"province": "100011",
			 *	"city": "100111",
			 *	"country": "100112",
			 *	"address": "虹桥路2208",
			 *	"contactPhone": "13564088666"
			 *	}    
			 * 
			 
			 * @apiSuccess {String} code 是否成功,0:成功;其他:失败.
			 * @apiSuccess {String} msg  返回码对应的描述.
			 * @apiSuccess {Object} jsonData  返回数据对象.
			* @apiSuccess {Number} jsonData.currentPage 当前页码
			* @apiSuccess {Number} jsonData.totalPage 总页数
			* @apiSuccess {Array} jsonData.records 卡包列表
			* @apiSuccess {Number} jsonData.enterpriseId -企业id
			* @apiSuccess {String} jsonData.enterpriseName -企业名称
			* @apiSuccess {String} jsonData.enterpriseImageSrc -企业logo
			* @apiSuccess {String} jsonData.cardBgImg -卡背景图片地址
			* @apiSuccess {String} jsonData.cardNo -卡号
			* @apiSuccess {String} jsonData.cardName -卡名称
			* @apiSuccess {String} jsonData.balance -账户余额

			 *
			 * @apiSuccessExample 请求成功返回数据示例:
			 *     Json  code=0 成功
			 *     {
			 *       "code": "0",
			 *       "msg": "成功",
			 *       "jsonData": {}
			 *     }
			 *
			 * @apiErrorExample 请求失败返回数据示例:
			 *      Json  errorCode =1 失败
			 *     {
			 *       "code": "1",
			 *       "msg": "参数错误",
			 *       "jsonData": {}
			 *     }
			 
			
			* @apiError (错误码) {String} 0 登录成功，跳转至首页    
			* @apiError (错误码) {String} 999011 toast提示    
			* @apiError (错误码) {String} 999999 toast提示    
			 * @apiPermission admin
			 * 
			 */
			void inter8(){}
			
	
}