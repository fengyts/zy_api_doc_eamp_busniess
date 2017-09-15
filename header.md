
## 1. 术语 
	M：必填
	O：选填
	
## 2. 系统参数 

<table>
	<tr>
		<td>字段</td>
		<td>类型</td>
		<td>描述</td>
	</tr>
	<tr>
		<td>userId</td>
		<td>String</td>
		<td><b>【必填】</b>登录用户id</td>
	</tr>
	<tr>
		<td>token</td>
		<td>String</td>
		<td><b>【必填】</b>系统生成与用户对应的Token,AES加密</td>
	</tr>
	<tr>
		<td>sign</td>
		<td>String</td>
		<td><b>【必填】</b>校验码,MD5加密串,加密规则：MD5_HEX("userId"=userId&"token"=AES解密的token&"timestamp"=timestamp)</td>
	</tr>
	<tr>
		<td>timestamp</td>
		<td>String</td>
		<td><b>【必填】</b>由与服务端时间同步定时器获取有效期10秒</td>
	</tr>
	<tr>
		<td>version</td>
		<td>String</td>
		<td><b>【必填】</b>版本号(默认值:v1)</td>
	</tr>
</table>


