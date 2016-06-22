package beans.inf;

import pojo.UserVo;

import javax.ejb.Local;

/**
 * Created by jeremy on 2016/6/20.
 */
@Local
public interface UserInf {
    void create(UserVo userVo);
}
