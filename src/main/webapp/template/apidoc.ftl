package ${packageName};

public class ${className}{
	
	<#if methodData?default([])?size!=0>
		<#list methodData?keys as key>
			${methodData[key]}
			void ${key}(){}
		</#list>
	</#if>
	
}