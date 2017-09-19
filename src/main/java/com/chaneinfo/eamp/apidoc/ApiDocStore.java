package com.chaneinfo.eamp.apidoc;

/**
 * @apiDefine store 店铺
 * 
 */
public class ApiDocStore {
	
	
	/**
	 * 
	 * @apiGroup store
	 * @api {post,get} /api/store/add 1.店铺新增 
	 * @apiName add
	 * @apiVersion 1.0.0
	 * @apiDeprecated use now (#store:add)
	 * @apiDescription <code>接口约定</code>
	 * 1.	参数是大小写敏感的
	 * 2.	所有接口为标准的 HTTP POST 协议
	 * 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
	 * 4.	返回值为JSON对象格式
	 * @apiParam (系统参数) {String} userId<code>【必填】</code> 登录用户id
	 * @apiParam (系统参数) {String} token<code>【必填】</code> 系统生成与用户对应的Token,AES加密
	 * @apiParam (系统参数) {String=v1} version <code>【必填】</code>版本号
	 * @apiParam (系统参数) {String} timestamp <code>【必填】</code>由与服务端时间同步定时器获取有效期10秒
	 * @apiParam (系统参数) {String} sign <code>【必填】</code>校验码,MD5加密串,加密规则：MD5_HEX("userId"=userId&"token"=AES解密的token&"timestamp"=timestamp)
	 
	 * @apiParam (业务参数) {String {1~15}=只能是汉字} storeName <code>【必填】</code>店铺名称
	 * @apiParam (业务参数) {String} province <code>【必填】</code>省的编码
	 * @apiParam (业务参数) {String} city <code>【必填】</code>市的编码
	 * @apiParam (业务参数) {String} country <code>【必填】</code>区的编码
	 * @apiParam (业务参数) {String} address <code>【必填】</code>详细地址
	 * @apiParam (业务参数) {String} contactPhone <code>【必填】</code>联系电话

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
	 * @apiError (错误码) {String} 0 成功    
	 * @apiError (错误码) {String} 999999 系统异常    
	 * @apiError (错误码) {String} 999001 参数错误    
	 * @apiError (错误码) {String} 999002 非法请求
	 * @apiError (错误码) {String} 999003  签名错误
	 * @apiError (错误码) {String} 999004 登录超时 
	 * @apiError (错误码) {String} 999006 数据异常
	 * 		
	 * @apiError (错误码) {String} 500001 店铺已经存在
	 * @apiError (错误码) {String} 500002 店铺数量已经超过限制
	 * @apiPermission admin
	 * 
	 */
	
	void add(){}
	
	/**
	 * @api {post,get} /api/store/modify  2.店铺修改
	 * @apiName modify
	 * @apiGroup store
	 * @apiVersion 1.0.0
	 * @apiDescription <code>接口约定</code> 
	 *1.	参数是大小写敏感的
	 *2.	所有接口为标准的 HTTP POST 协议
	 *3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
	 *4.	返回值为JSON对象格式
	 * @apiParam (系统参数) {String } userId<code>【必填】</code> 登录用户id
	 * @apiParam (系统参数) {String } token<code>【必填】</code> 系统生成与用户对应的Token,AES加密
	 * @apiParam (系统参数) {String=v1} version <code>【必填】</code>版本号
	 * @apiParam (系统参数) {String} timestamp <code>【必填】</code>由与服务端时间同步定时器获取有效期10秒
	 * @apiParam (系统参数) {String} sign <code>【必填】</code>校验码,MD5加密串,加密规则：MD5_HEX("userId"=userId&"token"=AES解密的token&"timestamp"=timestamp)
	 
	 * @apiParam (业务参数) {String} storeId <code>【必填】</code>店铺id
	 * @apiParam (业务参数) {String} storeName <code>【必填】</code>店铺名称
	 * @apiParam (业务参数) {String} province <code>【必填】</code>省编码
	 * @apiParam (业务参数) {String} city <code>【必填】</code>市编码
	 * @apiParam (业务参数) {String} country <code>【必填】</code>区编码
	 * @apiParam (业务参数) {String} address <code>【必填】</code>详细地址
	 * @apiParam (业务参数) {String} contactPhone <code>【必填】</code>联系电话

	 *@apiParamExample {json} 请求示例:
	 *  {
	 *	"storeId": "1",
	 *	"storeName": "店铺1号",
	 *	"province": "100011",
	 *	"city": "100111",
	 *	"country": "100112",
	 *	"address": "虹桥路2208",
	 *	"contactPhone": "13564088666"
	 *	}    
	 * 
	 * @apiSuccess (成功响应) {String} code 是否成功,0:成功;其他:失败.
	 * @apiSuccess (成功响应) {String} msg  返回码对应的描述.
	 * @apiSuccess (成功响应) {Object} jsonData  返回数据对象.
	 *
	 * @apiSuccessExample 请求成功返回数据示例:
	 *     Json  code=0 成功
	 *     
    {
        "code": "0",
        "msg": "成功",
        "jsonData":
        {
            "storeId": 1,
            "storeName": "testStore",
            "address": "上海市长宁区虹桥路2208号",
            "contactPhone": "13564088616",
            "privince": "310000",
            "privinceDesc": "上海",
            "city": "310100",
            "cityDesc": "上海市",
            "country": "310108",
            "countryDesc": "闸北区"
        }
    }

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
	 * @apiError (错误码) {String} 999001 参数错误    
	 * @apiError (错误码) {String} 999002 非法请求
	 * @apiError (错误码) {String} 999003  签名错误
	 * @apiError (错误码) {String} 999004 登录超时 
	 * @apiError (错误码) {String} 999006 数据异常
	 * 		
	 * @apiPermission admin
	 * 
	 */
	void modify(){}
	
