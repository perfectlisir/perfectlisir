package com.example.lijie.perfectlisir;

/**
 * @Description
 * @Author MoseLin
 * @Date 2016/10/20.
 */
public class ApiAction
{
    //common
    public static final String PHONE = "phone";
    public static final String CODE = "code";
    //检查更新
    public static final String UPDATE_ACTION = "start/checkUpdate";
    public static final String UPDATE_ACTION_PARA1 = "from";
    //提交推送信息
    public static final String START_UPDATE_PUSH = "start/updatePush";
    //引导页--不做
    public static final String START_PICLIST_ACTION = "start/picList";
    //登录0
    public static final String LOGIN_ACTION = "user/loginByPass";
    public static final String LOGIN_ACTION_ACCOUNT = "phone";
    public static final String LOGIN_ACTION_PASSWORD = "password";
    //获取验证码
    public static final String SEND_PHONE_CODE_ACTION = "user/sendPhoneCode";
    //手机号直接登录
    public static final String LOGIN_BY_CODE_ACTION = "user/loginByCode";
    public static final String LOGIN_BY_CODE_PHONE = "phone";
    public static final String LOGIN_BY_CODE_TEST = "test";
    public static final String LOGIN_BY_CODE_TYPE = "type";
    public static final String LOGIN_BY_CODE_CODE = "code";
    //设置密码
    public static final String SET_PASSWORD_ACTION = "user/setPass";
    public static final String SET_REPEAT_PASSWORD = "repeat_password";
    //忘记密码重置
    public static final String RESET_PASSWORD_ACTION = "user/resetPass";
    //通过身份证修改密码
    public static final String LOST_PASSWORD_BYID_ACTION = "user/lostPassByID";
    //注册
    public static final String REGISTER_ACTION = "user/register";
    //校验验证码
    public static final String VERIFY_CODE = "user/verifyCode";
    //退出登录
    public static final String LOGOUT_ACTION = "user/logout";


    //-------------------------------消息---------------------
    //消息列表
    public static final String USER_MESSAGE_LIST = "user/message/list";
    public static final String USER_MESSAGE_LIST1 = "user/message/list1";
    //系统消息
    public static final String USER_MESSAGE_SYSLIST = "user/message/sysList";
    //平台公告
    public static final String USER_MESSAGE_ANNLIST = "user/message/annList";
    //最新活动
    public static final String USER_MESSAGE_NEWSLIST = "user/message/newsList";
    //交易提示
    public static final String USER_MESSAGE_NOTICE_LIST = "user/message/noticeList";
    //-------------------------------消息---------------------


    //------------------首页-----------------
    public static final String MAIN = "main/";
    //上面部分
    public static final String MAIN_PICLIST = MAIN + "allList";
    //商品列表
    public static final String MAIN_GETPROLIST = MAIN + "proList";
    //搜索
    public static final String MAIN_SEARCH = MAIN + "search";
    //热门搜索
    public static final String MAIN_SEARCH_HOT = MAIN + "search/hot";
    public static final String KEY = "key";
    //------------------首页-----------------

    //-------------发现好店-------------------
    public static final String MAIN_MENU11_PICLIST = MAIN + "menu11/allList";//上面的部分
    public static final String MAIN_MENU11_STORE_BYCAT = MAIN + "menu11/storeByCat";//推荐品类
    public static final String MAIN_MENU11_STORE_LIST = MAIN + "menu11/storeList";//名品优店
    //-------------发现好店-------------------

    //-------------赠品区-------------------
    public static final String MAIN_MENU12_STORE_LIST = MAIN + "menu12/proList";
    //-------------赠品区-------------------

    //-------------赚积分-------------------
    public static final String MAIN_MENU13_COUNT = MAIN + "menu13/count";
    public static final String MAIN_MENU13_LIST = MAIN + "menu13/list";
    //-------------赚积分-------------------

    //-------------使用帮助-------------------
    public static final String MAIN_MENU14_LIST = MAIN + "menu14/list";
    public static final String MAIN_MENU14_DETAIL = MAIN + "menu14/detail";
    //-------------使用帮助-------------------

    //-------------赠品区,精品区,强力推荐,新品专区,进口区通用-------------------
    public static final String MAIN_TEMPL_PROLIST_PICLIST = MAIN + "templ/proList/picList";
    public static final String MAIN_TEMPL_PROLIST_PROLIST = MAIN + "templ/proList/proList";
    //-------------新品专区-------------------


