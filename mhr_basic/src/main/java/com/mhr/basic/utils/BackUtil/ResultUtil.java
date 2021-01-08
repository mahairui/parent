package com.mhr.basic.utils.BackUtil;



import java.util.HashMap;
import java.util.Map;

public class ResultUtil {



    public final static int OK = 0;
    public final static int SIGN_TS_INVALID = 300;
    public final static int SIGN_INVALID = 301;
    public final static int AUTH_CLENTID_INVALID = 302;//client_id无效
    public final static int AUTH_CLIENTSECRET_INVALID = 303;//client_secret无效
    public final static int AUTH_REDIRECTURI_INVALID = 304;//redirect_uri无效
    public final static int AUTH_ACCESSTOKEN_INVALID = 305;//access_token无效
    public final static int AUTH_RESPONSETYPE_INVALID = 306;//response_type无效
    public final static int AUTH_GRANTTYPE_INVALID = 307;//grant_type无效
    public final static int AUTH_AUTHORIZATIONCODE_INVALID = 308;//authorization_code无效
    public final static int AUTH_ACCESSTOKEN_FAILED = 309;//生成access_token失败
    public final static int AUTH_AUTHORIZATIONCODE_FAILED = 310;//生成authorization_code失败
    public final static int AUTH_GRANT_API_INVALID = 311; //无权访问该api
    public final static int AUTH_AUTHORIZATION_TYPE_INVALID = 312; //认证方式无效
    public final static int AUTH_LOGIN_INVALID = 313; //未登录
    public final static int AUTH_REQUEST_INVALID = 315; //limit_count超出频率限制
    public final static int ERROR_PARAMS_CODE = 400;              //参数不正确
    public final static int ERROR_RESOURCE_DO_NOT__EXIST_CODE = 404;   //资源不存在
    public static final int ERROR_RESOURCE_EXIST_CODE = 405;           //资源已存在
    public final static int ERROR_SERVER_FAIL_CODE = 500;         //服务器故障
    public final static int ERROR_UPDATE_FAIL_CODE = 501;         //更新失败
    public final static int ERROR_SELECT_FAIL_CODE = 502;         //查询失败
    public static final int ERROR_INSERT_FAIL_CODE = 503;              //新增失败
    public static final int ERROR_DELETE_FAIL_CODE = 504;              //删除失败
    public final static int ERROR_UNKNOWN_FAIL_CODE = 999;          //未知错误
    public final static int ERROR_UNAME_NEXIT_CODE = 373;          //未知错误
    public final static String SUCCESS = "SUCCESS";
    //新增code
    public final static int NOT_REGISTED = 92504900;
    public final static int SMS_FAIL = 92504901;
    public final static int SMS_EXPIRY = 92504902;
    public final static int SMS_SENDED = 92504903;
    public final static int PASS_FAIL = 92504904;
    public final static int REGISTID_FAIL = 92504905;
    public final static int PHONE_FAIL = 92504906;
    public final static int USER_NULL = 92504907;
    public final static int USER_FAIL = 92504908;
    public final static int DATA_FAIL = 92504909;
    public final static int USER_EXIST = 92504910;
    public final static int EMAIL_EXIST = 92504911;
    public final static int PHONE_EXIST = 92504912;
    public final static int ADD_SUCCESS = 92504913;
    public final static int SAVE_SUCCESS = 92504914;
    public final static int UPLOAD_SUCCESS = 92504915;
    public final static int UPLOAD_FAIL = 92504916;
    public final static int SMS_SUCCESS = 92504917;
    public final static int FAV_SUCCESS = 92504918;
    public final static int FAV_FAIL = 92504919;
    public final static int FAV_DEL_SUCCESS = 92504920;
    public final static int PRE_SUCCESS = 92504921;
    public final static int USER_NOT_LOGIN = 92504922;
    public final static int PRE_PASS = 92504923;
    public final static int NOT_VIP = 92504924;
    public final static int TEST_PASS = 92504925;
    public final static int VIP_OVERDUE = 92504926;
    public final static int TEST_ADVICE = 92504927;
    public final static int STUDY_NOT_TEST = 92504928;
    public final static int STUDY_NOT_BUY = 92504929;
    public final static int PWD_FALSE = 92504930;
    public final static int NOT_TEST_CARD = 92504931;
    public final static int GENERATE_REPORT = 92504932;
    public final static int PRE_NOT_PASS = 92504933;
    public final static int NOT_COMPLETE_TTR = 92504934;
    public final static int PREFER_PASS = 92504935;
    public final static int STATUS_STOP = 92504936; //停止状态
    public final static int STATUS_START = 92504937;//开始状态
    public final static int STATUS_CONTINUE = 92504938;//继续状态
    public final static int NOT_EDIT_PASSWORD = 92504939;//未修改初始密码
    public final static int FORGETPWD_ERROR = 92504940;//忘记密码超时
    public final static int NOT_FIND_USER = 92504941;//没有找到该用户
    public final static int ORDERID_BLACK = 92504942;//订单ID为空
    public final static int ORDER_BLACK = 92504943;//订单ID为空
    public final static int GO_PREFER_PASS = 92504944;//需要完成偏好测试题
    public final static int RECORD_NULL = 92504945;//课程收听记录为空
    public final static int NO_BIND = 92504946;//账号未绑定第三方应用
    public final static int NOT_SET_SORT = 92504947;



