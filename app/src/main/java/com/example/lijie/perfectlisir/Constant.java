package com.example.lijie.perfectlisir;

/**
 * @Description
 * @Author MoseLin
 * @Date 2016/8/6.
 */
public class Constant
{
    public static final String ISFIRSTINAPP = "isFirstInApp";
    public static final String VERSION = "version";
    public static final String ISLOGIN = "isLogin";
    public static final String TITLE = "title";
    public static final String DATAS = "datas";
    public static final String RET = "ret";
    public static final String MSG = "msg";
    public static final String USERNAME_SET = "username_set";
    public static final String MESSAGE_TYPE = "message_type";
    public static final String CHECK_SMS_PERMISSION = "check_sms_permission";
    public static final String FIRST_CHECK = "first_check";
    public static final String ADDRESS_DATA = "address_data";
    public static final String ID = "id";
    public static final String FIRST_ADDRESS = "first_address";
    public static final String COMPLETED = "completed";
    public static final String TOKEN = "token";
    public static final String DEVICE_TOKEN = "deviceToken";
    public static final String PUSH_OPEN = "open";
    public static final String REGION_INFO = "region_info";

    //消息中心
    public static final String MSGLASTUPDATETIME = "msg_last_updatetime";
    public static final String SYSMSGLASTUPDATETIME = "sysmsg_last_updatetime";
    public static final String PLATFORMMSGLASTUPDATETIME = "platformmsg_last_updatetime";
    public static final String DYAMICMSGLASTUPDATETIME = "dyamicmsg_last_updatetime";
    public static final String TRADEMSGLASTUPDATETIME = "trademsg_last_updatetime";

    //常量
    public static final long GETAUTHCODEPARTTIME = 6 * 10 * 1000; //验证码发送时间间隔：60s
    public static final long PHOTOCOMPRESSEDSIZE = 200; //上传图片大小限制：200kb
    public static final int PHOTOCOMPRESSEDHEIGHT = 1920; //上传图片高度限制：1920
    public static final int PHOTOCOMPRESSEDWIDTH = 1080; //上传图片宽度限制：1080

    //错误码
    public static final int PHONENUMISNULL = -1000;
    public static final int PHONENUMISWRONG = -1001;
    public static final int AUTHCODEISNULL = -1002;
    public static final int AUTHCODEISWRONG = -1003;
    public static final int PASSWORDISNULL = -1004;
    public static final int PASSWORDISWRONG = -1005;
    public static final int PASSWORDISNOTEQUALS = -1006;
    public static final int RECEIVERINFOISWRONG = -1007;

    //后台ret值
    public static final int RET_SUCCEED = 1;
    public static final int RET_ALREADY_REGISTERED = 21;

    //RxBus的event事件
    public static final String PERSONAL_DATA_CHANGE = "personal_data_change";
    public static final String PERSONAL_DATA_CLEAN = "personal_data_clean";
    public static final String PAY_COMPLETED = "pay_completed";

    public static final String BALANCE_CHANGE = "balance_change";
    public static final String INCART = "incart";
    public static final String CART_DELETE = "cart_delete";
    public static final String CART_DELETE2 = "cart_delete2";
    public static final String PHONE_LOGIN_GET_AUTH_CODE_SUCCESS = "phone_login_get_auth_code_success";
    public static final String REGISTER_GET_AUTH_CODE_SUCCESS = "register_get_auth_code_success";
    public static final String FIND_PASSWORD_GET_AUTH_CODE_SUCCESS = "find_password_get_auth_code_success";
    public static final String UPDATE_PAY_PASSWORD_GET_AUTH_CODE_SUCCESS = "update_pay_password_get_auth_code_success";
    public static final String PHONE_LOGIN_GET_AUTH_CODE_FAILED = "phone_login_get_auth_code_failed";
    public static final String REGISTER_GET_AUTH_CODE_FAILED = "register_get_auth_code_failed";
    public static final String FIND_PASSWORD_GET_AUTH_CODE_FAILED = "find_password_get_auth_code_failed";
    public static final String UPDATE_PAY_PASSWORD_GET_AUTH_CODE_FAILED = "update_pay_password_get_auth_code_failed";



    //加密的key
    public static final String RES_KEY ="ivX1m+Ya01lNbJ0kZpuwmcfzDVDohK4Bsu9xaY5NrB8=";



}
