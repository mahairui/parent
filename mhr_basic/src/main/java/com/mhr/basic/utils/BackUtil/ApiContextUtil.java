package com.mhr.basic.utils.BackUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ApiContextUtil {
	private static final String KEY_RESULT = "api_result";
	private static final String KEY_STARTTIME = "api_starttime";

	public static Object get(String name) {
		return RequestContextUtil.get(name);
	}

	public static void set(String name, Object value) {
		RequestContextUtil.set(name, value);
	}

	public static HttpServletRequest getRequest() {
		return RequestContextUtil.getRequest();
	}

	public static HttpServletResponse getResponse() {
		return RequestContextUtil.getResponse();
	}

	public static void setResult(ApiResult result) {
		RequestContextUtil.set(KEY_RESULT, result);
	}

	/**
	 * api请求开始时调用
	 */
	public static void start() {
		RequestContextUtil.set(KEY_STARTTIME, System.currentTimeMillis());
	}

	/**
	 * api结束时调用
	 */
	public static void end() {
		LogBuilder();
	}

	/**
	 * api结束时调用，发生了错误
	 * 
	 * @param code
	 * @throws IOException
	 */
	public static void endWithError(int code) throws IOException {
		HttpServletResponse response = RequestContextUtil.getResponse();
		ApiResult result = ResultUtil.getErrorResult(code, ResultUtil.getMessage(code));
		end();
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		response.getWriter().print(result);
		response.getWriter().flush();
		response.getWriter().close();
	}

	/**
	 * api接口访问日志
	 */
	private static void LogBuilder() {
//		ZzfLogPo logPo = new ZzfLogPo();
//		HttpServletRequest request = RequestContextUtil.getRequest();
//		Long startTime = (Long) RequestContextUtil.get(KEY_STARTTIME);
//		ApiResult apiResult = (ApiResult) RequestContextUtil.get(KEY_RESULT);
//		long duration = -1;
//		if (startTime != null){
//			duration = System.currentTimeMillis() - startTime.longValue();
//		}
//
//		String path = request.getRequestURI();
//		String apiAlias = ApiMapping.get(path);
//		String remote = IPUtil.getIpAddr(request);
//
//		logPo.setCreateTime(new Date());
//		try {
//			logPo.setCreateUserName(Token.getInstance().getTokenUser().getLoginName());
//			logPo.setCreatorId(Token.getInstance().getTokenUser().getUserId());
//		} catch (Exception e1) {
//			logPo.setCreateUserName("非登录用户");
//			logPo.setCreatorId("0");
//		}
//
//		//创建人ip
//		logPo.setCreateIp(remote);
//		//操作URL
//		logPo.setOpUrl(path);
//		//操作结果success、failed
//		logPo.setOpResult(String.valueOf(apiResult == null ? -1 : apiResult.getCode() == 200?"success":"failed"));
//		//操作客户端信息请求头User-Agent
//		String userAgent = request.getHeader("user-agent");
//		logPo.setOpClientInfo(userAgent);
//		//系统id
//		logPo.setSysId("");
//		//服务器IP
//		logPo.setServerIp("");
//		//日志级别1、一般2、重要3、严重
//		if(apiResult != null && apiResult.getCode() == 500){
//			logPo.setLogLevel(2);
//			//操作描述
//			logPo.setLogMemo(apiResult.getMsg());
//		}else if(apiResult != null){
//			if(apiResult.getCode() == 501 || apiResult.getCode() == 502 || apiResult.getCode() == 503 || apiResult.getCode() == 504){
//				logPo.setLogLevel(1);
//				//操作描述
//				logPo.setLogMemo(apiResult.getMsg());
//			}else {
//				//操作描述
//				logPo.setLogMemo(apiResult == null?"":apiResult.getMsg());
//			}
//		}else {
//			//操作描述
//			logPo.setLogMemo(apiResult == null?"":apiResult.getMsg());
//		}
//		//删除标识
//		logPo.setDelFlag("0");
//
//		LogCollectClient.LogAdd(logPo);
	}

}
