package study.utils;

public class ResponseCode {
    public ResponseCode() {
    }

    public static enum SubCode {
        SUCCESS(0, "成功"),
        UNSUCCESS(204, "响应成功，无数据"),
        SERVER_ERROR(500, "服务器内部异常"),
        NOT_LOGIN_ERROR(10000, "未登录或会话失效，请重新登录"),
        ACCOUNT_AUTHENTICATION_ERROR(10005, "账号或密码错误"),
        PERMISSION_AUTHENTICATION_ERROR(10010, "无法访问，您可能没有权限"),
        SYS_WARN(40013, "操作提示"),
        FAIL_RESPONSE(40002, "操作失败"),
        SIGN_ERROR(50000, "参数验签错误");

        private String msg;
        private int code;

        private SubCode(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }

        public String getMsg() {
            return this.msg;
        }

        public int getCode() {
            return this.code;
        }
    }

    public static enum Code {
        SUCCESS(0, "成功"),
        SYS_ERROR(40000, "服务器内部异常"),
        BIZ_FAIL(40003, "操作失败"),
        SYS_WARN(40013, "操作提示");

        private String msg;
        private int code;

        private Code(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }

        public String getMsg() {
            return this.msg;
        }

        public int getCode() {
            return this.code;
        }
    }
}