	/**
	 * @api {post,get} /api/store/details  3.店铺详情
	 * @apiName details
	 * @apiGroup store
	 * @apiVersion 1.0.0
	 * @apiDescription <code>接口约定</code> 
	 *1.	参数是大小写敏感的
	 *2.	所有接口为标准的 HTTP POST 协议
	 *3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
	 *4.	返回值为JSON对象格式
	 * @apiParam (系统参数) {String} userId<code>【必填】</code> 登录用户id
	 * @apiParam (系统参数) {String} token<code>【必填】</code> 系统生成与用户对应的Token,AES加密
	 * @apiParam (系统参数) {String=v1} version <code>【必填】</code>版本号
	 * @apiParam (系统参数) {String} timestamp <code>【必填】</code>由与服务端时间同步定时器获取有效期10秒
	 * @apiParam (系统参数) {String} sign <code>【必填】</code>校验码,MD5加密串,加密规则：MD5_HEX("userId"=userId&"token"=AES解密的token&"timestamp"=timestamp)
	 
	 * @apiParam (业务参数) {String} storeId <code>【必填】</code>店铺id

	 *@apiParamExample {json} 请求示例:
	 *  {
	 *	"storeId": "1"
	 *	}    
	 * 
	 * @apiSuccess (成功响应) {String} code 是否成功,0:成功;其他:失败.
	 * @apiSuccess (成功响应) {String} msg  返回码对应的描述.
	 * @apiSuccess (成功响应) {Object} jsonData  返回数据对象.
	 * @apiSuccess (成功响应) {Object} jsonData.storeId 店铺id.
	 * @apiSuccess (成功响应) {Object} jsonData.storeName 店铺名称.
	 * @apiSuccess (成功响应) {Object} jsonData.contactPhone 联系电话.
	 * @apiSuccess (成功响应) {Object} jsonData.province 省
	 * @apiSuccess (成功响应) {Object} jsonData.provinceDesc 省名称
	 * @apiSuccess (成功响应) {Object} jsonData.city 市编码
	 * @apiSuccess (成功响应) {Object} jsonData.cityDesc 市名称
	 * @apiSuccess (成功响应) {Object} jsonData.country 区县
	 * @apiSuccess (成功响应) {Object} jsonData.countryDesc 区名称
	 * @apiSuccess (成功响应) {Object} jsonData.address 详细地址
	 *
	 * @apiSuccessExample 请求成功返回数据示例:
	 *     Json  code=0 成功
	 *     
    {
        "code": "0",
        "msg": "成功",
        "jsonData":
        {
            "storeId": 1,
            "storeName": "testStore",
            "address": "上海市长宁区虹桥路2208号",
            "contactPhone": "13564088616",
            "privince": "310000",
            "privinceDesc": "上海",
            "city": "310100",
            "cityDesc": "上海市",
            "country": "310108",
            "countryDesc": "闸北区"
        }
    }

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
	 * @apiError (错误码) {String} 999001 参数错误    
	 * @apiError (错误码) {String} 999002 非法请求
	 * @apiError (错误码) {String} 999003  签名错误
	 * @apiError (错误码) {String} 999004 登录超时 
	 * @apiError (错误码) {String} 999006 数据异常
	 * 		
	 * @apiPermission admin
	 * 
	 */
	void details(){}

}