    private final static Map<Integer, String> MESSAGES = new HashMap<>();

    static {
        MESSAGES.put(SIGN_TS_INVALID, "时间戳已过期");
        MESSAGES.put(SIGN_INVALID, "签名无效");
        MESSAGES.put(AUTH_CLENTID_INVALID, "client_id无效");
        MESSAGES.put(AUTH_CLIENTSECRET_INVALID, "client_secret无效");
        MESSAGES.put(AUTH_REDIRECTURI_INVALID, "redirect_uri无效");
        MESSAGES.put(AUTH_ACCESSTOKEN_INVALID, "token无效");
        MESSAGES.put(AUTH_RESPONSETYPE_INVALID, "response_type无效");
        MESSAGES.put(AUTH_GRANTTYPE_INVALID, "grant_type无效");
        MESSAGES.put(AUTH_AUTHORIZATIONCODE_INVALID, "authorization_code无效");
        MESSAGES.put(AUTH_ACCESSTOKEN_FAILED, "生成access_token失败");
        MESSAGES.put(AUTH_AUTHORIZATIONCODE_FAILED, "生成authorization_code失败");
        MESSAGES.put(AUTH_GRANT_API_INVALID, "无权访问该api");
        MESSAGES.put(AUTH_AUTHORIZATION_TYPE_INVALID, "认证方式无效");
        MESSAGES.put(AUTH_LOGIN_INVALID, "未登录");
        MESSAGES.put(ERROR_PARAMS_CODE, "参数不正确");
        MESSAGES.put(ERROR_RESOURCE_DO_NOT__EXIST_CODE, "资源不存在");
        MESSAGES.put(ERROR_RESOURCE_EXIST_CODE, "资源已存在");
        MESSAGES.put(ERROR_SERVER_FAIL_CODE, "服务器故障");
        MESSAGES.put(ERROR_UPDATE_FAIL_CODE, "更新失败");
        MESSAGES.put(ERROR_SELECT_FAIL_CODE, "查询失败,暂无数据");
        MESSAGES.put(ERROR_INSERT_FAIL_CODE, "新增失败");
        MESSAGES.put(ERROR_DELETE_FAIL_CODE, "删除失败");
        MESSAGES.put(ERROR_UNKNOWN_FAIL_CODE, "未知错误");
        MESSAGES.put(AUTH_REQUEST_INVALID, "超出频率限制");
        MESSAGES.put(OK, "成功");
        MESSAGES.put(NOT_REGISTED, "用户未完成注册");
        MESSAGES.put(SMS_SUCCESS , "验证码发送成功");
        MESSAGES.put(SMS_FAIL , "验证码发送失败");
        MESSAGES.put(SMS_EXPIRY , "验证码无效");
        MESSAGES.put(SMS_SENDED , "验证码已发送");
        MESSAGES.put(PASS_FAIL , "密码错误");
        MESSAGES.put(REGISTID_FAIL , "注册超时");
        MESSAGES.put(PHONE_FAIL , "手机号或密码错误");
        MESSAGES.put(USER_NULL , "用户名或密码不能为空");
        MESSAGES.put(USER_FAIL , "用户名或密码错误");
        MESSAGES.put(DATA_FAIL , "获取数据失败");
        MESSAGES.put(USER_EXIST , "用户名已存在");
        MESSAGES.put(EMAIL_EXIST , "邮箱已存在");
        MESSAGES.put(PHONE_EXIST , "手机号已存在");
        MESSAGES.put(ADD_SUCCESS , "增加成功");
        MESSAGES.put(SAVE_SUCCESS , "保存成功");
        MESSAGES.put(UPLOAD_SUCCESS , "上传成功");
        MESSAGES.put(UPLOAD_FAIL , "上传失败");
        MESSAGES.put(FAV_SUCCESS , "收藏成功");
        MESSAGES.put(FAV_FAIL , "收藏失败");
        MESSAGES.put(FAV_DEL_SUCCESS , "取消收藏成功");
        MESSAGES.put(PRE_SUCCESS , "热身题已通过");
        MESSAGES.put(USER_NOT_LOGIN , "用户未登录");
        MESSAGES.put(PRE_PASS , "通过热身测试");
        MESSAGES.put(NOT_VIP , "开通VIP会员，尊享会员测试服务！");
        MESSAGES.put(TEST_PASS , "测试通过，测试报告生成中，5分钟后请前往我的_三叁阅读能力测试中查看测试结果");
        MESSAGES.put(VIP_OVERDUE , "VIP已过期，请续费");
        MESSAGES.put(TEST_ADVICE , "建议3个月测试一次");
        MESSAGES.put(STUDY_NOT_TEST , "宝贝还没有进行GE测试，尽快完成测试，我们将推荐最适合您的中文分级阅读产品哟～");
        MESSAGES.put(STUDY_NOT_BUY , "未购买");
        MESSAGES.put(PWD_FALSE , "两次输入的密码不一致");
        MESSAGES.put(NOT_TEST_CARD , "测试卡已用完，请前往续费");
        MESSAGES.put(GENERATE_REPORT , "测试报告生成中，5分钟后请前往\n" +
                                        "我的_三叁阅读能力测试中查看测试结果");
        MESSAGES.put(PRE_NOT_PASS , "热身题没有通过，多读书再来挑战");
        MESSAGES.put(NOT_COMPLETE_TTR , "未完成三叁测试！");
        MESSAGES.put(PREFER_PASS , "偏好测试通过！");
        MESSAGES.put(STATUS_STOP , "三叁测试停止！");
        MESSAGES.put(STATUS_START , "三叁测试开始！");
        MESSAGES.put(STATUS_CONTINUE , "三叁测试继续！");
        MESSAGES.put(NOT_SET_SORT , "已有学习中，不能排序！");
        MESSAGES.put(NOT_EDIT_PASSWORD , "登录成功，请修改初始密码！");
        MESSAGES.put(FORGETPWD_ERROR , "忘记密码超时！");
        MESSAGES.put(NOT_FIND_USER , "没有找到该用户！");
        MESSAGES.put(ORDERID_BLACK , "订单ID为空！");
        MESSAGES.put(ORDER_BLACK , "没有该订单！");
        MESSAGES.put(GO_PREFER_PASS , "请完成偏好测试");
        MESSAGES.put(RECORD_NULL , "课程收听记录为空！");
        MESSAGES.put(NO_BIND, "账号未绑定第三方应用！");



    }

