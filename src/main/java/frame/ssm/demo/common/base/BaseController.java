package frame.ssm.demo.common.base;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import frame.ssm.demo.model.User;

/**
 * 基础控制
 * @author ZhouYu
 * @version 1.0
 */
public class BaseController {
	/**
	 * 日志
	 */
	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	/**
	 * 当前日期
	 */
	protected Date date = new Date();
	/**
	 * 时间格式化
	 * @param fomat 时间格式
	 * @return 字符串类型时间
	 */
	protected String getTime(String fomat){
		SimpleDateFormat sdf = new SimpleDateFormat(fomat);
		return sdf.format(date);
	}
	/**
	 * 获取当前登录用户信息
	 * @return 用户实体
	 */
	protected User getUser(){
		return (User) SecurityUtils.getSubject().getPrincipal();
	}
}
