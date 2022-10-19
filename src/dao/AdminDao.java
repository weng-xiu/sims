package dao;

import domain.Admin;

public interface AdminDao {
    /**
     * 找到管理员和密码
     * @param id
     * @param password
     * @return
     */
    Admin findAdminidAndPassword(String id, String password);

    /**
     * 更新密码
     * @param adminid
     * @param newpassword
     */
    void updatePassword(String adminid, String newpassword);

    /**
     * 按 ID 查找管理员
     * @param a_id
     * @return
     */
    Admin findAdminById(String a_id);
}