    //-------------进口商品区-------------------
    public static final String MAIN_MENU22_PICLIST = MAIN + "templ/proList/picList";
    public static final String MAIN_MENU22_PRODLIST = MAIN + "templ/proList/proList";
    //-------------进口商品区-------------------

    //-------------组合装-------------------
    public static final String MAIN_MENU23_PRODLIST = MAIN + "menu23/prodList";
    public static final String PROMOTYPE="promoType";

    //-------------组合装-------------------

    //-------------店铺-------------------
    public static final String STORE = "store/";
    public static final String STORE_DETAIL = STORE + "detail";//店铺详情
    public static final String STORE_PROLIST = STORE + "prodList";//店铺列表
    public static final String STORE_COLLECT = STORE + "collect";//店铺收藏
    //-------------店铺-------------------
    public static final String PAGE = "page";
    public static final String SIZE = "size";
    public static final String ID = "id";
    public static final String TYPE = "type";
    public static final String STOREID = "storeId";
    public static final String MENUID = "menuId";

    //-------------分类-------------------
    public static final String CATEGORY = "cate/";
    public static final String CATEGORY_FIND1 = CATEGORY + "find1";
    public static final String CATEGORY_PICLIST = CATEGORY + "picList";
    public static final String CATEGORY_PROLIST = CATEGORY + "proList";


    //地址管理
    private static final String USER_ADDRESS = "user/address/";
    public static final String USER_ADDRESS_LIST = USER_ADDRESS + "list";
    public static final String USER_ADDRESS_ADD = USER_ADDRESS + "add";
    public static final String USER_ADDRESS_UPDATE = USER_ADDRESS + "update";
    public static final String USER_ADDRESS_DEL = USER_ADDRESS + "del";
    public static final String USER_ADDRESS_DETAIL = "detail";
    public static final String USER_ADDRESS_ID = "id";
    public static final String USER_ADDRESS_PID = "pid";
    public static final String USER_ADDRESS_ISDEFAULT = "isDefault";
    public static final String USER_ADDRESS_RNAME = "rName";
    public static final String USER_ADDRESS_RPHONE = "rPhone";
    public static final String USER_ADDRESS_REGIONCID = "regionCid";
    public static final String USER_ADDRESS_REGIONDID = "regionDid";
    public static final String USER_ADDRESS_REGIONPID = "regionPid";
    public static final String USER_ADDRESS_REGIONSID = "regionSid";
    public static final String REGION_PROVINCE = "region/province";
    public static final String REGION_BYPAR = "region/byPar";
    public static final String REGION_ALL3 = "region/all3";
    //购物车
    public static final String CART = "cart/";
    public static final String CART_LIST = CART + "list";
    public static final String CART_UPDATE = CART + "update";
    public static final String CART_REMOVE = CART + "remove";
    public static final String CART_PARAMETERS_PROD = "prod";
    public static final String CART_PARAMETERS_COUNT = "count";
    public static final String CART_PARAMETERS_PRODID = "prodId";
    public static final String CART_PARAMETERS_STOREID = "storeId";
    //商品
    public static final String PROD = "prod/";
    public static final String PROD_MAIN = PROD + "main";//商品介绍
    public static final String PROD_DETAIL = PROD + "detail";//商品详情
    public static final String PROD_COMMENTLIST = PROD + "commentList";//查看评价
    public static final String PROD_COMMENTUSEFUL = PROD + "commentUseful";//评价有用
    public static final String PROD_CHANGED = PROD_MAIN + "/changed";//更改属性后的商品页
    public static final String PROD_COLLECT = PROD + "collect";//收藏商品
    public static final String PROD_INCATE = PROD + "inCate";//加入购物车
    public static final String Prod = "prod";//加入购物车所需要的属性值


    //确认订单
    public static final String ORDER_BEFORE = "order/before/";//加入购物车所需要的属性值
    public static final String DISPATCH = ORDER_BEFORE + "dispatch";//查询物流费
    public static final String ORDER_CREATE = "order/create";//提交订单
    public static final String ADDRID = "addrId";//地址id
    public static final String BRANCHID = "branchId";//网点id
    public static final String ISDISPATCH = "isDispatch";//是否自提
    public static final String REMARK = "remark";//留言


