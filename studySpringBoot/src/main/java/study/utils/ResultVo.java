package study.utils;

import io.swagger.annotations.ApiModelProperty;
import org.slf4j.Logger;
import com.alibaba.fastjson.JSONObject;
import study.exception.CustomizedErrorException;
import study.exception.SystemInnerException;
import study.exception.WarnErrorException;
import study.utils.ResponseCode.*;

import java.io.Serializable;



public class ResultVo<T> implements Serializable {
    private static String WAP_DATA;
    private static final String WAP_DATA_RESULT = "true";



    @ApiModelProperty("错误编码 0:成功 40000:服务器内部异常 40003:表示给用户提示错误subMsg")
    private Integer code;
    @ApiModelProperty("服务器内部异常子编码(如: 405:Method Not Allowed、401:未认证、未登录)")
    private Integer subCode;
    @ApiModelProperty("前端操作标识,由前后端开发人员自由约定")
    private String tag;
    @ApiModelProperty("当code=0提示:成功, 当code!=0时提示服务器内部异常")
    private String msg;
    @ApiModelProperty("提示信息详情")
    private String subMsg;
    @ApiModelProperty("响应数据")
    private T data;
    @ApiModelProperty("扩展数据")
    private String expandJson;

    public static void setWapData(String wapData) {
        WAP_DATA = wapData;
    }

    public boolean isSuccess() {
        return this.code != null && this.code == Code.SUCCESS.getCode();
    }

    public void tryThrow(Logger logger, String express, Object... params) {
        if (!this.isSuccess()) {
            logger.error(express, params);
        }

        this.tryThrow();
    }

    public void tryThrow() {
        if (this.code.equals(Code.BIZ_FAIL.getCode())) {
            throw new CustomizedErrorException(this.subMsg);
        } else if (this.code.equals(Code.SYS_WARN.getCode())) {
            throw new WarnErrorException(this.subMsg);
        } else if (this.code.equals(Code.SYS_ERROR.getCode())) {
            throw new SystemInnerException(this.subMsg);
        }
    }

    public ResultVo tag(String tag) {
        this.tag = tag;
        return this;
    }

    public ResultVo expandJson(String expandJson) {
        this.expandJson = expandJson;
        return this;
    }

    public ResultVo(Code code, Integer subCode, T data, String msg) {
        this.code = code.getCode();
        this.msg = code.getMsg();
        this.subCode = subCode;
        this.subMsg = msg;
        this.data = data == null && "true".equalsIgnoreCase(WAP_DATA) ? (T) new JSONObject() : data;
    }

    public ResultVo(Code code, SubCode subCode, T data) {
        this(code, subCode, data, subCode.getMsg());
    }

    public ResultVo(Code code, SubCode subCode, T data, String msg) {
        this(code, subCode.getCode(), data, msg);
    }

    public static <T> ResultVo<T> success() {
        return new ResultVo(Code.SUCCESS, SubCode.SUCCESS, (Object)null);
    }

    public static <T> ResultVo<T> success(String msg) {
        return new ResultVo(Code.SUCCESS, SubCode.SUCCESS, (Object)null, msg);
    }

    public static <T> ResultVo<T> success(T data) {
        return new ResultVo(Code.SUCCESS, SubCode.SUCCESS, data);
    }

    public static <T> ResultVo<T> fail(SubCode subCode) {
        return new ResultVo(Code.BIZ_FAIL, subCode, (Object)null, subCode.getMsg());
    }

    public static <T> ResultVo<T> fail(String msg) {
        return new ResultVo(Code.BIZ_FAIL, SubCode.FAIL_RESPONSE, (Object)null, msg);
    }

    public static <T> ResultVo<T> fail() {
        return new ResultVo(Code.BIZ_FAIL, SubCode.FAIL_RESPONSE, (Object)null, SubCode.FAIL_RESPONSE.getMsg());
    }

    public static <T> ResultVo<T> error(int subCode, String msg) {
        return new ResultVo(Code.SYS_ERROR, subCode, (Object)null, msg);
    }

    public static <T> ResultVo<T> warn(String msg) {
        return new ResultVo(Code.SYS_WARN, SubCode.SYS_WARN, (Object)null, msg);
    }

