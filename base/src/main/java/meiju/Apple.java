package meiju;

/**
 * Created by alibeibei on 2017/12/4.
 */
public enum Apple {
    MAC_AIR(12, "123"), MAC(12, "12");
    private String msg;
    private Integer code;

    Apple(Integer code, String msg) {
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public Integer getCode() {
        return code;
    }
}