    //个人中心
    public static final String USER = "user/";
    public static final String USER_CONSTS = "consts";//查询
    //账户管理
    public static final String USER_MAIN = USER + "main";
    public static final String USER_UPDATE_INFO = USER + "updateInfo";
    public static final String USER_SECURECENTER = USER + "secureCenter";
    public static final String USER_CERTIFY_DETAIL = USER + "certify/detail";
    public static final String USER_CERTIFY_FIRST = USER + "certify";
    public static final String USER_CERTIFY_SECOND = USER + "certify2";
    //登录密码
    public static final String USER_UPDATE_PASSWORD = USER + "updatePass";
    //支付密码
    public static final String USER_SETTING_PAYPASSWORD = USER + "setPayPwd";
    //校验验证码
    public static final String USER_RESET_PAYPASSWORD_VERIFYCODE = USER + "verifyCode";
    //检查身份证
    public static final String USER_RESET_PAYPASSWORD_CHECKIDCARD = USER + "checkIdcard";
    //修改支付密码
    public static final String USER_RESET_PAYPASSWORD_RESETPAYPWD = USER + "resetPayPwd";

    //我的钱包
    public static final String BALANCE = USER + "balance/";
    public static final String BALANCE_HOME = "order/before/balance";
    public static final String BALANCE_INCOMEEXPENSES = USER + "balanceList";
    public static final String BALANCE_WITHDRAW_ALI_BEFORE = BALANCE + "withdrawAliBefore";
    public static final String BALANCE_WITHDRAW_ALI = BALANCE + "withdrawAli";
    public static final String BALANCE_BANKLIST = USER + "bankList";
    public static final String BALANCE_BANKADD = USER + "bankAdd";
    public static final String BALANCE_BANKDEL = USER + "bankDel";
    public static final String BALANCE_WITHDRAW_BANK_BEFORE = BALANCE + "withdrawBankBefore";
    public static final String BALANCE_WITHDRAW_BANK = BALANCE + "withdrawBank";
    public static final String BALANCE_DEPOSIT_BEFORE = BALANCE + "depositBefore";
    public static final String BALANCE_DEPOSIT_DETAIL = BALANCE + "depositDetail";

    //支付中心
    public static final String QUERYPAYPWD = USER + "queryPayPwd";

    //钱包支付
    public static final String PAY_BALANCE = "order/pay/balance";
    //我的收藏
    public static final String User_COLLECTION = "user/collection/";
    public static final String User_COLLECTION_PRODLIST = User_COLLECTION + "prodList";//商品收藏列表
    public static final String User_COLLECTION_STORELIST = User_COLLECTION + "storeList";//店铺收藏列表


    public static final String WXPAYCESHI = "order/pay/wx";
    public static final String ALIPAYCESHI = "order/pay/ali2";

    public static final String ORDER = "order";
    public static final String VALUEIDS = "valueIds";
    public static final String SPUID = "spuId";
    public static final String BUYNUM = "buyNum";

    //我的订单
    public static final String STATUS = "status";
    public static final String MY_ORDER = "order/";
    public static final String My_ORDER_LIST = MY_ORDER + "list";
    public static final String ORDER_CONFIRM_GOT = MY_ORDER + "confirmGot";
    public static final String ORDER_CANCEL = MY_ORDER + "cancel";
    public static final String ORDER_NOTIFY_DISPATCH= MY_ORDER + "notifyDispatch";
    public static final String ORDER_EVALUATE= MY_ORDER + "comment";
    public static final String ORDER_PICKUP= MY_ORDER + "pickup";
    //二维码
    public static final String ORDER_PICKUP_DETAIL= MY_ORDER + "pickup/detail";

    //赠品区
    public static final String GIFT = " gift/";
    public static final String GIFT_PICKLIST = GIFT+"pickList";
    public static final String GIFT_PICKDETAIL = GIFT+"pickDetail";
    public static final String GIFT_ORDERCREATE = GIFT+"orderCreate";
    public static final String GIFT_PICKUP = GIFT+"pickup";
    public static final String GIFT_ORDERDETAIL = GIFT+"orderDetail";


    //查询物流
    public static final String Order_DISPATCH ="order/dispatchDetail";

}
