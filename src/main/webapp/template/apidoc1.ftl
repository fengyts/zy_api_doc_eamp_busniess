package ${packageName};

public class ${className}{
	
	<#if methodData?default([])?size!=0>
		<#list methodData?keys as key>
			<#assign apidocDO = methodData[key] />
			<#assign params = methodData[key].params />
			<#assign resDatas = methodData[key].resDatas />
			<#assign resCodes = methodData[key].resCodes />
			/**
			 * 
			 * @apiGroup ${groupName!"c端接口"}
			 * @api ${"{" + apidocDO.requestMethod + "}"} ${apidocDO.requestUrl} ${apidocDO.interName}
			 * @apiName ${"inter" + key}
			 * @apiVersion 1.0.0
			 
			 <#--
			 * @apiDeprecated use now (#store:add)
			 -->

			 * @apiDescription <code>接口约定</code>
			 * 1.	参数是大小写敏感的
			 * 2.	所有接口为标准的 HTTP POST 协议
			 * 3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8
			 * 4.	返回值为JSON对象格式
			 
			 <#--
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
			 -->

			<#list params as param>
			* @apiParam (业务参数) ${"{" + param.type + "}"} ${param.code}<code>【必填】</code> ${param.name}
			</#list>
		
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
			<#list resDatas as resData>
			<#if "code" == resData.code || "msg" == resData.code || "jsonData" == resData.code>
			<#else>
			* @apiSuccess ${"{" + resData.type + "}"} ${"jsonData." + resData.code} ${resData.name}
			</#if>
			</#list>

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
			 
			 <#--
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
			 -->
			
			<#list resCodes as resCode>
			* @apiError (错误码) {String} ${resCode.code} ${resCode.desc}    
			</#list>
			 * @apiPermission admin
			 * 
			 */
			void ${"inter" + key}(){}
			
		</#list>
	</#if>
	
}