package org.jeecg.modules;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.jeecg.common.api.dto.OnlineAuthDTO;
import org.jeecg.common.api.dto.message.*;
import org.jeecg.common.system.api.ISysBaseAPI;
import org.jeecg.common.system.vo.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Description: 底层共通业务API，提供其他独立模块调用
 * @Author: scott
 * @Date:2019-4-20
 * @Version:V1.0
 */
@Slf4j
@Service
public class SysBaseApiImpl implements ISysBaseAPI {
    /**
     * 当前系统数据库类型
     */
    private static String DB_TYPE = "";

    @Override
    public void sendSysAnnouncement(MessageDTO message) {

    }

    @Override
    public void sendBusAnnouncement(BusMessageDTO message) {

    }

    @Override
    public void sendTemplateAnnouncement(TemplateMessageDTO message) {

    }

    @Override
    public void sendBusTemplateAnnouncement(BusTemplateMessageDTO message) {

    }

    @Override
    public String parseTemplateByCode(TemplateDTO templateDTO) {
        return null;
    }

    @Override
    public LoginUser getUserById(String id) {
        return null;
    }

    @Override
    public List<String> getRolesByUsername(String username) {
        return null;
    }

    @Override
    public List<String> getDepartIdsByUsername(String username) {
        return null;
    }

    @Override
    public List<String> getDepartNamesByUsername(String username) {
        return null;
    }

    @Override
    public List<DictModel> queryAllDict() {
        return null;
    }

    @Override
    public List<SysCategoryModel> queryAllDSysCategory() {
        return null;
    }

    @Override
    public List<DictModel> queryAllDepartBackDictModel() {
        return null;
    }

    @Override
    public void updateSysAnnounReadFlag(String busType, String busId) {

    }

    @Override
    public List<DictModel> queryFilterTableDictInfo(String table, String text, String code, String filterSql) {
        return null;
    }

    @Override
    public List<String> queryTableDictByKeys(String table, String text, String code, String[] keyArray) {
        return null;
    }

    @Override
    public List<ComboModel> queryAllUserBackCombo() {
        return null;
    }

    @Override
    public JSONObject queryAllUser(String userIds, Integer pageNo, Integer pageSize) {
        return null;
    }

    @Override
    public List<ComboModel> queryAllRole() {
        return null;
    }

    @Override
    public List<ComboModel> queryAllRole(String[] roleIds) {
        return null;
    }

    @Override
    public List<String> getRoleIdsByUsername(String username) {
        return null;
    }

    @Override
    public String getDepartIdsByOrgCode(String orgCode) {
        return null;
    }

    @Override
    public List<SysDepartModel> getAllSysDepart() {
        return null;
    }

    @Override
    public DictModel getParentDepartId(String departId) {
        return null;
    }

    @Override
    public List<String> getDeptHeadByDepId(String deptId) {
        return null;
    }

    @Override
    public void sendWebSocketMsg(String[] userIds, String cmd) {

    }

    @Override
    public List<LoginUser> queryAllUserByIds(String[] userIds) {
        return null;
    }

    @Override
    public void meetingSignWebsocket(String userId) {

    }

    @Override
    public List<LoginUser> queryUserByNames(String[] userNames) {
        return null;
    }

    @Override
    public Set<String> getUserRoleSet(String username) {
        return null;
    }

    @Override
    public Set<String> getUserPermissionSet(String username) {
        return null;
    }

    @Override
    public boolean hasOnlineAuth(OnlineAuthDTO onlineAuthDTO) {
        return false;
    }

    @Override
    public SysDepartModel selectAllById(String id) {
        return null;
    }

    @Override
    public List<String> queryDeptUsersByUserId(String userId) {
        return null;
    }

    @Override
    public List<JSONObject> queryUsersByUsernames(String usernames) {
        return null;
    }

    @Override
    public List<JSONObject> queryUsersByIds(String ids) {
        return null;
    }

    @Override
    public List<JSONObject> queryDepartsByOrgcodes(String orgCodes) {
        return null;
    }

    @Override
    public List<JSONObject> queryDepartsByIds(String ids) {
        return null;
    }

    @Override
    public void sendEmailMsg(String email, String title, String content) {

    }

    @Override
    public List<Map> getDeptUserByOrgCode(String orgCode) {
        return null;
    }

    @Override
    public Set<String> queryUserRoles(String username) {
        return null;
    }

    @Override
    public Set<String> queryUserAuths(String username) {
        return null;
    }

    @Override
    public DynamicDataSourceModel getDynamicDbSourceById(String dbSourceId) {
        return null;
    }

    @Override
    public DynamicDataSourceModel getDynamicDbSourceByCode(String dbSourceCode) {
        return null;
    }

    @Override
    public LoginUser getUserByName(String username) {
        return null;
    }

    @Override
    public String translateDictFromTable(String table, String text, String code, String key) {
        return null;
    }

    @Override
    public String translateDict(String code, String key) {
        return null;
    }

    @Override
    public List<SysPermissionDataRuleModel> queryPermissionDataRule(String component, String requestPath, String username) {
        return null;
    }

    @Override
    public SysUserCacheInfo getCacheUser(String username) {
        return null;
    }

    @Override
    public List<DictModel> queryDictItemsByCode(String code) {
        return null;
    }

    @Override
    public List<DictModel> queryTableDictItemsByCode(String table, String text, String code) {
        return null;
    }
}