    public static ApiResult getErrorResult(int code, String message) {
        ApiResult result = new ApiResult(code, message);
        ApiContextUtil.setResult(result);
        return result;
    }
    public static ApiResult getErrorResult(int code, int message) {
        ApiResult result = new ApiResult(code, getMessage(message));
        ApiContextUtil.setResult(result);
        return result;
    }
    public static ApiResult getErrorResult(int code) {
        ApiResult result = new ApiResult(code, getMessage(code));
        ApiContextUtil.setResult(result);
        return result;
    }

    public static ApiResult getOKResult(Object data) {
        ApiResult result = new ApiResult(0, getMessage(0), data);
        ApiContextUtil.setResult(result);
        return result;
    }
    public static ApiResult getOKResult() {
        ApiResult result = new ApiResult(0, getMessage(0), null);
        ApiContextUtil.setResult(result);
        return result;
    }

    public static ApiResult getOKResult(int code) {
        ApiResult result = new ApiResult(code, getMessage(code), "");
        ApiContextUtil.setResult(result);
        return result;
    }

    public static ApiResult getOKResult(int code,int msg) {
        ApiResult result = new ApiResult(code, getMessage(msg),"");
        ApiContextUtil.setResult(result);
        return result;
    }

    public static ApiResult getOKResult(int code,int msg,Object data) {
        ApiResult result = new ApiResult(code, getMessage(msg), data);
        ApiContextUtil.setResult(result);
        return result;
    }

    public static ApiResult getOKResult(int code,Object data) {
        ApiResult result = new ApiResult(code, getMessage(code), data);
        ApiContextUtil.setResult(result);
        return result;
    }

    public static String getMessage(int code) {
        String msg = MESSAGES.get(code);
        return msg == null ? "" : msg;
    }
}
