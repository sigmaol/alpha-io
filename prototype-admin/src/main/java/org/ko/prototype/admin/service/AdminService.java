package org.ko.prototype.admin.service;

import org.ko.prototype.admin.bean.domain.AdminUserModel;
import org.ko.prototype.admin.constants.AdminConstants;
import org.ko.prototype.admin.dao.repository.AdminUserRepository;
import org.ko.prototype.support.bean.model.AuthenticationBean;
import org.ko.prototype.support.view.View;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.security.auth.Subject;
import java.util.Date;

@Service
@Transactional(rollbackFor=Throwable.class)
public class AdminService {

	private static final Logger log = LoggerFactory.getLogger(AdminService.class);
	
	@Autowired
    private ValidationService validationService;
	@Autowired
    private AdminUserRepository adminUserRepository;
	
	/**
	 * 登录
	 * @param username	用户名
	 * @param password	密码
	 * @return
	 */
	public View<AdminUserModel> login(String username, String password, String imageToken, String lastLoginIp) throws Exception {
		View<AdminUserModel> view = new View<>();
		AdminUserModel user = null;

		if(AdminConstants.SystemUser.equals(username) && AdminConstants.SystemUserPassword.equals(password)){
			user = new AdminUserModel();
			user.setId(0);
			user.setLoginName(username);
			user.setFullName(username);
//			user.setAdminStatus(UserConstants.Values.AdminStatus.Admin);
		} else {
//			validationService.validateImageToken(imageToken);
			user = validationService.assureAdminUserExists(username, password);
			user.setLastLoginTime(new Date());
			user.setLastLoginIp(lastLoginIp);

			adminUserRepository.updateById(user);
		}

		postLogin(user);

		view.setModel(user);

		// shiro init
//		Subject subject = SecurityUtils.getSubject();
//    	UsernamePasswordToken token = new UsernamePasswordToken(username, password);
//    	subject.login(token);

		return view;
	}

//	public UserProfile reload() throws Exception {
//		Integer userId = AppContext.getSession().get(AdminConstants.Session.UserId);
//
//		AdminUserModel user = adminUserRepository.findById(userId, AdminUserModel.class);
//
//		UserProfile profile = null;
//
//		if(user != null){
//			profile = buildUserProfile(user);
//			AppContext.getSession().put(AdminConstants.Session.UserProfile, profile);
//			postLogin(user);
//		}
//
//		return profile;
//	}
//
//	public View logout(){
//		int userId = NumberUtils.convertToInt(AppContext.getSession().get(AppConstants.Session.UserId));
//		LoggingUtils.setMDC(AppConstants.MDC.UserId, String.valueOf(userId));
//		AppContext.getSession().invalidate();
//		return new View();
//	}
//
	protected void postLogin(AdminUserModel user) throws Exception {
		AuthenticationBean profile = buildUserProfile(user);

		AppContext.getSession().put(AdminConstants.Session.UserId, user.getId());
		AppContext.getSession().put(AdminConstants.Session.UserProfile, profile);
	}
//
	protected AuthenticationBean buildUserProfile(AdminUserModel user) throws Exception {
		AuthenticationBean profile = new AuthenticationBean();

		profile.setId(user.getId());
		profile.setFullName(user.getFullName());
		profile.setLoginName(user.getLoginName());
		profile.setRoleId(NumberUtils.convertToInt(user.getRoleId()));

		return profile;
	}
}