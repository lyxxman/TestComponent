package com.ly.common.base;

public interface BaseView {

    /**
     * 通用错误处理 可以自己根据实际情况增加其他异常处理
     * 页面状态错误
     *
     * @param code      和后台约定的错误码
     * @param message   错误提示消息
     * @param sceneCode 场景类型
     */
    void onPageStatusError(int code, String message, int sceneCode);

}