    public Integer getCode() {
        return this.code;
    }

    public Integer getSubCode() {
        return this.subCode;
    }

    public String getTag() {
        return this.tag;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getSubMsg() {
        return this.subMsg;
    }

    public T getData() {
        return this.data;
    }

    public String getExpandJson() {
        return this.expandJson;
    }

    public void setCode(final Integer code) {
        this.code = code;
    }

    public void setSubCode(final Integer subCode) {
        this.subCode = subCode;
    }

    public void setTag(final String tag) {
        this.tag = tag;
    }

    public void setMsg(final String msg) {
        this.msg = msg;
    }

    public void setSubMsg(final String subMsg) {
        this.subMsg = subMsg;
    }

    public void setData(final T data) {
        this.data = data;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof ResultVo)) {
            return false;
        } else {
            ResultVo<?> other = (ResultVo)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label95: {
                    Object this$code = this.getCode();
                    Object other$code = other.getCode();
                    if (this$code == null) {
                        if (other$code == null) {
                            break label95;
                        }
                    } else if (this$code.equals(other$code)) {
                        break label95;
                    }

                    return false;
                }

                Object this$subCode = this.getSubCode();
                Object other$subCode = other.getSubCode();
                if (this$subCode == null) {
                    if (other$subCode != null) {
                        return false;
                    }
                } else if (!this$subCode.equals(other$subCode)) {
                    return false;
                }

                Object this$tag = this.getTag();
                Object other$tag = other.getTag();
                if (this$tag == null) {
                    if (other$tag != null) {
                        return false;
                    }
                } else if (!this$tag.equals(other$tag)) {
                    return false;
                }

                label74: {
                    Object this$msg = this.getMsg();
                    Object other$msg = other.getMsg();
                    if (this$msg == null) {
                        if (other$msg == null) {
                            break label74;
                        }
                    } else if (this$msg.equals(other$msg)) {
                        break label74;
                    }

                    return false;
                }

                label67: {
                    Object this$subMsg = this.getSubMsg();
                    Object other$subMsg = other.getSubMsg();
                    if (this$subMsg == null) {
                        if (other$subMsg == null) {
                            break label67;
                        }
                    } else if (this$subMsg.equals(other$subMsg)) {
                        break label67;
                    }

                    return false;
                }

                Object this$data = this.getData();
                Object other$data = other.getData();
                if (this$data == null) {
                    if (other$data != null) {
                        return false;
                    }
                } else if (!this$data.equals(other$data)) {
                    return false;
                }

                Object this$expandJson = this.getExpandJson();
                Object other$expandJson = other.getExpandJson();
                if (this$expandJson == null) {
                    if (other$expandJson != null) {
                        return false;
                    }
                } else if (!this$expandJson.equals(other$expandJson)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ResultVo;
    }

    public int hashCode() {
//        int PRIME = true;
        int result = 1;
        Object $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        Object $subCode = this.getSubCode();
        result = result * 59 + ($subCode == null ? 43 : $subCode.hashCode());
        Object $tag = this.getTag();
        result = result * 59 + ($tag == null ? 43 : $tag.hashCode());
        Object $msg = this.getMsg();
        result = result * 59 + ($msg == null ? 43 : $msg.hashCode());
        Object $subMsg = this.getSubMsg();
        result = result * 59 + ($subMsg == null ? 43 : $subMsg.hashCode());
        Object $data = this.getData();
        result = result * 59 + ($data == null ? 43 : $data.hashCode());
        Object $expandJson = this.getExpandJson();
        result = result * 59 + ($expandJson == null ? 43 : $expandJson.hashCode());
        return result;
    }

    public String toString() {
        return "ResultVo(code=" + this.getCode() + ", subCode=" + this.getSubCode() + ", tag=" + this.getTag() + ", msg=" + this.getMsg() + ", subMsg=" + this.getSubMsg() + ", data=" + this.getData() + ", expandJson=" + this.getExpandJson() + ")";
    }

    public ResultVo() {
    }

    public void setExpandJson(final String expandJson) {
        this.expandJson = expandJson;
    }
}

