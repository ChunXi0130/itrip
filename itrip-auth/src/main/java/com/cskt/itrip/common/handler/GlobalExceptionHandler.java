package com.cskt.itrip.common.handler;

import com.cskt.itrip.common.vo.ReturnResult;
import com.cskt.itrip.common.constants.ErrorCodeEnum;
import com.cskt.itrip.common.exception.DaoException;
import com.cskt.itrip.common.exception.ServiceException;
import com.cskt.itrip.common.exception.SysException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 统一异常处理
 *
 * @author Lenovo
 * @version 1.0
 * @date 2021/12/18 14:13
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 捕获异常
     *
     * @param e 异常类型为 Exception
     * @return 异常信息
     */
    @ExceptionHandler(value = Exception.class)
    public ReturnResult error(Exception e) {
        LOGGER.error(e.getMessage(), e);
        return ReturnResult.error(ErrorCodeEnum.SYSTEM_EXECUTION_ERROR);
    }

    /**
     * 捕获异常
     *
     * @param e 异常类型为 ServiceException
     * @return 异常
     */
    @ExceptionHandler(value = ServiceException.class)
    public ReturnResult error(ServiceException e) {
        LOGGER.error(e.getMessage(), e);
        return ReturnResult.error(e.getErrorCode(), e.getMessage());
    }

    /**
     * 捕获异常
     *
     * @param e 异常类型为 DaoException
     * @return 异常
     */
    @ExceptionHandler(value = DaoException.class)
    public ReturnResult error(DaoException e) {
        LOGGER.error(e.getMessage(), e);
        return ReturnResult.error(e.getErrorCode(), e.getMessage());
    }

    @ExceptionHandler(value = SysException.class)
    public ReturnResult error(SysException e) {
        LOGGER.error(e.getMessage(), e);
        return ReturnResult.error(e.getErrorCode(), e.getMessage());
    }
}
